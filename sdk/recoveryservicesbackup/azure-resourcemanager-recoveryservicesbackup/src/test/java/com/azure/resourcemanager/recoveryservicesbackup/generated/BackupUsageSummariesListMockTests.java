// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementUsage;
import com.azure.resourcemanager.recoveryservicesbackup.models.UsagesUnit;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupUsageSummariesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"unit\":\"CountPerSecond\",\"quotaPeriod\":\"atqxmbjroumzzn\",\"nextResetTime\":\"2020-12-30T11:20:16Z\",\"currentValue\":7934901934803337359,\"limit\":4839026448793785641,\"name\":{\"value\":\"xonjtpusl\",\"localizedValue\":\"wpvtiotzbpdbol\"}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<BackupManagementUsage> response
            = manager.backupUsageSummaries().list("hdxlw", "ojbf", "zd", "fnjyix", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(UsagesUnit.COUNT_PER_SECOND, response.iterator().next().unit());
        Assertions.assertEquals("atqxmbjroumzzn", response.iterator().next().quotaPeriod());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-30T11:20:16Z"),
            response.iterator().next().nextResetTime());
        Assertions.assertEquals(7934901934803337359L, response.iterator().next().currentValue());
        Assertions.assertEquals(4839026448793785641L, response.iterator().next().limit());
        Assertions.assertEquals("xonjtpusl", response.iterator().next().name().value());
        Assertions.assertEquals("wpvtiotzbpdbol", response.iterator().next().name().localizedValue());
    }
}
