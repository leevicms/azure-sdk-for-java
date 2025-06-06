// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An abstract representation of a structured content item within a chat message.
 */
@Immutable
public class ChatMessageContentItem implements JsonSerializable<ChatMessageContentItem> {

    /**
     * Creates an instance of ChatMessageContentItem class.
     */
    @Generated
    public ChatMessageContentItem() {
    }

    /*
     * The discriminated object type.
     */
    @Generated
    private String type = "ChatMessageContentItem";

    /**
     * Get the type property: The discriminated object type.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatMessageContentItem from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatMessageContentItem if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ChatMessageContentItem.
     */
    @Generated
    public static ChatMessageContentItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                // Prepare for reading
                readerToUse.nextToken();
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("refusal".equals(discriminatorValue)) {
                    return ChatMessageRefusalContentItem.fromJson(readerToUse.reset());
                } else if ("image_url".equals(discriminatorValue)) {
                    return ChatMessageImageContentItem.fromJson(readerToUse.reset());
                } else if ("input_audio".equals(discriminatorValue)) {
                    return ChatMessageAudioContentItem.fromJson(readerToUse.reset());
                } else if ("text".equals(discriminatorValue)) {
                    return ChatMessageTextContentItem.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static ChatMessageContentItem fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChatMessageContentItem deserializedChatMessageContentItem = new ChatMessageContentItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    deserializedChatMessageContentItem.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedChatMessageContentItem;
        });
    }
}
