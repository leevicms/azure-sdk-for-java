// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.cloudhealth.generated;

/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2025-05-01-preview/Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to CloudHealthManager.
     */
    public static void operationsList(com.azure.resourcemanager.cloudhealth.CloudHealthManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
