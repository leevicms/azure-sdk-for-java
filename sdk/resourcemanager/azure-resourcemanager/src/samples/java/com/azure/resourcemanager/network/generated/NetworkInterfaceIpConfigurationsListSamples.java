// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NetworkInterfaceIpConfigurations List.
 */
public final class NetworkInterfaceIpConfigurationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * NetworkInterfaceIPConfigurationList.json
     */
    /**
     * Sample code: NetworkInterfaceIPConfigurationList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkInterfaceIPConfigurationList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkInterfaceIpConfigurations()
            .list("testrg", "nic1", com.azure.core.util.Context.NONE);
    }
}
