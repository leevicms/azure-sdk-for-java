// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ServiceEndpointPolicies List.
 */
public final class ServiceEndpointPoliciesListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/ServiceEndpointPolicyListAll.
     * json
     */
    /**
     * Sample code: List all service endpoint policy.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllServiceEndpointPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getServiceEndpointPolicies().list(com.azure.core.util.Context.NONE);
    }
}
