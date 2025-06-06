// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.purestorageblock.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.purestorageblock.PureStorageBlockManager;
import com.azure.resourcemanager.purestorageblock.models.AvsVmVolume;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AvsVmVolumesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"storagePoolInternalId\":\"cgyypro\",\"storagePoolResourceId\":\"ypundmbxhugc\",\"volumeInternalId\":\"k\",\"displayName\":\"lgorb\",\"space\":{\"totalUsed\":2304427621056901546,\"unique\":4613723734586965909,\"snapshots\":7226613213127469062,\"shared\":7430344282584886847},\"softDeletion\":{\"destroyed\":false,\"eradicationTimestamp\":\"fvnz\"},\"createdTimestamp\":\"jtotpvopvpbd\",\"provisionedSize\":9002474166715105889,\"volumeType\":\"avs\",\"avs\":{\"diskId\":\"hedsvqwthmkyib\",\"diskName\":\"ysi\",\"folder\":\"sgqcwdho\",\"avsVmInternalId\":\"sdtmcdzs\",\"avsVmResourceId\":\"fcohdxbzlmcmu\",\"avsVmName\":\"pcvhdbevwqqxeys\",\"avsStorageContainerResourceId\":\"onqzinkfkbgbzbow\"},\"provisioningState\":\"Canceled\"},\"id\":\"clj\",\"name\":\"ygvkzqkjj\",\"type\":\"okbzef\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PureStorageBlockManager manager = PureStorageBlockManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        AvsVmVolume response = manager.avsVmVolumes()
            .getWithResponse("fuxtyasiibmiybnn", "stgnl", "hnmgixhcm", "vmqfoud", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertFalse(response.properties().softDeletion().destroyed());
    }
}
