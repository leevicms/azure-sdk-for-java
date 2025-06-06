// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.Communication.RouterWorkerOfferIssued event.
 */
@Immutable
public final class AcsRouterWorkerOfferIssuedEventData extends AcsRouterWorkerEventData {

    /*
     * Router Worker Offer Issued Queue Id
     */
    @Generated
    private String queueId;

    /*
     * Router Worker Offer Issued Offer Id
     */
    @Generated
    private String offerId;

    /*
     * Router Worker Offer Issued Job Priority
     */
    @Generated
    private Integer jobPriority;

    /*
     * Router Worker Offer Issued Worker Labels
     */
    @Generated
    private final Map<String, String> workerLabels;

    /*
     * Router Worker Offer Issued Time in UTC
     */
    @Generated
    private final OffsetDateTime offeredOn;

    /*
     * Router Worker Offer Issued Expiration Time in UTC
     */
    @Generated
    private final OffsetDateTime expiresOn;

    /*
     * Router Worker Offer Issued Worker Tags
     */
    @Generated
    private final Map<String, String> workerTags;

    /*
     * Router Worker Offer Issued Job Labels
     */
    @Generated
    private final Map<String, String> jobLabels;

    /*
     * Router Worker Offer Issued Job Tags
     */
    @Generated
    private final Map<String, String> jobTags;

    /*
     * Router Worker events Worker Id
     */
    @Generated
    private String workerId;

    /*
     * Router Event Channel ID
     */
    @Generated
    private String channelId;

    /*
     * Router Event Channel Reference
     */
    @Generated
    private String channelReference;

    /**
     * Creates an instance of AcsRouterWorkerOfferIssuedEventData class.
     *
     * @param jobId the jobId value to set.
     * @param workerLabels the workerLabels value to set.
     * @param offeredOn the offeredOn value to set.
     * @param expiresOn the expiresOn value to set.
     * @param workerTags the workerTags value to set.
     * @param jobLabels the jobLabels value to set.
     * @param jobTags the jobTags value to set.
     */
    @Generated
    private AcsRouterWorkerOfferIssuedEventData(String jobId, Map<String, String> workerLabels,
        OffsetDateTime offeredOn, OffsetDateTime expiresOn, Map<String, String> workerTags,
        Map<String, String> jobLabels, Map<String, String> jobTags) {
        super(jobId);
        this.workerLabels = workerLabels;
        this.offeredOn = offeredOn;
        this.expiresOn = expiresOn;
        this.workerTags = workerTags;
        this.jobLabels = jobLabels;
        this.jobTags = jobTags;
    }

    /**
     * Get the queueId property: Router Worker Offer Issued Queue Id.
     *
     * @return the queueId value.
     */
    @Generated
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * Get the offerId property: Router Worker Offer Issued Offer Id.
     *
     * @return the offerId value.
     */
    @Generated
    public String getOfferId() {
        return this.offerId;
    }

    /**
     * Get the jobPriority property: Router Worker Offer Issued Job Priority.
     *
     * @return the jobPriority value.
     */
    @Generated
    public Integer getJobPriority() {
        return this.jobPriority;
    }

    /**
     * Get the workerLabels property: Router Worker Offer Issued Worker Labels.
     *
     * @return the workerLabels value.
     */
    @Generated
    public Map<String, String> getWorkerLabels() {
        return this.workerLabels;
    }

    /**
     * Get the offeredOn property: Router Worker Offer Issued Time in UTC.
     *
     * @return the offeredOn value.
     */
    @Generated
    public OffsetDateTime getOfferedOn() {
        return this.offeredOn;
    }

    /**
     * Get the expiresOn property: Router Worker Offer Issued Expiration Time in UTC.
     *
     * @return the expiresOn value.
     */
    @Generated
    public OffsetDateTime getExpiresOn() {
        return this.expiresOn;
    }

    /**
     * Get the workerTags property: Router Worker Offer Issued Worker Tags.
     *
     * @return the workerTags value.
     */
    @Generated
    public Map<String, String> getWorkerTags() {
        return this.workerTags;
    }

    /**
     * Get the jobLabels property: Router Worker Offer Issued Job Labels.
     *
     * @return the jobLabels value.
     */
    @Generated
    public Map<String, String> getJobLabels() {
        return this.jobLabels;
    }

    /**
     * Get the jobTags property: Router Worker Offer Issued Job Tags.
     *
     * @return the jobTags value.
     */
    @Generated
    public Map<String, String> getJobTags() {
        return this.jobTags;
    }

    /**
     * Get the workerId property: Router Worker events Worker Id.
     *
     * @return the workerId value.
     */
    @Generated
    @Override
    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * Get the channelId property: Router Event Channel ID.
     *
     * @return the channelId value.
     */
    @Generated
    @Override
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * Get the channelReference property: Router Event Channel Reference.
     *
     * @return the channelReference value.
     */
    @Generated
    @Override
    public String getChannelReference() {
        return this.channelReference;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("jobId", getJobId());
        jsonWriter.writeStringField("channelReference", getChannelReference());
        jsonWriter.writeStringField("channelId", getChannelId());
        jsonWriter.writeStringField("workerId", getWorkerId());
        jsonWriter.writeMapField("workerLabels", this.workerLabels, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("offeredOn",
            this.offeredOn == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.offeredOn));
        jsonWriter.writeStringField("expiresOn",
            this.expiresOn == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expiresOn));
        jsonWriter.writeMapField("workerTags", this.workerTags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("jobLabels", this.jobLabels, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("jobTags", this.jobTags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("queueId", this.queueId);
        jsonWriter.writeStringField("offerId", this.offerId);
        jsonWriter.writeNumberField("jobPriority", this.jobPriority);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsRouterWorkerOfferIssuedEventData from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsRouterWorkerOfferIssuedEventData if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AcsRouterWorkerOfferIssuedEventData.
     */
    @Generated
    public static AcsRouterWorkerOfferIssuedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String jobId = null;
            String channelReference = null;
            String channelId = null;
            String workerId = null;
            Map<String, String> workerLabels = null;
            OffsetDateTime offeredOn = null;
            OffsetDateTime expiresOn = null;
            Map<String, String> workerTags = null;
            Map<String, String> jobLabels = null;
            Map<String, String> jobTags = null;
            String queueId = null;
            String offerId = null;
            Integer jobPriority = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("jobId".equals(fieldName)) {
                    jobId = reader.getString();
                } else if ("channelReference".equals(fieldName)) {
                    channelReference = reader.getString();
                } else if ("channelId".equals(fieldName)) {
                    channelId = reader.getString();
                } else if ("workerId".equals(fieldName)) {
                    workerId = reader.getString();
                } else if ("workerLabels".equals(fieldName)) {
                    workerLabels = reader.readMap(reader1 -> reader1.getString());
                } else if ("offeredOn".equals(fieldName)) {
                    offeredOn = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("expiresOn".equals(fieldName)) {
                    expiresOn = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("workerTags".equals(fieldName)) {
                    workerTags = reader.readMap(reader1 -> reader1.getString());
                } else if ("jobLabels".equals(fieldName)) {
                    jobLabels = reader.readMap(reader1 -> reader1.getString());
                } else if ("jobTags".equals(fieldName)) {
                    jobTags = reader.readMap(reader1 -> reader1.getString());
                } else if ("queueId".equals(fieldName)) {
                    queueId = reader.getString();
                } else if ("offerId".equals(fieldName)) {
                    offerId = reader.getString();
                } else if ("jobPriority".equals(fieldName)) {
                    jobPriority = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            AcsRouterWorkerOfferIssuedEventData deserializedAcsRouterWorkerOfferIssuedEventData
                = new AcsRouterWorkerOfferIssuedEventData(jobId, workerLabels, offeredOn, expiresOn, workerTags,
                    jobLabels, jobTags);
            deserializedAcsRouterWorkerOfferIssuedEventData.channelReference = channelReference;
            deserializedAcsRouterWorkerOfferIssuedEventData.channelId = channelId;
            deserializedAcsRouterWorkerOfferIssuedEventData.workerId = workerId;
            deserializedAcsRouterWorkerOfferIssuedEventData.queueId = queueId;
            deserializedAcsRouterWorkerOfferIssuedEventData.offerId = offerId;
            deserializedAcsRouterWorkerOfferIssuedEventData.jobPriority = jobPriority;
            return deserializedAcsRouterWorkerOfferIssuedEventData;
        });
    }
}
