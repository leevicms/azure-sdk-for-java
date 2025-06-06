// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.agents.persistent.implementation.models;

import com.azure.ai.agents.persistent.models.VectorStoreChunkingStrategyRequest;
import com.azure.ai.agents.persistent.models.VectorStoreDataSource;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The CreateVectorStoreFileRequest model.
 */
@Fluent
public final class CreateVectorStoreFileRequest implements JsonSerializable<CreateVectorStoreFileRequest> {

    /*
     * Identifier of the file.
     */
    @Generated
    private String fileId;

    /*
     * Azure asset ID.
     */
    @Generated
    private VectorStoreDataSource dataSource;

    /*
     * The chunking strategy used to chunk the file. If not set, uses the auto strategy.
     */
    @Generated
    private VectorStoreChunkingStrategyRequest chunkingStrategy;

    /**
     * Creates an instance of CreateVectorStoreFileRequest class.
     */
    @Generated
    public CreateVectorStoreFileRequest() {
    }

    /**
     * Get the fileId property: Identifier of the file.
     *
     * @return the fileId value.
     */
    @Generated
    public String getFileId() {
        return this.fileId;
    }

    /**
     * Set the fileId property: Identifier of the file.
     *
     * @param fileId the fileId value to set.
     * @return the CreateVectorStoreFileRequest object itself.
     */
    @Generated
    public CreateVectorStoreFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Get the dataSource property: Azure asset ID.
     *
     * @return the dataSource value.
     */
    @Generated
    public VectorStoreDataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * Set the dataSource property: Azure asset ID.
     *
     * @param dataSource the dataSource value to set.
     * @return the CreateVectorStoreFileRequest object itself.
     */
    @Generated
    public CreateVectorStoreFileRequest setDataSource(VectorStoreDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * Get the chunkingStrategy property: The chunking strategy used to chunk the file. If not set, uses the auto
     * strategy.
     *
     * @return the chunkingStrategy value.
     */
    @Generated
    public VectorStoreChunkingStrategyRequest getChunkingStrategy() {
        return this.chunkingStrategy;
    }

    /**
     * Set the chunkingStrategy property: The chunking strategy used to chunk the file. If not set, uses the auto
     * strategy.
     *
     * @param chunkingStrategy the chunkingStrategy value to set.
     * @return the CreateVectorStoreFileRequest object itself.
     */
    @Generated
    public CreateVectorStoreFileRequest setChunkingStrategy(VectorStoreChunkingStrategyRequest chunkingStrategy) {
        this.chunkingStrategy = chunkingStrategy;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("file_id", this.fileId);
        jsonWriter.writeJsonField("data_source", this.dataSource);
        jsonWriter.writeJsonField("chunking_strategy", this.chunkingStrategy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateVectorStoreFileRequest from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateVectorStoreFileRequest if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CreateVectorStoreFileRequest.
     */
    @Generated
    public static CreateVectorStoreFileRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateVectorStoreFileRequest deserializedCreateVectorStoreFileRequest = new CreateVectorStoreFileRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("file_id".equals(fieldName)) {
                    deserializedCreateVectorStoreFileRequest.fileId = reader.getString();
                } else if ("data_source".equals(fieldName)) {
                    deserializedCreateVectorStoreFileRequest.dataSource = VectorStoreDataSource.fromJson(reader);
                } else if ("chunking_strategy".equals(fieldName)) {
                    deserializedCreateVectorStoreFileRequest.chunkingStrategy
                        = VectorStoreChunkingStrategyRequest.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedCreateVectorStoreFileRequest;
        });
    }
}
