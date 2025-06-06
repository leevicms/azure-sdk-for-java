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
 * An empty object that represents the default Azure AI service resource for a skillset.
 */
@Fluent
public final class DefaultCognitiveServicesAccount extends CognitiveServicesAccount {
    /*
     * A URI fragment specifying the type of Azure AI service resource attached to a skillset.
     */
    @Generated
    private String odataType = "#Microsoft.Azure.Search.DefaultCognitiveServices";

    /**
     * Creates an instance of DefaultCognitiveServicesAccount class.
     */
    @Generated
    public DefaultCognitiveServicesAccount() {
    }

    /**
     * Get the odataType property: A URI fragment specifying the type of Azure AI service resource attached to a
     * skillset.
     * 
     * @return the odataType value.
     */
    @Generated
    @Override
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public DefaultCognitiveServicesAccount setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeStringField("@odata.type", this.odataType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DefaultCognitiveServicesAccount from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DefaultCognitiveServicesAccount if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DefaultCognitiveServicesAccount.
     */
    @Generated
    public static DefaultCognitiveServicesAccount fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DefaultCognitiveServicesAccount deserializedDefaultCognitiveServicesAccount
                = new DefaultCognitiveServicesAccount();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedDefaultCognitiveServicesAccount.setDescription(reader.getString());
                } else if ("@odata.type".equals(fieldName)) {
                    deserializedDefaultCognitiveServicesAccount.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDefaultCognitiveServicesAccount;
        });
    }
}
