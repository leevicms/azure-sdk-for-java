// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for GremlinResources DeleteGremlinDatabase.
 */
public final class GremlinResourcesDeleteGremlinDatabaseSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2025-04-15/examples/
     * CosmosDBGremlinDatabaseDelete.json
     */
    /**
     * Sample code: CosmosDBGremlinDatabaseDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBGremlinDatabaseDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getGremlinResources()
            .deleteGremlinDatabase("rg1", "ddb1", "databaseName", com.azure.core.util.Context.NONE);
    }
}
