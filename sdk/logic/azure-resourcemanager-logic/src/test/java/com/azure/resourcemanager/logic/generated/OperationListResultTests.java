// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.fluent.models.OperationInner;
import com.azure.resourcemanager.logic.models.OperationDisplay;
import com.azure.resourcemanager.logic.models.OperationListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model = BinaryData.fromString(
            "{\"value\":[{\"origin\":\"cyxnza\",\"name\":\"l\",\"display\":{\"provider\":\"hgdzrcqdvapo\",\"resource\":\"minerejrdxh\",\"operation\":\"vmxhztdcadbm\",\"description\":\"gqmitrpa\"},\"properties\":\"datah\"},{\"origin\":\"cyasz\",\"name\":\"hmtcihupoeljfni\",\"display\":{\"provider\":\"xajitaawbsd\",\"resource\":\"qbdcbnrgrp\",\"operation\":\"rymtgtn\",\"description\":\"sopuwesmxodyto\"},\"properties\":\"datawld\"},{\"origin\":\"n\",\"name\":\"sdgmuaqtqn\",\"display\":{\"provider\":\"iptzg\",\"resource\":\"ujukenk\",\"operation\":\"ombkg\",\"description\":\"obuihprvokodrpy\"},\"properties\":\"datazxr\"}],\"nextLink\":\"oycufkxygxoub\"}")
            .toObject(OperationListResult.class);
        Assertions.assertEquals("cyxnza", model.value().get(0).origin());
        Assertions.assertEquals("l", model.value().get(0).name());
        Assertions.assertEquals("hgdzrcqdvapo", model.value().get(0).display().provider());
        Assertions.assertEquals("minerejrdxh", model.value().get(0).display().resource());
        Assertions.assertEquals("vmxhztdcadbm", model.value().get(0).display().operation());
        Assertions.assertEquals("gqmitrpa", model.value().get(0).display().description());
        Assertions.assertEquals("oycufkxygxoub", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model = new OperationListResult().withValue(Arrays.asList(
            new OperationInner().withOrigin("cyxnza")
                .withName("l")
                .withDisplay(new OperationDisplay().withProvider("hgdzrcqdvapo")
                    .withResource("minerejrdxh")
                    .withOperation("vmxhztdcadbm")
                    .withDescription("gqmitrpa"))
                .withProperties("datah"),
            new OperationInner().withOrigin("cyasz")
                .withName("hmtcihupoeljfni")
                .withDisplay(new OperationDisplay().withProvider("xajitaawbsd")
                    .withResource("qbdcbnrgrp")
                    .withOperation("rymtgtn")
                    .withDescription("sopuwesmxodyto"))
                .withProperties("datawld"),
            new OperationInner().withOrigin("n")
                .withName("sdgmuaqtqn")
                .withDisplay(new OperationDisplay().withProvider("iptzg")
                    .withResource("ujukenk")
                    .withOperation("ombkg")
                    .withDescription("obuihprvokodrpy"))
                .withProperties("datazxr")))
            .withNextLink("oycufkxygxoub");
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
        Assertions.assertEquals("cyxnza", model.value().get(0).origin());
        Assertions.assertEquals("l", model.value().get(0).name());
        Assertions.assertEquals("hgdzrcqdvapo", model.value().get(0).display().provider());
        Assertions.assertEquals("minerejrdxh", model.value().get(0).display().resource());
        Assertions.assertEquals("vmxhztdcadbm", model.value().get(0).display().operation());
        Assertions.assertEquals("gqmitrpa", model.value().get(0).display().description());
        Assertions.assertEquals("oycufkxygxoub", model.nextLink());
    }
}
