// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An authentication method and location for the operation.
 */
@Fluent
public final class SASTokenParameter implements JsonSerializable<SASTokenParameter> {
    /*
     * Azure Blob storage container Uri
     */
    @Generated
    private final String storageResourceUri;

    /*
     * The SAS token pointing to an Azure Blob storage container
     */
    @Generated
    private String token;

    /*
     * Indicates which authentication method should be used. If set to true, Managed HSM will use the configured
     * user-assigned managed identity to authenticate with Azure Storage. Otherwise, a SAS token has to be specified.
     */
    @Generated
    private Boolean useManagedIdentity;

    /**
     * Creates an instance of SASTokenParameter class.
     * 
     * @param storageResourceUri the storageResourceUri value to set.
     */
    @Generated
    public SASTokenParameter(String storageResourceUri) {
        this.storageResourceUri = storageResourceUri;
    }

    /**
     * Get the storageResourceUri property: Azure Blob storage container Uri.
     * 
     * @return the storageResourceUri value.
     */
    @Generated
    public String getStorageResourceUri() {
        return this.storageResourceUri;
    }

    /**
     * Get the token property: The SAS token pointing to an Azure Blob storage container.
     * 
     * @return the token value.
     */
    @Generated
    public String getToken() {
        return this.token;
    }

    /**
     * Set the token property: The SAS token pointing to an Azure Blob storage container.
     * 
     * @param token the token value to set.
     * @return the SASTokenParameter object itself.
     */
    @Generated
    public SASTokenParameter setToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get the useManagedIdentity property: Indicates which authentication method should be used. If set to true,
     * Managed HSM will use the configured user-assigned managed identity to authenticate with Azure Storage. Otherwise,
     * a SAS token has to be specified.
     * 
     * @return the useManagedIdentity value.
     */
    @Generated
    public Boolean isUseManagedIdentity() {
        return this.useManagedIdentity;
    }

    /**
     * Set the useManagedIdentity property: Indicates which authentication method should be used. If set to true,
     * Managed HSM will use the configured user-assigned managed identity to authenticate with Azure Storage. Otherwise,
     * a SAS token has to be specified.
     * 
     * @param useManagedIdentity the useManagedIdentity value to set.
     * @return the SASTokenParameter object itself.
     */
    @Generated
    public SASTokenParameter setUseManagedIdentity(Boolean useManagedIdentity) {
        this.useManagedIdentity = useManagedIdentity;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("storageResourceUri", this.storageResourceUri);
        jsonWriter.writeStringField("token", this.token);
        jsonWriter.writeBooleanField("useManagedIdentity", this.useManagedIdentity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SASTokenParameter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SASTokenParameter if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SASTokenParameter.
     */
    @Generated
    public static SASTokenParameter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String storageResourceUri = null;
            String token = null;
            Boolean useManagedIdentity = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("storageResourceUri".equals(fieldName)) {
                    storageResourceUri = reader.getString();
                } else if ("token".equals(fieldName)) {
                    token = reader.getString();
                } else if ("useManagedIdentity".equals(fieldName)) {
                    useManagedIdentity = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }
            SASTokenParameter deserializedSASTokenParameter = new SASTokenParameter(storageResourceUri);
            deserializedSASTokenParameter.token = token;
            deserializedSASTokenParameter.useManagedIdentity = useManagedIdentity;

            return deserializedSASTokenParameter;
        });
    }
}
