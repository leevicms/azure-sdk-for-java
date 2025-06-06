// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.logs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A stored query.
 * 
 * Queries are stored pieces of KQL, along with a list of relevant metadata items.
 */
@Fluent
public final class MetadataQuery implements JsonSerializable<MetadataQuery> {
    /*
     * The ID of the query.
     */
    @Generated
    private final String id;

    /*
     * The display name of the query.
     */
    @Generated
    private String displayName;

    /*
     * The description of the query.
     */
    @Generated
    private String description;

    /*
     * The KQL body of the query.
     */
    @Generated
    private final String body;

    /*
     * The user defined labels associated with the query.
     */
    @Generated
    private List<String> labels;

    /*
     * The tags associated with the query.
     */
    @Generated
    private Object tags;

    /*
     * The properties of the query.
     */
    @Generated
    private Object properties;

    /*
     * The related metadata items for the query.
     */
    @Generated
    private MetadataQueryRelated related;

    /**
     * Creates an instance of MetadataQuery class.
     * 
     * @param id the id value to set.
     * @param body the body value to set.
     */
    @Generated
    public MetadataQuery(String id, String body) {
        this.id = id;
        this.body = body;
    }

    /**
     * Get the id property: The ID of the query.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the displayName property: The display name of the query.
     * 
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the query.
     * 
     * @param displayName the displayName value to set.
     * @return the MetadataQuery object itself.
     */
    @Generated
    public MetadataQuery setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The description of the query.
     * 
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the query.
     * 
     * @param description the description value to set.
     * @return the MetadataQuery object itself.
     */
    @Generated
    public MetadataQuery setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the body property: The KQL body of the query.
     * 
     * @return the body value.
     */
    @Generated
    public String getBody() {
        return this.body;
    }

    /**
     * Get the labels property: The user defined labels associated with the query.
     * 
     * @return the labels value.
     */
    @Generated
    public List<String> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: The user defined labels associated with the query.
     * 
     * @param labels the labels value to set.
     * @return the MetadataQuery object itself.
     */
    @Generated
    public MetadataQuery setLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the tags property: The tags associated with the query.
     * 
     * @return the tags value.
     */
    @Generated
    public Object getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags associated with the query.
     * 
     * @param tags the tags value to set.
     * @return the MetadataQuery object itself.
     */
    @Generated
    public MetadataQuery setTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: The properties of the query.
     * 
     * @return the properties value.
     */
    @Generated
    public Object getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the query.
     * 
     * @param properties the properties value to set.
     * @return the MetadataQuery object itself.
     */
    @Generated
    public MetadataQuery setProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the related property: The related metadata items for the query.
     * 
     * @return the related value.
     */
    @Generated
    public MetadataQueryRelated getRelated() {
        return this.related;
    }

    /**
     * Set the related property: The related metadata items for the query.
     * 
     * @param related the related value to set.
     * @return the MetadataQuery object itself.
     */
    @Generated
    public MetadataQuery setRelated(MetadataQueryRelated related) {
        this.related = related;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("body", this.body);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeArrayField("labels", this.labels, (writer, element) -> writer.writeString(element));
        if (this.tags != null) {
            jsonWriter.writeUntypedField("tags", this.tags);
        }
        if (this.properties != null) {
            jsonWriter.writeUntypedField("properties", this.properties);
        }
        jsonWriter.writeJsonField("related", this.related);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetadataQuery from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetadataQuery if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MetadataQuery.
     */
    @Generated
    public static MetadataQuery fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean idFound = false;
            String id = null;
            boolean bodyFound = false;
            String body = null;
            String displayName = null;
            String description = null;
            List<String> labels = null;
            Object tags = null;
            Object properties = null;
            MetadataQueryRelated related = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                    idFound = true;
                } else if ("body".equals(fieldName)) {
                    body = reader.getString();
                    bodyFound = true;
                } else if ("displayName".equals(fieldName)) {
                    displayName = reader.getString();
                } else if ("description".equals(fieldName)) {
                    description = reader.getString();
                } else if ("labels".equals(fieldName)) {
                    labels = reader.readArray(reader1 -> reader1.getString());
                } else if ("tags".equals(fieldName)) {
                    tags = reader.readUntyped();
                } else if ("properties".equals(fieldName)) {
                    properties = reader.readUntyped();
                } else if ("related".equals(fieldName)) {
                    related = MetadataQueryRelated.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (idFound && bodyFound) {
                MetadataQuery deserializedMetadataQuery = new MetadataQuery(id, body);
                deserializedMetadataQuery.displayName = displayName;
                deserializedMetadataQuery.description = description;
                deserializedMetadataQuery.labels = labels;
                deserializedMetadataQuery.tags = tags;
                deserializedMetadataQuery.properties = properties;
                deserializedMetadataQuery.related = related;

                return deserializedMetadataQuery;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!idFound) {
                missingProperties.add("id");
            }
            if (!bodyFound) {
                missingProperties.add("body");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
