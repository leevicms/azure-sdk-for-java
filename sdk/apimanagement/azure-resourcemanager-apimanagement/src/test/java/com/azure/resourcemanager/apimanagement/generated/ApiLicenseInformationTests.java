// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.ApiLicenseInformation;
import org.junit.jupiter.api.Assertions;

public final class ApiLicenseInformationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiLicenseInformation model = BinaryData.fromString("{\"name\":\"nltyfsoppusuesnz\",\"url\":\"ej\"}")
            .toObject(ApiLicenseInformation.class);
        Assertions.assertEquals("nltyfsoppusuesnz", model.name());
        Assertions.assertEquals("ej", model.url());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiLicenseInformation model = new ApiLicenseInformation().withName("nltyfsoppusuesnz").withUrl("ej");
        model = BinaryData.fromObject(model).toObject(ApiLicenseInformation.class);
        Assertions.assertEquals("nltyfsoppusuesnz", model.name());
        Assertions.assertEquals("ej", model.url());
    }
}
