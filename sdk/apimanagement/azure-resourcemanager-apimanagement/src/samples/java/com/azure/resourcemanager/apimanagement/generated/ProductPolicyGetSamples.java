// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.resourcemanager.apimanagement.models.PolicyIdName;

/**
 * Samples for ProductPolicy Get.
 */
public final class ProductPolicyGetSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementGetProductPolicy.json
     */
    /**
     * Sample code: ApiManagementGetProductPolicy.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementGetProductPolicy(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.productPolicies()
            .getWithResponse("rg1", "apimService1", "kjoshiarmTemplateProduct4", PolicyIdName.POLICY, null,
                com.azure.core.util.Context.NONE);
    }
}
