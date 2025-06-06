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
import java.util.Map;

/**
 * The certificate import parameters.
 */
@Fluent
public final class CertificateImportParameters implements JsonSerializable<CertificateImportParameters> {
    /*
     * Base64 encoded representation of the certificate object to import. This certificate needs to contain the private
     * key.
     */
    @Generated
    private final String base64EncodedCertificate;

    /*
     * If the private key in base64EncodedCertificate is encrypted, the password used for encryption.
     */
    @Generated
    private String password;

    /*
     * The management policy for the certificate.
     */
    @Generated
    private CertificatePolicy certificatePolicy;

    /*
     * The attributes of the certificate (optional).
     */
    @Generated
    private CertificateAttributes certificateAttributes;

    /*
     * Application specific metadata in the form of key-value pairs.
     */
    @Generated
    private Map<String, String> tags;

    /*
     * Specifies whether the certificate chain preserves its original order. The default value is false, which sets the
     * leaf certificate at index 0.
     */
    @Generated
    private Boolean preserveCertOrder;

    /**
     * Creates an instance of CertificateImportParameters class.
     * 
     * @param base64EncodedCertificate the base64EncodedCertificate value to set.
     */
    @Generated
    public CertificateImportParameters(String base64EncodedCertificate) {
        this.base64EncodedCertificate = base64EncodedCertificate;
    }

    /**
     * Get the base64EncodedCertificate property: Base64 encoded representation of the certificate object to import.
     * This certificate needs to contain the private key.
     * 
     * @return the base64EncodedCertificate value.
     */
    @Generated
    public String getBase64EncodedCertificate() {
        return this.base64EncodedCertificate;
    }

    /**
     * Get the password property: If the private key in base64EncodedCertificate is encrypted, the password used for
     * encryption.
     * 
     * @return the password value.
     */
    @Generated
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password property: If the private key in base64EncodedCertificate is encrypted, the password used for
     * encryption.
     * 
     * @param password the password value to set.
     * @return the CertificateImportParameters object itself.
     */
    @Generated
    public CertificateImportParameters setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the certificatePolicy property: The management policy for the certificate.
     * 
     * @return the certificatePolicy value.
     */
    @Generated
    public CertificatePolicy getCertificatePolicy() {
        return this.certificatePolicy;
    }

    /**
     * Set the certificatePolicy property: The management policy for the certificate.
     * 
     * @param certificatePolicy the certificatePolicy value to set.
     * @return the CertificateImportParameters object itself.
     */
    @Generated
    public CertificateImportParameters setCertificatePolicy(CertificatePolicy certificatePolicy) {
        this.certificatePolicy = certificatePolicy;
        return this;
    }

    /**
     * Get the certificateAttributes property: The attributes of the certificate (optional).
     * 
     * @return the certificateAttributes value.
     */
    @Generated
    public CertificateAttributes getCertificateAttributes() {
        return this.certificateAttributes;
    }

    /**
     * Set the certificateAttributes property: The attributes of the certificate (optional).
     * 
     * @param certificateAttributes the certificateAttributes value to set.
     * @return the CertificateImportParameters object itself.
     */
    @Generated
    public CertificateImportParameters setCertificateAttributes(CertificateAttributes certificateAttributes) {
        this.certificateAttributes = certificateAttributes;
        return this;
    }

    /**
     * Get the tags property: Application specific metadata in the form of key-value pairs.
     * 
     * @return the tags value.
     */
    @Generated
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: Application specific metadata in the form of key-value pairs.
     * 
     * @param tags the tags value to set.
     * @return the CertificateImportParameters object itself.
     */
    @Generated
    public CertificateImportParameters setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the preserveCertOrder property: Specifies whether the certificate chain preserves its original order. The
     * default value is false, which sets the leaf certificate at index 0.
     * 
     * @return the preserveCertOrder value.
     */
    @Generated
    public Boolean isPreserveCertOrder() {
        return this.preserveCertOrder;
    }

    /**
     * Set the preserveCertOrder property: Specifies whether the certificate chain preserves its original order. The
     * default value is false, which sets the leaf certificate at index 0.
     * 
     * @param preserveCertOrder the preserveCertOrder value to set.
     * @return the CertificateImportParameters object itself.
     */
    @Generated
    public CertificateImportParameters setPreserveCertOrder(Boolean preserveCertOrder) {
        this.preserveCertOrder = preserveCertOrder;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.base64EncodedCertificate);
        jsonWriter.writeStringField("pwd", this.password);
        jsonWriter.writeJsonField("policy", this.certificatePolicy);
        jsonWriter.writeJsonField("attributes", this.certificateAttributes);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("preserveCertOrder", this.preserveCertOrder);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CertificateImportParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CertificateImportParameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CertificateImportParameters.
     */
    @Generated
    public static CertificateImportParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String base64EncodedCertificate = null;
            String password = null;
            CertificatePolicy certificatePolicy = null;
            CertificateAttributes certificateAttributes = null;
            Map<String, String> tags = null;
            Boolean preserveCertOrder = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    base64EncodedCertificate = reader.getString();
                } else if ("pwd".equals(fieldName)) {
                    password = reader.getString();
                } else if ("policy".equals(fieldName)) {
                    certificatePolicy = CertificatePolicy.fromJson(reader);
                } else if ("attributes".equals(fieldName)) {
                    certificateAttributes = CertificateAttributes.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    tags = reader.readMap(reader1 -> reader1.getString());
                } else if ("preserveCertOrder".equals(fieldName)) {
                    preserveCertOrder = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }
            CertificateImportParameters deserializedCertificateImportParameters
                = new CertificateImportParameters(base64EncodedCertificate);
            deserializedCertificateImportParameters.password = password;
            deserializedCertificateImportParameters.certificatePolicy = certificatePolicy;
            deserializedCertificateImportParameters.certificateAttributes = certificateAttributes;
            deserializedCertificateImportParameters.tags = tags;
            deserializedCertificateImportParameters.preserveCertOrder = preserveCertOrder;

            return deserializedCertificateImportParameters;
        });
    }
}
