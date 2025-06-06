// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.agents.persistent.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The input definition information for a azure function tool as used to configure an agent.
 */
@Immutable
public final class AzureFunctionToolDefinition extends ToolDefinition {

    /*
     * The object type.
     */
    @Generated
    private String type = "azure_function";

    /*
     * The definition of the concrete function that the function tool should call.
     */
    @Generated
    private final AzureFunctionDefinition azureFunction;

    /**
     * Creates an instance of AzureFunctionToolDefinition class.
     *
     * @param azureFunction the azureFunction value to set.
     */
    @Generated
    public AzureFunctionToolDefinition(AzureFunctionDefinition azureFunction) {
        this.azureFunction = azureFunction;
    }

    /**
     * Get the type property: The object type.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the azureFunction property: The definition of the concrete function that the function tool should call.
     *
     * @return the azureFunction value.
     */
    @Generated
    public AzureFunctionDefinition getAzureFunction() {
        return this.azureFunction;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("azure_function", this.azureFunction);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureFunctionToolDefinition from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFunctionToolDefinition if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureFunctionToolDefinition.
     */
    @Generated
    public static AzureFunctionToolDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFunctionDefinition azureFunction = null;
            String type = "azure_function";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("azure_function".equals(fieldName)) {
                    azureFunction = AzureFunctionDefinition.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            AzureFunctionToolDefinition deserializedAzureFunctionToolDefinition
                = new AzureFunctionToolDefinition(azureFunction);
            deserializedAzureFunctionToolDefinition.type = type;
            return deserializedAzureFunctionToolDefinition;
        });
    }
}
