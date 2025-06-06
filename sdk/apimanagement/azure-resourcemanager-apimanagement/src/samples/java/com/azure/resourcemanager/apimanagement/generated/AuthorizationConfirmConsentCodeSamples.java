// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.resourcemanager.apimanagement.models.AuthorizationConfirmConsentCodeRequestContract;

/**
 * Samples for Authorization ConfirmConsentCode.
 */
public final class AuthorizationConfirmConsentCodeSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementPostAuthorizationConfirmConsentCodeRequest.json
     */
    /**
     * Sample code: ApiManagementPostAuthorizationConfirmConsentCodeRequest.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementPostAuthorizationConfirmConsentCodeRequest(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.authorizations()
            .confirmConsentCodeWithResponse("rg1", "apimService1", "aadwithauthcode", "authz1",
                new AuthorizationConfirmConsentCodeRequestContract().withConsentCode("fakeTokenPlaceholder"),
                com.azure.core.util.Context.NONE);
    }
}
