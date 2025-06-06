// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.ai.personalizer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The PersonalizerSlotResult model.
 */
@Fluent
public final class PersonalizerSlotResult implements JsonSerializable<PersonalizerSlotResult> {

    /*
     * Id is the slot ID.
     */
    @Generated
    private String id;

    /*
     * RewardActionID is the action ID recommended by Personalizer.
     */
    @Generated
    private String rewardActionId;

    /**
     * Creates an instance of PersonalizerSlotResult class.
     */
    @Generated
    public PersonalizerSlotResult() {
    }

    /**
     * Get the id property: Id is the slot ID.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Id is the slot ID.
     *
     * @param id the id value to set.
     * @return the PersonalizerSlotResult object itself.
     */
    @Generated
    PersonalizerSlotResult setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the rewardActionId property: RewardActionID is the action ID recommended by Personalizer.
     *
     * @return the rewardActionId value.
     */
    @Generated
    public String getRewardActionId() {
        return this.rewardActionId;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PersonalizerSlotResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PersonalizerSlotResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PersonalizerSlotResult.
     */
    @Generated
    public static PersonalizerSlotResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PersonalizerSlotResult deserializedPersonalizerSlotResult = new PersonalizerSlotResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    deserializedPersonalizerSlotResult.id = reader.getString();
                } else if ("rewardActionId".equals(fieldName)) {
                    deserializedPersonalizerSlotResult.rewardActionId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedPersonalizerSlotResult;
        });
    }
}
