// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Grammar-based tokenizer that is suitable for processing most European-language documents. This tokenizer is
 * implemented using Apache Lucene.
 */
@Fluent
public final class ClassicTokenizer extends LexicalTokenizer {
    /*
     * A URI fragment specifying the type of tokenizer.
     */
    @Generated
    private String odataType = "#Microsoft.Azure.Search.ClassicTokenizer";

    /*
     * The maximum token length. Default is 255. Tokens longer than the maximum length are split. The maximum token
     * length that can be used is 300 characters.
     */
    @Generated
    private Integer maxTokenLength;

    /**
     * Creates an instance of ClassicTokenizer class.
     * 
     * @param name the name value to set.
     */
    @Generated
    public ClassicTokenizer(String name) {
        super(name);
    }

    /**
     * Get the odataType property: A URI fragment specifying the type of tokenizer.
     * 
     * @return the odataType value.
     */
    @Generated
    @Override
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Get the maxTokenLength property: The maximum token length. Default is 255. Tokens longer than the maximum length
     * are split. The maximum token length that can be used is 300 characters.
     * 
     * @return the maxTokenLength value.
     */
    @Generated
    public Integer getMaxTokenLength() {
        return this.maxTokenLength;
    }

    /**
     * Set the maxTokenLength property: The maximum token length. Default is 255. Tokens longer than the maximum length
     * are split. The maximum token length that can be used is 300 characters.
     * 
     * @param maxTokenLength the maxTokenLength value to set.
     * @return the ClassicTokenizer object itself.
     */
    @Generated
    public ClassicTokenizer setMaxTokenLength(Integer maxTokenLength) {
        this.maxTokenLength = maxTokenLength;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("@odata.type", this.odataType);
        jsonWriter.writeNumberField("maxTokenLength", this.maxTokenLength);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClassicTokenizer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClassicTokenizer if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClassicTokenizer.
     */
    @Generated
    public static ClassicTokenizer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            String odataType = "#Microsoft.Azure.Search.ClassicTokenizer";
            Integer maxTokenLength = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("@odata.type".equals(fieldName)) {
                    odataType = reader.getString();
                } else if ("maxTokenLength".equals(fieldName)) {
                    maxTokenLength = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound) {
                ClassicTokenizer deserializedClassicTokenizer = new ClassicTokenizer(name);
                deserializedClassicTokenizer.odataType = odataType;
                deserializedClassicTokenizer.maxTokenLength = maxTokenLength;

                return deserializedClassicTokenizer;
            }
            throw new IllegalStateException("Missing required property: name");
        });
    }
}
