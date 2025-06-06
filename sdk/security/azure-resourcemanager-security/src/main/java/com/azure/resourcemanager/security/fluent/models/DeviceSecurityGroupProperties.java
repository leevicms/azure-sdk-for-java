// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.security.models.AllowlistCustomAlertRule;
import com.azure.resourcemanager.security.models.DenylistCustomAlertRule;
import com.azure.resourcemanager.security.models.ThresholdCustomAlertRule;
import com.azure.resourcemanager.security.models.TimeWindowCustomAlertRule;
import java.io.IOException;
import java.util.List;

/**
 * describes properties of a security group.
 */
@Fluent
public final class DeviceSecurityGroupProperties implements JsonSerializable<DeviceSecurityGroupProperties> {
    /*
     * The list of custom alert threshold rules.
     */
    private List<ThresholdCustomAlertRule> thresholdRules;

    /*
     * The list of custom alert time-window rules.
     */
    private List<TimeWindowCustomAlertRule> timeWindowRules;

    /*
     * The allow-list custom alert rules.
     */
    private List<AllowlistCustomAlertRule> allowlistRules;

    /*
     * The deny-list custom alert rules.
     */
    private List<DenylistCustomAlertRule> denylistRules;

    /**
     * Creates an instance of DeviceSecurityGroupProperties class.
     */
    public DeviceSecurityGroupProperties() {
    }

    /**
     * Get the thresholdRules property: The list of custom alert threshold rules.
     * 
     * @return the thresholdRules value.
     */
    public List<ThresholdCustomAlertRule> thresholdRules() {
        return this.thresholdRules;
    }

    /**
     * Set the thresholdRules property: The list of custom alert threshold rules.
     * 
     * @param thresholdRules the thresholdRules value to set.
     * @return the DeviceSecurityGroupProperties object itself.
     */
    public DeviceSecurityGroupProperties withThresholdRules(List<ThresholdCustomAlertRule> thresholdRules) {
        this.thresholdRules = thresholdRules;
        return this;
    }

    /**
     * Get the timeWindowRules property: The list of custom alert time-window rules.
     * 
     * @return the timeWindowRules value.
     */
    public List<TimeWindowCustomAlertRule> timeWindowRules() {
        return this.timeWindowRules;
    }

    /**
     * Set the timeWindowRules property: The list of custom alert time-window rules.
     * 
     * @param timeWindowRules the timeWindowRules value to set.
     * @return the DeviceSecurityGroupProperties object itself.
     */
    public DeviceSecurityGroupProperties withTimeWindowRules(List<TimeWindowCustomAlertRule> timeWindowRules) {
        this.timeWindowRules = timeWindowRules;
        return this;
    }

    /**
     * Get the allowlistRules property: The allow-list custom alert rules.
     * 
     * @return the allowlistRules value.
     */
    public List<AllowlistCustomAlertRule> allowlistRules() {
        return this.allowlistRules;
    }

    /**
     * Set the allowlistRules property: The allow-list custom alert rules.
     * 
     * @param allowlistRules the allowlistRules value to set.
     * @return the DeviceSecurityGroupProperties object itself.
     */
    public DeviceSecurityGroupProperties withAllowlistRules(List<AllowlistCustomAlertRule> allowlistRules) {
        this.allowlistRules = allowlistRules;
        return this;
    }

    /**
     * Get the denylistRules property: The deny-list custom alert rules.
     * 
     * @return the denylistRules value.
     */
    public List<DenylistCustomAlertRule> denylistRules() {
        return this.denylistRules;
    }

    /**
     * Set the denylistRules property: The deny-list custom alert rules.
     * 
     * @param denylistRules the denylistRules value to set.
     * @return the DeviceSecurityGroupProperties object itself.
     */
    public DeviceSecurityGroupProperties withDenylistRules(List<DenylistCustomAlertRule> denylistRules) {
        this.denylistRules = denylistRules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (thresholdRules() != null) {
            thresholdRules().forEach(e -> e.validate());
        }
        if (timeWindowRules() != null) {
            timeWindowRules().forEach(e -> e.validate());
        }
        if (allowlistRules() != null) {
            allowlistRules().forEach(e -> e.validate());
        }
        if (denylistRules() != null) {
            denylistRules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("thresholdRules", this.thresholdRules,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("timeWindowRules", this.timeWindowRules,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("allowlistRules", this.allowlistRules,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("denylistRules", this.denylistRules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeviceSecurityGroupProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeviceSecurityGroupProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeviceSecurityGroupProperties.
     */
    public static DeviceSecurityGroupProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeviceSecurityGroupProperties deserializedDeviceSecurityGroupProperties
                = new DeviceSecurityGroupProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("thresholdRules".equals(fieldName)) {
                    List<ThresholdCustomAlertRule> thresholdRules
                        = reader.readArray(reader1 -> ThresholdCustomAlertRule.fromJson(reader1));
                    deserializedDeviceSecurityGroupProperties.thresholdRules = thresholdRules;
                } else if ("timeWindowRules".equals(fieldName)) {
                    List<TimeWindowCustomAlertRule> timeWindowRules
                        = reader.readArray(reader1 -> TimeWindowCustomAlertRule.fromJson(reader1));
                    deserializedDeviceSecurityGroupProperties.timeWindowRules = timeWindowRules;
                } else if ("allowlistRules".equals(fieldName)) {
                    List<AllowlistCustomAlertRule> allowlistRules
                        = reader.readArray(reader1 -> AllowlistCustomAlertRule.fromJson(reader1));
                    deserializedDeviceSecurityGroupProperties.allowlistRules = allowlistRules;
                } else if ("denylistRules".equals(fieldName)) {
                    List<DenylistCustomAlertRule> denylistRules
                        = reader.readArray(reader1 -> DenylistCustomAlertRule.fromJson(reader1));
                    deserializedDeviceSecurityGroupProperties.denylistRules = denylistRules;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeviceSecurityGroupProperties;
        });
    }
}
