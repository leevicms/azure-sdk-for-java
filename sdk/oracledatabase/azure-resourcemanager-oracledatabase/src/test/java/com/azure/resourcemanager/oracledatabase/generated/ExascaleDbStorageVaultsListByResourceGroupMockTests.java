// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.oracledatabase.OracleDatabaseManager;
import com.azure.resourcemanager.oracledatabase.models.ExascaleDbStorageVault;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ExascaleDbStorageVaultsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"additionalFlashCacheInPercent\":1359553105,\"description\":\"hsycxhxzgaz\",\"displayName\":\"taboidvmf\",\"highCapacityDatabaseStorageInput\":{\"totalSizeInGbs\":1970077416},\"highCapacityDatabaseStorage\":{\"availableSizeInGbs\":926086414,\"totalSizeInGbs\":1895248762},\"timeZone\":\"sepdfgk\",\"provisioningState\":\"Canceled\",\"lifecycleState\":\"Available\",\"lifecycleDetails\":\"ngb\",\"vmClusterCount\":151823445,\"ocid\":\"ahokqtobkauxofsh\",\"ociUrl\":\"hwpnulaiywzejywh\"},\"zones\":[\"koj\",\"llndnpd\",\"rpqaf\"],\"location\":\"ug\",\"tags\":{\"ypococtfjgtixr\":\"fhyete\"},\"id\":\"vzuyturmlmu\",\"name\":\"wolba\",\"type\":\"iropionszon\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        OracleDatabaseManager manager = OracleDatabaseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<ExascaleDbStorageVault> response
            = manager.exascaleDbStorageVaults().listByResourceGroup("ewmozqvbu", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ug", response.iterator().next().location());
        Assertions.assertEquals("fhyete", response.iterator().next().tags().get("ypococtfjgtixr"));
        Assertions.assertEquals(1359553105, response.iterator().next().properties().additionalFlashCacheInPercent());
        Assertions.assertEquals("hsycxhxzgaz", response.iterator().next().properties().description());
        Assertions.assertEquals("taboidvmf", response.iterator().next().properties().displayName());
        Assertions.assertEquals(1970077416,
            response.iterator().next().properties().highCapacityDatabaseStorageInput().totalSizeInGbs());
        Assertions.assertEquals("sepdfgk", response.iterator().next().properties().timeZone());
        Assertions.assertEquals("koj", response.iterator().next().zones().get(0));
    }
}
