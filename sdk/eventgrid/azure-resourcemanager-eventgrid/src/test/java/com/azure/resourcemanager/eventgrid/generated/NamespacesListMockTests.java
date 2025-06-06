// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.CustomDomainValidationState;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.IpActionType;
import com.azure.resourcemanager.eventgrid.models.Namespace;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.ResourceProvisioningState;
import com.azure.resourcemanager.eventgrid.models.RoutingIdentityType;
import com.azure.resourcemanager.eventgrid.models.SkuName;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import com.azure.resourcemanager.eventgrid.models.TopicSpacesConfigurationState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class NamespacesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"privateEndpointConnections\":[{\"properties\":{\"privateEndpoint\":{},\"groupIds\":[\"fjhkeizcpihtdmiw\"],\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Deleting\"},\"id\":\"tycaydbjzcqyml\",\"name\":\"fnzhmhsurlgw\",\"type\":\"kpmmz\"}],\"provisioningState\":\"CreateFailed\",\"topicsConfiguration\":{\"hostname\":\"olawiubmoms\",\"customDomains\":[{\"fullyQualifiedDomainName\":\"jhvvlrlo\",\"validationState\":\"Pending\",\"identity\":{},\"certificateUrl\":\"majnkd\",\"expectedTxtRecordName\":\"q\",\"expectedTxtRecordValue\":\"ns\"},{\"fullyQualifiedDomainName\":\"aeqkzfzqxjoshoh\",\"validationState\":\"Approved\",\"identity\":{},\"certificateUrl\":\"egpkhxrmex\",\"expectedTxtRecordName\":\"lwkbfok\",\"expectedTxtRecordValue\":\"hupzerufgjblc\"}]},\"topicSpacesConfiguration\":{\"state\":\"Disabled\",\"routeTopicResourceId\":\"cemftzgyykyalu\",\"hostname\":\"kd\",\"routingEnrichments\":{\"static\":[{\"valueType\":\"StaticRoutingEnrichment\"},{\"valueType\":\"StaticRoutingEnrichment\"}],\"dynamic\":[{}]},\"maximumSessionExpiryInHours\":500622504,\"maximumClientSessionsPerAuthenticationName\":1425473509,\"routingIdentityInfo\":{\"type\":\"SystemAssigned\",\"userAssignedIdentity\":\"jjnnu\"},\"customDomains\":[{\"fullyQualifiedDomainName\":\"kkmhm\",\"validationState\":\"ErrorRetrievingDnsRecord\",\"identity\":{},\"certificateUrl\":\"m\",\"expectedTxtRecordName\":\"cifrhjulrsulwzpf\",\"expectedTxtRecordValue\":\"snawmhhgzotfri\"},{\"fullyQualifiedDomainName\":\"rgkoekvzwxxyx\",\"validationState\":\"Approved\",\"identity\":{},\"certificateUrl\":\"t\",\"expectedTxtRecordName\":\"xmolpcqydeyk\",\"expectedTxtRecordValue\":\"kiczdfrj\"}]},\"isZoneRedundant\":true,\"publicNetworkAccess\":\"Enabled\",\"inboundIpRules\":[{\"ipMask\":\"boohxbms\",\"action\":\"Allow\"},{\"ipMask\":\"sx\",\"action\":\"Allow\"},{\"ipMask\":\"ewuyqa\",\"action\":\"Allow\"}],\"minimumTlsVersionAllowed\":\"1.1\"},\"sku\":{\"name\":\"Standard\",\"capacity\":1515998294},\"identity\":{\"type\":\"SystemAssigned\",\"principalId\":\"daurgho\",\"tenantId\":\"aexbkhxjxjo\",\"userAssignedIdentities\":{\"m\":{\"principalId\":\"xrkdknkobektm\",\"clientId\":\"z\"}}},\"location\":\"amicbigwcdgz\",\"tags\":{\"abmdlqj\":\"nuxkeuair\",\"xlhupmomihzbdnp\":\"edpf\",\"cghf\":\"pkcdpreyxely\",\"sfxrkbhammgm\":\"rufssjyg\"},\"id\":\"fm\",\"name\":\"fgvqcpdw\",\"type\":\"gquxweysland\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<Namespace> response
            = manager.namespaces().list("knsjulugd", 1822277572, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("amicbigwcdgz", response.iterator().next().location());
        Assertions.assertEquals("nuxkeuair", response.iterator().next().tags().get("abmdlqj"));
        Assertions.assertEquals(SkuName.STANDARD, response.iterator().next().sku().name());
        Assertions.assertEquals(1515998294, response.iterator().next().sku().capacity());
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("daurgho", response.iterator().next().identity().principalId());
        Assertions.assertEquals("aexbkhxjxjo", response.iterator().next().identity().tenantId());
        Assertions.assertEquals("xrkdknkobektm",
            response.iterator().next().identity().userAssignedIdentities().get("m").principalId());
        Assertions.assertEquals("z",
            response.iterator().next().identity().userAssignedIdentities().get("m").clientId());
        Assertions.assertEquals("fjhkeizcpihtdmiw",
            response.iterator().next().privateEndpointConnections().get(0).groupIds().get(0));
        Assertions.assertEquals(ResourceProvisioningState.DELETING,
            response.iterator().next().privateEndpointConnections().get(0).provisioningState());
        Assertions.assertEquals("jhvvlrlo",
            response.iterator().next().topicsConfiguration().customDomains().get(0).fullyQualifiedDomainName());
        Assertions.assertEquals(CustomDomainValidationState.PENDING,
            response.iterator().next().topicsConfiguration().customDomains().get(0).validationState());
        Assertions.assertEquals("majnkd",
            response.iterator().next().topicsConfiguration().customDomains().get(0).certificateUrl());
        Assertions.assertEquals("q",
            response.iterator().next().topicsConfiguration().customDomains().get(0).expectedTxtRecordName());
        Assertions.assertEquals("ns",
            response.iterator().next().topicsConfiguration().customDomains().get(0).expectedTxtRecordValue());
        Assertions.assertEquals(TopicSpacesConfigurationState.DISABLED,
            response.iterator().next().topicSpacesConfiguration().state());
        Assertions.assertEquals("cemftzgyykyalu",
            response.iterator().next().topicSpacesConfiguration().routeTopicResourceId());
        Assertions.assertEquals(500622504,
            response.iterator().next().topicSpacesConfiguration().maximumSessionExpiryInHours());
        Assertions.assertEquals(1425473509,
            response.iterator().next().topicSpacesConfiguration().maximumClientSessionsPerAuthenticationName());
        Assertions.assertEquals(RoutingIdentityType.SYSTEM_ASSIGNED,
            response.iterator().next().topicSpacesConfiguration().routingIdentityInfo().type());
        Assertions.assertEquals("jjnnu",
            response.iterator().next().topicSpacesConfiguration().routingIdentityInfo().userAssignedIdentity());
        Assertions.assertEquals("kkmhm",
            response.iterator().next().topicSpacesConfiguration().customDomains().get(0).fullyQualifiedDomainName());
        Assertions.assertEquals(CustomDomainValidationState.ERROR_RETRIEVING_DNS_RECORD,
            response.iterator().next().topicSpacesConfiguration().customDomains().get(0).validationState());
        Assertions.assertEquals("m",
            response.iterator().next().topicSpacesConfiguration().customDomains().get(0).certificateUrl());
        Assertions.assertEquals("cifrhjulrsulwzpf",
            response.iterator().next().topicSpacesConfiguration().customDomains().get(0).expectedTxtRecordName());
        Assertions.assertEquals("snawmhhgzotfri",
            response.iterator().next().topicSpacesConfiguration().customDomains().get(0).expectedTxtRecordValue());
        Assertions.assertEquals(true, response.iterator().next().isZoneRedundant());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, response.iterator().next().publicNetworkAccess());
        Assertions.assertEquals("boohxbms", response.iterator().next().inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, response.iterator().next().inboundIpRules().get(0).action());
        Assertions.assertEquals(TlsVersion.ONE_ONE, response.iterator().next().minimumTlsVersionAllowed());
    }
}
