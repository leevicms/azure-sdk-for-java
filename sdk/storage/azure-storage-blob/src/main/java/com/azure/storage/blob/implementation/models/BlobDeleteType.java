// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for BlobDeleteType.
 */
public final class BlobDeleteType extends ExpandableStringEnum<BlobDeleteType> {
    /**
     * Static value Permanent for BlobDeleteType.
     */
    @Generated
    public static final BlobDeleteType PERMANENT = fromString("Permanent");

    /**
     * Creates a new instance of BlobDeleteType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public BlobDeleteType() {
    }

    /**
     * Creates or finds a BlobDeleteType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BlobDeleteType.
     */
    @Generated
    public static BlobDeleteType fromString(String name) {
        return fromString(name, BlobDeleteType.class);
    }

    /**
     * Gets known BlobDeleteType values.
     * 
     * @return known BlobDeleteType values.
     */
    @Generated
    public static Collection<BlobDeleteType> values() {
        return values(BlobDeleteType.class);
    }
}
