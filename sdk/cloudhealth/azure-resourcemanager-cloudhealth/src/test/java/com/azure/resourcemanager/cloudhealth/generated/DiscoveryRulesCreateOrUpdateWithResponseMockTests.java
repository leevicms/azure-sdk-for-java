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
import com.azure.resourcemanager.cloudhealth.models.DiscoveryRule;
import com.azure.resourcemanager.cloudhealth.models.DiscoveryRuleProperties;
import com.azure.resourcemanager.cloudhealth.models.DiscoveryRuleRecommendedSignalsBehavior;
import com.azure.resourcemanager.cloudhealth.models.DiscoveryRuleRelationshipDiscoveryBehavior;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DiscoveryRulesCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"displayName\":\"yjt\",\"resourceGraphQuery\":\"vofqzhvfc\",\"authenticationSetting\":\"byfmowuxr\",\"discoverRelationships\":\"Enabled\",\"addRecommendedSignals\":\"Enabled\",\"deletionDate\":\"2021-11-01T00:27:01Z\",\"errorMessage\":\"xfzwi\",\"numberOfDiscoveredEntities\":1157352083,\"entityName\":\"zjb\"},\"id\":\"zsxjrkambtrneg\",\"name\":\"mnvuqe\",\"type\":\"vldspa\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CloudHealthManager manager = CloudHealthManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        DiscoveryRule response = manager.discoveryRules()
            .define("g")
            .withExistingHealthmodel("widf", "xsspuunnoxyhk")
            .withProperties(new DiscoveryRuleProperties().withDisplayName("hp")
                .withResourceGraphQuery("hoqca")
                .withAuthenticationSetting("ewda")
                .withDiscoverRelationships(DiscoveryRuleRelationshipDiscoveryBehavior.ENABLED)
                .withAddRecommendedSignals(DiscoveryRuleRecommendedSignalsBehavior.ENABLED))
            .create();

        Assertions.assertEquals("yjt", response.properties().displayName());
        Assertions.assertEquals("vofqzhvfc", response.properties().resourceGraphQuery());
        Assertions.assertEquals("byfmowuxr", response.properties().authenticationSetting());
        Assertions.assertEquals(DiscoveryRuleRelationshipDiscoveryBehavior.ENABLED,
            response.properties().discoverRelationships());
        Assertions.assertEquals(DiscoveryRuleRecommendedSignalsBehavior.ENABLED,
            response.properties().addRecommendedSignals());
    }
}
