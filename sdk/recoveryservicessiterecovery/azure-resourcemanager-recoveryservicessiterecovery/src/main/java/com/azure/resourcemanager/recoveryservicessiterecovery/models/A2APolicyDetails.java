// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A2A specific policy details.
 */
@Fluent
public final class A2APolicyDetails extends PolicyProviderSpecificDetails {
    /*
     * Gets the class type. Overridden in derived classes.
     */
    private String instanceType = "A2A";

    /*
     * The recovery point threshold in minutes.
     */
    private Integer recoveryPointThresholdInMinutes;

    /*
     * The duration in minutes until which the recovery points need to be stored.
     */
    private Integer recoveryPointHistory;

    /*
     * The app consistent snapshot frequency in minutes.
     */
    private Integer appConsistentFrequencyInMinutes;

    /*
     * A value indicating whether multi-VM sync has to be enabled.
     */
    private String multiVmSyncStatus;

    /*
     * The crash consistent snapshot frequency in minutes.
     */
    private Integer crashConsistentFrequencyInMinutes;

    /**
     * Creates an instance of A2APolicyDetails class.
     */
    public A2APolicyDetails() {
    }

    /**
     * Get the instanceType property: Gets the class type. Overridden in derived classes.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the recoveryPointThresholdInMinutes property: The recovery point threshold in minutes.
     * 
     * @return the recoveryPointThresholdInMinutes value.
     */
    public Integer recoveryPointThresholdInMinutes() {
        return this.recoveryPointThresholdInMinutes;
    }

    /**
     * Set the recoveryPointThresholdInMinutes property: The recovery point threshold in minutes.
     * 
     * @param recoveryPointThresholdInMinutes the recoveryPointThresholdInMinutes value to set.
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withRecoveryPointThresholdInMinutes(Integer recoveryPointThresholdInMinutes) {
        this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
        return this;
    }

    /**
     * Get the recoveryPointHistory property: The duration in minutes until which the recovery points need to be stored.
     * 
     * @return the recoveryPointHistory value.
     */
    public Integer recoveryPointHistory() {
        return this.recoveryPointHistory;
    }

    /**
     * Set the recoveryPointHistory property: The duration in minutes until which the recovery points need to be stored.
     * 
     * @param recoveryPointHistory the recoveryPointHistory value to set.
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withRecoveryPointHistory(Integer recoveryPointHistory) {
        this.recoveryPointHistory = recoveryPointHistory;
        return this;
    }

    /**
     * Get the appConsistentFrequencyInMinutes property: The app consistent snapshot frequency in minutes.
     * 
     * @return the appConsistentFrequencyInMinutes value.
     */
    public Integer appConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes;
    }

    /**
     * Set the appConsistentFrequencyInMinutes property: The app consistent snapshot frequency in minutes.
     * 
     * @param appConsistentFrequencyInMinutes the appConsistentFrequencyInMinutes value to set.
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withAppConsistentFrequencyInMinutes(Integer appConsistentFrequencyInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the multiVmSyncStatus property: A value indicating whether multi-VM sync has to be enabled.
     * 
     * @return the multiVmSyncStatus value.
     */
    public String multiVmSyncStatus() {
        return this.multiVmSyncStatus;
    }

    /**
     * Set the multiVmSyncStatus property: A value indicating whether multi-VM sync has to be enabled.
     * 
     * @param multiVmSyncStatus the multiVmSyncStatus value to set.
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withMultiVmSyncStatus(String multiVmSyncStatus) {
        this.multiVmSyncStatus = multiVmSyncStatus;
        return this;
    }

    /**
     * Get the crashConsistentFrequencyInMinutes property: The crash consistent snapshot frequency in minutes.
     * 
     * @return the crashConsistentFrequencyInMinutes value.
     */
    public Integer crashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes;
    }

    /**
     * Set the crashConsistentFrequencyInMinutes property: The crash consistent snapshot frequency in minutes.
     * 
     * @param crashConsistentFrequencyInMinutes the crashConsistentFrequencyInMinutes value to set.
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withCrashConsistentFrequencyInMinutes(Integer crashConsistentFrequencyInMinutes) {
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceType", this.instanceType);
        jsonWriter.writeNumberField("recoveryPointThresholdInMinutes", this.recoveryPointThresholdInMinutes);
        jsonWriter.writeNumberField("recoveryPointHistory", this.recoveryPointHistory);
        jsonWriter.writeNumberField("appConsistentFrequencyInMinutes", this.appConsistentFrequencyInMinutes);
        jsonWriter.writeStringField("multiVmSyncStatus", this.multiVmSyncStatus);
        jsonWriter.writeNumberField("crashConsistentFrequencyInMinutes", this.crashConsistentFrequencyInMinutes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of A2APolicyDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of A2APolicyDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the A2APolicyDetails.
     */
    public static A2APolicyDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            A2APolicyDetails deserializedA2APolicyDetails = new A2APolicyDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedA2APolicyDetails.instanceType = reader.getString();
                } else if ("recoveryPointThresholdInMinutes".equals(fieldName)) {
                    deserializedA2APolicyDetails.recoveryPointThresholdInMinutes
                        = reader.getNullable(JsonReader::getInt);
                } else if ("recoveryPointHistory".equals(fieldName)) {
                    deserializedA2APolicyDetails.recoveryPointHistory = reader.getNullable(JsonReader::getInt);
                } else if ("appConsistentFrequencyInMinutes".equals(fieldName)) {
                    deserializedA2APolicyDetails.appConsistentFrequencyInMinutes
                        = reader.getNullable(JsonReader::getInt);
                } else if ("multiVmSyncStatus".equals(fieldName)) {
                    deserializedA2APolicyDetails.multiVmSyncStatus = reader.getString();
                } else if ("crashConsistentFrequencyInMinutes".equals(fieldName)) {
                    deserializedA2APolicyDetails.crashConsistentFrequencyInMinutes
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedA2APolicyDetails;
        });
    }
}
