// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NatGateways List.
 */
public final class NatGatewaysListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/NatGatewayListAll.json
     */
    /**
     * Sample code: List all nat gateways.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllNatGateways(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getNatGateways().list(com.azure.core.util.Context.NONE);
    }
}
