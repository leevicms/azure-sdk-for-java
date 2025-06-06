// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Error codes returned by the service.
 */
public final class QueueErrorCode extends ExpandableStringEnum<QueueErrorCode> {
    /**
     * Static value AccountAlreadyExists for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode ACCOUNT_ALREADY_EXISTS = fromString("AccountAlreadyExists");

    /**
     * Static value AccountBeingCreated for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode ACCOUNT_BEING_CREATED = fromString("AccountBeingCreated");

    /**
     * Static value AccountIsDisabled for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode ACCOUNT_IS_DISABLED = fromString("AccountIsDisabled");

    /**
     * Static value AuthenticationFailed for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode AUTHENTICATION_FAILED = fromString("AuthenticationFailed");

    /**
     * Static value AuthorizationFailure for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode AUTHORIZATION_FAILURE = fromString("AuthorizationFailure");

    /**
     * Static value ConditionHeadersNotSupported for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode CONDITION_HEADERS_NOT_SUPPORTED = fromString("ConditionHeadersNotSupported");

    /**
     * Static value ConditionNotMet for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode CONDITION_NOT_MET = fromString("ConditionNotMet");

    /**
     * Static value EmptyMetadataKey for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode EMPTY_METADATA_KEY = fromString("EmptyMetadataKey");

    /**
     * Static value InsufficientAccountPermissions for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INSUFFICIENT_ACCOUNT_PERMISSIONS = fromString("InsufficientAccountPermissions");

    /**
     * Static value InternalError for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INTERNAL_ERROR = fromString("InternalError");

    /**
     * Static value InvalidAuthenticationInfo for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INVALID_AUTHENTICATION_INFO = fromString("InvalidAuthenticationInfo");

    /**
     * Static value InvalidHeaderValue for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INVALID_HEADER_VALUE = fromString("InvalidHeaderValue");

    /**
     * Static value InvalidHttpVerb for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INVALID_HTTP_VERB = fromString("InvalidHttpVerb");

    /**
     * Static value InvalidInput for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INVALID_INPUT = fromString("InvalidInput");

    /**
     * Static value InvalidMd5 for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INVALID_MD5 = fromString("InvalidMd5");

    /**
     * Static value InvalidMetadata for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INVALID_METADATA = fromString("InvalidMetadata");

    /**
     * Static value InvalidQueryParameterValue for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INVALID_QUERY_PARAMETER_VALUE = fromString("InvalidQueryParameterValue");

    /**
     * Static value InvalidRange for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INVALID_RANGE = fromString("InvalidRange");

    /**
     * Static value InvalidResourceName for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INVALID_RESOURCE_NAME = fromString("InvalidResourceName");

    /**
     * Static value InvalidUri for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INVALID_URI = fromString("InvalidUri");

    /**
     * Static value InvalidXmlDocument for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INVALID_XML_DOCUMENT = fromString("InvalidXmlDocument");

    /**
     * Static value InvalidXmlNodeValue for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INVALID_XML_NODE_VALUE = fromString("InvalidXmlNodeValue");

    /**
     * Static value Md5Mismatch for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode MD5MISMATCH = fromString("Md5Mismatch");

    /**
     * Static value MetadataTooLarge for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode METADATA_TOO_LARGE = fromString("MetadataTooLarge");

    /**
     * Static value MissingContentLengthHeader for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode MISSING_CONTENT_LENGTH_HEADER = fromString("MissingContentLengthHeader");

    /**
     * Static value MissingRequiredQueryParameter for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode MISSING_REQUIRED_QUERY_PARAMETER = fromString("MissingRequiredQueryParameter");

    /**
     * Static value MissingRequiredHeader for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode MISSING_REQUIRED_HEADER = fromString("MissingRequiredHeader");

    /**
     * Static value MissingRequiredXmlNode for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode MISSING_REQUIRED_XML_NODE = fromString("MissingRequiredXmlNode");

    /**
     * Static value MultipleConditionHeadersNotSupported for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode MULTIPLE_CONDITION_HEADERS_NOT_SUPPORTED
        = fromString("MultipleConditionHeadersNotSupported");

    /**
     * Static value OperationTimedOut for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode OPERATION_TIMED_OUT = fromString("OperationTimedOut");

    /**
     * Static value OutOfRangeInput for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode OUT_OF_RANGE_INPUT = fromString("OutOfRangeInput");

    /**
     * Static value OutOfRangeQueryParameterValue for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode OUT_OF_RANGE_QUERY_PARAMETER_VALUE = fromString("OutOfRangeQueryParameterValue");

    /**
     * Static value RequestBodyTooLarge for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode REQUEST_BODY_TOO_LARGE = fromString("RequestBodyTooLarge");

    /**
     * Static value ResourceTypeMismatch for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode RESOURCE_TYPE_MISMATCH = fromString("ResourceTypeMismatch");

    /**
     * Static value RequestUrlFailedToParse for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode REQUEST_URL_FAILED_TO_PARSE = fromString("RequestUrlFailedToParse");

    /**
     * Static value ResourceAlreadyExists for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode RESOURCE_ALREADY_EXISTS = fromString("ResourceAlreadyExists");

    /**
     * Static value ResourceNotFound for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode RESOURCE_NOT_FOUND = fromString("ResourceNotFound");

    /**
     * Static value ServerBusy for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode SERVER_BUSY = fromString("ServerBusy");

    /**
     * Static value UnsupportedHeader for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode UNSUPPORTED_HEADER = fromString("UnsupportedHeader");

    /**
     * Static value UnsupportedXmlNode for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode UNSUPPORTED_XML_NODE = fromString("UnsupportedXmlNode");

    /**
     * Static value UnsupportedQueryParameter for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode UNSUPPORTED_QUERY_PARAMETER = fromString("UnsupportedQueryParameter");

    /**
     * Static value UnsupportedHttpVerb for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode UNSUPPORTED_HTTP_VERB = fromString("UnsupportedHttpVerb");

    /**
     * Static value InvalidMarker for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode INVALID_MARKER = fromString("InvalidMarker");

    /**
     * Static value MessageNotFound for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode MESSAGE_NOT_FOUND = fromString("MessageNotFound");

    /**
     * Static value MessageTooLarge for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode MESSAGE_TOO_LARGE = fromString("MessageTooLarge");

    /**
     * Static value PopReceiptMismatch for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode POP_RECEIPT_MISMATCH = fromString("PopReceiptMismatch");

    /**
     * Static value QueueAlreadyExists for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode QUEUE_ALREADY_EXISTS = fromString("QueueAlreadyExists");

    /**
     * Static value QueueBeingDeleted for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode QUEUE_BEING_DELETED = fromString("QueueBeingDeleted");

    /**
     * Static value QueueDisabled for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode QUEUE_DISABLED = fromString("QueueDisabled");

    /**
     * Static value QueueNotEmpty for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode QUEUE_NOT_EMPTY = fromString("QueueNotEmpty");

    /**
     * Static value QueueNotFound for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode QUEUE_NOT_FOUND = fromString("QueueNotFound");

    /**
     * Static value AuthorizationSourceIPMismatch for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode AUTHORIZATION_SOURCE_IPMISMATCH = fromString("AuthorizationSourceIPMismatch");

    /**
     * Static value AuthorizationProtocolMismatch for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode AUTHORIZATION_PROTOCOL_MISMATCH = fromString("AuthorizationProtocolMismatch");

    /**
     * Static value AuthorizationPermissionMismatch for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode AUTHORIZATION_PERMISSION_MISMATCH
        = fromString("AuthorizationPermissionMismatch");

    /**
     * Static value AuthorizationServiceMismatch for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode AUTHORIZATION_SERVICE_MISMATCH = fromString("AuthorizationServiceMismatch");

    /**
     * Static value AuthorizationResourceTypeMismatch for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode AUTHORIZATION_RESOURCE_TYPE_MISMATCH
        = fromString("AuthorizationResourceTypeMismatch");

    /**
     * Static value FeatureVersionMismatch for QueueErrorCode.
     */
    @Generated
    public static final QueueErrorCode FEATURE_VERSION_MISMATCH = fromString("FeatureVersionMismatch");

    /**
     * Creates a new instance of QueueErrorCode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public QueueErrorCode() {
    }

    /**
     * Creates or finds a QueueErrorCode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding QueueErrorCode.
     */
    @Generated
    public static QueueErrorCode fromString(String name) {
        return fromString(name, QueueErrorCode.class);
    }

    /**
     * Gets known QueueErrorCode values.
     * 
     * @return known QueueErrorCode values.
     */
    @Generated
    public static Collection<QueueErrorCode> values() {
        return values(QueueErrorCode.class);
    }
}
