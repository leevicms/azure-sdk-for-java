// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.resourcemanager.postgresqlflexibleserver.models.ThreatProtectionName;

/**
 * Samples for ServerThreatProtectionSettings Get.
 */
public final class ServerThreatProtectionSettingsGetSamples {
    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2025-01-01-preview/examples/
     * ServerThreatProtectionSettingsGet.json
     */
    /**
     * Sample code: Get a server's Threat Protection settings.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void getAServerSThreatProtectionSettings(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.serverThreatProtectionSettings()
            .getWithResponse("threatprotection-6852", "threatprotection-2080", ThreatProtectionName.DEFAULT,
                com.azure.core.util.Context.NONE);
    }
}
