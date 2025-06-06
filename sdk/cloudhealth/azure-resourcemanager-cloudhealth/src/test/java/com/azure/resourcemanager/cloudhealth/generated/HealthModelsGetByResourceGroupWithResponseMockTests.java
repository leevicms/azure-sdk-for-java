// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.cloudhealth.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.cloudhealth.CloudHealthManager;
import com.azure.resourcemanager.cloudhealth.models.DiscoveryRuleRecommendedSignalsBehavior;
import com.azure.resourcemanager.cloudhealth.models.HealthModel;
import com.azure.resourcemanager.cloudhealth.models.ManagedServiceIdentityType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class HealthModelsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"dataplaneEndpoint\":\"x\",\"provisioningState\":\"Creating\",\"discovery\":{\"scope\":\"zikywgg\",\"addRecommendedSignals\":\"Disabled\",\"identity\":\"lla\"}},\"identity\":{\"principalId\":\"lwuip\",\"tenantId\":\"cjzkzivgvvcna\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"tdaaygdvwvg\":{\"principalId\":\"nxxmueedndrdv\",\"clientId\":\"kwqqtchealmf\"},\"himdbl\":{\"principalId\":\"ohgwxrtfudxepxg\",\"clientId\":\"agvrvmnpkuk\"},\"xw\":{\"principalId\":\"wi\",\"clientId\":\"njhf\"}}},\"location\":\"zk\",\"tags\":{\"fjawneaivxwczel\":\"qreyfkzi\",\"r\":\"c\",\"xbjhwuaanozjosph\":\"lsfeaenwabfatkld\",\"ag\":\"oulpjrv\"},\"id\":\"rvimjwosytxitcsk\",\"name\":\"cktqumiekkezzi\",\"type\":\"hlyfjhdgqgg\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CloudHealthManager manager = CloudHealthManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        HealthModel response = manager.healthModels()
            .getByResourceGroupWithResponse("ocrkvcikh", "vpa", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("zk", response.location());
        Assertions.assertEquals("qreyfkzi", response.tags().get("fjawneaivxwczel"));
        Assertions.assertEquals("zikywgg", response.properties().discovery().scope());
        Assertions.assertEquals(DiscoveryRuleRecommendedSignalsBehavior.DISABLED,
            response.properties().discovery().addRecommendedSignals());
        Assertions.assertEquals("lla", response.properties().discovery().identity());
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.identity().type());
    }
}
