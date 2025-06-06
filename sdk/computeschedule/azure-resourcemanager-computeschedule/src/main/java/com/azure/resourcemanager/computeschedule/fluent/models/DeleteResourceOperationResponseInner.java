// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computeschedule.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.computeschedule.models.ResourceOperation;
import java.io.IOException;
import java.util.List;

/**
 * The response from a delete request.
 */
@Immutable
public final class DeleteResourceOperationResponseInner
    implements JsonSerializable<DeleteResourceOperationResponseInner> {
    /*
     * The description of the operation response
     */
    private String description;

    /*
     * The type of resources used in the delete request eg virtual machines
     */
    private String type;

    /*
     * The location of the start request eg westus
     */
    private String location;

    /*
     * The results from the start request if no errors exist
     */
    private List<ResourceOperation> results;

    /**
     * Creates an instance of DeleteResourceOperationResponseInner class.
     */
    private DeleteResourceOperationResponseInner() {
    }

    /**
     * Get the description property: The description of the operation response.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the type property: The type of resources used in the delete request eg virtual machines.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the location property: The location of the start request eg westus.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the results property: The results from the start request if no errors exist.
     * 
     * @return the results value.
     */
    public List<ResourceOperation> results() {
        return this.results;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (description() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property description in model DeleteResourceOperationResponseInner"));
        }
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property type in model DeleteResourceOperationResponseInner"));
        }
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model DeleteResourceOperationResponseInner"));
        }
        if (results() != null) {
            results().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeleteResourceOperationResponseInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeArrayField("results", this.results, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeleteResourceOperationResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeleteResourceOperationResponseInner if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeleteResourceOperationResponseInner.
     */
    public static DeleteResourceOperationResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeleteResourceOperationResponseInner deserializedDeleteResourceOperationResponseInner
                = new DeleteResourceOperationResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedDeleteResourceOperationResponseInner.description = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDeleteResourceOperationResponseInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedDeleteResourceOperationResponseInner.location = reader.getString();
                } else if ("results".equals(fieldName)) {
                    List<ResourceOperation> results = reader.readArray(reader1 -> ResourceOperation.fromJson(reader1));
                    deserializedDeleteResourceOperationResponseInner.results = results;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeleteResourceOperationResponseInner;
        });
    }
}
