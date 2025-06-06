// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies how the LLM should format the response. Possible values: 'text' (plain string), 'json_object' (arbitrary
 * JSON), or 'json_schema' (adheres to provided schema).
 */
public final class ChatCompletionResponseFormatType extends ExpandableStringEnum<ChatCompletionResponseFormatType> {
    /**
     * Static value text for ChatCompletionResponseFormatType.
     */
    @Generated
    public static final ChatCompletionResponseFormatType TEXT = fromString("text");

    /**
     * Static value jsonObject for ChatCompletionResponseFormatType.
     */
    @Generated
    public static final ChatCompletionResponseFormatType JSON_OBJECT = fromString("jsonObject");

    /**
     * Static value jsonSchema for ChatCompletionResponseFormatType.
     */
    @Generated
    public static final ChatCompletionResponseFormatType JSON_SCHEMA = fromString("jsonSchema");

    /**
     * Creates a new instance of ChatCompletionResponseFormatType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ChatCompletionResponseFormatType() {
    }

    /**
     * Creates or finds a ChatCompletionResponseFormatType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ChatCompletionResponseFormatType.
     */
    @Generated
    public static ChatCompletionResponseFormatType fromString(String name) {
        return fromString(name, ChatCompletionResponseFormatType.class);
    }

    /**
     * Gets known ChatCompletionResponseFormatType values.
     * 
     * @return known ChatCompletionResponseFormatType values.
     */
    @Generated
    public static Collection<ChatCompletionResponseFormatType> values() {
        return values(ChatCompletionResponseFormatType.class);
    }
}
