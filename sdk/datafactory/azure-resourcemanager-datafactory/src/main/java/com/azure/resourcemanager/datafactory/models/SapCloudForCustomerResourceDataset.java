// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.SapCloudForCustomerResourceDatasetTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The path of the SAP Cloud for Customer OData entity.
 */
@Fluent
public final class SapCloudForCustomerResourceDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "SapCloudForCustomerResource";

    /*
     * SAP Cloud For Customer OData resource dataset properties.
     */
    private SapCloudForCustomerResourceDatasetTypeProperties innerTypeProperties
        = new SapCloudForCustomerResourceDatasetTypeProperties();

    /**
     * Creates an instance of SapCloudForCustomerResourceDataset class.
     */
    public SapCloudForCustomerResourceDataset() {
    }

    /**
     * Get the type property: Type of dataset.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: SAP Cloud For Customer OData resource dataset properties.
     * 
     * @return the innerTypeProperties value.
     */
    SapCloudForCustomerResourceDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapCloudForCustomerResourceDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapCloudForCustomerResourceDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapCloudForCustomerResourceDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapCloudForCustomerResourceDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapCloudForCustomerResourceDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapCloudForCustomerResourceDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapCloudForCustomerResourceDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the path property: The path of the SAP Cloud for Customer OData entity. Type: string (or Expression with
     * resultType string).
     * 
     * @return the path value.
     */
    public Object path() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().path();
    }

    /**
     * Set the path property: The path of the SAP Cloud for Customer OData entity. Type: string (or Expression with
     * resultType string).
     * 
     * @param path the path value to set.
     * @return the SapCloudForCustomerResourceDataset object itself.
     */
    public SapCloudForCustomerResourceDataset withPath(Object path) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapCloudForCustomerResourceDatasetTypeProperties();
        }
        this.innerTypeProperties().withPath(path);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model SapCloudForCustomerResourceDataset"));
        } else {
            innerTypeProperties().validate();
        }
        if (linkedServiceName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property linkedServiceName in model SapCloudForCustomerResourceDataset"));
        } else {
            linkedServiceName().validate();
        }
        if (parameters() != null) {
            parameters().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (folder() != null) {
            folder().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SapCloudForCustomerResourceDataset.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("linkedServiceName", linkedServiceName());
        jsonWriter.writeStringField("description", description());
        if (structure() != null) {
            jsonWriter.writeUntypedField("structure", structure());
        }
        if (schema() != null) {
            jsonWriter.writeUntypedField("schema", schema());
        }
        jsonWriter.writeMapField("parameters", parameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", annotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("folder", folder());
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SapCloudForCustomerResourceDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SapCloudForCustomerResourceDataset if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SapCloudForCustomerResourceDataset.
     */
    public static SapCloudForCustomerResourceDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SapCloudForCustomerResourceDataset deserializedSapCloudForCustomerResourceDataset
                = new SapCloudForCustomerResourceDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedSapCloudForCustomerResourceDataset
                        .withLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedSapCloudForCustomerResourceDataset.withDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedSapCloudForCustomerResourceDataset.withStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedSapCloudForCustomerResourceDataset.withSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedSapCloudForCustomerResourceDataset.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedSapCloudForCustomerResourceDataset.withAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedSapCloudForCustomerResourceDataset.withFolder(DatasetFolder.fromJson(reader));
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedSapCloudForCustomerResourceDataset.innerTypeProperties
                        = SapCloudForCustomerResourceDatasetTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedSapCloudForCustomerResourceDataset.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSapCloudForCustomerResourceDataset.withAdditionalProperties(additionalProperties);

            return deserializedSapCloudForCustomerResourceDataset;
        });
    }
}
