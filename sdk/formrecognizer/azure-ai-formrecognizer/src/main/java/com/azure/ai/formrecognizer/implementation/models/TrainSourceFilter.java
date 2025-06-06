// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Filter to apply to the documents in the source path for training.
 */
@Fluent
public final class TrainSourceFilter implements JsonSerializable<TrainSourceFilter> {
    /*
     * A case-sensitive prefix string to filter documents in the source path for training. For example, when using a
     * Azure storage blob Uri, use the prefix to restrict sub folders for training.
     */
    @Generated
    private String prefix;

    /*
     * A flag to indicate if sub folders within the set of prefix folders will also need to be included when searching
     * for content to be preprocessed.
     */
    @Generated
    private Boolean includeSubFolders;

    /**
     * Creates an instance of TrainSourceFilter class.
     */
    @Generated
    public TrainSourceFilter() {
    }

    /**
     * Get the prefix property: A case-sensitive prefix string to filter documents in the source path for training. For
     * example, when using a Azure storage blob Uri, use the prefix to restrict sub folders for training.
     * 
     * @return the prefix value.
     */
    @Generated
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: A case-sensitive prefix string to filter documents in the source path for training. For
     * example, when using a Azure storage blob Uri, use the prefix to restrict sub folders for training.
     * 
     * @param prefix the prefix value to set.
     * @return the TrainSourceFilter object itself.
     */
    @Generated
    public TrainSourceFilter setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the includeSubFolders property: A flag to indicate if sub folders within the set of prefix folders will also
     * need to be included when searching for content to be preprocessed.
     * 
     * @return the includeSubFolders value.
     */
    @Generated
    public Boolean isIncludeSubFolders() {
        return this.includeSubFolders;
    }

    /**
     * Set the includeSubFolders property: A flag to indicate if sub folders within the set of prefix folders will also
     * need to be included when searching for content to be preprocessed.
     * 
     * @param includeSubFolders the includeSubFolders value to set.
     * @return the TrainSourceFilter object itself.
     */
    @Generated
    public TrainSourceFilter setIncludeSubFolders(Boolean includeSubFolders) {
        this.includeSubFolders = includeSubFolders;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("prefix", this.prefix);
        jsonWriter.writeBooleanField("includeSubFolders", this.includeSubFolders);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TrainSourceFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TrainSourceFilter if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TrainSourceFilter.
     */
    @Generated
    public static TrainSourceFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TrainSourceFilter deserializedTrainSourceFilter = new TrainSourceFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("prefix".equals(fieldName)) {
                    deserializedTrainSourceFilter.prefix = reader.getString();
                } else if ("includeSubFolders".equals(fieldName)) {
                    deserializedTrainSourceFilter.includeSubFolders = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTrainSourceFilter;
        });
    }
}
