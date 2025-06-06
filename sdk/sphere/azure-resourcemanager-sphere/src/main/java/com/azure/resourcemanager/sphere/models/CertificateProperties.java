// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The properties of certificate.
 */
@Immutable
public class CertificateProperties implements JsonSerializable<CertificateProperties> {
    /*
     * The certificate as a UTF-8 encoded base 64 string.
     */
    private String certificate;

    /*
     * The certificate status.
     */
    private CertificateStatus status;

    /*
     * The certificate subject.
     */
    private String subject;

    /*
     * The certificate thumbprint.
     */
    private String thumbprint;

    /*
     * The certificate expiry date.
     */
    private OffsetDateTime expiryUtc;

    /*
     * The certificate not before date.
     */
    private OffsetDateTime notBeforeUtc;

    /*
     * The status of the last operation.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of CertificateProperties class.
     */
    public CertificateProperties() {
    }

    /**
     * Get the certificate property: The certificate as a UTF-8 encoded base 64 string.
     * 
     * @return the certificate value.
     */
    public String certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate property: The certificate as a UTF-8 encoded base 64 string.
     * 
     * @param certificate the certificate value to set.
     * @return the CertificateProperties object itself.
     */
    CertificateProperties withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get the status property: The certificate status.
     * 
     * @return the status value.
     */
    public CertificateStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The certificate status.
     * 
     * @param status the status value to set.
     * @return the CertificateProperties object itself.
     */
    CertificateProperties withStatus(CertificateStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the subject property: The certificate subject.
     * 
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set the subject property: The certificate subject.
     * 
     * @param subject the subject value to set.
     * @return the CertificateProperties object itself.
     */
    CertificateProperties withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the thumbprint property: The certificate thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: The certificate thumbprint.
     * 
     * @param thumbprint the thumbprint value to set.
     * @return the CertificateProperties object itself.
     */
    CertificateProperties withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the expiryUtc property: The certificate expiry date.
     * 
     * @return the expiryUtc value.
     */
    public OffsetDateTime expiryUtc() {
        return this.expiryUtc;
    }

    /**
     * Set the expiryUtc property: The certificate expiry date.
     * 
     * @param expiryUtc the expiryUtc value to set.
     * @return the CertificateProperties object itself.
     */
    CertificateProperties withExpiryUtc(OffsetDateTime expiryUtc) {
        this.expiryUtc = expiryUtc;
        return this;
    }

    /**
     * Get the notBeforeUtc property: The certificate not before date.
     * 
     * @return the notBeforeUtc value.
     */
    public OffsetDateTime notBeforeUtc() {
        return this.notBeforeUtc;
    }

    /**
     * Set the notBeforeUtc property: The certificate not before date.
     * 
     * @param notBeforeUtc the notBeforeUtc value to set.
     * @return the CertificateProperties object itself.
     */
    CertificateProperties withNotBeforeUtc(OffsetDateTime notBeforeUtc) {
        this.notBeforeUtc = notBeforeUtc;
        return this;
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The status of the last operation.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the CertificateProperties object itself.
     */
    CertificateProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CertificateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CertificateProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CertificateProperties.
     */
    public static CertificateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CertificateProperties deserializedCertificateProperties = new CertificateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("certificate".equals(fieldName)) {
                    deserializedCertificateProperties.certificate = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedCertificateProperties.status = CertificateStatus.fromString(reader.getString());
                } else if ("subject".equals(fieldName)) {
                    deserializedCertificateProperties.subject = reader.getString();
                } else if ("thumbprint".equals(fieldName)) {
                    deserializedCertificateProperties.thumbprint = reader.getString();
                } else if ("expiryUtc".equals(fieldName)) {
                    deserializedCertificateProperties.expiryUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("notBeforeUtc".equals(fieldName)) {
                    deserializedCertificateProperties.notBeforeUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedCertificateProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCertificateProperties;
        });
    }
}
