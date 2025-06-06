// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for SecurityUserRules Get.
 */
public final class SecurityUserRulesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * NetworkManagerSecurityUserRuleGet.json
     */
    /**
     * Sample code: Gets a security user rule.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsASecurityUserRule(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getSecurityUserRules()
            .getWithResponse("rg1", "testNetworkManager", "myTestSecurityConfig", "testRuleCollection",
                "SampleUserRule", com.azure.core.util.Context.NONE);
    }
}
