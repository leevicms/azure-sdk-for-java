// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * SaaS Subscription Details model.
 */
@Immutable
public final class SaasSubscriptionDetailsInner implements JsonSerializable<SaasSubscriptionDetailsInner> {
    /*
     * Purchased SaaS subscription ID
     */
    private String id;

    /*
     * SaaS subscription name
     */
    private String subscriptionName;

    /*
     * Creation Date and Time
     */
    private OffsetDateTime timeCreated;

    /*
     * Purchased offer ID
     */
    private String offerId;

    /*
     * Purchased offer's plan ID
     */
    private String planId;

    /*
     * Indicates the status of the Subscription.
     */
    private String saasSubscriptionStatus;

    /*
     * Publisher ID
     */
    private String publisherId;

    /*
     * Purchaser Email ID
     */
    private String purchaserEmailId;

    /*
     * Purchaser Tenant ID
     */
    private String purchaserTenantId;

    /*
     * Purchase Term Unit
     */
    private String termUnit;

    /*
     * AutoRenew flag
     */
    private Boolean isAutoRenew;

    /*
     * FreeTrial flag
     */
    private Boolean isFreeTrial;

    /**
     * Creates an instance of SaasSubscriptionDetailsInner class.
     */
    private SaasSubscriptionDetailsInner() {
    }

    /**
     * Get the id property: Purchased SaaS subscription ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the subscriptionName property: SaaS subscription name.
     * 
     * @return the subscriptionName value.
     */
    public String subscriptionName() {
        return this.subscriptionName;
    }

    /**
     * Get the timeCreated property: Creation Date and Time.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Get the offerId property: Purchased offer ID.
     * 
     * @return the offerId value.
     */
    public String offerId() {
        return this.offerId;
    }

    /**
     * Get the planId property: Purchased offer's plan ID.
     * 
     * @return the planId value.
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Get the saasSubscriptionStatus property: Indicates the status of the Subscription.
     * 
     * @return the saasSubscriptionStatus value.
     */
    public String saasSubscriptionStatus() {
        return this.saasSubscriptionStatus;
    }

    /**
     * Get the publisherId property: Publisher ID.
     * 
     * @return the publisherId value.
     */
    public String publisherId() {
        return this.publisherId;
    }

    /**
     * Get the purchaserEmailId property: Purchaser Email ID.
     * 
     * @return the purchaserEmailId value.
     */
    public String purchaserEmailId() {
        return this.purchaserEmailId;
    }

    /**
     * Get the purchaserTenantId property: Purchaser Tenant ID.
     * 
     * @return the purchaserTenantId value.
     */
    public String purchaserTenantId() {
        return this.purchaserTenantId;
    }

    /**
     * Get the termUnit property: Purchase Term Unit.
     * 
     * @return the termUnit value.
     */
    public String termUnit() {
        return this.termUnit;
    }

    /**
     * Get the isAutoRenew property: AutoRenew flag.
     * 
     * @return the isAutoRenew value.
     */
    public Boolean isAutoRenew() {
        return this.isAutoRenew;
    }

    /**
     * Get the isFreeTrial property: FreeTrial flag.
     * 
     * @return the isFreeTrial value.
     */
    public Boolean isFreeTrial() {
        return this.isFreeTrial;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
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
     * Reads an instance of SaasSubscriptionDetailsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SaasSubscriptionDetailsInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SaasSubscriptionDetailsInner.
     */
    public static SaasSubscriptionDetailsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SaasSubscriptionDetailsInner deserializedSaasSubscriptionDetailsInner = new SaasSubscriptionDetailsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSaasSubscriptionDetailsInner.id = reader.getString();
                } else if ("subscriptionName".equals(fieldName)) {
                    deserializedSaasSubscriptionDetailsInner.subscriptionName = reader.getString();
                } else if ("timeCreated".equals(fieldName)) {
                    deserializedSaasSubscriptionDetailsInner.timeCreated = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("offerId".equals(fieldName)) {
                    deserializedSaasSubscriptionDetailsInner.offerId = reader.getString();
                } else if ("planId".equals(fieldName)) {
                    deserializedSaasSubscriptionDetailsInner.planId = reader.getString();
                } else if ("saasSubscriptionStatus".equals(fieldName)) {
                    deserializedSaasSubscriptionDetailsInner.saasSubscriptionStatus = reader.getString();
                } else if ("publisherId".equals(fieldName)) {
                    deserializedSaasSubscriptionDetailsInner.publisherId = reader.getString();
                } else if ("purchaserEmailId".equals(fieldName)) {
                    deserializedSaasSubscriptionDetailsInner.purchaserEmailId = reader.getString();
                } else if ("purchaserTenantId".equals(fieldName)) {
                    deserializedSaasSubscriptionDetailsInner.purchaserTenantId = reader.getString();
                } else if ("termUnit".equals(fieldName)) {
                    deserializedSaasSubscriptionDetailsInner.termUnit = reader.getString();
                } else if ("isAutoRenew".equals(fieldName)) {
                    deserializedSaasSubscriptionDetailsInner.isAutoRenew = reader.getNullable(JsonReader::getBoolean);
                } else if ("isFreeTrial".equals(fieldName)) {
                    deserializedSaasSubscriptionDetailsInner.isFreeTrial = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSaasSubscriptionDetailsInner;
        });
    }
}
