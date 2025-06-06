// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A copy activity Json sink.
 */
@Fluent
public final class JsonSink extends CopySink {
    /*
     * Copy sink type.
     */
    private String type = "JsonSink";

    /*
     * Json store settings.
     */
    private StoreWriteSettings storeSettings;

    /*
     * Json format settings.
     */
    private JsonWriteSettings formatSettings;

    /**
     * Creates an instance of JsonSink class.
     */
    public JsonSink() {
    }

    /**
     * Get the type property: Copy sink type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the storeSettings property: Json store settings.
     * 
     * @return the storeSettings value.
     */
    public StoreWriteSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: Json store settings.
     * 
     * @param storeSettings the storeSettings value to set.
     * @return the JsonSink object itself.
     */
    public JsonSink withStoreSettings(StoreWriteSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: Json format settings.
     * 
     * @return the formatSettings value.
     */
    public JsonWriteSettings formatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: Json format settings.
     * 
     * @param formatSettings the formatSettings value to set.
     * @return the JsonSink object itself.
     */
    public JsonSink withFormatSettings(JsonWriteSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonSink withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (storeSettings() != null) {
            storeSettings().validate();
        }
        if (formatSettings() != null) {
            formatSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (writeBatchSize() != null) {
            jsonWriter.writeUntypedField("writeBatchSize", writeBatchSize());
        }
        if (writeBatchTimeout() != null) {
            jsonWriter.writeUntypedField("writeBatchTimeout", writeBatchTimeout());
        }
        if (sinkRetryCount() != null) {
            jsonWriter.writeUntypedField("sinkRetryCount", sinkRetryCount());
        }
        if (sinkRetryWait() != null) {
            jsonWriter.writeUntypedField("sinkRetryWait", sinkRetryWait());
        }
        if (maxConcurrentConnections() != null) {
            jsonWriter.writeUntypedField("maxConcurrentConnections", maxConcurrentConnections());
        }
        if (disableMetricsCollection() != null) {
            jsonWriter.writeUntypedField("disableMetricsCollection", disableMetricsCollection());
        }
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("storeSettings", this.storeSettings);
        jsonWriter.writeJsonField("formatSettings", this.formatSettings);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JsonSink from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JsonSink if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the JsonSink.
     */
    public static JsonSink fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JsonSink deserializedJsonSink = new JsonSink();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("writeBatchSize".equals(fieldName)) {
                    deserializedJsonSink.withWriteBatchSize(reader.readUntyped());
                } else if ("writeBatchTimeout".equals(fieldName)) {
                    deserializedJsonSink.withWriteBatchTimeout(reader.readUntyped());
                } else if ("sinkRetryCount".equals(fieldName)) {
                    deserializedJsonSink.withSinkRetryCount(reader.readUntyped());
                } else if ("sinkRetryWait".equals(fieldName)) {
                    deserializedJsonSink.withSinkRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedJsonSink.withMaxConcurrentConnections(reader.readUntyped());
                } else if ("disableMetricsCollection".equals(fieldName)) {
                    deserializedJsonSink.withDisableMetricsCollection(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedJsonSink.type = reader.getString();
                } else if ("storeSettings".equals(fieldName)) {
                    deserializedJsonSink.storeSettings = StoreWriteSettings.fromJson(reader);
                } else if ("formatSettings".equals(fieldName)) {
                    deserializedJsonSink.formatSettings = JsonWriteSettings.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedJsonSink.withAdditionalProperties(additionalProperties);

            return deserializedJsonSink;
        });
    }
}
