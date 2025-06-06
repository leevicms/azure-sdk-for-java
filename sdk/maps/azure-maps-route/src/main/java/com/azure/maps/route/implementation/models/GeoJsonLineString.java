// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A valid `GeoJSON LineString` geometry type. Please refer to [RFC
 * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.4) for details.
 */
@Fluent
public final class GeoJsonLineString extends GeoJsonGeometry {
    /*
     * Specifies the `GeoJSON` type. Must be one of the nine valid GeoJSON object types - Point, MultiPoint, LineString,
     * MultiLineString, Polygon, MultiPolygon, GeometryCollection, Feature and FeatureCollection.
     */
    @Generated
    private GeoJsonObjectType type = GeoJsonObjectType.GEO_JSON_LINE_STRING;

    /*
     * Coordinates for the `GeoJson LineString` geometry.
     */
    @Generated
    private List<List<Double>> coordinates;

    /**
     * Creates an instance of GeoJsonLineString class.
     */
    @Generated
    public GeoJsonLineString() {
    }

    /**
     * Get the type property: Specifies the `GeoJSON` type. Must be one of the nine valid GeoJSON object types - Point,
     * MultiPoint, LineString, MultiLineString, Polygon, MultiPolygon, GeometryCollection, Feature and
     * FeatureCollection.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public GeoJsonObjectType getType() {
        return this.type;
    }

    /**
     * Get the coordinates property: Coordinates for the `GeoJson LineString` geometry.
     * 
     * @return the coordinates value.
     */
    @Generated
    public List<List<Double>> getCoordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: Coordinates for the `GeoJson LineString` geometry.
     * 
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonLineString object itself.
     */
    @Generated
    public GeoJsonLineString setCoordinates(List<List<Double>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("coordinates", this.coordinates,
            (writer, element) -> writer.writeArray(element, (writer1, element1) -> writer1.writeDouble(element1)));
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GeoJsonLineString from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GeoJsonLineString if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GeoJsonLineString.
     */
    @Generated
    public static GeoJsonLineString fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GeoJsonLineString deserializedGeoJsonLineString = new GeoJsonLineString();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("coordinates".equals(fieldName)) {
                    List<List<Double>> coordinates
                        = reader.readArray(reader1 -> reader1.readArray(reader2 -> reader2.getDouble()));
                    deserializedGeoJsonLineString.coordinates = coordinates;
                } else if ("type".equals(fieldName)) {
                    deserializedGeoJsonLineString.type = GeoJsonObjectType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGeoJsonLineString;
        });
    }
}
