// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.models.QuotaEnabled;
import java.io.IOException;
import java.util.Map;

/**
 * Subscription quotas.
 */
@Immutable
public final class QuotaInner implements JsonSerializable<QuotaInner> {
    /*
     * Remaining hosts quota by sku type
     */
    private Map<String, Integer> hostsRemaining;

    /*
     * Host quota is active for current subscription
     */
    private QuotaEnabled quotaEnabled;

    /**
     * Creates an instance of QuotaInner class.
     */
    private QuotaInner() {
    }

    /**
     * Get the hostsRemaining property: Remaining hosts quota by sku type.
     * 
     * @return the hostsRemaining value.
     */
    public Map<String, Integer> hostsRemaining() {
        return this.hostsRemaining;
    }

    /**
     * Get the quotaEnabled property: Host quota is active for current subscription.
     * 
     * @return the quotaEnabled value.
     */
    public QuotaEnabled quotaEnabled() {
        return this.quotaEnabled;
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
     * Reads an instance of QuotaInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QuotaInner if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the QuotaInner.
     */
    public static QuotaInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QuotaInner deserializedQuotaInner = new QuotaInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hostsRemaining".equals(fieldName)) {
                    Map<String, Integer> hostsRemaining = reader.readMap(reader1 -> reader1.getInt());
                    deserializedQuotaInner.hostsRemaining = hostsRemaining;
                } else if ("quotaEnabled".equals(fieldName)) {
                    deserializedQuotaInner.quotaEnabled = QuotaEnabled.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQuotaInner;
        });
    }
}
