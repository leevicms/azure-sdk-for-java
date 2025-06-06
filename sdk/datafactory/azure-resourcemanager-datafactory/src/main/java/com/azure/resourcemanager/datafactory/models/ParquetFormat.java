// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The data stored in Parquet format.
 */
@Fluent
public final class ParquetFormat extends DatasetStorageFormat {
    /*
     * Type of dataset storage format.
     */
    private String type = "ParquetFormat";

    /**
     * Creates an instance of ParquetFormat class.
     */
    public ParquetFormat() {
    }

    /**
     * Get the type property: Type of dataset storage format.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetFormat withSerializer(Object serializer) {
        super.withSerializer(serializer);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetFormat withDeserializer(Object deserializer) {
        super.withDeserializer(deserializer);
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
        if (serializer() != null) {
            jsonWriter.writeUntypedField("serializer", serializer());
        }
        if (deserializer() != null) {
            jsonWriter.writeUntypedField("deserializer", deserializer());
        }
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ParquetFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ParquetFormat if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ParquetFormat.
     */
    public static ParquetFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ParquetFormat deserializedParquetFormat = new ParquetFormat();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serializer".equals(fieldName)) {
                    deserializedParquetFormat.withSerializer(reader.readUntyped());
                } else if ("deserializer".equals(fieldName)) {
                    deserializedParquetFormat.withDeserializer(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedParquetFormat.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedParquetFormat.withAdditionalProperties(additionalProperties);

            return deserializedParquetFormat;
        });
    }
}
