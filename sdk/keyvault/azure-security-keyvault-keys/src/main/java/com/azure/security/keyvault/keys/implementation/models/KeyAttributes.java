// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.security.keyvault.keys.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.security.keyvault.keys.models.KeyAttestation;
import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * The attributes of a key managed by the key vault service.
 */
@Fluent
public final class KeyAttributes implements JsonSerializable<KeyAttributes> {
    /*
     * Determines whether the object is enabled.
     */
    @Generated
    private Boolean enabled;

    /*
     * Not before date in UTC.
     */
    @Generated
    private Long notBefore;

    /*
     * Expiry date in UTC.
     */
    @Generated
    private Long expires;

    /*
     * Creation time in UTC.
     */
    @Generated
    private Long created;

    /*
     * Last updated time in UTC.
     */
    @Generated
    private Long updated;

    /*
     * softDelete data retention days. Value should be >=7 and <=90 when softDelete enabled, otherwise 0.
     */
    @Generated
    private Integer recoverableDays;

    /*
     * Reflects the deletion recovery level currently in effect for keys in the current vault. If it contains
     * 'Purgeable' the key can be permanently deleted by a privileged user; otherwise, only the system can purge the
     * key, at the end of the retention interval.
     */
    @Generated
    private DeletionRecoveryLevel recoveryLevel;

    /*
     * Indicates if the private key can be exported. Release policy must be provided when creating the first version of
     * an exportable key.
     */
    @Generated
    private Boolean exportable;

    /*
     * The underlying HSM Platform.
     */
    @Generated
    private String hsmPlatform;

    /*
     * The key or key version attestation information.
     */
    @Generated
    private KeyAttestation attestation;

    /**
     * Creates an instance of KeyAttributes class.
     */
    @Generated
    public KeyAttributes() {
    }

    /**
     * Get the enabled property: Determines whether the object is enabled.
     * 
     * @return the enabled value.
     */
    @Generated
    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Determines whether the object is enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the KeyAttributes object itself.
     */
    @Generated
    public KeyAttributes setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the notBefore property: Not before date in UTC.
     * 
     * @return the notBefore value.
     */
    @Generated
    public OffsetDateTime getNotBefore() {
        if (this.notBefore == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.notBefore), ZoneOffset.UTC);
    }

    /**
     * Set the notBefore property: Not before date in UTC.
     * 
     * @param notBefore the notBefore value to set.
     * @return the KeyAttributes object itself.
     */
    @Generated
    public KeyAttributes setNotBefore(OffsetDateTime notBefore) {
        if (notBefore == null) {
            this.notBefore = null;
        } else {
            this.notBefore = notBefore.toEpochSecond();
        }
        return this;
    }

    /**
     * Get the expires property: Expiry date in UTC.
     * 
     * @return the expires value.
     */
    @Generated
    public OffsetDateTime getExpires() {
        if (this.expires == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.expires), ZoneOffset.UTC);
    }

    /**
     * Set the expires property: Expiry date in UTC.
     * 
     * @param expires the expires value to set.
     * @return the KeyAttributes object itself.
     */
    @Generated
    public KeyAttributes setExpires(OffsetDateTime expires) {
        if (expires == null) {
            this.expires = null;
        } else {
            this.expires = expires.toEpochSecond();
        }
        return this;
    }

    /**
     * Get the created property: Creation time in UTC.
     * 
     * @return the created value.
     */
    @Generated
    public OffsetDateTime getCreated() {
        if (this.created == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.created), ZoneOffset.UTC);
    }

    /**
     * Get the updated property: Last updated time in UTC.
     * 
     * @return the updated value.
     */
    @Generated
    public OffsetDateTime getUpdated() {
        if (this.updated == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.updated), ZoneOffset.UTC);
    }

    /**
     * Get the recoverableDays property: softDelete data retention days. Value should be &gt;=7 and &lt;=90 when
     * softDelete enabled, otherwise 0.
     * 
     * @return the recoverableDays value.
     */
    @Generated
    public Integer getRecoverableDays() {
        return this.recoverableDays;
    }

    /**
     * Get the recoveryLevel property: Reflects the deletion recovery level currently in effect for keys in the current
     * vault. If it contains 'Purgeable' the key can be permanently deleted by a privileged user; otherwise, only the
     * system can purge the key, at the end of the retention interval.
     * 
     * @return the recoveryLevel value.
     */
    @Generated
    public DeletionRecoveryLevel getRecoveryLevel() {
        return this.recoveryLevel;
    }

    /**
     * Get the exportable property: Indicates if the private key can be exported. Release policy must be provided when
     * creating the first version of an exportable key.
     * 
     * @return the exportable value.
     */
    @Generated
    public Boolean isExportable() {
        return this.exportable;
    }

    /**
     * Set the exportable property: Indicates if the private key can be exported. Release policy must be provided when
     * creating the first version of an exportable key.
     * 
     * @param exportable the exportable value to set.
     * @return the KeyAttributes object itself.
     */
    @Generated
    public KeyAttributes setExportable(Boolean exportable) {
        this.exportable = exportable;
        return this;
    }

    /**
     * Get the hsmPlatform property: The underlying HSM Platform.
     * 
     * @return the hsmPlatform value.
     */
    @Generated
    public String getHsmPlatform() {
        return this.hsmPlatform;
    }

    /**
     * Get the attestation property: The key or key version attestation information.
     * 
     * @return the attestation value.
     */
    @Generated
    public KeyAttestation getAttestation() {
        return this.attestation;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeNumberField("nbf", this.notBefore);
        jsonWriter.writeNumberField("exp", this.expires);
        jsonWriter.writeBooleanField("exportable", this.exportable);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyAttributes from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyAttributes if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the KeyAttributes.
     */
    @Generated
    public static KeyAttributes fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyAttributes deserializedKeyAttributes = new KeyAttributes();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedKeyAttributes.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("nbf".equals(fieldName)) {
                    deserializedKeyAttributes.notBefore = reader.getNullable(JsonReader::getLong);
                } else if ("exp".equals(fieldName)) {
                    deserializedKeyAttributes.expires = reader.getNullable(JsonReader::getLong);
                } else if ("created".equals(fieldName)) {
                    deserializedKeyAttributes.created = reader.getNullable(JsonReader::getLong);
                } else if ("updated".equals(fieldName)) {
                    deserializedKeyAttributes.updated = reader.getNullable(JsonReader::getLong);
                } else if ("recoverableDays".equals(fieldName)) {
                    deserializedKeyAttributes.recoverableDays = reader.getNullable(JsonReader::getInt);
                } else if ("recoveryLevel".equals(fieldName)) {
                    deserializedKeyAttributes.recoveryLevel = DeletionRecoveryLevel.fromString(reader.getString());
                } else if ("exportable".equals(fieldName)) {
                    deserializedKeyAttributes.exportable = reader.getNullable(JsonReader::getBoolean);
                } else if ("hsmPlatform".equals(fieldName)) {
                    deserializedKeyAttributes.hsmPlatform = reader.getString();
                } else if ("attestation".equals(fieldName)) {
                    deserializedKeyAttributes.attestation = KeyAttestation.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyAttributes;
        });
    }
}
