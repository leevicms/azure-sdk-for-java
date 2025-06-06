// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import java.time.OffsetDateTime;

/**
 * The PathsGetPropertiesHeaders model.
 */
@Fluent
public final class PathsGetPropertiesHeaders {
    /*
     * The x-ms-lease-status property.
     */
    @Generated
    private String xMsLeaseStatus;

    /*
     * The Content-Range property.
     */
    @Generated
    private String contentRange;

    /*
     * The x-ms-lease-state property.
     */
    @Generated
    private String xMsLeaseState;

    /*
     * The Last-Modified property.
     */
    @Generated
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-properties property.
     */
    @Generated
    private String xMsProperties;

    /*
     * The x-ms-encryption-key-sha256 property.
     */
    @Generated
    private String xMsEncryptionKeySha256;

    /*
     * The Content-Encoding property.
     */
    @Generated
    private String contentEncoding;

    /*
     * The x-ms-creation-time property.
     */
    @Generated
    private DateTimeRfc1123 xMsCreationTime;

    /*
     * The x-ms-permissions property.
     */
    @Generated
    private String xMsPermissions;

    /*
     * The x-ms-lease-duration property.
     */
    @Generated
    private String xMsLeaseDuration;

    /*
     * The Content-Length property.
     */
    @Generated
    private Long contentLength;

    /*
     * The x-ms-request-id property.
     */
    @Generated
    private String xMsRequestId;

    /*
     * The x-ms-owner property.
     */
    @Generated
    private String xMsOwner;

    /*
     * The Content-Type property.
     */
    @Generated
    private String contentType;

    /*
     * The x-ms-group property.
     */
    @Generated
    private String xMsGroup;

    /*
     * The x-ms-version property.
     */
    @Generated
    private String xMsVersion;

    /*
     * The x-ms-encryption-context property.
     */
    @Generated
    private String xMsEncryptionContext;

    /*
     * The x-ms-acl property.
     */
    @Generated
    private String xMsAcl;

    /*
     * The Date property.
     */
    @Generated
    private DateTimeRfc1123 date;

    /*
     * The x-ms-resource-type property.
     */
    @Generated
    private String xMsResourceType;

    /*
     * The x-ms-expiry-time property.
     */
    @Generated
    private DateTimeRfc1123 xMsExpiryTime;

    /*
     * The Content-MD5 property.
     */
    @Generated
    private String contentMD5;

    /*
     * The Accept-Ranges property.
     */
    @Generated
    private String acceptRanges;

    /*
     * The x-ms-server-encrypted property.
     */
    @Generated
    private Boolean xMsServerEncrypted;

    /*
     * The Cache-Control property.
     */
    @Generated
    private String cacheControl;

    /*
     * The ETag property.
     */
    @Generated
    private String eTag;

    /*
     * The Content-Disposition property.
     */
    @Generated
    private String contentDisposition;

    /*
     * The Content-Language property.
     */
    @Generated
    private String contentLanguage;

    /*
     * The x-ms-encryption-scope property.
     */
    @Generated
    private String xMsEncryptionScope;

    private static final HttpHeaderName X_MS_LEASE_STATUS = HttpHeaderName.fromString("x-ms-lease-status");

    private static final HttpHeaderName X_MS_LEASE_STATE = HttpHeaderName.fromString("x-ms-lease-state");

    private static final HttpHeaderName X_MS_PROPERTIES = HttpHeaderName.fromString("x-ms-properties");

    private static final HttpHeaderName X_MS_ENCRYPTION_KEY_SHA256
        = HttpHeaderName.fromString("x-ms-encryption-key-sha256");

    private static final HttpHeaderName X_MS_CREATION_TIME = HttpHeaderName.fromString("x-ms-creation-time");

    private static final HttpHeaderName X_MS_PERMISSIONS = HttpHeaderName.fromString("x-ms-permissions");

    private static final HttpHeaderName X_MS_LEASE_DURATION = HttpHeaderName.fromString("x-ms-lease-duration");

    private static final HttpHeaderName X_MS_OWNER = HttpHeaderName.fromString("x-ms-owner");

    private static final HttpHeaderName X_MS_GROUP = HttpHeaderName.fromString("x-ms-group");

    private static final HttpHeaderName X_MS_VERSION = HttpHeaderName.fromString("x-ms-version");

    private static final HttpHeaderName X_MS_ENCRYPTION_CONTEXT = HttpHeaderName.fromString("x-ms-encryption-context");

    private static final HttpHeaderName X_MS_ACL = HttpHeaderName.fromString("x-ms-acl");

    private static final HttpHeaderName X_MS_RESOURCE_TYPE = HttpHeaderName.fromString("x-ms-resource-type");

    private static final HttpHeaderName X_MS_EXPIRY_TIME = HttpHeaderName.fromString("x-ms-expiry-time");

    private static final HttpHeaderName X_MS_SERVER_ENCRYPTED = HttpHeaderName.fromString("x-ms-server-encrypted");

    private static final HttpHeaderName X_MS_ENCRYPTION_SCOPE = HttpHeaderName.fromString("x-ms-encryption-scope");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of PathsGetPropertiesHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public PathsGetPropertiesHeaders(HttpHeaders rawHeaders) {
        this.xMsLeaseStatus = rawHeaders.getValue(X_MS_LEASE_STATUS);
        this.contentRange = rawHeaders.getValue(HttpHeaderName.CONTENT_RANGE);
        this.xMsLeaseState = rawHeaders.getValue(X_MS_LEASE_STATE);
        String lastModified = rawHeaders.getValue(HttpHeaderName.LAST_MODIFIED);
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        } else {
            this.lastModified = null;
        }
        this.xMsProperties = rawHeaders.getValue(X_MS_PROPERTIES);
        this.xMsEncryptionKeySha256 = rawHeaders.getValue(X_MS_ENCRYPTION_KEY_SHA256);
        this.contentEncoding = rawHeaders.getValue(HttpHeaderName.CONTENT_ENCODING);
        String xMsCreationTime = rawHeaders.getValue(X_MS_CREATION_TIME);
        if (xMsCreationTime != null) {
            this.xMsCreationTime = new DateTimeRfc1123(xMsCreationTime);
        } else {
            this.xMsCreationTime = null;
        }
        this.xMsPermissions = rawHeaders.getValue(X_MS_PERMISSIONS);
        this.xMsLeaseDuration = rawHeaders.getValue(X_MS_LEASE_DURATION);
        String contentLength = rawHeaders.getValue(HttpHeaderName.CONTENT_LENGTH);
        if (contentLength != null) {
            this.contentLength = Long.parseLong(contentLength);
        } else {
            this.contentLength = null;
        }
        this.xMsRequestId = rawHeaders.getValue(HttpHeaderName.X_MS_REQUEST_ID);
        this.xMsOwner = rawHeaders.getValue(X_MS_OWNER);
        this.contentType = rawHeaders.getValue(HttpHeaderName.CONTENT_TYPE);
        this.xMsGroup = rawHeaders.getValue(X_MS_GROUP);
        this.xMsVersion = rawHeaders.getValue(X_MS_VERSION);
        this.xMsEncryptionContext = rawHeaders.getValue(X_MS_ENCRYPTION_CONTEXT);
        this.xMsAcl = rawHeaders.getValue(X_MS_ACL);
        String date = rawHeaders.getValue(HttpHeaderName.DATE);
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        } else {
            this.date = null;
        }
        this.xMsResourceType = rawHeaders.getValue(X_MS_RESOURCE_TYPE);
        String xMsExpiryTime = rawHeaders.getValue(X_MS_EXPIRY_TIME);
        if (xMsExpiryTime != null) {
            this.xMsExpiryTime = new DateTimeRfc1123(xMsExpiryTime);
        } else {
            this.xMsExpiryTime = null;
        }
        this.contentMD5 = rawHeaders.getValue(HttpHeaderName.CONTENT_MD5);
        this.acceptRanges = rawHeaders.getValue(HttpHeaderName.ACCEPT_RANGES);
        String xMsServerEncrypted = rawHeaders.getValue(X_MS_SERVER_ENCRYPTED);
        if (xMsServerEncrypted != null) {
            this.xMsServerEncrypted = Boolean.parseBoolean(xMsServerEncrypted);
        } else {
            this.xMsServerEncrypted = null;
        }
        this.cacheControl = rawHeaders.getValue(HttpHeaderName.CACHE_CONTROL);
        this.eTag = rawHeaders.getValue(HttpHeaderName.ETAG);
        this.contentDisposition = rawHeaders.getValue(HttpHeaderName.CONTENT_DISPOSITION);
        this.contentLanguage = rawHeaders.getValue(HttpHeaderName.CONTENT_LANGUAGE);
        this.xMsEncryptionScope = rawHeaders.getValue(X_MS_ENCRYPTION_SCOPE);
    }

    /**
     * Get the xMsLeaseStatus property: The x-ms-lease-status property.
     * 
     * @return the xMsLeaseStatus value.
     */
    @Generated
    public String getXMsLeaseStatus() {
        return this.xMsLeaseStatus;
    }

    /**
     * Set the xMsLeaseStatus property: The x-ms-lease-status property.
     * 
     * @param xMsLeaseStatus the xMsLeaseStatus value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsLeaseStatus(String xMsLeaseStatus) {
        this.xMsLeaseStatus = xMsLeaseStatus;
        return this;
    }

    /**
     * Get the contentRange property: The Content-Range property.
     * 
     * @return the contentRange value.
     */
    @Generated
    public String getContentRange() {
        return this.contentRange;
    }

    /**
     * Set the contentRange property: The Content-Range property.
     * 
     * @param contentRange the contentRange value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * Get the xMsLeaseState property: The x-ms-lease-state property.
     * 
     * @return the xMsLeaseState value.
     */
    @Generated
    public String getXMsLeaseState() {
        return this.xMsLeaseState;
    }

    /**
     * Set the xMsLeaseState property: The x-ms-lease-state property.
     * 
     * @param xMsLeaseState the xMsLeaseState value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsLeaseState(String xMsLeaseState) {
        this.xMsLeaseState = xMsLeaseState;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     * 
     * @return the lastModified value.
     */
    @Generated
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     * 
     * @param lastModified the lastModified value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsProperties property: The x-ms-properties property.
     * 
     * @return the xMsProperties value.
     */
    @Generated
    public String getXMsProperties() {
        return this.xMsProperties;
    }

    /**
     * Set the xMsProperties property: The x-ms-properties property.
     * 
     * @param xMsProperties the xMsProperties value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsProperties(String xMsProperties) {
        this.xMsProperties = xMsProperties;
        return this;
    }

    /**
     * Get the xMsEncryptionKeySha256 property: The x-ms-encryption-key-sha256 property.
     * 
     * @return the xMsEncryptionKeySha256 value.
     */
    @Generated
    public String getXMsEncryptionKeySha256() {
        return this.xMsEncryptionKeySha256;
    }

    /**
     * Set the xMsEncryptionKeySha256 property: The x-ms-encryption-key-sha256 property.
     * 
     * @param xMsEncryptionKeySha256 the xMsEncryptionKeySha256 value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsEncryptionKeySha256(String xMsEncryptionKeySha256) {
        this.xMsEncryptionKeySha256 = xMsEncryptionKeySha256;
        return this;
    }

    /**
     * Get the contentEncoding property: The Content-Encoding property.
     * 
     * @return the contentEncoding value.
     */
    @Generated
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: The Content-Encoding property.
     * 
     * @param contentEncoding the contentEncoding value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the xMsCreationTime property: The x-ms-creation-time property.
     * 
     * @return the xMsCreationTime value.
     */
    @Generated
    public OffsetDateTime getXMsCreationTime() {
        if (this.xMsCreationTime == null) {
            return null;
        }
        return this.xMsCreationTime.getDateTime();
    }

    /**
     * Set the xMsCreationTime property: The x-ms-creation-time property.
     * 
     * @param xMsCreationTime the xMsCreationTime value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsCreationTime(OffsetDateTime xMsCreationTime) {
        if (xMsCreationTime == null) {
            this.xMsCreationTime = null;
        } else {
            this.xMsCreationTime = new DateTimeRfc1123(xMsCreationTime);
        }
        return this;
    }

    /**
     * Get the xMsPermissions property: The x-ms-permissions property.
     * 
     * @return the xMsPermissions value.
     */
    @Generated
    public String getXMsPermissions() {
        return this.xMsPermissions;
    }

    /**
     * Set the xMsPermissions property: The x-ms-permissions property.
     * 
     * @param xMsPermissions the xMsPermissions value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsPermissions(String xMsPermissions) {
        this.xMsPermissions = xMsPermissions;
        return this;
    }

    /**
     * Get the xMsLeaseDuration property: The x-ms-lease-duration property.
     * 
     * @return the xMsLeaseDuration value.
     */
    @Generated
    public String getXMsLeaseDuration() {
        return this.xMsLeaseDuration;
    }

    /**
     * Set the xMsLeaseDuration property: The x-ms-lease-duration property.
     * 
     * @param xMsLeaseDuration the xMsLeaseDuration value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsLeaseDuration(String xMsLeaseDuration) {
        this.xMsLeaseDuration = xMsLeaseDuration;
        return this;
    }

    /**
     * Get the contentLength property: The Content-Length property.
     * 
     * @return the contentLength value.
     */
    @Generated
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The Content-Length property.
     * 
     * @param contentLength the contentLength value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     * 
     * @return the xMsRequestId value.
     */
    @Generated
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     * 
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsOwner property: The x-ms-owner property.
     * 
     * @return the xMsOwner value.
     */
    @Generated
    public String getXMsOwner() {
        return this.xMsOwner;
    }

    /**
     * Set the xMsOwner property: The x-ms-owner property.
     * 
     * @param xMsOwner the xMsOwner value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsOwner(String xMsOwner) {
        this.xMsOwner = xMsOwner;
        return this;
    }

    /**
     * Get the contentType property: The Content-Type property.
     * 
     * @return the contentType value.
     */
    @Generated
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The Content-Type property.
     * 
     * @param contentType the contentType value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the xMsGroup property: The x-ms-group property.
     * 
     * @return the xMsGroup value.
     */
    @Generated
    public String getXMsGroup() {
        return this.xMsGroup;
    }

    /**
     * Set the xMsGroup property: The x-ms-group property.
     * 
     * @param xMsGroup the xMsGroup value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsGroup(String xMsGroup) {
        this.xMsGroup = xMsGroup;
        return this;
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     * 
     * @return the xMsVersion value.
     */
    @Generated
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     * 
     * @param xMsVersion the xMsVersion value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsEncryptionContext property: The x-ms-encryption-context property.
     * 
     * @return the xMsEncryptionContext value.
     */
    @Generated
    public String getXMsEncryptionContext() {
        return this.xMsEncryptionContext;
    }

    /**
     * Set the xMsEncryptionContext property: The x-ms-encryption-context property.
     * 
     * @param xMsEncryptionContext the xMsEncryptionContext value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsEncryptionContext(String xMsEncryptionContext) {
        this.xMsEncryptionContext = xMsEncryptionContext;
        return this;
    }

    /**
     * Get the xMsAcl property: The x-ms-acl property.
     * 
     * @return the xMsAcl value.
     */
    @Generated
    public String getXMsAcl() {
        return this.xMsAcl;
    }

    /**
     * Set the xMsAcl property: The x-ms-acl property.
     * 
     * @param xMsAcl the xMsAcl value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsAcl(String xMsAcl) {
        this.xMsAcl = xMsAcl;
        return this;
    }

    /**
     * Get the date property: The Date property.
     * 
     * @return the date value.
     */
    @Generated
    public OffsetDateTime getDate() {
        if (this.date == null) {
            return null;
        }
        return this.date.getDateTime();
    }

    /**
     * Set the date property: The Date property.
     * 
     * @param date the date value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }

    /**
     * Get the xMsResourceType property: The x-ms-resource-type property.
     * 
     * @return the xMsResourceType value.
     */
    @Generated
    public String getXMsResourceType() {
        return this.xMsResourceType;
    }

    /**
     * Set the xMsResourceType property: The x-ms-resource-type property.
     * 
     * @param xMsResourceType the xMsResourceType value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsResourceType(String xMsResourceType) {
        this.xMsResourceType = xMsResourceType;
        return this;
    }

    /**
     * Get the xMsExpiryTime property: The x-ms-expiry-time property.
     * 
     * @return the xMsExpiryTime value.
     */
    @Generated
    public OffsetDateTime getXMsExpiryTime() {
        if (this.xMsExpiryTime == null) {
            return null;
        }
        return this.xMsExpiryTime.getDateTime();
    }

    /**
     * Set the xMsExpiryTime property: The x-ms-expiry-time property.
     * 
     * @param xMsExpiryTime the xMsExpiryTime value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsExpiryTime(OffsetDateTime xMsExpiryTime) {
        if (xMsExpiryTime == null) {
            this.xMsExpiryTime = null;
        } else {
            this.xMsExpiryTime = new DateTimeRfc1123(xMsExpiryTime);
        }
        return this;
    }

    /**
     * Get the contentMD5 property: The Content-MD5 property.
     * 
     * @return the contentMD5 value.
     */
    @Generated
    public String getContentMD5() {
        return this.contentMD5;
    }

    /**
     * Set the contentMD5 property: The Content-MD5 property.
     * 
     * @param contentMD5 the contentMD5 value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * Get the acceptRanges property: The Accept-Ranges property.
     * 
     * @return the acceptRanges value.
     */
    @Generated
    public String getAcceptRanges() {
        return this.acceptRanges;
    }

    /**
     * Set the acceptRanges property: The Accept-Ranges property.
     * 
     * @param acceptRanges the acceptRanges value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * Get the xMsServerEncrypted property: The x-ms-server-encrypted property.
     * 
     * @return the xMsServerEncrypted value.
     */
    @Generated
    public Boolean isXMsServerEncrypted() {
        return this.xMsServerEncrypted;
    }

    /**
     * Set the xMsServerEncrypted property: The x-ms-server-encrypted property.
     * 
     * @param xMsServerEncrypted the xMsServerEncrypted value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsServerEncrypted(Boolean xMsServerEncrypted) {
        this.xMsServerEncrypted = xMsServerEncrypted;
        return this;
    }

    /**
     * Get the cacheControl property: The Cache-Control property.
     * 
     * @return the cacheControl value.
     */
    @Generated
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: The Cache-Control property.
     * 
     * @param cacheControl the cacheControl value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     * 
     * @return the eTag value.
     */
    @Generated
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     * 
     * @param eTag the eTag value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the contentDisposition property: The Content-Disposition property.
     * 
     * @return the contentDisposition value.
     */
    @Generated
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: The Content-Disposition property.
     * 
     * @param contentDisposition the contentDisposition value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the contentLanguage property: The Content-Language property.
     * 
     * @return the contentLanguage value.
     */
    @Generated
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: The Content-Language property.
     * 
     * @param contentLanguage the contentLanguage value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the xMsEncryptionScope property: The x-ms-encryption-scope property.
     * 
     * @return the xMsEncryptionScope value.
     */
    @Generated
    public String getXMsEncryptionScope() {
        return this.xMsEncryptionScope;
    }

    /**
     * Set the xMsEncryptionScope property: The x-ms-encryption-scope property.
     * 
     * @param xMsEncryptionScope the xMsEncryptionScope value to set.
     * @return the PathsGetPropertiesHeaders object itself.
     */
    @Generated
    public PathsGetPropertiesHeaders setXMsEncryptionScope(String xMsEncryptionScope) {
        this.xMsEncryptionScope = xMsEncryptionScope;
        return this;
    }
}
