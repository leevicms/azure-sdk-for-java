// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

/**
 * The desired action for requests captured by this rule.
 */
public enum IpFilterActionType {
    /**
     * Enum value Accept.
     */
    ACCEPT("Accept"),

    /**
     * Enum value Reject.
     */
    REJECT("Reject");

    /**
     * The actual serialized value for a IpFilterActionType instance.
     */
    private final String value;

    IpFilterActionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IpFilterActionType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed IpFilterActionType object, or null if unable to parse.
     */
    public static IpFilterActionType fromString(String value) {
        if (value == null) {
            return null;
        }
        IpFilterActionType[] items = IpFilterActionType.values();
        for (IpFilterActionType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
