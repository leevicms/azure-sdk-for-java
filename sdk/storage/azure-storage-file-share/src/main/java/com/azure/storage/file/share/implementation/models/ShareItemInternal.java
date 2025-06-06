// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * A listed Azure Storage share item.
 */
@Fluent
public final class ShareItemInternal implements XmlSerializable<ShareItemInternal> {
    /*
     * The Name property.
     */
    @Generated
    private String name;

    /*
     * The Snapshot property.
     */
    @Generated
    private String snapshot;

    /*
     * The Deleted property.
     */
    @Generated
    private Boolean deleted;

    /*
     * The Version property.
     */
    @Generated
    private String version;

    /*
     * Properties of a share.
     */
    @Generated
    private SharePropertiesInternal properties;

    /*
     * Dictionary of <string>
     */
    @Generated
    private Map<String, String> metadata;

    /**
     * Creates an instance of ShareItemInternal class.
     */
    @Generated
    public ShareItemInternal() {
    }

    /**
     * Get the name property: The Name property.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The Name property.
     * 
     * @param name the name value to set.
     * @return the ShareItemInternal object itself.
     */
    @Generated
    public ShareItemInternal setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the snapshot property: The Snapshot property.
     * 
     * @return the snapshot value.
     */
    @Generated
    public String getSnapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The Snapshot property.
     * 
     * @param snapshot the snapshot value to set.
     * @return the ShareItemInternal object itself.
     */
    @Generated
    public ShareItemInternal setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the deleted property: The Deleted property.
     * 
     * @return the deleted value.
     */
    @Generated
    public Boolean isDeleted() {
        return this.deleted;
    }

    /**
     * Set the deleted property: The Deleted property.
     * 
     * @param deleted the deleted value to set.
     * @return the ShareItemInternal object itself.
     */
    @Generated
    public ShareItemInternal setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get the version property: The Version property.
     * 
     * @return the version value.
     */
    @Generated
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The Version property.
     * 
     * @param version the version value to set.
     * @return the ShareItemInternal object itself.
     */
    @Generated
    public ShareItemInternal setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the properties property: Properties of a share.
     * 
     * @return the properties value.
     */
    @Generated
    public SharePropertiesInternal getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of a share.
     * 
     * @param properties the properties value to set.
     * @return the ShareItemInternal object itself.
     */
    @Generated
    public ShareItemInternal setProperties(SharePropertiesInternal properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the metadata property: Dictionary of &lt;string&gt;.
     * 
     * @return the metadata value.
     */
    @Generated
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Dictionary of &lt;string&gt;.
     * 
     * @param metadata the metadata value to set.
     * @return the ShareItemInternal object itself.
     */
    @Generated
    public ShareItemInternal setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
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
        rootElementName = rootElementName == null || rootElementName.isEmpty() ? "Share" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeStringElement("Name", this.name);
        xmlWriter.writeStringElement("Snapshot", this.snapshot);
        xmlWriter.writeBooleanElement("Deleted", this.deleted);
        xmlWriter.writeStringElement("Version", this.version);
        xmlWriter.writeXml(this.properties, "Properties");
        if (this.metadata != null) {
            xmlWriter.writeStartElement("Metadata");
            for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
                xmlWriter.writeStringElement(entry.getKey(), entry.getValue());
            }
            xmlWriter.writeEndElement();
        }
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of ShareItemInternal from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of ShareItemInternal if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the ShareItemInternal.
     */
    @Generated
    public static ShareItemInternal fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of ShareItemInternal from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of ShareItemInternal if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the ShareItemInternal.
     */
    @Generated
    public static ShareItemInternal fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = rootElementName == null || rootElementName.isEmpty() ? "Share" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            ShareItemInternal deserializedShareItemInternal = new ShareItemInternal();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("Name".equals(elementName.getLocalPart())) {
                    deserializedShareItemInternal.name = reader.getStringElement();
                } else if ("Snapshot".equals(elementName.getLocalPart())) {
                    deserializedShareItemInternal.snapshot = reader.getStringElement();
                } else if ("Deleted".equals(elementName.getLocalPart())) {
                    deserializedShareItemInternal.deleted = reader.getNullableElement(Boolean::parseBoolean);
                } else if ("Version".equals(elementName.getLocalPart())) {
                    deserializedShareItemInternal.version = reader.getStringElement();
                } else if ("Properties".equals(elementName.getLocalPart())) {
                    deserializedShareItemInternal.properties = SharePropertiesInternal.fromXml(reader, "Properties");
                } else if ("Metadata".equals(elementName.getLocalPart())) {
                    while (reader.nextElement() != XmlToken.END_ELEMENT) {
                        if (deserializedShareItemInternal.metadata == null) {
                            deserializedShareItemInternal.metadata = new LinkedHashMap<>();
                        }
                        deserializedShareItemInternal.metadata.put(reader.getElementName().getLocalPart(),
                            reader.getStringElement());
                    }
                } else {
                    reader.skipElement();
                }
            }

            return deserializedShareItemInternal;
        });
    }
}
