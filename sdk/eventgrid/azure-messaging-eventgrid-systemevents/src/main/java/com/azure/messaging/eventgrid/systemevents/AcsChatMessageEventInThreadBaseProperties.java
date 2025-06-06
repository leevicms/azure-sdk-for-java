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

/**
 * Schema of common properties of all thread-level chat message events.
 */
@Immutable
public class AcsChatMessageEventInThreadBaseProperties extends AcsChatEventInThreadBaseProperties {
    /*
     * The chat message id
     */
    @Generated
    private final String messageId;

    /*
     * The communication identifier of the sender
     */
    @Generated
    private final CommunicationIdentifierModel senderCommunicationIdentifier;

    /*
     * The display name of the sender
     */
    @Generated
    private String senderDisplayName;

    /*
     * The original compose time of the message
     */
    @Generated
    private final OffsetDateTime composeTime;

    /*
     * The type of the message
     */
    @Generated
    private final String type;

    /*
     * The version of the message
     */
    @Generated
    private final long version;

    /*
     * The transaction id will be used as co-relation vector
     */
    @Generated
    private String transactionId;

    /**
     * Creates an instance of AcsChatMessageEventInThreadBaseProperties class.
     * 
     * @param threadId the threadId value to set.
     * @param messageId the messageId value to set.
     * @param senderCommunicationIdentifier the senderCommunicationIdentifier value to set.
     * @param composeTime the composeTime value to set.
     * @param type the type value to set.
     * @param version the version value to set.
     */
    @Generated
    protected AcsChatMessageEventInThreadBaseProperties(String threadId, String messageId,
        CommunicationIdentifierModel senderCommunicationIdentifier, OffsetDateTime composeTime, String type,
        long version) {
        super(threadId);
        this.messageId = messageId;
        this.senderCommunicationIdentifier = senderCommunicationIdentifier;
        this.composeTime = composeTime;
        this.type = type;
        this.version = version;
    }

    /**
     * Get the messageId property: The chat message id.
     * 
     * @return the messageId value.
     */
    @Generated
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Get the senderCommunicationIdentifier property: The communication identifier of the sender.
     * 
     * @return the senderCommunicationIdentifier value.
     */
    @Generated
    public CommunicationIdentifierModel getSenderCommunicationIdentifier() {
        return this.senderCommunicationIdentifier;
    }

    /**
     * Get the senderDisplayName property: The display name of the sender.
     * 
     * @return the senderDisplayName value.
     */
    @Generated
    public String getSenderDisplayName() {
        return this.senderDisplayName;
    }

    /**
     * Set the senderDisplayName property: The display name of the sender.
     * 
     * @param senderDisplayName the senderDisplayName value to set.
     * @return the AcsChatMessageEventInThreadBaseProperties object itself.
     */
    @Generated
    AcsChatMessageEventInThreadBaseProperties setSenderDisplayName(String senderDisplayName) {
        this.senderDisplayName = senderDisplayName;
        return this;
    }

    /**
     * Get the composeTime property: The original compose time of the message.
     * 
     * @return the composeTime value.
     */
    @Generated
    public OffsetDateTime getComposeTime() {
        return this.composeTime;
    }

    /**
     * Get the type property: The type of the message.
     * 
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Get the version property: The version of the message.
     * 
     * @return the version value.
     */
    @Generated
    public long getVersion() {
        return this.version;
    }

    /**
     * Get the transactionId property: The transaction id will be used as co-relation vector.
     * 
     * @return the transactionId value.
     */
    @Generated
    @Override
    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("threadId", getThreadId());
        jsonWriter.writeStringField("transactionId", getTransactionId());
        jsonWriter.writeStringField("messageId", this.messageId);
        jsonWriter.writeJsonField("senderCommunicationIdentifier", this.senderCommunicationIdentifier);
        jsonWriter.writeStringField("composeTime",
            this.composeTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.composeTime));
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeLongField("version", this.version);
        jsonWriter.writeStringField("senderDisplayName", this.senderDisplayName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsChatMessageEventInThreadBaseProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsChatMessageEventInThreadBaseProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AcsChatMessageEventInThreadBaseProperties.
     */
    @Generated
    public static AcsChatMessageEventInThreadBaseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String threadId = null;
            String transactionId = null;
            String messageId = null;
            CommunicationIdentifierModel senderCommunicationIdentifier = null;
            OffsetDateTime composeTime = null;
            String type = null;
            long version = 0L;
            String senderDisplayName = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("threadId".equals(fieldName)) {
                    threadId = reader.getString();
                } else if ("transactionId".equals(fieldName)) {
                    transactionId = reader.getString();
                } else if ("messageId".equals(fieldName)) {
                    messageId = reader.getString();
                } else if ("senderCommunicationIdentifier".equals(fieldName)) {
                    senderCommunicationIdentifier = CommunicationIdentifierModel.fromJson(reader);
                } else if ("composeTime".equals(fieldName)) {
                    composeTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else if ("version".equals(fieldName)) {
                    version = reader.getLong();
                } else if ("senderDisplayName".equals(fieldName)) {
                    senderDisplayName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            AcsChatMessageEventInThreadBaseProperties deserializedAcsChatMessageEventInThreadBaseProperties
                = new AcsChatMessageEventInThreadBaseProperties(threadId, messageId, senderCommunicationIdentifier,
                    composeTime, type, version);
            deserializedAcsChatMessageEventInThreadBaseProperties.transactionId = transactionId;
            deserializedAcsChatMessageEventInThreadBaseProperties.senderDisplayName = senderDisplayName;

            return deserializedAcsChatMessageEventInThreadBaseProperties;
        });
    }
}
