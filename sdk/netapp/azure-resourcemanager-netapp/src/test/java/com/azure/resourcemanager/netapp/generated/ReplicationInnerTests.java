// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.ReplicationInner;
import com.azure.resourcemanager.netapp.models.EndpointType;
import com.azure.resourcemanager.netapp.models.ReplicationSchedule;
import org.junit.jupiter.api.Assertions;

public final class ReplicationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicationInner model = BinaryData.fromString(
            "{\"replicationId\":\"sytgadgvraea\",\"endpointType\":\"src\",\"replicationSchedule\":\"daily\",\"remoteVolumeResourceId\":\"zar\",\"remoteVolumeRegion\":\"lquuijfqkacewii\"}")
            .toObject(ReplicationInner.class);
        Assertions.assertEquals(EndpointType.SRC, model.endpointType());
        Assertions.assertEquals(ReplicationSchedule.DAILY, model.replicationSchedule());
        Assertions.assertEquals("zar", model.remoteVolumeResourceId());
        Assertions.assertEquals("lquuijfqkacewii", model.remoteVolumeRegion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicationInner model = new ReplicationInner().withEndpointType(EndpointType.SRC)
            .withReplicationSchedule(ReplicationSchedule.DAILY)
            .withRemoteVolumeResourceId("zar")
            .withRemoteVolumeRegion("lquuijfqkacewii");
        model = BinaryData.fromObject(model).toObject(ReplicationInner.class);
        Assertions.assertEquals(EndpointType.SRC, model.endpointType());
        Assertions.assertEquals(ReplicationSchedule.DAILY, model.replicationSchedule());
        Assertions.assertEquals("zar", model.remoteVolumeResourceId());
        Assertions.assertEquals("lquuijfqkacewii", model.remoteVolumeRegion());
    }
}
