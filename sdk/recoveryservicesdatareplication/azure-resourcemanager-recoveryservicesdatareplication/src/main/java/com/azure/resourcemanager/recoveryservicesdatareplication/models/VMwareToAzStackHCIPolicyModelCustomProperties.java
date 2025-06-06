// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * VMware To AzStackHCI Policy model custom properties.
 */
@Fluent
public final class VMwareToAzStackHCIPolicyModelCustomProperties extends PolicyModelCustomProperties {
    /*
     * Discriminator property for PolicyModelCustomProperties.
     */
    private String instanceType = "VMwareToAzStackHCI";

    /*
     * Gets or sets the duration in minutes until which the recovery points need to be stored.
     */
    private int recoveryPointHistoryInMinutes;

    /*
     * Gets or sets the crash consistent snapshot frequency (in minutes).
     */
    private int crashConsistentFrequencyInMinutes;

    /*
     * Gets or sets the app consistent snapshot frequency (in minutes).
     */
    private int appConsistentFrequencyInMinutes;

    /**
     * Creates an instance of VMwareToAzStackHCIPolicyModelCustomProperties class.
     */
    public VMwareToAzStackHCIPolicyModelCustomProperties() {
    }

    /**
     * Get the instanceType property: Discriminator property for PolicyModelCustomProperties.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the recoveryPointHistoryInMinutes property: Gets or sets the duration in minutes until which the recovery
     * points need to be stored.
     * 
     * @return the recoveryPointHistoryInMinutes value.
     */
    public int recoveryPointHistoryInMinutes() {
        return this.recoveryPointHistoryInMinutes;
    }

    /**
     * Set the recoveryPointHistoryInMinutes property: Gets or sets the duration in minutes until which the recovery
     * points need to be stored.
     * 
     * @param recoveryPointHistoryInMinutes the recoveryPointHistoryInMinutes value to set.
     * @return the VMwareToAzStackHCIPolicyModelCustomProperties object itself.
     */
    public VMwareToAzStackHCIPolicyModelCustomProperties
        withRecoveryPointHistoryInMinutes(int recoveryPointHistoryInMinutes) {
        this.recoveryPointHistoryInMinutes = recoveryPointHistoryInMinutes;
        return this;
    }

    /**
     * Get the crashConsistentFrequencyInMinutes property: Gets or sets the crash consistent snapshot frequency (in
     * minutes).
     * 
     * @return the crashConsistentFrequencyInMinutes value.
     */
    public int crashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes;
    }

    /**
     * Set the crashConsistentFrequencyInMinutes property: Gets or sets the crash consistent snapshot frequency (in
     * minutes).
     * 
     * @param crashConsistentFrequencyInMinutes the crashConsistentFrequencyInMinutes value to set.
     * @return the VMwareToAzStackHCIPolicyModelCustomProperties object itself.
     */
    public VMwareToAzStackHCIPolicyModelCustomProperties
        withCrashConsistentFrequencyInMinutes(int crashConsistentFrequencyInMinutes) {
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the appConsistentFrequencyInMinutes property: Gets or sets the app consistent snapshot frequency (in
     * minutes).
     * 
     * @return the appConsistentFrequencyInMinutes value.
     */
    public int appConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes;
    }

    /**
     * Set the appConsistentFrequencyInMinutes property: Gets or sets the app consistent snapshot frequency (in
     * minutes).
     * 
     * @param appConsistentFrequencyInMinutes the appConsistentFrequencyInMinutes value to set.
     * @return the VMwareToAzStackHCIPolicyModelCustomProperties object itself.
     */
    public VMwareToAzStackHCIPolicyModelCustomProperties
        withAppConsistentFrequencyInMinutes(int appConsistentFrequencyInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
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
        jsonWriter.writeIntField("recoveryPointHistoryInMinutes", this.recoveryPointHistoryInMinutes);
        jsonWriter.writeIntField("crashConsistentFrequencyInMinutes", this.crashConsistentFrequencyInMinutes);
        jsonWriter.writeIntField("appConsistentFrequencyInMinutes", this.appConsistentFrequencyInMinutes);
        jsonWriter.writeStringField("instanceType", this.instanceType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VMwareToAzStackHCIPolicyModelCustomProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VMwareToAzStackHCIPolicyModelCustomProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VMwareToAzStackHCIPolicyModelCustomProperties.
     */
    public static VMwareToAzStackHCIPolicyModelCustomProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VMwareToAzStackHCIPolicyModelCustomProperties deserializedVMwareToAzStackHCIPolicyModelCustomProperties
                = new VMwareToAzStackHCIPolicyModelCustomProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("recoveryPointHistoryInMinutes".equals(fieldName)) {
                    deserializedVMwareToAzStackHCIPolicyModelCustomProperties.recoveryPointHistoryInMinutes
                        = reader.getInt();
                } else if ("crashConsistentFrequencyInMinutes".equals(fieldName)) {
                    deserializedVMwareToAzStackHCIPolicyModelCustomProperties.crashConsistentFrequencyInMinutes
                        = reader.getInt();
                } else if ("appConsistentFrequencyInMinutes".equals(fieldName)) {
                    deserializedVMwareToAzStackHCIPolicyModelCustomProperties.appConsistentFrequencyInMinutes
                        = reader.getInt();
                } else if ("instanceType".equals(fieldName)) {
                    deserializedVMwareToAzStackHCIPolicyModelCustomProperties.instanceType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVMwareToAzStackHCIPolicyModelCustomProperties;
        });
    }
}
