// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.AgentOptions;
import com.azure.resourcemanager.networkcloud.models.HugepagesSize;
import org.junit.jupiter.api.Assertions;

public final class AgentOptionsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgentOptions model = BinaryData.fromString("{\"hugepagesCount\":7080556178524665851,\"hugepagesSize\":\"2M\"}")
            .toObject(AgentOptions.class);
        Assertions.assertEquals(7080556178524665851L, model.hugepagesCount());
        Assertions.assertEquals(HugepagesSize.TWOM, model.hugepagesSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgentOptions model
            = new AgentOptions().withHugepagesCount(7080556178524665851L).withHugepagesSize(HugepagesSize.TWOM);
        model = BinaryData.fromObject(model).toObject(AgentOptions.class);
        Assertions.assertEquals(7080556178524665851L, model.hugepagesCount());
        Assertions.assertEquals(HugepagesSize.TWOM, model.hugepagesSize());
    }
}
