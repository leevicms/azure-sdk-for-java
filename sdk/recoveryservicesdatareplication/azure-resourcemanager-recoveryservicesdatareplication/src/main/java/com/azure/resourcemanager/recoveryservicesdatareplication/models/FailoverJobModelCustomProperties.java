// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Failover job model custom properties.
 */
@Immutable
public final class FailoverJobModelCustomProperties extends JobCustomProperties {
    /*
     * Discriminator property for JobCustomProperties.
     */
    private String instanceType = "FailoverJobDetails";

    /*
     * Gets or sets the failed over protected item details.
     */
    private List<FailoverProtectedItemProperties> protectedItemDetails;

    /**
     * Creates an instance of FailoverJobModelCustomProperties class.
     */
    private FailoverJobModelCustomProperties() {
    }

    /**
     * Get the instanceType property: Discriminator property for JobCustomProperties.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the protectedItemDetails property: Gets or sets the failed over protected item details.
     * 
     * @return the protectedItemDetails value.
     */
    public List<FailoverProtectedItemProperties> protectedItemDetails() {
        return this.protectedItemDetails;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (protectedItemDetails() != null) {
            protectedItemDetails().forEach(e -> e.validate());
        }
        if (affectedObjectDetails() != null) {
            affectedObjectDetails().validate();
        }
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
     * Reads an instance of FailoverJobModelCustomProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FailoverJobModelCustomProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FailoverJobModelCustomProperties.
     */
    public static FailoverJobModelCustomProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FailoverJobModelCustomProperties deserializedFailoverJobModelCustomProperties
                = new FailoverJobModelCustomProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("affectedObjectDetails".equals(fieldName)) {
                    deserializedFailoverJobModelCustomProperties
                        .withAffectedObjectDetails(AffectedObjectDetails.fromJson(reader));
                } else if ("instanceType".equals(fieldName)) {
                    deserializedFailoverJobModelCustomProperties.instanceType = reader.getString();
                } else if ("protectedItemDetails".equals(fieldName)) {
                    List<FailoverProtectedItemProperties> protectedItemDetails
                        = reader.readArray(reader1 -> FailoverProtectedItemProperties.fromJson(reader1));
                    deserializedFailoverJobModelCustomProperties.protectedItemDetails = protectedItemDetails;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFailoverJobModelCustomProperties;
        });
    }
}
