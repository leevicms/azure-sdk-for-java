// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.FromEachInputFile;
import com.azure.resourcemanager.mediaservices.models.TrackDescriptor;
import java.util.Arrays;

public final class FromEachInputFileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FromEachInputFile model = BinaryData.fromString(
            "{\"@odata.type\":\"#Microsoft.Media.FromEachInputFile\",\"includedTracks\":[{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"}]}")
            .toObject(FromEachInputFile.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FromEachInputFile model = new FromEachInputFile().withIncludedTracks(
            Arrays.asList(new TrackDescriptor(), new TrackDescriptor(), new TrackDescriptor(), new TrackDescriptor()));
        model = BinaryData.fromObject(model).toObject(FromEachInputFile.class);
    }
}
