// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The AclFailedEntry model.
 */
@Fluent
public final class AclFailedEntry implements JsonSerializable<AclFailedEntry> {
    /*
     * The name property.
     */
    @Generated
    private String name;

    /*
     * The type property.
     */
    @Generated
    private String type;

    /*
     * The errorMessage property.
     */
    @Generated
    private String errorMessage;

    /**
     * Creates an instance of AclFailedEntry class.
     */
    @Generated
    public AclFailedEntry() {
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the AclFailedEntry object itself.
     */
    @Generated
    public AclFailedEntry setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     * 
     * @param type the type value to set.
     * @return the AclFailedEntry object itself.
     */
    @Generated
    public AclFailedEntry setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the errorMessage property: The errorMessage property.
     * 
     * @return the errorMessage value.
     */
    @Generated
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: The errorMessage property.
     * 
     * @param errorMessage the errorMessage value to set.
     * @return the AclFailedEntry object itself.
     */
    @Generated
    public AclFailedEntry setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("errorMessage", this.errorMessage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AclFailedEntry from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AclFailedEntry if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AclFailedEntry.
     */
    @Generated
    public static AclFailedEntry fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AclFailedEntry deserializedAclFailedEntry = new AclFailedEntry();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedAclFailedEntry.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAclFailedEntry.type = reader.getString();
                } else if ("errorMessage".equals(fieldName)) {
                    deserializedAclFailedEntry.errorMessage = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAclFailedEntry;
        });
    }
}
