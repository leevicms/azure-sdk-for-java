// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.voiceservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The configuration used in this region as primary, and other regions as backup.
 */
@Fluent
public final class PrimaryRegionProperties implements JsonSerializable<PrimaryRegionProperties> {
    /*
     * IP address to use to contact the operator network from this region
     */
    private List<String> operatorAddresses;

    /*
     * IP address to use to contact the ESRP from this region
     */
    private List<String> esrpAddresses;

    /*
     * The allowed source IP address or CIDR ranges for signaling
     */
    private List<String> allowedSignalingSourceAddressPrefixes;

    /*
     * The allowed source IP address or CIDR ranges for media
     */
    private List<String> allowedMediaSourceAddressPrefixes;

    /**
     * Creates an instance of PrimaryRegionProperties class.
     */
    public PrimaryRegionProperties() {
    }

    /**
     * Get the operatorAddresses property: IP address to use to contact the operator network from this region.
     * 
     * @return the operatorAddresses value.
     */
    public List<String> operatorAddresses() {
        return this.operatorAddresses;
    }

    /**
     * Set the operatorAddresses property: IP address to use to contact the operator network from this region.
     * 
     * @param operatorAddresses the operatorAddresses value to set.
     * @return the PrimaryRegionProperties object itself.
     */
    public PrimaryRegionProperties withOperatorAddresses(List<String> operatorAddresses) {
        this.operatorAddresses = operatorAddresses;
        return this;
    }

    /**
     * Get the esrpAddresses property: IP address to use to contact the ESRP from this region.
     * 
     * @return the esrpAddresses value.
     */
    public List<String> esrpAddresses() {
        return this.esrpAddresses;
    }

    /**
     * Set the esrpAddresses property: IP address to use to contact the ESRP from this region.
     * 
     * @param esrpAddresses the esrpAddresses value to set.
     * @return the PrimaryRegionProperties object itself.
     */
    public PrimaryRegionProperties withEsrpAddresses(List<String> esrpAddresses) {
        this.esrpAddresses = esrpAddresses;
        return this;
    }

    /**
     * Get the allowedSignalingSourceAddressPrefixes property: The allowed source IP address or CIDR ranges for
     * signaling.
     * 
     * @return the allowedSignalingSourceAddressPrefixes value.
     */
    public List<String> allowedSignalingSourceAddressPrefixes() {
        return this.allowedSignalingSourceAddressPrefixes;
    }

    /**
     * Set the allowedSignalingSourceAddressPrefixes property: The allowed source IP address or CIDR ranges for
     * signaling.
     * 
     * @param allowedSignalingSourceAddressPrefixes the allowedSignalingSourceAddressPrefixes value to set.
     * @return the PrimaryRegionProperties object itself.
     */
    public PrimaryRegionProperties
        withAllowedSignalingSourceAddressPrefixes(List<String> allowedSignalingSourceAddressPrefixes) {
        this.allowedSignalingSourceAddressPrefixes = allowedSignalingSourceAddressPrefixes;
        return this;
    }

    /**
     * Get the allowedMediaSourceAddressPrefixes property: The allowed source IP address or CIDR ranges for media.
     * 
     * @return the allowedMediaSourceAddressPrefixes value.
     */
    public List<String> allowedMediaSourceAddressPrefixes() {
        return this.allowedMediaSourceAddressPrefixes;
    }

    /**
     * Set the allowedMediaSourceAddressPrefixes property: The allowed source IP address or CIDR ranges for media.
     * 
     * @param allowedMediaSourceAddressPrefixes the allowedMediaSourceAddressPrefixes value to set.
     * @return the PrimaryRegionProperties object itself.
     */
    public PrimaryRegionProperties
        withAllowedMediaSourceAddressPrefixes(List<String> allowedMediaSourceAddressPrefixes) {
        this.allowedMediaSourceAddressPrefixes = allowedMediaSourceAddressPrefixes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operatorAddresses() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property operatorAddresses in model PrimaryRegionProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrimaryRegionProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("operatorAddresses", this.operatorAddresses,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("esrpAddresses", this.esrpAddresses,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("allowedSignalingSourceAddressPrefixes", this.allowedSignalingSourceAddressPrefixes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("allowedMediaSourceAddressPrefixes", this.allowedMediaSourceAddressPrefixes,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrimaryRegionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrimaryRegionProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PrimaryRegionProperties.
     */
    public static PrimaryRegionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrimaryRegionProperties deserializedPrimaryRegionProperties = new PrimaryRegionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operatorAddresses".equals(fieldName)) {
                    List<String> operatorAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrimaryRegionProperties.operatorAddresses = operatorAddresses;
                } else if ("esrpAddresses".equals(fieldName)) {
                    List<String> esrpAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrimaryRegionProperties.esrpAddresses = esrpAddresses;
                } else if ("allowedSignalingSourceAddressPrefixes".equals(fieldName)) {
                    List<String> allowedSignalingSourceAddressPrefixes
                        = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrimaryRegionProperties.allowedSignalingSourceAddressPrefixes
                        = allowedSignalingSourceAddressPrefixes;
                } else if ("allowedMediaSourceAddressPrefixes".equals(fieldName)) {
                    List<String> allowedMediaSourceAddressPrefixes = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrimaryRegionProperties.allowedMediaSourceAddressPrefixes
                        = allowedMediaSourceAddressPrefixes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrimaryRegionProperties;
        });
    }
}
