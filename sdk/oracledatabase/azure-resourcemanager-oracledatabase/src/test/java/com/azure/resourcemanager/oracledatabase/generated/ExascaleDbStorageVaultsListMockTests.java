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

public final class ExascaleDbStorageVaultsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"additionalFlashCacheInPercent\":1738803510,\"description\":\"jinnix\",\"displayName\":\"awrtmjfjmyccxlz\",\"highCapacityDatabaseStorageInput\":{\"totalSizeInGbs\":1400866339},\"highCapacityDatabaseStorage\":{\"availableSizeInGbs\":963389591,\"totalSizeInGbs\":1682316966},\"timeZone\":\"khenlus\",\"provisioningState\":\"Succeeded\",\"lifecycleState\":\"Terminating\",\"lifecycleDetails\":\"xtxrdcqtjvidt\",\"vmClusterCount\":695049640,\"ocid\":\"uslvyjtcvuwkasi\",\"ociUrl\":\"esfuught\"},\"zones\":[\"ecjxe\",\"gtuhxuicbu\",\"wmrswnjlxuzrh\"],\"location\":\"usxjbaqehg\",\"tags\":{\"xncnwfe\":\"hzjqatucoige\",\"cgbjbgdlfgt\":\"bnwgfmxj\",\"naquflq\":\"y\",\"zeqyjleziun\":\"ctqhamzjrwdk\"},\"id\":\"xdfzantkw\",\"name\":\"eg\",\"type\":\"amlbnseqacjjvpil\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        OracleDatabaseManager manager = OracleDatabaseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<ExascaleDbStorageVault> response
            = manager.exascaleDbStorageVaults().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("usxjbaqehg", response.iterator().next().location());
        Assertions.assertEquals("hzjqatucoige", response.iterator().next().tags().get("xncnwfe"));
        Assertions.assertEquals(1738803510, response.iterator().next().properties().additionalFlashCacheInPercent());
        Assertions.assertEquals("jinnix", response.iterator().next().properties().description());
        Assertions.assertEquals("awrtmjfjmyccxlz", response.iterator().next().properties().displayName());
        Assertions.assertEquals(1400866339,
            response.iterator().next().properties().highCapacityDatabaseStorageInput().totalSizeInGbs());
        Assertions.assertEquals("khenlus", response.iterator().next().properties().timeZone());
        Assertions.assertEquals("ecjxe", response.iterator().next().zones().get(0));
    }
}
