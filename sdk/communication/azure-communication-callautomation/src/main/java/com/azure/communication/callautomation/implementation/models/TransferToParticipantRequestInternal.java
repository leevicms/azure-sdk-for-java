// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The request payload for transferring call to a participant.
 */
@Fluent
public final class TransferToParticipantRequestInternal
    implements JsonSerializable<TransferToParticipantRequestInternal> {
    /*
     * The identity of the target where call should be transferred to.
     */
    @Generated
    private CommunicationIdentifierModel targetParticipant;

    /*
     * Used by customers when calling mid-call actions to correlate the request to the response event.
     */
    @Generated
    private String operationContext;

    /*
     * Transferee is the participant who is transferred away.
     */
    @Generated
    private CommunicationIdentifierModel transferee;

    /*
     * Set a callback URI that overrides the default callback URI set by CreateCall/AnswerCall for this operation.
     * This setup is per-action. If this is not set, the default callback URI set by CreateCall/AnswerCall will be used.
     */
    @Generated
    private String operationCallbackUri;

    /*
     * Used by customer to send custom calling context to targets
     */
    @Generated
    private CustomCallingContext customCallingContext;

    /*
     * The source caller Id, a phone number, that will be used as the transferor's caller Id when transferring a call to
     * a Pstn target.
     */
    @Generated
    private PhoneNumberIdentifierModel sourceCallerIdNumber;

    /**
     * Creates an instance of TransferToParticipantRequestInternal class.
     */
    @Generated
    public TransferToParticipantRequestInternal() {
    }

    /**
     * Get the targetParticipant property: The identity of the target where call should be transferred to.
     * 
     * @return the targetParticipant value.
     */
    @Generated
    public CommunicationIdentifierModel getTargetParticipant() {
        return this.targetParticipant;
    }

    /**
     * Set the targetParticipant property: The identity of the target where call should be transferred to.
     * 
     * @param targetParticipant the targetParticipant value to set.
     * @return the TransferToParticipantRequestInternal object itself.
     */
    @Generated
    public TransferToParticipantRequestInternal setTargetParticipant(CommunicationIdentifierModel targetParticipant) {
        this.targetParticipant = targetParticipant;
        return this;
    }

    /**
     * Get the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     * 
     * @return the operationContext value.
     */
    @Generated
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     * 
     * @param operationContext the operationContext value to set.
     * @return the TransferToParticipantRequestInternal object itself.
     */
    @Generated
    public TransferToParticipantRequestInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get the transferee property: Transferee is the participant who is transferred away.
     * 
     * @return the transferee value.
     */
    @Generated
    public CommunicationIdentifierModel getTransferee() {
        return this.transferee;
    }

    /**
     * Set the transferee property: Transferee is the participant who is transferred away.
     * 
     * @param transferee the transferee value to set.
     * @return the TransferToParticipantRequestInternal object itself.
     */
    @Generated
    public TransferToParticipantRequestInternal setTransferee(CommunicationIdentifierModel transferee) {
        this.transferee = transferee;
        return this;
    }

    /**
     * Get the operationCallbackUri property: Set a callback URI that overrides the default callback URI set by
     * CreateCall/AnswerCall for this operation.
     * This setup is per-action. If this is not set, the default callback URI set by CreateCall/AnswerCall will be used.
     * 
     * @return the operationCallbackUri value.
     */
    @Generated
    public String getOperationCallbackUri() {
        return this.operationCallbackUri;
    }

    /**
     * Set the operationCallbackUri property: Set a callback URI that overrides the default callback URI set by
     * CreateCall/AnswerCall for this operation.
     * This setup is per-action. If this is not set, the default callback URI set by CreateCall/AnswerCall will be used.
     * 
     * @param operationCallbackUri the operationCallbackUri value to set.
     * @return the TransferToParticipantRequestInternal object itself.
     */
    @Generated
    public TransferToParticipantRequestInternal setOperationCallbackUri(String operationCallbackUri) {
        this.operationCallbackUri = operationCallbackUri;
        return this;
    }

    /**
     * Get the customCallingContext property: Used by customer to send custom calling context to targets.
     * 
     * @return the customCallingContext value.
     */
    @Generated
    public CustomCallingContext getCustomCallingContext() {
        return this.customCallingContext;
    }

    /**
     * Set the customCallingContext property: Used by customer to send custom calling context to targets.
     * 
     * @param customCallingContext the customCallingContext value to set.
     * @return the TransferToParticipantRequestInternal object itself.
     */
    @Generated
    public TransferToParticipantRequestInternal setCustomCallingContext(CustomCallingContext customCallingContext) {
        this.customCallingContext = customCallingContext;
        return this;
    }

    /**
     * Get the sourceCallerIdNumber property: The source caller Id, a phone number, that will be used as the
     * transferor's caller Id when transferring a call to a Pstn target.
     * 
     * @return the sourceCallerIdNumber value.
     */
    @Generated
    public PhoneNumberIdentifierModel getSourceCallerIdNumber() {
        return this.sourceCallerIdNumber;
    }

    /**
     * Set the sourceCallerIdNumber property: The source caller Id, a phone number, that will be used as the
     * transferor's caller Id when transferring a call to a Pstn target.
     * 
     * @param sourceCallerIdNumber the sourceCallerIdNumber value to set.
     * @return the TransferToParticipantRequestInternal object itself.
     */
    @Generated
    public TransferToParticipantRequestInternal
        setSourceCallerIdNumber(PhoneNumberIdentifierModel sourceCallerIdNumber) {
        this.sourceCallerIdNumber = sourceCallerIdNumber;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("targetParticipant", this.targetParticipant);
        jsonWriter.writeStringField("operationContext", this.operationContext);
        jsonWriter.writeJsonField("transferee", this.transferee);
        jsonWriter.writeStringField("operationCallbackUri", this.operationCallbackUri);
        jsonWriter.writeJsonField("customCallingContext", this.customCallingContext);
        jsonWriter.writeJsonField("sourceCallerIdNumber", this.sourceCallerIdNumber);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TransferToParticipantRequestInternal from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TransferToParticipantRequestInternal if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TransferToParticipantRequestInternal.
     */
    @Generated
    public static TransferToParticipantRequestInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TransferToParticipantRequestInternal deserializedTransferToParticipantRequestInternal
                = new TransferToParticipantRequestInternal();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetParticipant".equals(fieldName)) {
                    deserializedTransferToParticipantRequestInternal.targetParticipant
                        = CommunicationIdentifierModel.fromJson(reader);
                } else if ("operationContext".equals(fieldName)) {
                    deserializedTransferToParticipantRequestInternal.operationContext = reader.getString();
                } else if ("transferee".equals(fieldName)) {
                    deserializedTransferToParticipantRequestInternal.transferee
                        = CommunicationIdentifierModel.fromJson(reader);
                } else if ("operationCallbackUri".equals(fieldName)) {
                    deserializedTransferToParticipantRequestInternal.operationCallbackUri = reader.getString();
                } else if ("customCallingContext".equals(fieldName)) {
                    deserializedTransferToParticipantRequestInternal.customCallingContext
                        = CustomCallingContext.fromJson(reader);
                } else if ("sourceCallerIdNumber".equals(fieldName)) {
                    deserializedTransferToParticipantRequestInternal.sourceCallerIdNumber
                        = PhoneNumberIdentifierModel.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTransferToParticipantRequestInternal;
        });
    }
}
