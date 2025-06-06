// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.GlobalSchemaContractProperties;
import com.azure.resourcemanager.apimanagement.models.SchemaType;
import org.junit.jupiter.api.Assertions;

public final class GlobalSchemaContractPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GlobalSchemaContractProperties model = BinaryData.fromString(
            "{\"schemaType\":\"xml\",\"description\":\"b\",\"value\":\"datauywevtjrieikmwl\",\"document\":\"dataklfnisyxgucbmt\",\"provisioningState\":\"dscnns\"}")
            .toObject(GlobalSchemaContractProperties.class);
        Assertions.assertEquals(SchemaType.XML, model.schemaType());
        Assertions.assertEquals("b", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GlobalSchemaContractProperties model = new GlobalSchemaContractProperties().withSchemaType(SchemaType.XML)
            .withDescription("b")
            .withValue("datauywevtjrieikmwl")
            .withDocument("dataklfnisyxgucbmt");
        model = BinaryData.fromObject(model).toObject(GlobalSchemaContractProperties.class);
        Assertions.assertEquals(SchemaType.XML, model.schemaType());
        Assertions.assertEquals("b", model.description());
    }
}
