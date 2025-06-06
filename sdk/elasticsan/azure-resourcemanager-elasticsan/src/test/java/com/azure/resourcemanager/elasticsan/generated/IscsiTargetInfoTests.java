// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.models.IscsiTargetInfo;
import com.azure.resourcemanager.elasticsan.models.OperationalStatus;
import org.junit.jupiter.api.Assertions;

public final class IscsiTargetInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IscsiTargetInfo model = BinaryData.fromString(
            "{\"targetIqn\":\"ocmnyyazttbtwwrq\",\"targetPortalHostname\":\"edckzywbiexzfey\",\"targetPortalPort\":2061798656,\"provisioningState\":\"Deleting\",\"status\":\"Stopped (deallocated)\"}")
            .toObject(IscsiTargetInfo.class);
        Assertions.assertEquals(OperationalStatus.STOPPED_DEALLOCATED, model.status());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IscsiTargetInfo model = new IscsiTargetInfo().withStatus(OperationalStatus.STOPPED_DEALLOCATED);
        model = BinaryData.fromObject(model).toObject(IscsiTargetInfo.class);
        Assertions.assertEquals(OperationalStatus.STOPPED_DEALLOCATED, model.status());
    }
}
