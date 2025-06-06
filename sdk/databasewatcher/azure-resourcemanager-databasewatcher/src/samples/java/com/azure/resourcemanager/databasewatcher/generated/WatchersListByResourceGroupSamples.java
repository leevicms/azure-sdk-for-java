// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.databasewatcher.generated;

/**
 * Samples for Watchers ListByResourceGroup.
 */
public final class WatchersListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2025-01-02/Watchers_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: Watchers_ListByResourceGroup_MaximumSet.
     * 
     * @param manager Entry point to DatabaseWatcherManager.
     */
    public static void watchersListByResourceGroupMaximumSet(
        com.azure.resourcemanager.databasewatcher.DatabaseWatcherManager manager) {
        manager.watchers().listByResourceGroup("rgWatcher", com.azure.core.util.Context.NONE);
    }
}
