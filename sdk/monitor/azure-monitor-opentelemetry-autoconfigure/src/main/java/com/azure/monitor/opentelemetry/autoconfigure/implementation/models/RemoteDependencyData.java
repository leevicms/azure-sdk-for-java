// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.opentelemetry.autoconfigure.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * An instance of Remote Dependency represents an interaction of the monitored component with a remote component/service
 * like SQL or an HTTP endpoint.
 */
@Fluent
public final class RemoteDependencyData extends MonitorDomain {
    /*
     * Identifier of a dependency call instance. Used for correlation with the request telemetry item corresponding to
     * this dependency call.
     */
    @Generated
    private String id;

    /*
     * Name of the command initiated with this dependency call. Low cardinality value. Examples are stored procedure
     * name and URL path template.
     */
    @Generated
    private String name;

    /*
     * Result code of a dependency call. Examples are SQL error code and HTTP status code.
     */
    @Generated
    private String resultCode;

    /*
     * Command initiated by this dependency call. Examples are SQL statement and HTTP URL with all query parameters.
     */
    @Generated
    private String data;

    /*
     * Dependency type name. Very low cardinality value for logical grouping of dependencies and interpretation of other
     * fields like commandName and resultCode. Examples are SQL, Azure table, and HTTP.
     */
    @Generated
    private String type;

    /*
     * Target site of a dependency call. Examples are server name, host address.
     */
    @Generated
    private String target;

    /*
     * Request duration in format: DD.HH:MM:SS.MMMMMM. Must be less than 1000 days.
     */
    @Generated
    private String duration;

    /*
     * Indication of successful or unsuccessful call.
     */
    @Generated
    private Boolean success;

    /*
     * Collection of custom properties.
     */
    @Generated
    private Map<String, String> properties;

    /*
     * Collection of custom measurements.
     */
    @Generated
    private Map<String, Double> measurements;

    /**
     * Creates an instance of RemoteDependencyData class.
     */
    @Generated
    public RemoteDependencyData() {
    }

    /**
     * Get the id property: Identifier of a dependency call instance. Used for correlation with the request telemetry
     * item corresponding to this dependency call.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Identifier of a dependency call instance. Used for correlation with the request telemetry
     * item corresponding to this dependency call.
     * 
     * @param id the id value to set.
     * @return the RemoteDependencyData object itself.
     */
    @Generated
    public RemoteDependencyData setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name of the command initiated with this dependency call. Low cardinality value. Examples
     * are stored procedure name and URL path template.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the command initiated with this dependency call. Low cardinality value. Examples
     * are stored procedure name and URL path template.
     * 
     * @param name the name value to set.
     * @return the RemoteDependencyData object itself.
     */
    @Generated
    public RemoteDependencyData setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resultCode property: Result code of a dependency call. Examples are SQL error code and HTTP status code.
     * 
     * @return the resultCode value.
     */
    @Generated
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * Set the resultCode property: Result code of a dependency call. Examples are SQL error code and HTTP status code.
     * 
     * @param resultCode the resultCode value to set.
     * @return the RemoteDependencyData object itself.
     */
    @Generated
    public RemoteDependencyData setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * Get the data property: Command initiated by this dependency call. Examples are SQL statement and HTTP URL with
     * all query parameters.
     * 
     * @return the data value.
     */
    @Generated
    public String getData() {
        return this.data;
    }

    /**
     * Set the data property: Command initiated by this dependency call. Examples are SQL statement and HTTP URL with
     * all query parameters.
     * 
     * @param data the data value to set.
     * @return the RemoteDependencyData object itself.
     */
    @Generated
    public RemoteDependencyData setData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the type property: Dependency type name. Very low cardinality value for logical grouping of dependencies and
     * interpretation of other fields like commandName and resultCode. Examples are SQL, Azure table, and HTTP.
     * 
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Dependency type name. Very low cardinality value for logical grouping of dependencies and
     * interpretation of other fields like commandName and resultCode. Examples are SQL, Azure table, and HTTP.
     * 
     * @param type the type value to set.
     * @return the RemoteDependencyData object itself.
     */
    @Generated
    public RemoteDependencyData setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the target property: Target site of a dependency call. Examples are server name, host address.
     * 
     * @return the target value.
     */
    @Generated
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: Target site of a dependency call. Examples are server name, host address.
     * 
     * @param target the target value to set.
     * @return the RemoteDependencyData object itself.
     */
    @Generated
    public RemoteDependencyData setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the duration property: Request duration in format: DD.HH:MM:SS.MMMMMM. Must be less than 1000 days.
     * 
     * @return the duration value.
     */
    @Generated
    public String getDuration() {
        return this.duration;
    }

    /**
     * Set the duration property: Request duration in format: DD.HH:MM:SS.MMMMMM. Must be less than 1000 days.
     * 
     * @param duration the duration value to set.
     * @return the RemoteDependencyData object itself.
     */
    @Generated
    public RemoteDependencyData setDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the success property: Indication of successful or unsuccessful call.
     * 
     * @return the success value.
     */
    @Generated
    public Boolean isSuccess() {
        return this.success;
    }

    /**
     * Set the success property: Indication of successful or unsuccessful call.
     * 
     * @param success the success value to set.
     * @return the RemoteDependencyData object itself.
     */
    @Generated
    public RemoteDependencyData setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * Get the properties property: Collection of custom properties.
     * 
     * @return the properties value.
     */
    @Generated
    public Map<String, String> getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Collection of custom properties.
     * 
     * @param properties the properties value to set.
     * @return the RemoteDependencyData object itself.
     */
    @Generated
    public RemoteDependencyData setProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the measurements property: Collection of custom measurements.
     * 
     * @return the measurements value.
     */
    @Generated
    public Map<String, Double> getMeasurements() {
        return this.measurements;
    }

    /**
     * Set the measurements property: Collection of custom measurements.
     * 
     * @param measurements the measurements value to set.
     * @return the RemoteDependencyData object itself.
     */
    @Generated
    public RemoteDependencyData setMeasurements(Map<String, Double> measurements) {
        this.measurements = measurements;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public RemoteDependencyData setVersion(int version) {
        super.setVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("ver", getVersion());
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("duration", this.duration);
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("resultCode", this.resultCode);
        jsonWriter.writeStringField("data", this.data);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("target", this.target);
        jsonWriter.writeBooleanField("success", this.success);
        jsonWriter.writeMapField("properties", this.properties, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("measurements", this.measurements, (writer, element) -> writer.writeDouble(element));
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RemoteDependencyData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RemoteDependencyData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RemoteDependencyData.
     */
    @Generated
    public static RemoteDependencyData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RemoteDependencyData deserializedRemoteDependencyData = new RemoteDependencyData();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ver".equals(fieldName)) {
                    deserializedRemoteDependencyData.setVersion(reader.getInt());
                } else if ("name".equals(fieldName)) {
                    deserializedRemoteDependencyData.name = reader.getString();
                } else if ("duration".equals(fieldName)) {
                    deserializedRemoteDependencyData.duration = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedRemoteDependencyData.id = reader.getString();
                } else if ("resultCode".equals(fieldName)) {
                    deserializedRemoteDependencyData.resultCode = reader.getString();
                } else if ("data".equals(fieldName)) {
                    deserializedRemoteDependencyData.data = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRemoteDependencyData.type = reader.getString();
                } else if ("target".equals(fieldName)) {
                    deserializedRemoteDependencyData.target = reader.getString();
                } else if ("success".equals(fieldName)) {
                    deserializedRemoteDependencyData.success = reader.getNullable(JsonReader::getBoolean);
                } else if ("properties".equals(fieldName)) {
                    Map<String, String> properties = reader.readMap(reader1 -> reader1.getString());
                    deserializedRemoteDependencyData.properties = properties;
                } else if ("measurements".equals(fieldName)) {
                    Map<String, Double> measurements = reader.readMap(reader1 -> reader1.getDouble());
                    deserializedRemoteDependencyData.measurements = measurements;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedRemoteDependencyData.setAdditionalProperties(additionalProperties);

            return deserializedRemoteDependencyData;
        });
    }
}
