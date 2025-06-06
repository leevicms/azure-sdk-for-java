// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Abstract base type for data identities.
 */
@Immutable
public class SearchIndexerDataIdentity implements JsonSerializable<SearchIndexerDataIdentity> {
    /*
     * A URI fragment specifying the type of identity.
     */
    @Generated
    private String odataType = "SearchIndexerDataIdentity";

    /**
     * Creates an instance of SearchIndexerDataIdentity class.
     */
    @Generated
    public SearchIndexerDataIdentity() {
    }

    /**
     * Get the odataType property: A URI fragment specifying the type of identity.
     * 
     * @return the odataType value.
     */
    @Generated
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", this.odataType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchIndexerDataIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchIndexerDataIdentity if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SearchIndexerDataIdentity.
     */
    @Generated
    public static SearchIndexerDataIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("@odata.type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("#Microsoft.Azure.Search.DataNoneIdentity".equals(discriminatorValue)) {
                    return SearchIndexerDataNoneIdentity.fromJson(readerToUse.reset());
                } else if ("#Microsoft.Azure.Search.DataUserAssignedIdentity".equals(discriminatorValue)) {
                    return SearchIndexerDataUserAssignedIdentity.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static SearchIndexerDataIdentity fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SearchIndexerDataIdentity deserializedSearchIndexerDataIdentity = new SearchIndexerDataIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    deserializedSearchIndexerDataIdentity.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSearchIndexerDataIdentity;
        });
    }
}
