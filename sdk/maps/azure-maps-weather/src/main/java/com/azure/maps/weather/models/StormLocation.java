// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.models.GeoPosition;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.maps.weather.implementation.models.LatLongPair;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Location for an individual Government-issued storm.
 */
@Fluent
public final class StormLocation implements JsonSerializable<StormLocation> {

    /*
     * Datetime the forecast is valid, displayed in ISO8601 format.
     */
    @Generated
    private OffsetDateTime timestamp;

    /*
     * Coordinates of the storm
     */
    @Generated
    private LatLongPair coordinates;

    /*
     * Maximum wind gust speed associated with the storm. May be NULL.
     */
    @Generated
    private WeatherUnitDetails maxWindGust;

    /*
     * Maximum sustained wind speed associated with the storm. May be NULL.
     */
    @Generated
    private WeatherUnitDetails sustainedWind;

    /*
     * Minimum pressure associated with the storm. May be NULL.
     */
    @Generated
    private WeatherUnitDetails minimumPressure;

    /*
     * The storm movement information.
     */
    @Generated
    private WindDetails movement;

    /*
     * Storm status, in English.
     */
    @Generated
    private String status;

    /*
     * True when the depression is classified as a subtropical cyclone.
     */
    @Generated
    private Boolean isSubtropical;

    /*
     * True when storm may develop into a Tropical System.
     */
    @Generated
    private Boolean hasTropicalPotential;

    /*
     * True when the storm is weakening away, and will no longer become a tropical system.
     */
    @Generated
    private Boolean isPostTropical;

    /*
     * Displayed when details=true or radiiGeometry=true in the request.
     */
    @Generated
    private List<StormWindRadiiSummary> windRadiiSummary;

    /**
     * Set default StormLocation constructor to private
     */
    @Generated
    private StormLocation() {
    }

    /**
     * Get the timestamp property: Datetime the forecast is valid, displayed in ISO8601 format.
     *
     * @return the timestamp value.
     */
    @Generated
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the coordinates property: Coordinates of the storm.
     *
     * @return the coordinates value.
     */
    @Generated
    public GeoPosition getCoordinates() {
        return new GeoPosition(this.coordinates.getLongitude(), this.coordinates.getLatitude());
    }

    /**
     * Get the maxWindGust property: Maximum wind gust speed associated with the storm. May be NULL.
     *
     * @return the maxWindGust value.
     */
    @Generated
    public WeatherUnitDetails getMaxWindGust() {
        return this.maxWindGust;
    }

    /**
     * Get the sustainedWind property: Maximum sustained wind speed associated with the storm. May be NULL.
     *
     * @return the sustainedWind value.
     */
    @Generated
    public WeatherUnitDetails getSustainedWind() {
        return this.sustainedWind;
    }

    /**
     * Get the minimumPressure property: Minimum pressure associated with the storm. May be NULL.
     *
     * @return the minimumPressure value.
     */
    @Generated
    public WeatherUnitDetails getMinimumPressure() {
        return this.minimumPressure;
    }

    /**
     * Get the movement property: The storm movement information.
     *
     * @return the movement value.
     */
    @Generated
    public WindDetails getMovement() {
        return this.movement;
    }

    /**
     * Get the status property: Storm status, in English.
     *
     * @return the status value.
     */
    @Generated
    public String getStatus() {
        return this.status;
    }

    /**
     * Get the isSubtropical property: True when the depression is classified as a subtropical cyclone.
     *
     * @return the isSubtropical value.
     */
    @Generated
    public Boolean isSubtropical() {
        return this.isSubtropical;
    }

    /**
     * Get the hasTropicalPotential property: True when storm may develop into a Tropical System.
     *
     * @return the hasTropicalPotential value.
     */
    @Generated
    public Boolean isHasTropicalPotential() {
        return this.hasTropicalPotential;
    }

    /**
     * Get the isPostTropical property: True when the storm is weakening away, and will no longer become a tropical
     * system.
     *
     * @return the isPostTropical value.
     */
    @Generated
    public Boolean isPostTropical() {
        return this.isPostTropical;
    }

    /**
     * Get the windRadiiSummary property: Displayed when details=true or radiiGeometry=true in the request.
     *
     * @return the windRadiiSummary value.
     */
    @Generated
    public List<StormWindRadiiSummary> getWindRadiiSummary() {
        return this.windRadiiSummary;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dateTime",
            this.timestamp == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.timestamp));
        jsonWriter.writeJsonField("location", this.coordinates);
        jsonWriter.writeJsonField("maxWindGust", this.maxWindGust);
        jsonWriter.writeJsonField("sustainedWind", this.sustainedWind);
        jsonWriter.writeJsonField("minimumPressure", this.minimumPressure);
        jsonWriter.writeJsonField("movement", this.movement);
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeBooleanField("isSubtropical", this.isSubtropical);
        jsonWriter.writeBooleanField("hasTropicalPotential", this.hasTropicalPotential);
        jsonWriter.writeBooleanField("isPostTropical", this.isPostTropical);
        jsonWriter.writeArrayField("windRadiiSummary", this.windRadiiSummary,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StormLocation from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of StormLocation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the StormLocation.
     */
    @Generated
    public static StormLocation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StormLocation deserializedStormLocation = new StormLocation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("dateTime".equals(fieldName)) {
                    deserializedStormLocation.timestamp = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("location".equals(fieldName)) {
                    deserializedStormLocation.coordinates = LatLongPair.fromJson(reader);
                } else if ("maxWindGust".equals(fieldName)) {
                    deserializedStormLocation.maxWindGust = WeatherUnitDetails.fromJson(reader);
                } else if ("sustainedWind".equals(fieldName)) {
                    deserializedStormLocation.sustainedWind = WeatherUnitDetails.fromJson(reader);
                } else if ("minimumPressure".equals(fieldName)) {
                    deserializedStormLocation.minimumPressure = WeatherUnitDetails.fromJson(reader);
                } else if ("movement".equals(fieldName)) {
                    deserializedStormLocation.movement = WindDetails.fromJson(reader);
                } else if ("status".equals(fieldName)) {
                    deserializedStormLocation.status = reader.getString();
                } else if ("isSubtropical".equals(fieldName)) {
                    deserializedStormLocation.isSubtropical = reader.getNullable(JsonReader::getBoolean);
                } else if ("hasTropicalPotential".equals(fieldName)) {
                    deserializedStormLocation.hasTropicalPotential = reader.getNullable(JsonReader::getBoolean);
                } else if ("isPostTropical".equals(fieldName)) {
                    deserializedStormLocation.isPostTropical = reader.getNullable(JsonReader::getBoolean);
                } else if ("windRadiiSummary".equals(fieldName)) {
                    List<StormWindRadiiSummary> windRadiiSummary
                        = reader.readArray(reader1 -> StormWindRadiiSummary.fromJson(reader1));
                    deserializedStormLocation.windRadiiSummary = windRadiiSummary;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedStormLocation;
        });
    }
}
