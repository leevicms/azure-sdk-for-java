// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.security.keyvault.certificates.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The credentials to be used for the certificate issuer.
 */
@Fluent
public final class IssuerCredentials implements JsonSerializable<IssuerCredentials> {
    /*
     * The user name/account name/account id.
     */
    @Generated
    private String accountId;

    /*
     * The password/secret/account key.
     */
    @Generated
    private String password;

    /**
     * Creates an instance of IssuerCredentials class.
     */
    @Generated
    public IssuerCredentials() {
    }

    /**
     * Get the accountId property: The user name/account name/account id.
     * 
     * @return the accountId value.
     */
    @Generated
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * Set the accountId property: The user name/account name/account id.
     * 
     * @param accountId the accountId value to set.
     * @return the IssuerCredentials object itself.
     */
    @Generated
    public IssuerCredentials setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get the password property: The password/secret/account key.
     * 
     * @return the password value.
     */
    @Generated
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password/secret/account key.
     * 
     * @param password the password value to set.
     * @return the IssuerCredentials object itself.
     */
    @Generated
    public IssuerCredentials setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("account_id", this.accountId);
        jsonWriter.writeStringField("pwd", this.password);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IssuerCredentials from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IssuerCredentials if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IssuerCredentials.
     */
    @Generated
    public static IssuerCredentials fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IssuerCredentials deserializedIssuerCredentials = new IssuerCredentials();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("account_id".equals(fieldName)) {
                    deserializedIssuerCredentials.accountId = reader.getString();
                } else if ("pwd".equals(fieldName)) {
                    deserializedIssuerCredentials.password = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIssuerCredentials;
        });
    }
}
