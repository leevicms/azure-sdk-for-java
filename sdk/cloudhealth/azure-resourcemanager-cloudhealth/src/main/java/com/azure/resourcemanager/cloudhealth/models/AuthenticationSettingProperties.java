// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.cloudhealth.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Authentication setting properties.
 */
@Fluent
public class AuthenticationSettingProperties implements JsonSerializable<AuthenticationSettingProperties> {
    /*
     * Kind of the authentication setting
     */
    private AuthenticationKind authenticationKind = AuthenticationKind.fromString("AuthenticationSettingProperties");

    /*
     * The status of the last operation.
     */
    private HealthModelProvisioningState provisioningState;

    /*
     * Display name
     */
    private String displayName;

    /**
     * Creates an instance of AuthenticationSettingProperties class.
     */
    public AuthenticationSettingProperties() {
    }

    /**
     * Get the authenticationKind property: Kind of the authentication setting.
     * 
     * @return the authenticationKind value.
     */
    public AuthenticationKind authenticationKind() {
        return this.authenticationKind;
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     * 
     * @return the provisioningState value.
     */
    public HealthModelProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The status of the last operation.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the AuthenticationSettingProperties object itself.
     */
    AuthenticationSettingProperties withProvisioningState(HealthModelProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the displayName property: Display name.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name.
     * 
     * @param displayName the displayName value to set.
     * @return the AuthenticationSettingProperties object itself.
     */
    public AuthenticationSettingProperties withDisplayName(String displayName) {
        this.displayName = displayName;
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
        jsonWriter.writeStringField("authenticationKind",
            this.authenticationKind == null ? null : this.authenticationKind.toString());
        jsonWriter.writeStringField("displayName", this.displayName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AuthenticationSettingProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuthenticationSettingProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AuthenticationSettingProperties.
     */
    public static AuthenticationSettingProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("authenticationKind".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("ManagedIdentity".equals(discriminatorValue)) {
                    return ManagedIdentityAuthenticationSettingProperties.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static AuthenticationSettingProperties fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AuthenticationSettingProperties deserializedAuthenticationSettingProperties
                = new AuthenticationSettingProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("authenticationKind".equals(fieldName)) {
                    deserializedAuthenticationSettingProperties.authenticationKind
                        = AuthenticationKind.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedAuthenticationSettingProperties.provisioningState
                        = HealthModelProvisioningState.fromString(reader.getString());
                } else if ("displayName".equals(fieldName)) {
                    deserializedAuthenticationSettingProperties.displayName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAuthenticationSettingProperties;
        });
    }
}
