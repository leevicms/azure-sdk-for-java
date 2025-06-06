// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.elasticsan.ElasticSanManager;
import com.azure.resourcemanager.elasticsan.models.PrivateEndpointConnection;
import com.azure.resourcemanager.elasticsan.models.PrivateEndpointServiceConnectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Pending\",\"privateEndpoint\":{\"id\":\"cjaesgvvs\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"jguq\",\"actionsRequired\":\"wygzlvdnkfxusem\"},\"groupIds\":[\"rmuhapfcq\",\"psqxq\",\"psvuoymgc\",\"elvezrypq\"]},\"id\":\"feo\",\"name\":\"erqwkyhkobopg\",\"type\":\"edkowepbqpcrfk\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ElasticSanManager manager = ElasticSanManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<PrivateEndpointConnection> response
            = manager.privateEndpointConnections().list("vtbvkayh", "tnvyqiatkzwp", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.REJECTED,
            response.iterator().next().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("jguq", response.iterator().next().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("wygzlvdnkfxusem",
            response.iterator().next().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("rmuhapfcq", response.iterator().next().groupIds().get(0));
    }
}
