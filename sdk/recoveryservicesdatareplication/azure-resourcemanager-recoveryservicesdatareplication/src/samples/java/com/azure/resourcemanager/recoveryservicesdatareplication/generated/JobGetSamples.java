// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

/**
 * Samples for Job Get.
 */
public final class JobGetSamples {
    /*
     * x-ms-original-file: 2024-09-01/Job_Get.json
     */
    /**
     * Sample code: Gets the job.
     * 
     * @param manager Entry point to RecoveryServicesDataReplicationManager.
     */
    public static void getsTheJob(
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager manager) {
        manager.jobs()
            .getWithResponse("rgrecoveryservicesdatareplication", "4", "ZGH4y", com.azure.core.util.Context.NONE);
    }
}
