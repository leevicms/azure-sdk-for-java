// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Site properties.
 */
@Fluent
public final class SitePropertiesFormat implements JsonSerializable<SitePropertiesFormat> {
    /*
     * The provisioning state of the site resource. **TODO**: Confirm if this is needed.
     */
    private ProvisioningState provisioningState;

    /*
     * List of NFVIs
     */
    private List<NfvIs> nfvis;

    /*
     * The list of site network services on the site.
     */
    private List<ReferencedResource> siteNetworkServiceReferences;

    /**
     * Creates an instance of SitePropertiesFormat class.
     */
    public SitePropertiesFormat() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the site resource. **TODO**: Confirm if this is
     * needed.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the nfvis property: List of NFVIs.
     * 
     * @return the nfvis value.
     */
    public List<NfvIs> nfvis() {
        return this.nfvis;
    }

    /**
     * Set the nfvis property: List of NFVIs.
     * 
     * @param nfvis the nfvis value to set.
     * @return the SitePropertiesFormat object itself.
     */
    public SitePropertiesFormat withNfvis(List<NfvIs> nfvis) {
        this.nfvis = nfvis;
        return this;
    }

    /**
     * Get the siteNetworkServiceReferences property: The list of site network services on the site.
     * 
     * @return the siteNetworkServiceReferences value.
     */
    public List<ReferencedResource> siteNetworkServiceReferences() {
        return this.siteNetworkServiceReferences;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nfvis() != null) {
            nfvis().forEach(e -> e.validate());
        }
        if (siteNetworkServiceReferences() != null) {
            siteNetworkServiceReferences().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("nfvis", this.nfvis, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SitePropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SitePropertiesFormat if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SitePropertiesFormat.
     */
    public static SitePropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SitePropertiesFormat deserializedSitePropertiesFormat = new SitePropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedSitePropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("nfvis".equals(fieldName)) {
                    List<NfvIs> nfvis = reader.readArray(reader1 -> NfvIs.fromJson(reader1));
                    deserializedSitePropertiesFormat.nfvis = nfvis;
                } else if ("siteNetworkServiceReferences".equals(fieldName)) {
                    List<ReferencedResource> siteNetworkServiceReferences
                        = reader.readArray(reader1 -> ReferencedResource.fromJson(reader1));
                    deserializedSitePropertiesFormat.siteNetworkServiceReferences = siteNetworkServiceReferences;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSitePropertiesFormat;
        });
    }
}
