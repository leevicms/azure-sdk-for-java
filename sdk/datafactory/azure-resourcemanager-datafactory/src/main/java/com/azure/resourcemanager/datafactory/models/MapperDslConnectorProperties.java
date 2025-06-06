// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Connector properties of a CDC table in terms of name / value pairs.
 */
@Fluent
public final class MapperDslConnectorProperties implements JsonSerializable<MapperDslConnectorProperties> {
    /*
     * Name of the property.
     */
    private String name;

    /*
     * Value of the property.
     */
    private Object value;

    /**
     * Creates an instance of MapperDslConnectorProperties class.
     */
    public MapperDslConnectorProperties() {
    }

    /**
     * Get the name property: Name of the property.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the property.
     * 
     * @param name the name value to set.
     * @return the MapperDslConnectorProperties object itself.
     */
    public MapperDslConnectorProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Value of the property.
     * 
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the property.
     * 
     * @param value the value value to set.
     * @return the MapperDslConnectorProperties object itself.
     */
    public MapperDslConnectorProperties withValue(Object value) {
        this.value = value;
        return this;
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
        jsonWriter.writeStringField("name", this.name);
        if (this.value != null) {
            jsonWriter.writeUntypedField("value", this.value);
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MapperDslConnectorProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MapperDslConnectorProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MapperDslConnectorProperties.
     */
    public static MapperDslConnectorProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MapperDslConnectorProperties deserializedMapperDslConnectorProperties = new MapperDslConnectorProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedMapperDslConnectorProperties.name = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedMapperDslConnectorProperties.value = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMapperDslConnectorProperties;
        });
    }
}
