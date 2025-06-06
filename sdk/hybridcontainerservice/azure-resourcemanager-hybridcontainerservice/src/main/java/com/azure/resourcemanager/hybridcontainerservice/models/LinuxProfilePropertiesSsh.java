// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * SSH configuration for VMs of the provisioned cluster.
 */
@Fluent
public final class LinuxProfilePropertiesSsh implements JsonSerializable<LinuxProfilePropertiesSsh> {
    /*
     * The list of SSH public keys used to authenticate with VMs. A maximum of 1 key may be specified.
     */
    private List<LinuxProfilePropertiesSshPublicKeysItem> publicKeys;

    /**
     * Creates an instance of LinuxProfilePropertiesSsh class.
     */
    public LinuxProfilePropertiesSsh() {
    }

    /**
     * Get the publicKeys property: The list of SSH public keys used to authenticate with VMs. A maximum of 1 key may be
     * specified.
     * 
     * @return the publicKeys value.
     */
    public List<LinuxProfilePropertiesSshPublicKeysItem> publicKeys() {
        return this.publicKeys;
    }

    /**
     * Set the publicKeys property: The list of SSH public keys used to authenticate with VMs. A maximum of 1 key may be
     * specified.
     * 
     * @param publicKeys the publicKeys value to set.
     * @return the LinuxProfilePropertiesSsh object itself.
     */
    public LinuxProfilePropertiesSsh withPublicKeys(List<LinuxProfilePropertiesSshPublicKeysItem> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicKeys() != null) {
            publicKeys().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("publicKeys", this.publicKeys, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LinuxProfilePropertiesSsh from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LinuxProfilePropertiesSsh if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LinuxProfilePropertiesSsh.
     */
    public static LinuxProfilePropertiesSsh fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LinuxProfilePropertiesSsh deserializedLinuxProfilePropertiesSsh = new LinuxProfilePropertiesSsh();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("publicKeys".equals(fieldName)) {
                    List<LinuxProfilePropertiesSshPublicKeysItem> publicKeys
                        = reader.readArray(reader1 -> LinuxProfilePropertiesSshPublicKeysItem.fromJson(reader1));
                    deserializedLinuxProfilePropertiesSsh.publicKeys = publicKeys;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLinuxProfilePropertiesSsh;
        });
    }
}
