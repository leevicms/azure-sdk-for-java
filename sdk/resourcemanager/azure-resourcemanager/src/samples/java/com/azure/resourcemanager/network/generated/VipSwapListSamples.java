// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VipSwap List.
 */
public final class VipSwapListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/CloudServiceSwapList.json
     */
    /**
     * Sample code: Get swap resource list.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getSwapResourceList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVipSwaps()
            .listWithResponse("rg1", "testCloudService", com.azure.core.util.Context.NONE);
    }
}
