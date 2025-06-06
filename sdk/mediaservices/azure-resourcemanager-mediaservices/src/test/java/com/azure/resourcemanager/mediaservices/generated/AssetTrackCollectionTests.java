// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetTrackInner;
import com.azure.resourcemanager.mediaservices.models.AssetTrackCollection;
import com.azure.resourcemanager.mediaservices.models.TrackBase;
import java.util.Arrays;

public final class AssetTrackCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AssetTrackCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"track\":{\"@odata.type\":\"TrackBase\"},\"provisioningState\":\"Failed\"},\"id\":\"mweriofzpy\",\"name\":\"semwabnet\",\"type\":\"hhszh\"},{\"properties\":{\"track\":{\"@odata.type\":\"TrackBase\"},\"provisioningState\":\"Succeeded\"},\"id\":\"wiwubm\",\"name\":\"mbes\",\"type\":\"dnkwwtppjflcxog\"}]}")
            .toObject(AssetTrackCollection.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AssetTrackCollection model
            = new AssetTrackCollection().withValue(Arrays.asList(new AssetTrackInner().withTrack(new TrackBase()),
                new AssetTrackInner().withTrack(new TrackBase())));
        model = BinaryData.fromObject(model).toObject(AssetTrackCollection.class);
    }
}
