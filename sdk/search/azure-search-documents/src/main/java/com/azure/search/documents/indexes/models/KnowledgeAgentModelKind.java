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
 * The AI model to be used for query planning.
 */
public final class KnowledgeAgentModelKind extends ExpandableStringEnum<KnowledgeAgentModelKind> {
    /**
     * Use Azure Open AI models for query planning.
     */
    @Generated
    public static final KnowledgeAgentModelKind AZURE_OPEN_AI = fromString("azureOpenAI");

    /**
     * Creates a new instance of KnowledgeAgentModelKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public KnowledgeAgentModelKind() {
    }

    /**
     * Creates or finds a KnowledgeAgentModelKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding KnowledgeAgentModelKind.
     */
    @Generated
    public static KnowledgeAgentModelKind fromString(String name) {
        return fromString(name, KnowledgeAgentModelKind.class);
    }

    /**
     * Gets known KnowledgeAgentModelKind values.
     * 
     * @return known KnowledgeAgentModelKind values.
     */
    @Generated
    public static Collection<KnowledgeAgentModelKind> values() {
        return values(KnowledgeAgentModelKind.class);
    }
}
