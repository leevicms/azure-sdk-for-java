// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.models.IscsiPathProvisioningState;
import java.io.IOException;

/**
 * The properties of an iSCSI path resource.
 */
@Fluent
public final class IscsiPathProperties implements JsonSerializable<IscsiPathProperties> {
    /*
     * The state of the iSCSI path provisioning
     */
    private IscsiPathProvisioningState provisioningState;

    /*
     * CIDR Block for iSCSI path.
     */
    private String networkBlock;

    /**
     * Creates an instance of IscsiPathProperties class.
     */
    public IscsiPathProperties() {
    }

    /**
     * Get the provisioningState property: The state of the iSCSI path provisioning.
     * 
     * @return the provisioningState value.
     */
    public IscsiPathProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the networkBlock property: CIDR Block for iSCSI path.
     * 
     * @return the networkBlock value.
     */
    public String networkBlock() {
        return this.networkBlock;
    }

    /**
     * Set the networkBlock property: CIDR Block for iSCSI path.
     * 
     * @param networkBlock the networkBlock value to set.
     * @return the IscsiPathProperties object itself.
     */
    public IscsiPathProperties withNetworkBlock(String networkBlock) {
        this.networkBlock = networkBlock;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkBlock() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property networkBlock in model IscsiPathProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IscsiPathProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("networkBlock", this.networkBlock);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IscsiPathProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IscsiPathProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IscsiPathProperties.
     */
    public static IscsiPathProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IscsiPathProperties deserializedIscsiPathProperties = new IscsiPathProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("networkBlock".equals(fieldName)) {
                    deserializedIscsiPathProperties.networkBlock = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedIscsiPathProperties.provisioningState
                        = IscsiPathProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIscsiPathProperties;
        });
    }
}
