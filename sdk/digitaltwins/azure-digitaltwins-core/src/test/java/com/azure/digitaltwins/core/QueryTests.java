// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.digitaltwins.core;

import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.Page;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.digitaltwins.core.helpers.UniqueIdHelper;
import java.io.IOException;

import com.azure.digitaltwins.core.models.QueryOptions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.azure.digitaltwins.core.TestHelper.DISPLAY_NAME_WITH_ARGUMENTS;
import static org.junit.jupiter.api.Assertions.*;

public class QueryTests extends QueryTestBase {

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.digitaltwins.core.TestHelper#getTestParameters")
    @Override
    public void validQuerySucceeds(HttpClient httpClient, DigitalTwinsServiceVersion serviceVersion)
        throws IOException {
        DigitalTwinsClient client = getClient(httpClient, serviceVersion);
        int pageSize = 3;
        String floorModelId = UniqueIdHelper.getUniqueModelId(TestAssetDefaults.FLOOR_MODEL_ID_PREFIX, client,
            getRandomIntegerStringGenerator());
        String roomModelId = UniqueIdHelper.getUniqueModelId(TestAssetDefaults.ROOM_MODEL_ID_PREFIX, client,
            getRandomIntegerStringGenerator());
        List<String> roomTwinIds = new ArrayList<>();

        try {
            String roomModelPayload = TestAssetsHelper.getRoomModelPayload(roomModelId, floorModelId);
            client.createModelsWithResponse(new ArrayList<>(Arrays.asList(roomModelPayload)), Context.NONE);

            // Create a room twin with property "IsOccupied" : true
            String roomTwin = TestAssetsHelper.getRoomTwinPayload(roomModelId);
            for (int i = 0; i < pageSize + 1; i++) {
                String roomTwinId = UniqueIdHelper.getUniqueDigitalTwinId(TestAssetDefaults.ROOM_TWIN_ID_PREFIX, client,
                    getRandomIntegerStringGenerator());
                roomTwinIds.add(roomTwinId);
                client.createOrReplaceDigitalTwinWithResponse(roomTwinId,
                    deserializeJsonString(roomTwin, BasicDigitalTwin::fromJson), BasicDigitalTwin.class, null,
                    Context.NONE);
            }

            sleepIfRunningAgainstService(5000);

            String queryString = "SELECT * FROM digitaltwins where IsOccupied = true";

            PagedIterable<BasicDigitalTwin> pagedQueryResponse = client.query(queryString, BasicDigitalTwin.class,
                new QueryOptions().setMaxItemsPerPage(pageSize), Context.NONE);

            for (BasicDigitalTwin digitalTwin : pagedQueryResponse) {
                assertNotNull(digitalTwin.getContents().get("IsOccupied"));
            }

            pagedQueryResponse = client.query(queryString, BasicDigitalTwin.class,
                new QueryOptions().setMaxItemsPerPage(pageSize), Context.NONE);

            // Test that page size hint works, and that all returned pages either have the page size hint amount of
            // elements, or have no continuation token (signaling that it is the last page)
            int pageCount = 0;
            for (Page<BasicDigitalTwin> digitalTwinsPage : pagedQueryResponse.iterableByPage()) {
                pageCount++;
                int elementsPerPage = 0;
                for (BasicDigitalTwin ignored : digitalTwinsPage.getElements()) {
                    elementsPerPage++;
                }

                if (digitalTwinsPage.getContinuationToken() != null) {
                    assertFalse(elementsPerPage < pageSize, "Unexpected page size for a non-terminal page");
                }
            }

            assertTrue(pageCount > 1, "Expected more than one page of query results");
        } finally {
            // Cleanup
            for (String roomTwinId : roomTwinIds) {
                client.deleteDigitalTwin(roomTwinId);
            }
            if (roomModelId != null) {
                client.deleteModel(roomModelId);
            }
        }
    }
}
