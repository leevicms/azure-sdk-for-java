// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.cloudhealth.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Contains various signal groups that can be assigned to an entity.
 */
@Fluent
public final class SignalGroup implements JsonSerializable<SignalGroup> {
    /*
     * Azure Resource Signal Group
     */
    private AzureResourceSignalGroup azureResource;

    /*
     * Log Analytics Signal Group
     */
    private LogAnalyticsSignalGroup azureLogAnalytics;

    /*
     * Azure Monitor Workspace Signal Group
     */
    private AzureMonitorWorkspaceSignalGroup azureMonitorWorkspace;

    /*
     * Settings for dependency signals to control how the health state of child entities influences the health state of
     * the parent entity.
     */
    private DependenciesSignalGroup dependencies;

    /**
     * Creates an instance of SignalGroup class.
     */
    public SignalGroup() {
    }

    /**
     * Get the azureResource property: Azure Resource Signal Group.
     * 
     * @return the azureResource value.
     */
    public AzureResourceSignalGroup azureResource() {
        return this.azureResource;
    }

    /**
     * Set the azureResource property: Azure Resource Signal Group.
     * 
     * @param azureResource the azureResource value to set.
     * @return the SignalGroup object itself.
     */
    public SignalGroup withAzureResource(AzureResourceSignalGroup azureResource) {
        this.azureResource = azureResource;
        return this;
    }

    /**
     * Get the azureLogAnalytics property: Log Analytics Signal Group.
     * 
     * @return the azureLogAnalytics value.
     */
    public LogAnalyticsSignalGroup azureLogAnalytics() {
        return this.azureLogAnalytics;
    }

    /**
     * Set the azureLogAnalytics property: Log Analytics Signal Group.
     * 
     * @param azureLogAnalytics the azureLogAnalytics value to set.
     * @return the SignalGroup object itself.
     */
    public SignalGroup withAzureLogAnalytics(LogAnalyticsSignalGroup azureLogAnalytics) {
        this.azureLogAnalytics = azureLogAnalytics;
        return this;
    }

    /**
     * Get the azureMonitorWorkspace property: Azure Monitor Workspace Signal Group.
     * 
     * @return the azureMonitorWorkspace value.
     */
    public AzureMonitorWorkspaceSignalGroup azureMonitorWorkspace() {
        return this.azureMonitorWorkspace;
    }

    /**
     * Set the azureMonitorWorkspace property: Azure Monitor Workspace Signal Group.
     * 
     * @param azureMonitorWorkspace the azureMonitorWorkspace value to set.
     * @return the SignalGroup object itself.
     */
    public SignalGroup withAzureMonitorWorkspace(AzureMonitorWorkspaceSignalGroup azureMonitorWorkspace) {
        this.azureMonitorWorkspace = azureMonitorWorkspace;
        return this;
    }

    /**
     * Get the dependencies property: Settings for dependency signals to control how the health state of child entities
     * influences the health state of the parent entity.
     * 
     * @return the dependencies value.
     */
    public DependenciesSignalGroup dependencies() {
        return this.dependencies;
    }

    /**
     * Set the dependencies property: Settings for dependency signals to control how the health state of child entities
     * influences the health state of the parent entity.
     * 
     * @param dependencies the dependencies value to set.
     * @return the SignalGroup object itself.
     */
    public SignalGroup withDependencies(DependenciesSignalGroup dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (azureResource() != null) {
            azureResource().validate();
        }
        if (azureLogAnalytics() != null) {
            azureLogAnalytics().validate();
        }
        if (azureMonitorWorkspace() != null) {
            azureMonitorWorkspace().validate();
        }
        if (dependencies() != null) {
            dependencies().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("azureResource", this.azureResource);
        jsonWriter.writeJsonField("azureLogAnalytics", this.azureLogAnalytics);
        jsonWriter.writeJsonField("azureMonitorWorkspace", this.azureMonitorWorkspace);
        jsonWriter.writeJsonField("dependencies", this.dependencies);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SignalGroup from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SignalGroup if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SignalGroup.
     */
    public static SignalGroup fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SignalGroup deserializedSignalGroup = new SignalGroup();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("azureResource".equals(fieldName)) {
                    deserializedSignalGroup.azureResource = AzureResourceSignalGroup.fromJson(reader);
                } else if ("azureLogAnalytics".equals(fieldName)) {
                    deserializedSignalGroup.azureLogAnalytics = LogAnalyticsSignalGroup.fromJson(reader);
                } else if ("azureMonitorWorkspace".equals(fieldName)) {
                    deserializedSignalGroup.azureMonitorWorkspace = AzureMonitorWorkspaceSignalGroup.fromJson(reader);
                } else if ("dependencies".equals(fieldName)) {
                    deserializedSignalGroup.dependencies = DependenciesSignalGroup.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSignalGroup;
        });
    }
}
