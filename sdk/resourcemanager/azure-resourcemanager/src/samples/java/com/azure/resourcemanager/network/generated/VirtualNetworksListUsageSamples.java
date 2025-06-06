// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualNetworks ListUsage.
 */
public final class VirtualNetworksListUsageSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/VirtualNetworkListUsage.json
     */
    /**
     * Sample code: VnetGetUsage.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void vnetGetUsage(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworks()
            .listUsage("rg1", "vnetName", com.azure.core.util.Context.NONE);
    }
}
