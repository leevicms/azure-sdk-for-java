// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation.changefeed.pkversion;

import com.azure.cosmos.implementation.changefeed.CancellationToken;
import com.azure.cosmos.implementation.changefeed.CancellationTokenSource;
import com.azure.cosmos.implementation.changefeed.Lease;
import com.azure.cosmos.implementation.changefeed.LeaseContainer;
import com.azure.cosmos.implementation.changefeed.LeaseManager;
import com.azure.cosmos.implementation.changefeed.PartitionController;
import com.azure.cosmos.implementation.changefeed.PartitionSupervisor;
import com.azure.cosmos.implementation.changefeed.PartitionSupervisorFactory;
import com.azure.cosmos.implementation.changefeed.exceptions.FeedRangeGoneException;
import com.azure.cosmos.implementation.changefeed.exceptions.LeaseLostException;
import com.azure.cosmos.implementation.changefeed.exceptions.TaskCancelledException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Implementation for {@link PartitionController}.
 */
class PartitionControllerImpl implements PartitionController {
    private static final Logger logger = LoggerFactory.getLogger(PartitionControllerImpl.class);
    private final Map<String, WorkerTask> currentlyOwnedPartitions = new ConcurrentHashMap<>();

    private final LeaseContainer leaseContainer;
    private final LeaseManager leaseManager;
    private final PartitionSupervisorFactory partitionSupervisorFactory;
    private final PartitionSynchronizer synchronizer;
    private final boolean shouldSkipDirectLeaseAssignment;
    private CancellationTokenSource shutdownCts;

    private final Scheduler scheduler;

    public PartitionControllerImpl(
            LeaseContainer leaseContainer,
            LeaseManager leaseManager,
            PartitionSupervisorFactory partitionSupervisorFactory,
            PartitionSynchronizer synchronizer,
            Scheduler scheduler,
            int maxScaleCount) {

        this.leaseContainer = leaseContainer;
        this.leaseManager = leaseManager;
        this.partitionSupervisorFactory = partitionSupervisorFactory;
        this.synchronizer = synchronizer;
        this.scheduler = scheduler;

        // If maxScaleCount is configured, then all lease assignments should go through load balancer
        // It will make sure the change feed processor instance always honor the maxScaleCount config
        this.shouldSkipDirectLeaseAssignment = maxScaleCount > 0;
    }

    @Override
    public Mono<Void> initialize() {
        this.shutdownCts = new CancellationTokenSource();
        return this.loadLeases();
    }

    @Override
    public synchronized Mono<Lease> addOrUpdateLease(final Lease lease) {
        WorkerTask workerTask = this.currentlyOwnedPartitions.get(lease.getLeaseToken());
        if (workerTask != null && workerTask.isRunning()) {
            return this.leaseManager.updateProperties(lease)
                .map(updatedLease -> {
                    logger.debug("Partition {}: updated.", updatedLease.getLeaseToken());
                    return updatedLease;
                });
        }

        return this.leaseManager.acquire(lease)
            .map(updatedLease -> {
                WorkerTask checkTask = this.currentlyOwnedPartitions.get(lease.getLeaseToken());
                if (checkTask == null) {
                    logger.info("Partition {}: acquired.", updatedLease.getLeaseToken());
                    PartitionSupervisor supervisor = this.partitionSupervisorFactory.create(updatedLease);
                    this.currentlyOwnedPartitions.put(updatedLease.getLeaseToken(), this.processPartition(supervisor, updatedLease));
                }
                return updatedLease;
            })
            .onErrorResume(throwable -> {
                logger.warn("Partition {}: unexpected error; removing lease from current cache.", lease.getLeaseToken());
                return this.removeLease(lease).then(Mono.error(throwable));
            });
    }

    @Override
    public Mono<Void> shutdown() {
        // TODO: wait for the threads to finish.
        this.shutdownCts.cancel();
//        this.currentlyOwnedPartitions.clear();

        return Mono.empty();
    }

    private Mono<Void> loadLeases() {
        logger.debug("Starting renew leases assigned to this host on initialize.");

        return this.leaseContainer.getOwnedLeases()
            .flatMap( lease -> {
                logger.info("Acquired lease for PartitionId '{}' on startup.", lease.getLeaseToken());
                return this.addOrUpdateLease(lease);
            }).then();
    }

    private Mono<Void> removeLease(Lease lease) {
        return Mono.just(this)
            .flatMap(value -> {
                WorkerTask workerTask = this.currentlyOwnedPartitions.remove(lease.getLeaseToken());
                if (workerTask != null && workerTask.isRunning()) {
                    workerTask.cancelJob();
                }
                logger.info("Partition {}: released.", lease.getLeaseToken());

                return this.leaseManager.release(lease);
            })
            .onErrorResume(e -> {
                if (e instanceof LeaseLostException) {
                    logger.warn("Partition {}: lease already removed.", lease.getLeaseToken());
                } else {
                    logger.warn("Partition {}: failed to remove lease.", lease.getLeaseToken(), e);
                }

                return Mono.empty();
            })
            .doOnSuccess(aVoid -> {
                logger.info("Partition {}: successfully removed lease.", lease.getLeaseToken());
            });
    }

    private WorkerTask processPartition(PartitionSupervisor partitionSupervisor, Lease lease) {
        CancellationToken shutdownToken = this.shutdownCts.getToken();

        WorkerTask partitionSupervisorTask =
            new WorkerTask(
                lease,
                partitionSupervisor,
                getWorkerJob(partitionSupervisor, lease, shutdownToken));

        this.scheduler.schedule(partitionSupervisorTask);

        return partitionSupervisorTask;
    }

    private Mono<Void> getWorkerJob(
        PartitionSupervisor partitionSupervisor,
        Lease lease,
        CancellationToken shutdownToken) {
        return partitionSupervisor.run(shutdownToken)
            .onErrorResume(throwable -> {
                if (throwable instanceof FeedRangeGoneException) {
                    FeedRangeGoneException ex = (FeedRangeGoneException) throwable;
                    return this.handleSplit(lease, ex.getLastContinuation());
                } else if (throwable instanceof TaskCancelledException) {
                    logger.debug("Partition {}: processing canceled.", lease.getLeaseToken());
                } else {
                    logger.warn("Partition {}: processing failed.", lease.getLeaseToken(), throwable);
                }

                return Mono.empty();
            })
            .then(this.removeLease(lease));
    }

    private Mono<Void> handleSplit(Lease lease, String lastContinuationToken) {
        if (lastContinuationToken != null) {
            logger.warn("Partition {}, with owner: {}, updated with last continuation token: {}",
                lease.getLeaseToken(),
                lease.getOwner(),
                lastContinuationToken);
            lease.setContinuationToken(lastContinuationToken);
        } else {
            logger.warn("Continuation token not found for split for partition: {}, with owner: {}",
                lease.getLeaseToken(),
                lease.getOwner());
        }
        return this.synchronizer.splitPartition(lease)
            .flatMap(l -> {
                if (this.shouldSkipDirectLeaseAssignment) {
                    return Mono.empty();
                } else {
                    l.setProperties(lease.getProperties());
                    return this.addOrUpdateLease(l);
                }
            }).then(this.leaseManager.delete(lease))
            .onErrorResume(throwable -> {
                logger.warn("Partition {}: failed to split", lease.getLeaseToken(), throwable);
                return  Mono.empty();
            });
    }
}
