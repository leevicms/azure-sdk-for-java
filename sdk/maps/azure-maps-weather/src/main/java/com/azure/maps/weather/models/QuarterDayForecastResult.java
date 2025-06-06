// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.weather.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The QuarterDayForecastResult model.
 */
@Immutable
public final class QuarterDayForecastResult implements JsonSerializable<QuarterDayForecastResult> {

    /*
     * Forecast data for each quarter in the response.
     */
    @Generated
    private List<QuarterDayForecast> forecasts;

    /**
     * Set default QuarterDayForecastResult constructor to private
     */
    @Generated
    private QuarterDayForecastResult() {
    }

    /**
     * Get the forecasts property: Forecast data for each quarter in the response.
     *
     * @return the forecasts value.
     */
    @Generated
    public List<QuarterDayForecast> getForecasts() {
        return this.forecasts;
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
     * Reads an instance of QuarterDayForecastResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of QuarterDayForecastResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the QuarterDayForecastResult.
     */
    @Generated
    public static QuarterDayForecastResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QuarterDayForecastResult deserializedQuarterDayForecastResult = new QuarterDayForecastResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("forecasts".equals(fieldName)) {
                    List<QuarterDayForecast> forecasts
                        = reader.readArray(reader1 -> QuarterDayForecast.fromJson(reader1));
                    deserializedQuarterDayForecastResult.forecasts = forecasts;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedQuarterDayForecastResult;
        });
    }
}
