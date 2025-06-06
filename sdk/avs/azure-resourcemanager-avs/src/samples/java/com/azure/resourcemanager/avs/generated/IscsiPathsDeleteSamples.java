// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.generated;

/**
 * Samples for IscsiPaths Delete.
 */
public final class IscsiPathsDeleteSamples {
    /*
     * x-ms-original-file: 2024-09-01/IscsiPaths_Delete.json
     */
    /**
     * Sample code: IscsiPaths_Delete.
     * 
     * @param manager Entry point to AvsManager.
     */
    public static void iscsiPathsDelete(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.iscsiPaths().delete("group1", "cloud1", com.azure.core.util.Context.NONE);
    }
}
