// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.models.DnsServiceLogLevelEnum;
import com.azure.resourcemanager.avs.models.DnsServiceStatusEnum;
import com.azure.resourcemanager.avs.models.WorkloadNetworkDnsServiceProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * NSX DNS Service.
 */
@Fluent
public final class WorkloadNetworkDnsServiceInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    private WorkloadNetworkDnsServiceProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of WorkloadNetworkDnsServiceInner class.
     */
    public WorkloadNetworkDnsServiceInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private WorkloadNetworkDnsServiceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the displayName property: Display name of the DNS Service.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Display name of the DNS Service.
     * 
     * @param displayName the displayName value to set.
     * @return the WorkloadNetworkDnsServiceInner object itself.
     */
    public WorkloadNetworkDnsServiceInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadNetworkDnsServiceProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the dnsServiceIp property: DNS service IP of the DNS Service.
     * 
     * @return the dnsServiceIp value.
     */
    public String dnsServiceIp() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsServiceIp();
    }

    /**
     * Set the dnsServiceIp property: DNS service IP of the DNS Service.
     * 
     * @param dnsServiceIp the dnsServiceIp value to set.
     * @return the WorkloadNetworkDnsServiceInner object itself.
     */
    public WorkloadNetworkDnsServiceInner withDnsServiceIp(String dnsServiceIp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadNetworkDnsServiceProperties();
        }
        this.innerProperties().withDnsServiceIp(dnsServiceIp);
        return this;
    }

    /**
     * Get the defaultDnsZone property: Default DNS zone of the DNS Service.
     * 
     * @return the defaultDnsZone value.
     */
    public String defaultDnsZone() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultDnsZone();
    }

    /**
     * Set the defaultDnsZone property: Default DNS zone of the DNS Service.
     * 
     * @param defaultDnsZone the defaultDnsZone value to set.
     * @return the WorkloadNetworkDnsServiceInner object itself.
     */
    public WorkloadNetworkDnsServiceInner withDefaultDnsZone(String defaultDnsZone) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadNetworkDnsServiceProperties();
        }
        this.innerProperties().withDefaultDnsZone(defaultDnsZone);
        return this;
    }

    /**
     * Get the fqdnZones property: FQDN zones of the DNS Service.
     * 
     * @return the fqdnZones value.
     */
    public List<String> fqdnZones() {
        return this.innerProperties() == null ? null : this.innerProperties().fqdnZones();
    }

    /**
     * Set the fqdnZones property: FQDN zones of the DNS Service.
     * 
     * @param fqdnZones the fqdnZones value to set.
     * @return the WorkloadNetworkDnsServiceInner object itself.
     */
    public WorkloadNetworkDnsServiceInner withFqdnZones(List<String> fqdnZones) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadNetworkDnsServiceProperties();
        }
        this.innerProperties().withFqdnZones(fqdnZones);
        return this;
    }

    /**
     * Get the logLevel property: DNS Service log level.
     * 
     * @return the logLevel value.
     */
    public DnsServiceLogLevelEnum logLevel() {
        return this.innerProperties() == null ? null : this.innerProperties().logLevel();
    }

    /**
     * Set the logLevel property: DNS Service log level.
     * 
     * @param logLevel the logLevel value to set.
     * @return the WorkloadNetworkDnsServiceInner object itself.
     */
    public WorkloadNetworkDnsServiceInner withLogLevel(DnsServiceLogLevelEnum logLevel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadNetworkDnsServiceProperties();
        }
        this.innerProperties().withLogLevel(logLevel);
        return this;
    }

    /**
     * Get the status property: DNS Service status.
     * 
     * @return the status value.
     */
    public DnsServiceStatusEnum status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the provisioningState property: The provisioning state.
     * 
     * @return the provisioningState value.
     */
    public WorkloadNetworkDnsServiceProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the revision property: NSX revision number.
     * 
     * @return the revision value.
     */
    public Long revision() {
        return this.innerProperties() == null ? null : this.innerProperties().revision();
    }

    /**
     * Set the revision property: NSX revision number.
     * 
     * @param revision the revision value to set.
     * @return the WorkloadNetworkDnsServiceInner object itself.
     */
    public WorkloadNetworkDnsServiceInner withRevision(Long revision) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadNetworkDnsServiceProperties();
        }
        this.innerProperties().withRevision(revision);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkloadNetworkDnsServiceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkloadNetworkDnsServiceInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WorkloadNetworkDnsServiceInner.
     */
    public static WorkloadNetworkDnsServiceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkloadNetworkDnsServiceInner deserializedWorkloadNetworkDnsServiceInner
                = new WorkloadNetworkDnsServiceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedWorkloadNetworkDnsServiceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedWorkloadNetworkDnsServiceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedWorkloadNetworkDnsServiceInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedWorkloadNetworkDnsServiceInner.innerProperties
                        = WorkloadNetworkDnsServiceProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedWorkloadNetworkDnsServiceInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkloadNetworkDnsServiceInner;
        });
    }
}
