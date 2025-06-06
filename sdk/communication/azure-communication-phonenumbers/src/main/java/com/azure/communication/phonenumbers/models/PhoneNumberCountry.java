// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents a country.
 */
@Immutable
public final class PhoneNumberCountry implements JsonSerializable<PhoneNumberCountry> {
    /*
     * Represents the name of the country.
     */
    @Generated
    private String localizedName;

    /*
     * Represents the abbreviated name of the country.
     */
    @Generated
    private String countryCode;

    /**
     * Creates an instance of PhoneNumberCountry class.
     */
    @Generated
    public PhoneNumberCountry() {
    }

    /**
     * Get the localizedName property: Represents the name of the country.
     * 
     * @return the localizedName value.
     */
    @Generated
    public String getLocalizedName() {
        return this.localizedName;
    }

    /**
     * Get the countryCode property: Represents the abbreviated name of the country.
     * 
     * @return the countryCode value.
     */
    @Generated
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PhoneNumberCountry from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PhoneNumberCountry if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PhoneNumberCountry.
     */
    @Generated
    public static PhoneNumberCountry fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PhoneNumberCountry deserializedPhoneNumberCountry = new PhoneNumberCountry();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("localizedName".equals(fieldName)) {
                    deserializedPhoneNumberCountry.localizedName = reader.getString();
                } else if ("countryCode".equals(fieldName)) {
                    deserializedPhoneNumberCountry.countryCode = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPhoneNumberCountry;
        });
    }
}
