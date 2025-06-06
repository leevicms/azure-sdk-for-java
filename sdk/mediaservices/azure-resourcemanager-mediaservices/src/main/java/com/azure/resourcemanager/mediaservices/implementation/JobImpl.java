// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.JobInner;
import com.azure.resourcemanager.mediaservices.models.Job;
import com.azure.resourcemanager.mediaservices.models.JobInput;
import com.azure.resourcemanager.mediaservices.models.JobOutput;
import com.azure.resourcemanager.mediaservices.models.JobState;
import com.azure.resourcemanager.mediaservices.models.Priority;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class JobImpl implements Job, Job.Definition, Job.Update {
    private JobInner innerObject;

    private final com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public JobState state() {
        return this.innerModel().state();
    }

    public String description() {
        return this.innerModel().description();
    }

    public JobInput input() {
        return this.innerModel().input();
    }

    public OffsetDateTime lastModified() {
        return this.innerModel().lastModified();
    }

    public List<JobOutput> outputs() {
        List<JobOutput> inner = this.innerModel().outputs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Priority priority() {
        return this.innerModel().priority();
    }

    public Map<String, String> correlationData() {
        Map<String, String> inner = this.innerModel().correlationData();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public JobInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mediaservices.MediaServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String transformName;

    private String jobName;

    public JobImpl withExistingTransform(String resourceGroupName, String accountName, String transformName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.transformName = transformName;
        return this;
    }

    public Job create() {
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .createWithResponse(resourceGroupName, accountName, transformName, jobName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public Job create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .createWithResponse(resourceGroupName, accountName, transformName, jobName, this.innerModel(), context)
            .getValue();
        return this;
    }

    JobImpl(String name, com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerObject = new JobInner();
        this.serviceManager = serviceManager;
        this.jobName = name;
    }

    public JobImpl update() {
        return this;
    }

    public Job apply() {
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .updateWithResponse(resourceGroupName, accountName, transformName, jobName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public Job apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .updateWithResponse(resourceGroupName, accountName, transformName, jobName, this.innerModel(), context)
            .getValue();
        return this;
    }

    JobImpl(JobInner innerObject, com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "mediaServices");
        this.transformName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "transforms");
        this.jobName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "jobs");
    }

    public Job refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .getWithResponse(resourceGroupName, accountName, transformName, jobName, Context.NONE)
            .getValue();
        return this;
    }

    public Job refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .getWithResponse(resourceGroupName, accountName, transformName, jobName, context)
            .getValue();
        return this;
    }

    public Response<Void> cancelJobWithResponse(Context context) {
        return serviceManager.jobs()
            .cancelJobWithResponse(resourceGroupName, accountName, transformName, jobName, context);
    }

    public void cancelJob() {
        serviceManager.jobs().cancelJob(resourceGroupName, accountName, transformName, jobName);
    }

    public JobImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public JobImpl withInput(JobInput input) {
        this.innerModel().withInput(input);
        return this;
    }

    public JobImpl withOutputs(List<JobOutput> outputs) {
        this.innerModel().withOutputs(outputs);
        return this;
    }

    public JobImpl withPriority(Priority priority) {
        this.innerModel().withPriority(priority);
        return this;
    }

    public JobImpl withCorrelationData(Map<String, String> correlationData) {
        this.innerModel().withCorrelationData(correlationData);
        return this;
    }
}
