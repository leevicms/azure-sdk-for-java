// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.SkuResource;
import com.azure.resourcemanager.cognitiveservices.models.SkuTier;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DeploymentsListSkusMockTests {
    @Test
    public void testListSkus() throws Exception {
        String responseStr
            = "{\"value\":[{\"resourceType\":\"bafvafhlbylcc\",\"sku\":{\"name\":\"vxrh\",\"tier\":\"Premium\",\"size\":\"wrso\",\"family\":\"ltdb\",\"capacity\":1334796632},\"capacity\":{\"minimum\":230207599,\"maximum\":1425884711,\"step\":1212551870,\"default\":956599834,\"allowedValues\":[796664640,1226325830,1723621906,1084783265]}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CognitiveServicesManager manager = CognitiveServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<SkuResource> response
            = manager.deployments().listSkus("ledynojpz", "uwfbzkkdtnhqsy", "ljselp", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("bafvafhlbylcc", response.iterator().next().resourceType());
        Assertions.assertEquals("vxrh", response.iterator().next().sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, response.iterator().next().sku().tier());
        Assertions.assertEquals("wrso", response.iterator().next().sku().size());
        Assertions.assertEquals("ltdb", response.iterator().next().sku().family());
        Assertions.assertEquals(1334796632, response.iterator().next().sku().capacity());
        Assertions.assertEquals(230207599, response.iterator().next().capacity().minimum());
        Assertions.assertEquals(1425884711, response.iterator().next().capacity().maximum());
        Assertions.assertEquals(1212551870, response.iterator().next().capacity().step());
        Assertions.assertEquals(956599834, response.iterator().next().capacity().defaultProperty());
        Assertions.assertEquals(796664640, response.iterator().next().capacity().allowedValues().get(0));
    }
}
