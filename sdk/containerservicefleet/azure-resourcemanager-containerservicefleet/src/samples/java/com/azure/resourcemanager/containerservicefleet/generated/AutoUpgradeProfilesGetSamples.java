// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

/**
 * Samples for AutoUpgradeProfiles Get.
 */
public final class AutoUpgradeProfilesGetSamples {
    /*
     * x-ms-original-file: 2025-03-01/AutoUpgradeProfiles_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Gets an AutoUpgradeProfile resource. - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void getsAnAutoUpgradeProfileResourceGeneratedByMaximumSetRule(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.autoUpgradeProfiles()
            .getWithResponse("rgfleets", "fleet1", "autoupgradeprofile1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2025-03-01/AutoUpgradeProfiles_Get.json
     */
    /**
     * Sample code: Gets an AutoUpgradeProfile resource.
     * 
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void getsAnAutoUpgradeProfileResource(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.autoUpgradeProfiles()
            .getWithResponse("rg1", "fleet1", "autoupgradeprofile1", com.azure.core.util.Context.NONE);
    }
}
