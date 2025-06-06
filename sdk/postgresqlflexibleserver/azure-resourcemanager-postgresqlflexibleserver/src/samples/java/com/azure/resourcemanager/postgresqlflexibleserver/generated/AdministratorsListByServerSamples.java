// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

/**
 * Samples for Administrators ListByServer.
 */
public final class AdministratorsListByServerSamples {
    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2025-01-01-preview/examples/
     * AdministratorsListByServer.json
     */
    /**
     * Sample code: AdministratorsListByServer.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void
        administratorsListByServer(com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.administrators().listByServer("testrg", "pgtestsvc1", com.azure.core.util.Context.NONE);
    }
}
