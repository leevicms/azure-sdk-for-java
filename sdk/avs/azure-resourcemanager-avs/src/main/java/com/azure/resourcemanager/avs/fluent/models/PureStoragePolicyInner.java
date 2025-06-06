// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.models.PureStoragePolicyProperties;
import java.io.IOException;

/**
 * An instance describing a Pure Storage Policy Based Management policy.
 */
@Fluent
public final class PureStoragePolicyInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    private PureStoragePolicyProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

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
     * Creates an instance of PureStoragePolicyInner class.
     */
    public PureStoragePolicyInner() {
    }

    /**
     * Get the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    public PureStoragePolicyProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource-specific properties for this resource.
     * 
     * @param properties the properties value to set.
     * @return the PureStoragePolicyInner object itself.
     */
    public PureStoragePolicyInner withProperties(PureStoragePolicyProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PureStoragePolicyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PureStoragePolicyInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PureStoragePolicyInner.
     */
    public static PureStoragePolicyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PureStoragePolicyInner deserializedPureStoragePolicyInner = new PureStoragePolicyInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPureStoragePolicyInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPureStoragePolicyInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPureStoragePolicyInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPureStoragePolicyInner.properties = PureStoragePolicyProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedPureStoragePolicyInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPureStoragePolicyInner;
        });
    }
}
