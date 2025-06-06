// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.cloudhealth.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * ML-based model variants.
 */
public final class DynamicThresholdModel extends ExpandableStringEnum<DynamicThresholdModel> {
    /**
     * Anomaly detection model.
     */
    public static final DynamicThresholdModel ANOMALY_DETECTION = fromString("AnomalyDetection");

    /**
     * Creates a new instance of DynamicThresholdModel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DynamicThresholdModel() {
    }

    /**
     * Creates or finds a DynamicThresholdModel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DynamicThresholdModel.
     */
    public static DynamicThresholdModel fromString(String name) {
        return fromString(name, DynamicThresholdModel.class);
    }

    /**
     * Gets known DynamicThresholdModel values.
     * 
     * @return known DynamicThresholdModel values.
     */
    public static Collection<DynamicThresholdModel> values() {
        return values(DynamicThresholdModel.class);
    }
}
