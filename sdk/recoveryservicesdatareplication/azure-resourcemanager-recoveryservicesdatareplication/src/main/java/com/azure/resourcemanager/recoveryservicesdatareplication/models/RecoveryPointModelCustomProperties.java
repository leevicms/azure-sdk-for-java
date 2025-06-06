// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Recovery point model custom properties.
 */
@Immutable
public class RecoveryPointModelCustomProperties implements JsonSerializable<RecoveryPointModelCustomProperties> {
    /*
     * Discriminator property for RecoveryPointModelCustomProperties.
     */
    private String instanceType = "RecoveryPointModelCustomProperties";

    /**
     * Creates an instance of RecoveryPointModelCustomProperties class.
     */
    protected RecoveryPointModelCustomProperties() {
    }

    /**
     * Get the instanceType property: Discriminator property for RecoveryPointModelCustomProperties.
     * 
     * @return the instanceType value.
     */
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceType", this.instanceType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RecoveryPointModelCustomProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RecoveryPointModelCustomProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RecoveryPointModelCustomProperties.
     */
    public static RecoveryPointModelCustomProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("instanceType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("HyperVToAzStackHCI".equals(discriminatorValue)) {
                    return HyperVToAzStackHciRecoveryPointCustomProps.fromJson(readerToUse.reset());
                } else if ("VMwareToAzStackHCIRecoveryPointModelCustomProperties".equals(discriminatorValue)) {
                    return VMwareToAzStackHCIRecoveryPointCustomProps.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static RecoveryPointModelCustomProperties fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RecoveryPointModelCustomProperties deserializedRecoveryPointModelCustomProperties
                = new RecoveryPointModelCustomProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedRecoveryPointModelCustomProperties.instanceType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRecoveryPointModelCustomProperties;
        });
    }
}
