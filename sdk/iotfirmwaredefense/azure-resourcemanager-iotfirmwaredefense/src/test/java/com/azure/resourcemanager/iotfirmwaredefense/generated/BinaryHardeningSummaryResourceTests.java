// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotfirmwaredefense.models.BinaryHardeningSummaryResource;
import org.junit.jupiter.api.Assertions;

public final class BinaryHardeningSummaryResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BinaryHardeningSummaryResource model = BinaryData.fromString(
            "{\"summaryType\":\"BinaryHardening\",\"totalFiles\":4538179811311563630,\"notExecutableStackCount\":9056885702416460224,\"positionIndependentExecutableCount\":5303445195272830471,\"relocationReadOnlyCount\":7203686124674464131,\"stackCanaryCount\":163949755346838285,\"strippedBinaryCount\":1525093327016049085,\"provisioningState\":\"Extracting\"}")
            .toObject(BinaryHardeningSummaryResource.class);
        Assertions.assertEquals(4538179811311563630L, model.totalFiles());
        Assertions.assertEquals(9056885702416460224L, model.notExecutableStackCount());
        Assertions.assertEquals(5303445195272830471L, model.positionIndependentExecutableCount());
        Assertions.assertEquals(7203686124674464131L, model.relocationReadOnlyCount());
        Assertions.assertEquals(163949755346838285L, model.stackCanaryCount());
        Assertions.assertEquals(1525093327016049085L, model.strippedBinaryCount());
    }
}
