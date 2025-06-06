// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.relay.RelayManager;
import com.azure.resourcemanager.relay.models.RelayNamespace;
import com.azure.resourcemanager.relay.models.SkuTier;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class NamespacesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"sku\":{\"tier\":\"Standard\"},\"properties\":{\"provisioningState\":\"Updating\",\"createdAt\":\"2021-04-19T05:30:16Z\",\"updatedAt\":\"2021-10-29T21:44:59Z\",\"serviceBusEndpoint\":\"xmnteiwaop\",\"metricId\":\"mijcmmxdcufufs\"},\"location\":\"pymzidnsezcxtbzs\",\"tags\":{\"sne\":\"c\"},\"id\":\"mdwzjeiachboo\",\"name\":\"flnrosfqpteehzz\",\"type\":\"ypyqrimzinp\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RelayManager manager = RelayManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<RelayNamespace> response
            = manager.namespaces().listByResourceGroup("zwdzuh", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("pymzidnsezcxtbzs", response.iterator().next().location());
        Assertions.assertEquals("c", response.iterator().next().tags().get("sne"));
        Assertions.assertEquals(SkuTier.STANDARD, response.iterator().next().sku().tier());
    }
}
