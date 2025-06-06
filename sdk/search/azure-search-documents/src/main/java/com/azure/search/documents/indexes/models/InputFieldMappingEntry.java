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
import java.util.Arrays;
import java.util.List;

/**
 * Input field mapping for a skill.
 */
@Fluent
public final class InputFieldMappingEntry implements JsonSerializable<InputFieldMappingEntry> {

    /*
     * The name of the input.
     */
    @Generated
    private final String name;

    /*
     * The source of the input.
     */
    @Generated
    private String source;

    /*
     * The source context used for selecting recursive inputs.
     */
    @Generated
    private String sourceContext;

    /*
     * The recursive inputs used when creating a complex type.
     */
    @Generated
    private List<InputFieldMappingEntry> inputs;

    /**
     * Creates an instance of InputFieldMappingEntry class.
     *
     * @param name the name value to set.
     */
    @Generated
    public InputFieldMappingEntry(String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the input.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the source property: The source of the input.
     *
     * @return the source value.
     */
    @Generated
    public String getSource() {
        return this.source;
    }

    /**
     * Set the source property: The source of the input.
     *
     * @param source the source value to set.
     * @return the InputFieldMappingEntry object itself.
     */
    @Generated
    public InputFieldMappingEntry setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the sourceContext property: The source context used for selecting recursive inputs.
     *
     * @return the sourceContext value.
     */
    @Generated
    public String getSourceContext() {
        return this.sourceContext;
    }

    /**
     * Set the sourceContext property: The source context used for selecting recursive inputs.
     *
     * @param sourceContext the sourceContext value to set.
     * @return the InputFieldMappingEntry object itself.
     */
    @Generated
    public InputFieldMappingEntry setSourceContext(String sourceContext) {
        this.sourceContext = sourceContext;
        return this;
    }

    /**
     * Get the inputs property: The recursive inputs used when creating a complex type.
     *
     * @return the inputs value.
     */
    @Generated
    public List<InputFieldMappingEntry> getInputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: The recursive inputs used when creating a complex type.
     *
     * @param inputs the inputs value to set.
     * @return the InputFieldMappingEntry object itself.
     */
    @Generated
    public InputFieldMappingEntry setInputs(List<InputFieldMappingEntry> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("source", this.source);
        jsonWriter.writeStringField("sourceContext", this.sourceContext);
        jsonWriter.writeArrayField("inputs", this.inputs, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InputFieldMappingEntry from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of InputFieldMappingEntry if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the InputFieldMappingEntry.
     */
    @Generated
    public static InputFieldMappingEntry fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            String source = null;
            String sourceContext = null;
            List<InputFieldMappingEntry> inputs = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("source".equals(fieldName)) {
                    source = reader.getString();
                } else if ("sourceContext".equals(fieldName)) {
                    sourceContext = reader.getString();
                } else if ("inputs".equals(fieldName)) {
                    inputs = reader.readArray(reader1 -> InputFieldMappingEntry.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound) {
                InputFieldMappingEntry deserializedInputFieldMappingEntry = new InputFieldMappingEntry(name);
                deserializedInputFieldMappingEntry.source = source;
                deserializedInputFieldMappingEntry.sourceContext = sourceContext;
                deserializedInputFieldMappingEntry.inputs = inputs;
                return deserializedInputFieldMappingEntry;
            }
            throw new IllegalStateException("Missing required property: name");
        });
    }

    /**
     * Set the inputs property: The recursive inputs used when creating a complex type.
     *
     * @param inputs the inputs value to set.
     * @return the InputFieldMappingEntry object itself.
     */
    public InputFieldMappingEntry setInputs(InputFieldMappingEntry... inputs) {
        this.inputs = (inputs == null) ? null : Arrays.asList(inputs);
        return this;
    }
}
