// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.resourcemanager.managednetworkfabric.models.NetworkRackType;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for NetworkRacks Create.
 */
public final class NetworkRacksCreateSamples {
    /*
     * x-ms-original-file:
     * specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/stable/2023-06-15/examples/
     * NetworkRacks_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkRacks_Create_MaximumSet_Gen.
     * 
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void networkRacksCreateMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager.networkRacks()
            .define("example-rack")
            .withRegion("eastuseuap")
            .withExistingResourceGroup("example-rg")
            .withNetworkFabricId(
                "/subscriptions/1234ABCD-0A1B-1234-5678-123456ABCDEF/resourcegroups/example-rg/providers/Microsoft.ManagedNetworkFabric/networkFabrics/example-networkFabric")
            .withTags(mapOf("keyID", "fakeTokenPlaceholder"))
            .withNetworkRackType(NetworkRackType.AGGREGATE)
            .withAnnotation("annotation")
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
