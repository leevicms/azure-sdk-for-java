// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * CORS is an HTTP feature that enables a web application running under one domain to access resources in another
 * domain. Web browsers implement a security restriction known as same-origin policy that prevents a web page from
 * calling APIs in a different domain; CORS provides a secure way to allow one domain (the origin domain) to call APIs
 * in another domain.
 */
@Fluent
public final class ShareCorsRule implements XmlSerializable<ShareCorsRule> {
    /*
     * The origin domains that are permitted to make a request against the storage service via CORS. The origin domain
     * is the domain from which the request originates. Note that the origin must be an exact case-sensitive match with
     * the origin that the user age sends to the service. You can also use the wildcard character '*' to allow all
     * origin domains to make requests via CORS.
     */
    @Generated
    private String allowedOrigins;

    /*
     * The methods (HTTP request verbs) that the origin domain may use for a CORS request. (comma separated)
     */
    @Generated
    private String allowedMethods;

    /*
     * The request headers that the origin domain may specify on the CORS request.
     */
    @Generated
    private String allowedHeaders;

    /*
     * The response headers that may be sent in the response to the CORS request and exposed by the browser to the
     * request issuer.
     */
    @Generated
    private String exposedHeaders;

    /*
     * The maximum amount time that a browser should cache the preflight OPTIONS request.
     */
    @Generated
    private int maxAgeInSeconds;

    /**
     * Creates an instance of ShareCorsRule class.
     */
    @Generated
    public ShareCorsRule() {
    }

    /**
     * Get the allowedOrigins property: The origin domains that are permitted to make a request against the storage
     * service via CORS. The origin domain is the domain from which the request originates. Note that the origin must be
     * an exact case-sensitive match with the origin that the user age sends to the service. You can also use the
     * wildcard character '*' to allow all origin domains to make requests via CORS.
     * 
     * @return the allowedOrigins value.
     */
    @Generated
    public String getAllowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Set the allowedOrigins property: The origin domains that are permitted to make a request against the storage
     * service via CORS. The origin domain is the domain from which the request originates. Note that the origin must be
     * an exact case-sensitive match with the origin that the user age sends to the service. You can also use the
     * wildcard character '*' to allow all origin domains to make requests via CORS.
     * 
     * @param allowedOrigins the allowedOrigins value to set.
     * @return the ShareCorsRule object itself.
     */
    @Generated
    public ShareCorsRule setAllowedOrigins(String allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     * Get the allowedMethods property: The methods (HTTP request verbs) that the origin domain may use for a CORS
     * request. (comma separated).
     * 
     * @return the allowedMethods value.
     */
    @Generated
    public String getAllowedMethods() {
        return this.allowedMethods;
    }

    /**
     * Set the allowedMethods property: The methods (HTTP request verbs) that the origin domain may use for a CORS
     * request. (comma separated).
     * 
     * @param allowedMethods the allowedMethods value to set.
     * @return the ShareCorsRule object itself.
     */
    @Generated
    public ShareCorsRule setAllowedMethods(String allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * Get the allowedHeaders property: The request headers that the origin domain may specify on the CORS request.
     * 
     * @return the allowedHeaders value.
     */
    @Generated
    public String getAllowedHeaders() {
        return this.allowedHeaders;
    }

    /**
     * Set the allowedHeaders property: The request headers that the origin domain may specify on the CORS request.
     * 
     * @param allowedHeaders the allowedHeaders value to set.
     * @return the ShareCorsRule object itself.
     */
    @Generated
    public ShareCorsRule setAllowedHeaders(String allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
        return this;
    }

    /**
     * Get the exposedHeaders property: The response headers that may be sent in the response to the CORS request and
     * exposed by the browser to the request issuer.
     * 
     * @return the exposedHeaders value.
     */
    @Generated
    public String getExposedHeaders() {
        return this.exposedHeaders;
    }

    /**
     * Set the exposedHeaders property: The response headers that may be sent in the response to the CORS request and
     * exposed by the browser to the request issuer.
     * 
     * @param exposedHeaders the exposedHeaders value to set.
     * @return the ShareCorsRule object itself.
     */
    @Generated
    public ShareCorsRule setExposedHeaders(String exposedHeaders) {
        this.exposedHeaders = exposedHeaders;
        return this;
    }

    /**
     * Get the maxAgeInSeconds property: The maximum amount time that a browser should cache the preflight OPTIONS
     * request.
     * 
     * @return the maxAgeInSeconds value.
     */
    @Generated
    public int getMaxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    /**
     * Set the maxAgeInSeconds property: The maximum amount time that a browser should cache the preflight OPTIONS
     * request.
     * 
     * @param maxAgeInSeconds the maxAgeInSeconds value to set.
     * @return the ShareCorsRule object itself.
     */
    @Generated
    public ShareCorsRule setMaxAgeInSeconds(int maxAgeInSeconds) {
        this.maxAgeInSeconds = maxAgeInSeconds;
        return this;
    }

    @Generated
    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Generated
    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = rootElementName == null || rootElementName.isEmpty() ? "CorsRule" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeStringElement("AllowedOrigins", this.allowedOrigins);
        xmlWriter.writeStringElement("AllowedMethods", this.allowedMethods);
        xmlWriter.writeStringElement("AllowedHeaders", this.allowedHeaders);
        xmlWriter.writeStringElement("ExposedHeaders", this.exposedHeaders);
        xmlWriter.writeIntElement("MaxAgeInSeconds", this.maxAgeInSeconds);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of ShareCorsRule from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of ShareCorsRule if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the ShareCorsRule.
     */
    @Generated
    public static ShareCorsRule fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of ShareCorsRule from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of ShareCorsRule if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the ShareCorsRule.
     */
    @Generated
    public static ShareCorsRule fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName
            = rootElementName == null || rootElementName.isEmpty() ? "CorsRule" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            ShareCorsRule deserializedShareCorsRule = new ShareCorsRule();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("AllowedOrigins".equals(elementName.getLocalPart())) {
                    deserializedShareCorsRule.allowedOrigins = reader.getStringElement();
                } else if ("AllowedMethods".equals(elementName.getLocalPart())) {
                    deserializedShareCorsRule.allowedMethods = reader.getStringElement();
                } else if ("AllowedHeaders".equals(elementName.getLocalPart())) {
                    deserializedShareCorsRule.allowedHeaders = reader.getStringElement();
                } else if ("ExposedHeaders".equals(elementName.getLocalPart())) {
                    deserializedShareCorsRule.exposedHeaders = reader.getStringElement();
                } else if ("MaxAgeInSeconds".equals(elementName.getLocalPart())) {
                    deserializedShareCorsRule.maxAgeInSeconds = reader.getIntElement();
                } else {
                    reader.skipElement();
                }
            }

            return deserializedShareCorsRule;
        });
    }
}
