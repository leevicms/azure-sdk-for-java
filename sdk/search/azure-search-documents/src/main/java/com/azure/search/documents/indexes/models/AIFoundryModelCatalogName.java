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
 * The name of the embedding model from the Azure AI Foundry Catalog that will be called.
 */
public final class AIFoundryModelCatalogName extends ExpandableStringEnum<AIFoundryModelCatalogName> {
    /**
     * Static value OpenAI-CLIP-Image-Text-Embeddings-vit-base-patch32 for AIFoundryModelCatalogName.
     */
    @Generated
    public static final AIFoundryModelCatalogName OPEN_AICLIP_IMAGE_TEXT_EMBEDDINGS_VIT_BASE_PATCH32
        = fromString("OpenAI-CLIP-Image-Text-Embeddings-vit-base-patch32");

    /**
     * Static value OpenAI-CLIP-Image-Text-Embeddings-ViT-Large-Patch14-336 for AIFoundryModelCatalogName.
     */
    @Generated
    public static final AIFoundryModelCatalogName OPEN_AICLIP_IMAGE_TEXT_EMBEDDINGS_VI_TLARGE_PATCH14336
        = fromString("OpenAI-CLIP-Image-Text-Embeddings-ViT-Large-Patch14-336");

    /**
     * Static value Facebook-DinoV2-Image-Embeddings-ViT-Base for AIFoundryModelCatalogName.
     */
    @Generated
    public static final AIFoundryModelCatalogName FACEBOOK_DINO_V2IMAGE_EMBEDDINGS_VI_TBASE
        = fromString("Facebook-DinoV2-Image-Embeddings-ViT-Base");

    /**
     * Static value Facebook-DinoV2-Image-Embeddings-ViT-Giant for AIFoundryModelCatalogName.
     */
    @Generated
    public static final AIFoundryModelCatalogName FACEBOOK_DINO_V2IMAGE_EMBEDDINGS_VI_TGIANT
        = fromString("Facebook-DinoV2-Image-Embeddings-ViT-Giant");

    /**
     * Static value Cohere-embed-v3-english for AIFoundryModelCatalogName.
     */
    @Generated
    public static final AIFoundryModelCatalogName COHERE_EMBED_V3ENGLISH = fromString("Cohere-embed-v3-english");

    /**
     * Static value Cohere-embed-v3-multilingual for AIFoundryModelCatalogName.
     */
    @Generated
    public static final AIFoundryModelCatalogName COHERE_EMBED_V3MULTILINGUAL
        = fromString("Cohere-embed-v3-multilingual");

    /**
     * Cohere embed v4 model for generating embeddings from both text and images.
     */
    @Generated
    public static final AIFoundryModelCatalogName COHERE_EMBED_V4 = fromString("Cohere-embed-v4");

    /**
     * Creates a new instance of AIFoundryModelCatalogName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public AIFoundryModelCatalogName() {
    }

    /**
     * Creates or finds a AIFoundryModelCatalogName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AIFoundryModelCatalogName.
     */
    @Generated
    public static AIFoundryModelCatalogName fromString(String name) {
        return fromString(name, AIFoundryModelCatalogName.class);
    }

    /**
     * Gets known AIFoundryModelCatalogName values.
     * 
     * @return known AIFoundryModelCatalogName values.
     */
    @Generated
    public static Collection<AIFoundryModelCatalogName> values() {
        return values(AIFoundryModelCatalogName.class);
    }
}
