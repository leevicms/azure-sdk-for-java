// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ExpressRoutePorts ListByResourceGroup.
 */
public final class ExpressRoutePortsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * ExpressRoutePortListByResourceGroup.json
     */
    /**
     * Sample code: ExpressRoutePortListByResourceGroup.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void expressRoutePortListByResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getExpressRoutePorts()
            .listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
