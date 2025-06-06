// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.BinaryData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Deployment preflight resource.
 */
@Fluent
public final class DeploymentPreflightResource implements JsonSerializable<DeploymentPreflightResource> {
    /*
     * Gets or sets the resource name.
     */
    private String name;

    /*
     * Gets or sets the resource type.
     */
    private String type;

    /*
     * Gets or sets the location of the resource.
     */
    private String location;

    /*
     * Gets or sets the Api version.
     */
    private String apiVersion;

    /*
     * Gets or sets the properties of the resource.
     */
    private BinaryData properties;

    /**
     * Creates an instance of DeploymentPreflightResource class.
     */
    public DeploymentPreflightResource() {
    }

    /**
     * Get the name property: Gets or sets the resource name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the resource name.
     * 
     * @param name the name value to set.
     * @return the DeploymentPreflightResource object itself.
     */
    public DeploymentPreflightResource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Gets or sets the resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Gets or sets the resource type.
     * 
     * @param type the type value to set.
     * @return the DeploymentPreflightResource object itself.
     */
    public DeploymentPreflightResource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the location property: Gets or sets the location of the resource.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Gets or sets the location of the resource.
     * 
     * @param location the location value to set.
     * @return the DeploymentPreflightResource object itself.
     */
    public DeploymentPreflightResource withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the apiVersion property: Gets or sets the Api version.
     * 
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion property: Gets or sets the Api version.
     * 
     * @param apiVersion the apiVersion value to set.
     * @return the DeploymentPreflightResource object itself.
     */
    public DeploymentPreflightResource withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the properties property: Gets or sets the properties of the resource.
     * 
     * @return the properties value.
     */
    public BinaryData properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Gets or sets the properties of the resource.
     * 
     * @param properties the properties value to set.
     * @return the DeploymentPreflightResource object itself.
     */
    public DeploymentPreflightResource withProperties(BinaryData properties) {
        this.properties = properties;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeStringField("apiVersion", this.apiVersion);
        if (this.properties != null) {
            jsonWriter.writeFieldName("properties");
            this.properties.writeTo(jsonWriter);
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeploymentPreflightResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeploymentPreflightResource if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeploymentPreflightResource.
     */
    public static DeploymentPreflightResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeploymentPreflightResource deserializedDeploymentPreflightResource = new DeploymentPreflightResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedDeploymentPreflightResource.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDeploymentPreflightResource.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedDeploymentPreflightResource.location = reader.getString();
                } else if ("apiVersion".equals(fieldName)) {
                    deserializedDeploymentPreflightResource.apiVersion = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedDeploymentPreflightResource.properties
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeploymentPreflightResource;
        });
    }
}
