// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.logs.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The data type of this column.
 */
public final class LogsColumnType extends ExpandableStringEnum<LogsColumnType> {
    /**
     * Static value bool for LogsColumnType.
     */
    @Generated
    public static final LogsColumnType BOOL = fromString("bool");

    /**
     * Static value datetime for LogsColumnType.
     */
    @Generated
    public static final LogsColumnType DATETIME = fromString("datetime");

    /**
     * Static value dynamic for LogsColumnType.
     */
    @Generated
    public static final LogsColumnType DYNAMIC = fromString("dynamic");

    /**
     * Static value int for LogsColumnType.
     */
    @Generated
    public static final LogsColumnType INT = fromString("int");

    /**
     * Static value long for LogsColumnType.
     */
    @Generated
    public static final LogsColumnType LONG = fromString("long");

    /**
     * Static value real for LogsColumnType.
     */
    @Generated
    public static final LogsColumnType REAL = fromString("real");

    /**
     * Static value string for LogsColumnType.
     */
    @Generated
    public static final LogsColumnType STRING = fromString("string");

    /**
     * Static value guid for LogsColumnType.
     */
    @Generated
    public static final LogsColumnType GUID = fromString("guid");

    /**
     * Static value decimal for LogsColumnType.
     */
    @Generated
    public static final LogsColumnType DECIMAL = fromString("decimal");

    /**
     * Static value timespan for LogsColumnType.
     */
    @Generated
    public static final LogsColumnType TIMESPAN = fromString("timespan");

    /**
     * Creates a new instance of LogsColumnType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public LogsColumnType() {
    }

    /**
     * Creates or finds a LogsColumnType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LogsColumnType.
     */
    @Generated
    public static LogsColumnType fromString(String name) {
        return fromString(name, LogsColumnType.class);
    }

    /**
     * Gets known LogsColumnType values.
     * 
     * @return known LogsColumnType values.
     */
    @Generated
    public static Collection<LogsColumnType> values() {
        return values(LogsColumnType.class);
    }
}
