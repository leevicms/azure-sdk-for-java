// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.JobQueryParameter;

/**
 * Samples for ReplicationJobs Export.
 */
public final class ReplicationJobsExportSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2025-01-01/examples
     * /ReplicationJobs_Export.json
     */
    /**
     * Sample code: Exports the details of the Azure Site Recovery jobs of the vault.
     * 
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void exportsTheDetailsOfTheAzureSiteRecoveryJobsOfTheVault(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationJobs()
            .export("resourceGroupPS1", "vault1",
                new JobQueryParameter().withStartTime("2017-04-27T14:26:51.9161395Z")
                    .withEndTime("2017-05-04T14:26:51.9161395Z")
                    .withAffectedObjectTypes("")
                    .withJobStatus(""),
                com.azure.core.util.Context.NONE);
    }
}
