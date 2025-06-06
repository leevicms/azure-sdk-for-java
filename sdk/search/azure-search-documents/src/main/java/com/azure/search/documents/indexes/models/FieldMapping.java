// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines a mapping between a field in a data source and a target field in an index.
 */
@Fluent
public final class FieldMapping implements JsonSerializable<FieldMapping> {
    /*
     * The name of the field in the data source.
     */
    @Generated
    private final String sourceFieldName;

    /*
     * The name of the target field in the index. Same as the source field name by default.
     */
    @Generated
    private String targetFieldName;

    /*
     * A function to apply to each source field value before indexing.
     */
    @Generated
    private FieldMappingFunction mappingFunction;

    /**
     * Creates an instance of FieldMapping class.
     * 
     * @param sourceFieldName the sourceFieldName value to set.
     */
    @Generated
    public FieldMapping(String sourceFieldName) {
        this.sourceFieldName = sourceFieldName;
    }

    /**
     * Get the sourceFieldName property: The name of the field in the data source.
     * 
     * @return the sourceFieldName value.
     */
    @Generated
    public String getSourceFieldName() {
        return this.sourceFieldName;
    }

    /**
     * Get the targetFieldName property: The name of the target field in the index. Same as the source field name by
     * default.
     * 
     * @return the targetFieldName value.
     */
    @Generated
    public String getTargetFieldName() {
        return this.targetFieldName;
    }

    /**
     * Set the targetFieldName property: The name of the target field in the index. Same as the source field name by
     * default.
     * 
     * @param targetFieldName the targetFieldName value to set.
     * @return the FieldMapping object itself.
     */
    @Generated
    public FieldMapping setTargetFieldName(String targetFieldName) {
        this.targetFieldName = targetFieldName;
        return this;
    }

    /**
     * Get the mappingFunction property: A function to apply to each source field value before indexing.
     * 
     * @return the mappingFunction value.
     */
    @Generated
    public FieldMappingFunction getMappingFunction() {
        return this.mappingFunction;
    }

    /**
     * Set the mappingFunction property: A function to apply to each source field value before indexing.
     * 
     * @param mappingFunction the mappingFunction value to set.
     * @return the FieldMapping object itself.
     */
    @Generated
    public FieldMapping setMappingFunction(FieldMappingFunction mappingFunction) {
        this.mappingFunction = mappingFunction;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sourceFieldName", this.sourceFieldName);
        jsonWriter.writeStringField("targetFieldName", this.targetFieldName);
        jsonWriter.writeJsonField("mappingFunction", this.mappingFunction);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FieldMapping from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FieldMapping if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FieldMapping.
     */
    @Generated
    public static FieldMapping fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean sourceFieldNameFound = false;
            String sourceFieldName = null;
            String targetFieldName = null;
            FieldMappingFunction mappingFunction = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceFieldName".equals(fieldName)) {
                    sourceFieldName = reader.getString();
                    sourceFieldNameFound = true;
                } else if ("targetFieldName".equals(fieldName)) {
                    targetFieldName = reader.getString();
                } else if ("mappingFunction".equals(fieldName)) {
                    mappingFunction = FieldMappingFunction.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (sourceFieldNameFound) {
                FieldMapping deserializedFieldMapping = new FieldMapping(sourceFieldName);
                deserializedFieldMapping.targetFieldName = targetFieldName;
                deserializedFieldMapping.mappingFunction = mappingFunction;

                return deserializedFieldMapping;
            }
            throw new IllegalStateException("Missing required property: sourceFieldName");
        });
    }
}
