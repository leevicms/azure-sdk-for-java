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
 * The certificate issuer set parameters.
 */
@Fluent
public final class CertificateIssuerSetParameters implements JsonSerializable<CertificateIssuerSetParameters> {
    /*
     * The issuer provider.
     */
    @Generated
    private final String provider;

    /*
     * The credentials to be used for the issuer.
     */
    @Generated
    private IssuerCredentials credentials;

    /*
     * Details of the organization as provided to the issuer.
     */
    @Generated
    private OrganizationDetails organizationDetails;

    /*
     * Attributes of the issuer object.
     */
    @Generated
    private IssuerAttributes attributes;

    /**
     * Creates an instance of CertificateIssuerSetParameters class.
     * 
     * @param provider the provider value to set.
     */
    @Generated
    public CertificateIssuerSetParameters(String provider) {
        this.provider = provider;
    }

    /**
     * Get the provider property: The issuer provider.
     * 
     * @return the provider value.
     */
    @Generated
    public String getProvider() {
        return this.provider;
    }

    /**
     * Get the credentials property: The credentials to be used for the issuer.
     * 
     * @return the credentials value.
     */
    @Generated
    public IssuerCredentials getCredentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: The credentials to be used for the issuer.
     * 
     * @param credentials the credentials value to set.
     * @return the CertificateIssuerSetParameters object itself.
     */
    @Generated
    public CertificateIssuerSetParameters setCredentials(IssuerCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the organizationDetails property: Details of the organization as provided to the issuer.
     * 
     * @return the organizationDetails value.
     */
    @Generated
    public OrganizationDetails getOrganizationDetails() {
        return this.organizationDetails;
    }

    /**
     * Set the organizationDetails property: Details of the organization as provided to the issuer.
     * 
     * @param organizationDetails the organizationDetails value to set.
     * @return the CertificateIssuerSetParameters object itself.
     */
    @Generated
    public CertificateIssuerSetParameters setOrganizationDetails(OrganizationDetails organizationDetails) {
        this.organizationDetails = organizationDetails;
        return this;
    }

    /**
     * Get the attributes property: Attributes of the issuer object.
     * 
     * @return the attributes value.
     */
    @Generated
    public IssuerAttributes getAttributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: Attributes of the issuer object.
     * 
     * @param attributes the attributes value to set.
     * @return the CertificateIssuerSetParameters object itself.
     */
    @Generated
    public CertificateIssuerSetParameters setAttributes(IssuerAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("provider", this.provider);
        jsonWriter.writeJsonField("credentials", this.credentials);
        jsonWriter.writeJsonField("org_details", this.organizationDetails);
        jsonWriter.writeJsonField("attributes", this.attributes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CertificateIssuerSetParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CertificateIssuerSetParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CertificateIssuerSetParameters.
     */
    @Generated
    public static CertificateIssuerSetParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String provider = null;
            IssuerCredentials credentials = null;
            OrganizationDetails organizationDetails = null;
            IssuerAttributes attributes = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provider".equals(fieldName)) {
                    provider = reader.getString();
                } else if ("credentials".equals(fieldName)) {
                    credentials = IssuerCredentials.fromJson(reader);
                } else if ("org_details".equals(fieldName)) {
                    organizationDetails = OrganizationDetails.fromJson(reader);
                } else if ("attributes".equals(fieldName)) {
                    attributes = IssuerAttributes.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            CertificateIssuerSetParameters deserializedCertificateIssuerSetParameters
                = new CertificateIssuerSetParameters(provider);
            deserializedCertificateIssuerSetParameters.credentials = credentials;
            deserializedCertificateIssuerSetParameters.organizationDetails = organizationDetails;
            deserializedCertificateIssuerSetParameters.attributes = attributes;

            return deserializedCertificateIssuerSetParameters;
        });
    }
}
