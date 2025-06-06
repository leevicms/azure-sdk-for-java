// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResolveHealthError;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResolveHealthInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResolveHealthInputProperties;
import java.util.Arrays;

/**
 * Samples for ReplicationProtectedItems ResolveHealthErrors.
 */
public final class ReplicationProtectedItemsResolveHealthErrorsSam {
    /*
     * x-ms-original-file:
     * specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2025-01-01/examples
     * /ReplicationProtectedItems_ResolveHealthErrors.json
     */
    /**
     * Sample code: Resolve health errors.
     * 
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void
        resolveHealthErrors(com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationProtectedItems()
            .resolveHealthErrors("resourceGroupPS1", "vault1", "cloud1", "cloud_6d224fc6-f326-5d35-96de-fbf51efb3179",
                "f8491e4f-817a-40dd-a90c-af773978c75b",
                new ResolveHealthInput().withProperties(new ResolveHealthInputProperties()
                    .withHealthErrors(Arrays.asList(new ResolveHealthError().withHealthErrorId("3:8020")))),
                com.azure.core.util.Context.NONE);
    }
}
