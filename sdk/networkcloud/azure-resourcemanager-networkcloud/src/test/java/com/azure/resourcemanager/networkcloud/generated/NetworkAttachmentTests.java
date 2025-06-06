// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.DefaultGateway;
import com.azure.resourcemanager.networkcloud.models.NetworkAttachment;
import com.azure.resourcemanager.networkcloud.models.VirtualMachineIpAllocationMethod;
import org.junit.jupiter.api.Assertions;

public final class NetworkAttachmentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkAttachment model = BinaryData.fromString(
            "{\"attachedNetworkId\":\"akufgmjz\",\"defaultGateway\":\"True\",\"ipAllocationMethod\":\"Static\",\"ipv4Address\":\"rtwaenuuzko\",\"ipv6Address\":\"minrfdw\",\"macAddress\":\"uhhziuiefozbhdm\",\"networkAttachmentName\":\"l\"}")
            .toObject(NetworkAttachment.class);
        Assertions.assertEquals("akufgmjz", model.attachedNetworkId());
        Assertions.assertEquals(DefaultGateway.TRUE, model.defaultGateway());
        Assertions.assertEquals(VirtualMachineIpAllocationMethod.STATIC, model.ipAllocationMethod());
        Assertions.assertEquals("rtwaenuuzko", model.ipv4Address());
        Assertions.assertEquals("minrfdw", model.ipv6Address());
        Assertions.assertEquals("l", model.networkAttachmentName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkAttachment model = new NetworkAttachment().withAttachedNetworkId("akufgmjz")
            .withDefaultGateway(DefaultGateway.TRUE)
            .withIpAllocationMethod(VirtualMachineIpAllocationMethod.STATIC)
            .withIpv4Address("rtwaenuuzko")
            .withIpv6Address("minrfdw")
            .withNetworkAttachmentName("l");
        model = BinaryData.fromObject(model).toObject(NetworkAttachment.class);
        Assertions.assertEquals("akufgmjz", model.attachedNetworkId());
        Assertions.assertEquals(DefaultGateway.TRUE, model.defaultGateway());
        Assertions.assertEquals(VirtualMachineIpAllocationMethod.STATIC, model.ipAllocationMethod());
        Assertions.assertEquals("rtwaenuuzko", model.ipv4Address());
        Assertions.assertEquals("minrfdw", model.ipv6Address());
        Assertions.assertEquals("l", model.networkAttachmentName());
    }
}
