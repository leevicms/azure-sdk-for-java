// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.IssueContractBaseProperties;
import com.azure.resourcemanager.apimanagement.models.State;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class IssueContractBasePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IssueContractBaseProperties model = BinaryData
            .fromString("{\"createdDate\":\"2021-02-08T19:58:59Z\",\"state\":\"closed\",\"apiId\":\"qsdtcjbctvivuzq\"}")
            .toObject(IssueContractBaseProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-08T19:58:59Z"), model.createdDate());
        Assertions.assertEquals(State.CLOSED, model.state());
        Assertions.assertEquals("qsdtcjbctvivuzq", model.apiId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IssueContractBaseProperties model
            = new IssueContractBaseProperties().withCreatedDate(OffsetDateTime.parse("2021-02-08T19:58:59Z"))
                .withState(State.CLOSED)
                .withApiId("qsdtcjbctvivuzq");
        model = BinaryData.fromObject(model).toObject(IssueContractBaseProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-08T19:58:59Z"), model.createdDate());
        Assertions.assertEquals(State.CLOSED, model.state());
        Assertions.assertEquals("qsdtcjbctvivuzq", model.apiId());
    }
}
