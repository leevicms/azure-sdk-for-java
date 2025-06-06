// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.fluent.models.DeletedAppRestoreRequestProperties;
import java.io.IOException;

/**
 * Details about restoring a deleted app.
 */
@Fluent
public final class DeletedAppRestoreRequest extends ProxyOnlyResource {
    /*
     * DeletedAppRestoreRequest resource specific properties
     */
    private DeletedAppRestoreRequestProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of DeletedAppRestoreRequest class.
     */
    public DeletedAppRestoreRequest() {
    }

    /**
     * Get the innerProperties property: DeletedAppRestoreRequest resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private DeletedAppRestoreRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeletedAppRestoreRequest withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the deletedSiteId property: ARM resource ID of the deleted app. Example:
     * /subscriptions/{subId}/providers/Microsoft.Web/deletedSites/{deletedSiteId}.
     * 
     * @return the deletedSiteId value.
     */
    public String deletedSiteId() {
        return this.innerProperties() == null ? null : this.innerProperties().deletedSiteId();
    }

    /**
     * Set the deletedSiteId property: ARM resource ID of the deleted app. Example:
     * /subscriptions/{subId}/providers/Microsoft.Web/deletedSites/{deletedSiteId}.
     * 
     * @param deletedSiteId the deletedSiteId value to set.
     * @return the DeletedAppRestoreRequest object itself.
     */
    public DeletedAppRestoreRequest withDeletedSiteId(String deletedSiteId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeletedAppRestoreRequestProperties();
        }
        this.innerProperties().withDeletedSiteId(deletedSiteId);
        return this;
    }

    /**
     * Get the recoverConfiguration property: If true, deleted site configuration, in addition to content, will be
     * restored.
     * 
     * @return the recoverConfiguration value.
     */
    public Boolean recoverConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().recoverConfiguration();
    }

    /**
     * Set the recoverConfiguration property: If true, deleted site configuration, in addition to content, will be
     * restored.
     * 
     * @param recoverConfiguration the recoverConfiguration value to set.
     * @return the DeletedAppRestoreRequest object itself.
     */
    public DeletedAppRestoreRequest withRecoverConfiguration(Boolean recoverConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeletedAppRestoreRequestProperties();
        }
        this.innerProperties().withRecoverConfiguration(recoverConfiguration);
        return this;
    }

    /**
     * Get the snapshotTime property: Point in time to restore the deleted app from, formatted as a DateTime string.
     * If unspecified, default value is the time that the app was deleted.
     * 
     * @return the snapshotTime value.
     */
    public String snapshotTime() {
        return this.innerProperties() == null ? null : this.innerProperties().snapshotTime();
    }

    /**
     * Set the snapshotTime property: Point in time to restore the deleted app from, formatted as a DateTime string.
     * If unspecified, default value is the time that the app was deleted.
     * 
     * @param snapshotTime the snapshotTime value to set.
     * @return the DeletedAppRestoreRequest object itself.
     */
    public DeletedAppRestoreRequest withSnapshotTime(String snapshotTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeletedAppRestoreRequestProperties();
        }
        this.innerProperties().withSnapshotTime(snapshotTime);
        return this;
    }

    /**
     * Get the useDRSecondary property: If true, the snapshot is retrieved from DRSecondary endpoint.
     * 
     * @return the useDRSecondary value.
     */
    public Boolean useDRSecondary() {
        return this.innerProperties() == null ? null : this.innerProperties().useDRSecondary();
    }

    /**
     * Set the useDRSecondary property: If true, the snapshot is retrieved from DRSecondary endpoint.
     * 
     * @param useDRSecondary the useDRSecondary value to set.
     * @return the DeletedAppRestoreRequest object itself.
     */
    public DeletedAppRestoreRequest withUseDRSecondary(Boolean useDRSecondary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeletedAppRestoreRequestProperties();
        }
        this.innerProperties().withUseDRSecondary(useDRSecondary);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeletedAppRestoreRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeletedAppRestoreRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeletedAppRestoreRequest.
     */
    public static DeletedAppRestoreRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeletedAppRestoreRequest deserializedDeletedAppRestoreRequest = new DeletedAppRestoreRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDeletedAppRestoreRequest.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDeletedAppRestoreRequest.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDeletedAppRestoreRequest.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedDeletedAppRestoreRequest.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedDeletedAppRestoreRequest.innerProperties
                        = DeletedAppRestoreRequestProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeletedAppRestoreRequest;
        });
    }
}
