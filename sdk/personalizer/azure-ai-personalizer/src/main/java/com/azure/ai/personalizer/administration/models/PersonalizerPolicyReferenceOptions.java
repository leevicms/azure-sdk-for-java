// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.administration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Reference to the policy within the evaluation.
 */
@Fluent
public final class PersonalizerPolicyReferenceOptions implements JsonSerializable<PersonalizerPolicyReferenceOptions> {
    /*
     * Evaluation Id of the evaluation.
     */
    @Generated
    private String evaluationId;

    /*
     * Name of the learning settings.
     */
    @Generated
    private String policyName;

    /**
     * Creates an instance of PersonalizerPolicyReferenceOptions class.
     */
    @Generated
    public PersonalizerPolicyReferenceOptions() {
    }

    /**
     * Get the evaluationId property: Evaluation Id of the evaluation.
     * 
     * @return the evaluationId value.
     */
    @Generated
    public String getEvaluationId() {
        return this.evaluationId;
    }

    /**
     * Set the evaluationId property: Evaluation Id of the evaluation.
     * 
     * @param evaluationId the evaluationId value to set.
     * @return the PersonalizerPolicyReferenceOptions object itself.
     */
    @Generated
    public PersonalizerPolicyReferenceOptions setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }

    /**
     * Get the policyName property: Name of the learning settings.
     * 
     * @return the policyName value.
     */
    @Generated
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * Set the policyName property: Name of the learning settings.
     * 
     * @param policyName the policyName value to set.
     * @return the PersonalizerPolicyReferenceOptions object itself.
     */
    @Generated
    public PersonalizerPolicyReferenceOptions setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("evaluationId", this.evaluationId);
        jsonWriter.writeStringField("policyName", this.policyName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PersonalizerPolicyReferenceOptions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PersonalizerPolicyReferenceOptions if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PersonalizerPolicyReferenceOptions.
     */
    @Generated
    public static PersonalizerPolicyReferenceOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PersonalizerPolicyReferenceOptions deserializedPersonalizerPolicyReferenceOptions
                = new PersonalizerPolicyReferenceOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("evaluationId".equals(fieldName)) {
                    deserializedPersonalizerPolicyReferenceOptions.evaluationId = reader.getString();
                } else if ("policyName".equals(fieldName)) {
                    deserializedPersonalizerPolicyReferenceOptions.policyName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPersonalizerPolicyReferenceOptions;
        });
    }
}
