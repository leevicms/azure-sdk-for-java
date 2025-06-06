// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.agents.persistent.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents the function data in a streaming run step delta's function tool call.
 */
@Immutable
public final class RunStepDeltaFunction implements JsonSerializable<RunStepDeltaFunction> {

    /*
     * The name of the function.
     */
    @Generated
    private String name;

    /*
     * The arguments passed to the function as input.
     */
    @Generated
    private String arguments;

    /*
     * The output of the function, null if outputs have not yet been submitted.
     */
    @Generated
    private String output;

    /**
     * Creates an instance of RunStepDeltaFunction class.
     */
    @Generated
    private RunStepDeltaFunction() {
    }

    /**
     * Get the name property: The name of the function.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the arguments property: The arguments passed to the function as input.
     *
     * @return the arguments value.
     */
    @Generated
    public String getArguments() {
        return this.arguments;
    }

    /**
     * Get the output property: The output of the function, null if outputs have not yet been submitted.
     *
     * @return the output value.
     */
    @Generated
    public String getOutput() {
        return this.output;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("arguments", this.arguments);
        jsonWriter.writeStringField("output", this.output);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDeltaFunction from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDeltaFunction if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RunStepDeltaFunction.
     */
    @Generated
    public static RunStepDeltaFunction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RunStepDeltaFunction deserializedRunStepDeltaFunction = new RunStepDeltaFunction();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("name".equals(fieldName)) {
                    deserializedRunStepDeltaFunction.name = reader.getString();
                } else if ("arguments".equals(fieldName)) {
                    deserializedRunStepDeltaFunction.arguments = reader.getString();
                } else if ("output".equals(fieldName)) {
                    deserializedRunStepDeltaFunction.output = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRunStepDeltaFunction;
        });
    }
}
