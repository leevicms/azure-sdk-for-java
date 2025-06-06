// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ResourceBasics;
import java.io.IOException;
import java.util.List;

/**
 * IpamPool usage information.
 */
@Immutable
public final class PoolUsageInner implements JsonSerializable<PoolUsageInner> {
    /*
     * List of IP address prefixes of the resource.
     */
    private List<String> addressPrefixes;

    /*
     * List of IpamPool that are children of this IpamPool.
     */
    private List<ResourceBasics> childPools;

    /*
     * List of assigned IP address prefixes.
     */
    private List<String> allocatedAddressPrefixes;

    /*
     * List of reserved IP address prefixes. These IP addresses could be reclaimed if not assigned in the given time.
     */
    private List<String> reservedAddressPrefixes;

    /*
     * List of available IP address prefixes.
     */
    private List<String> availableAddressPrefixes;

    /*
     * Total number of IP addresses managed in the IpamPool.
     */
    private String totalNumberOfIpAddresses;

    /*
     * Total number of assigned IP addresses in the IpamPool.
     */
    private String numberOfAllocatedIpAddresses;

    /*
     * Total number of reserved IP addresses in the IpamPool.
     */
    private String numberOfReservedIpAddresses;

    /*
     * Total number of available IP addresses in the IpamPool.
     */
    private String numberOfAvailableIpAddresses;

    /**
     * Creates an instance of PoolUsageInner class.
     */
    public PoolUsageInner() {
    }

    /**
     * Get the addressPrefixes property: List of IP address prefixes of the resource.
     * 
     * @return the addressPrefixes value.
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Get the childPools property: List of IpamPool that are children of this IpamPool.
     * 
     * @return the childPools value.
     */
    public List<ResourceBasics> childPools() {
        return this.childPools;
    }

    /**
     * Get the allocatedAddressPrefixes property: List of assigned IP address prefixes.
     * 
     * @return the allocatedAddressPrefixes value.
     */
    public List<String> allocatedAddressPrefixes() {
        return this.allocatedAddressPrefixes;
    }

    /**
     * Get the reservedAddressPrefixes property: List of reserved IP address prefixes. These IP addresses could be
     * reclaimed if not assigned in the given time.
     * 
     * @return the reservedAddressPrefixes value.
     */
    public List<String> reservedAddressPrefixes() {
        return this.reservedAddressPrefixes;
    }

    /**
     * Get the availableAddressPrefixes property: List of available IP address prefixes.
     * 
     * @return the availableAddressPrefixes value.
     */
    public List<String> availableAddressPrefixes() {
        return this.availableAddressPrefixes;
    }

    /**
     * Get the totalNumberOfIpAddresses property: Total number of IP addresses managed in the IpamPool.
     * 
     * @return the totalNumberOfIpAddresses value.
     */
    public String totalNumberOfIpAddresses() {
        return this.totalNumberOfIpAddresses;
    }

    /**
     * Get the numberOfAllocatedIpAddresses property: Total number of assigned IP addresses in the IpamPool.
     * 
     * @return the numberOfAllocatedIpAddresses value.
     */
    public String numberOfAllocatedIpAddresses() {
        return this.numberOfAllocatedIpAddresses;
    }

    /**
     * Get the numberOfReservedIpAddresses property: Total number of reserved IP addresses in the IpamPool.
     * 
     * @return the numberOfReservedIpAddresses value.
     */
    public String numberOfReservedIpAddresses() {
        return this.numberOfReservedIpAddresses;
    }

    /**
     * Get the numberOfAvailableIpAddresses property: Total number of available IP addresses in the IpamPool.
     * 
     * @return the numberOfAvailableIpAddresses value.
     */
    public String numberOfAvailableIpAddresses() {
        return this.numberOfAvailableIpAddresses;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (childPools() != null) {
            childPools().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PoolUsageInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PoolUsageInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PoolUsageInner.
     */
    public static PoolUsageInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PoolUsageInner deserializedPoolUsageInner = new PoolUsageInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("addressPrefixes".equals(fieldName)) {
                    List<String> addressPrefixes = reader.readArray(reader1 -> reader1.getString());
                    deserializedPoolUsageInner.addressPrefixes = addressPrefixes;
                } else if ("childPools".equals(fieldName)) {
                    List<ResourceBasics> childPools = reader.readArray(reader1 -> ResourceBasics.fromJson(reader1));
                    deserializedPoolUsageInner.childPools = childPools;
                } else if ("allocatedAddressPrefixes".equals(fieldName)) {
                    List<String> allocatedAddressPrefixes = reader.readArray(reader1 -> reader1.getString());
                    deserializedPoolUsageInner.allocatedAddressPrefixes = allocatedAddressPrefixes;
                } else if ("reservedAddressPrefixes".equals(fieldName)) {
                    List<String> reservedAddressPrefixes = reader.readArray(reader1 -> reader1.getString());
                    deserializedPoolUsageInner.reservedAddressPrefixes = reservedAddressPrefixes;
                } else if ("availableAddressPrefixes".equals(fieldName)) {
                    List<String> availableAddressPrefixes = reader.readArray(reader1 -> reader1.getString());
                    deserializedPoolUsageInner.availableAddressPrefixes = availableAddressPrefixes;
                } else if ("totalNumberOfIPAddresses".equals(fieldName)) {
                    deserializedPoolUsageInner.totalNumberOfIpAddresses = reader.getString();
                } else if ("numberOfAllocatedIPAddresses".equals(fieldName)) {
                    deserializedPoolUsageInner.numberOfAllocatedIpAddresses = reader.getString();
                } else if ("numberOfReservedIPAddresses".equals(fieldName)) {
                    deserializedPoolUsageInner.numberOfReservedIpAddresses = reader.getString();
                } else if ("numberOfAvailableIPAddresses".equals(fieldName)) {
                    deserializedPoolUsageInner.numberOfAvailableIpAddresses = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPoolUsageInner;
        });
    }
}
