// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for ReverseGeocodingResultTypeEnum.
 */
public final class ReverseGeocodingResultTypeEnum extends ExpandableStringEnum<ReverseGeocodingResultTypeEnum> {
    /**
     * Static value Address for ReverseGeocodingResultTypeEnum.
     */
    @Generated
    public static final ReverseGeocodingResultTypeEnum ADDRESS = fromString("Address");

    /**
     * Static value Neighborhood for ReverseGeocodingResultTypeEnum.
     */
    @Generated
    public static final ReverseGeocodingResultTypeEnum NEIGHBORHOOD = fromString("Neighborhood");

    /**
     * Static value PopulatedPlace for ReverseGeocodingResultTypeEnum.
     */
    @Generated
    public static final ReverseGeocodingResultTypeEnum POPULATED_PLACE = fromString("PopulatedPlace");

    /**
     * Static value Postcode1 for ReverseGeocodingResultTypeEnum.
     */
    @Generated
    public static final ReverseGeocodingResultTypeEnum POSTCODE1 = fromString("Postcode1");

    /**
     * Static value AdminDivision1 for ReverseGeocodingResultTypeEnum.
     */
    @Generated
    public static final ReverseGeocodingResultTypeEnum ADMIN_DIVISION1 = fromString("AdminDivision1");

    /**
     * Static value AdminDivision2 for ReverseGeocodingResultTypeEnum.
     */
    @Generated
    public static final ReverseGeocodingResultTypeEnum ADMIN_DIVISION2 = fromString("AdminDivision2");

    /**
     * Static value CountryRegion for ReverseGeocodingResultTypeEnum.
     */
    @Generated
    public static final ReverseGeocodingResultTypeEnum COUNTRY_REGION = fromString("CountryRegion");

    /**
     * Creates a new instance of ReverseGeocodingResultTypeEnum value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ReverseGeocodingResultTypeEnum() {
    }

    /**
     * Creates or finds a ReverseGeocodingResultTypeEnum from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ReverseGeocodingResultTypeEnum.
     */
    @Generated
    public static ReverseGeocodingResultTypeEnum fromString(String name) {
        return fromString(name, ReverseGeocodingResultTypeEnum.class);
    }

    /**
     * Gets known ReverseGeocodingResultTypeEnum values.
     * 
     * @return known ReverseGeocodingResultTypeEnum values.
     */
    @Generated
    public static Collection<ReverseGeocodingResultTypeEnum> values() {
        return values(ReverseGeocodingResultTypeEnum.class);
    }
}
