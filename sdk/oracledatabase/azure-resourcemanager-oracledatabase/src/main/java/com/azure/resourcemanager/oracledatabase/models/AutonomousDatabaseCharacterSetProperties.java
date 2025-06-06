// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * AutonomousDatabaseCharacterSet resource model.
 */
@Immutable
public final class AutonomousDatabaseCharacterSetProperties
    implements JsonSerializable<AutonomousDatabaseCharacterSetProperties> {
    /*
     * The Oracle Autonomous Database supported character sets.
     */
    private String characterSet;

    /**
     * Creates an instance of AutonomousDatabaseCharacterSetProperties class.
     */
    private AutonomousDatabaseCharacterSetProperties() {
    }

    /**
     * Get the characterSet property: The Oracle Autonomous Database supported character sets.
     * 
     * @return the characterSet value.
     */
    public String characterSet() {
        return this.characterSet;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (characterSet() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property characterSet in model AutonomousDatabaseCharacterSetProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AutonomousDatabaseCharacterSetProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("characterSet", this.characterSet);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AutonomousDatabaseCharacterSetProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutonomousDatabaseCharacterSetProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AutonomousDatabaseCharacterSetProperties.
     */
    public static AutonomousDatabaseCharacterSetProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AutonomousDatabaseCharacterSetProperties deserializedAutonomousDatabaseCharacterSetProperties
                = new AutonomousDatabaseCharacterSetProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("characterSet".equals(fieldName)) {
                    deserializedAutonomousDatabaseCharacterSetProperties.characterSet = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAutonomousDatabaseCharacterSetProperties;
        });
    }
}
