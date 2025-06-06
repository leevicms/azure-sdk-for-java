// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.resourcemanager.frontdoor.models.Profile;
import com.azure.resourcemanager.frontdoor.models.State;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for NetworkExperimentProfiles Update.
 */
public final class NetworkExperimentProfilesUpdateSamples {
    /*
     * x-ms-original-file: specification/frontdoor/resource-manager/Microsoft.Network/stable/2019-11-01/examples/
     * NetworkExperimentUpdateProfile.json
     */
    /**
     * Sample code: Updates an Experiment.
     * 
     * @param manager Entry point to FrontDoorManager.
     */
    public static void updatesAnExperiment(com.azure.resourcemanager.frontdoor.FrontDoorManager manager) {
        Profile resource = manager.networkExperimentProfiles()
            .getByResourceGroupWithResponse("MyResourceGroup", "MyProfile", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder"))
            .withEnabledState(State.ENABLED)
            .apply();
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
