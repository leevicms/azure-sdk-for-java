// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.models.WorkloadNetworkGateway;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class WorkloadNetworksListGatewaysMockTests {
    @Test
    public void testListGateways() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"displayName\":\"mmaxrizkzobgo\",\"path\":\"lhslnelxieixyn\"},\"id\":\"xecwcro\",\"name\":\"phslhcawjutifdw\",\"type\":\"mvi\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AvsManager manager = AvsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<WorkloadNetworkGateway> response
            = manager.workloadNetworks().listGateways("ovzidsx", "aabzmif", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("mmaxrizkzobgo", response.iterator().next().displayName());
    }
}
