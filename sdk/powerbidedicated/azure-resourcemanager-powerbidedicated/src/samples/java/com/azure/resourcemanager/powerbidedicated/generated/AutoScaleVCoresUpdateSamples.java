// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.generated;

import com.azure.resourcemanager.powerbidedicated.models.AutoScaleVCore;
import com.azure.resourcemanager.powerbidedicated.models.AutoScaleVCoreSku;
import com.azure.resourcemanager.powerbidedicated.models.VCoreSkuTier;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AutoScaleVCores Update.
 */
public final class AutoScaleVCoresUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/powerbidedicated/resource-manager/Microsoft.PowerBIdedicated/stable/2021-01-01/examples/
     * updateAutoScaleVCore.json
     */
    /**
     * Sample code: Update auto scale v-core parameters.
     * 
     * @param manager Entry point to PowerBIDedicatedManager.
     */
    public static void
        updateAutoScaleVCoreParameters(com.azure.resourcemanager.powerbidedicated.PowerBIDedicatedManager manager) {
        AutoScaleVCore resource = manager.autoScaleVCores()
            .getByResourceGroupWithResponse("TestRG", "testvcore", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("testKey", "fakeTokenPlaceholder"))
            .withSku(new AutoScaleVCoreSku().withName("AutoScale").withTier(VCoreSkuTier.AUTO_SCALE).withCapacity(0))
            .withCapacityLimit(20)
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
