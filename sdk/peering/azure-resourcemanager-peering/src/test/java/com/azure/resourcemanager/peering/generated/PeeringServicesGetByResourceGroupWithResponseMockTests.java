// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.peering.PeeringManager;
import com.azure.resourcemanager.peering.models.PeeringService;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PeeringServicesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"sku\":{\"name\":\"gvmnvuqeq\"},\"properties\":{\"peeringServiceLocation\":\"spastjbkkdmf\",\"peeringServiceProvider\":\"est\",\"provisioningState\":\"Succeeded\",\"providerPrimaryPeeringLocation\":\"rriloz\",\"providerBackupPeeringLocation\":\"eewchpxlktw\"},\"location\":\"uziycsl\",\"tags\":{\"ztcktyh\":\"f\",\"rqzz\":\"tqedcgzulwm\",\"toepryu\":\"rjvpglydzgkrvqee\",\"pzdm\":\"nwy\"},\"id\":\"vzvfvaawzqadfl\",\"name\":\"z\",\"type\":\"riglaec\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PeeringManager manager = PeeringManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PeeringService response = manager.peeringServices()
            .getByResourceGroupWithResponse("wiivwzjbhyzsx", "rkambt", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("gvmnvuqeq", response.sku().name());
        Assertions.assertEquals("uziycsl", response.location());
        Assertions.assertEquals("f", response.tags().get("ztcktyh"));
        Assertions.assertEquals("spastjbkkdmf", response.peeringServiceLocation());
        Assertions.assertEquals("est", response.peeringServiceProvider());
        Assertions.assertEquals("rriloz", response.providerPrimaryPeeringLocation());
        Assertions.assertEquals("eewchpxlktw", response.providerBackupPeeringLocation());
    }
}
