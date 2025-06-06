// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * The BlobTag model.
 */
@Fluent
public final class BlobTag implements XmlSerializable<BlobTag> {
    /*
     * The Key property.
     */
    @Generated
    private String key;

    /*
     * The Value property.
     */
    @Generated
    private String value;

    /**
     * Creates an instance of BlobTag class.
     */
    @Generated
    public BlobTag() {
    }

    /**
     * Get the key property: The Key property.
     * 
     * @return the key value.
     */
    @Generated
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The Key property.
     * 
     * @param key the key value to set.
     * @return the BlobTag object itself.
     */
    @Generated
    public BlobTag setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: The Value property.
     * 
     * @return the value value.
     */
    @Generated
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The Value property.
     * 
     * @param value the value value to set.
     * @return the BlobTag object itself.
     */
    @Generated
    public BlobTag setValue(String value) {
        this.value = value;
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
        rootElementName = rootElementName == null || rootElementName.isEmpty() ? "Tag" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeStringElement("Key", this.key);
        xmlWriter.writeStringElement("Value", this.value);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of BlobTag from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of BlobTag if the XmlReader was pointing to an instance of it, or null if it was pointing to
     * XML null.
     * @throws XMLStreamException If an error occurs while reading the BlobTag.
     */
    @Generated
    public static BlobTag fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of BlobTag from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of BlobTag if the XmlReader was pointing to an instance of it, or null if it was pointing to
     * XML null.
     * @throws XMLStreamException If an error occurs while reading the BlobTag.
     */
    @Generated
    public static BlobTag fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = rootElementName == null || rootElementName.isEmpty() ? "Tag" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            BlobTag deserializedBlobTag = new BlobTag();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("Key".equals(elementName.getLocalPart())) {
                    deserializedBlobTag.key = reader.getStringElement();
                } else if ("Value".equals(elementName.getLocalPart())) {
                    deserializedBlobTag.value = reader.getStringElement();
                } else {
                    reader.skipElement();
                }
            }

            return deserializedBlobTag;
        });
    }
}
