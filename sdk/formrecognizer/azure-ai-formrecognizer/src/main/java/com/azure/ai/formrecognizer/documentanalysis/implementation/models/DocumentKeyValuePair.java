// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

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
 * An object representing a form field with distinct field label (key) and field value (may be empty).
 */
@Fluent
public final class DocumentKeyValuePair implements JsonSerializable<DocumentKeyValuePair> {
    /*
     * Field label of the key-value pair.
     */
    @Generated
    private final DocumentKeyValueElement key;

    /*
     * Field value of the key-value pair.
     */
    @Generated
    private DocumentKeyValueElement value;

    /*
     * Confidence of correctly extracting the key-value pair.
     */
    @Generated
    private final float confidence;

    /**
     * Creates an instance of DocumentKeyValuePair class.
     * 
     * @param key the key value to set.
     * @param confidence the confidence value to set.
     */
    @Generated
    public DocumentKeyValuePair(DocumentKeyValueElement key, float confidence) {
        this.key = key;
        this.confidence = confidence;
    }

    /**
     * Get the key property: Field label of the key-value pair.
     * 
     * @return the key value.
     */
    @Generated
    public DocumentKeyValueElement getKey() {
        return this.key;
    }

    /**
     * Get the value property: Field value of the key-value pair.
     * 
     * @return the value value.
     */
    @Generated
    public DocumentKeyValueElement getValue() {
        return this.value;
    }

    /**
     * Set the value property: Field value of the key-value pair.
     * 
     * @param value the value value to set.
     * @return the DocumentKeyValuePair object itself.
     */
    @Generated
    public DocumentKeyValuePair setValue(DocumentKeyValueElement value) {
        this.value = value;
        return this;
    }

    /**
     * Get the confidence property: Confidence of correctly extracting the key-value pair.
     * 
     * @return the confidence value.
     */
    @Generated
    public float getConfidence() {
        return this.confidence;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("key", this.key);
        jsonWriter.writeFloatField("confidence", this.confidence);
        jsonWriter.writeJsonField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentKeyValuePair from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentKeyValuePair if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentKeyValuePair.
     */
    @Generated
    public static DocumentKeyValuePair fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean keyFound = false;
            DocumentKeyValueElement key = null;
            boolean confidenceFound = false;
            float confidence = 0.0f;
            DocumentKeyValueElement value = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    key = DocumentKeyValueElement.fromJson(reader);
                    keyFound = true;
                } else if ("confidence".equals(fieldName)) {
                    confidence = reader.getFloat();
                    confidenceFound = true;
                } else if ("value".equals(fieldName)) {
                    value = DocumentKeyValueElement.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (keyFound && confidenceFound) {
                DocumentKeyValuePair deserializedDocumentKeyValuePair = new DocumentKeyValuePair(key, confidence);
                deserializedDocumentKeyValuePair.value = value;

                return deserializedDocumentKeyValuePair;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!keyFound) {
                missingProperties.add("key");
            }
            if (!confidenceFound) {
                missingProperties.add("confidence");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
