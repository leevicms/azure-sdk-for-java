// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.generated;

/**
 * Samples for WorkloadNetworks CreatePublicIp.
 */
public final class WorkloadNetworksCreatePublicIpSamples {
    /*
     * x-ms-original-file: 2024-09-01/WorkloadNetworks_CreatePublicIP.json
     */
    /**
     * Sample code: WorkloadNetworks_CreatePublicIP.
     * 
     * @param manager Entry point to AvsManager.
     */
    public static void workloadNetworksCreatePublicIP(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.workloadNetworks()
            .definePublicIp("publicIP1")
            .withExistingPrivateCloud("group1", "cloud1")
            .withDisplayName("publicIP1")
            .withNumberOfPublicIPs(32L)
            .create();
    }
}
