// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * The BlockList model.
 */
@Fluent
public final class BlockList implements XmlSerializable<BlockList> {
    /*
     * The CommittedBlocks property.
     */
    @Generated
    private List<Block> committedBlocks;

    /*
     * The UncommittedBlocks property.
     */
    @Generated
    private List<Block> uncommittedBlocks;

    /**
     * Creates an instance of BlockList class.
     */
    @Generated
    public BlockList() {
    }

    /**
     * Get the committedBlocks property: The CommittedBlocks property.
     * 
     * @return the committedBlocks value.
     */
    @Generated
    public List<Block> getCommittedBlocks() {
        if (this.committedBlocks == null) {
            this.committedBlocks = new ArrayList<>();
        }
        return this.committedBlocks;
    }

    /**
     * Set the committedBlocks property: The CommittedBlocks property.
     * 
     * @param committedBlocks the committedBlocks value to set.
     * @return the BlockList object itself.
     */
    @Generated
    public BlockList setCommittedBlocks(List<Block> committedBlocks) {
        this.committedBlocks = committedBlocks;
        return this;
    }

    /**
     * Get the uncommittedBlocks property: The UncommittedBlocks property.
     * 
     * @return the uncommittedBlocks value.
     */
    @Generated
    public List<Block> getUncommittedBlocks() {
        if (this.uncommittedBlocks == null) {
            this.uncommittedBlocks = new ArrayList<>();
        }
        return this.uncommittedBlocks;
    }

    /**
     * Set the uncommittedBlocks property: The UncommittedBlocks property.
     * 
     * @param uncommittedBlocks the uncommittedBlocks value to set.
     * @return the BlockList object itself.
     */
    @Generated
    public BlockList setUncommittedBlocks(List<Block> uncommittedBlocks) {
        this.uncommittedBlocks = uncommittedBlocks;
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
        rootElementName = rootElementName == null || rootElementName.isEmpty() ? "BlockList" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        if (this.committedBlocks != null) {
            xmlWriter.writeStartElement("CommittedBlocks");
            for (Block element : this.committedBlocks) {
                xmlWriter.writeXml(element, "Block");
            }
            xmlWriter.writeEndElement();
        }
        if (this.uncommittedBlocks != null) {
            xmlWriter.writeStartElement("UncommittedBlocks");
            for (Block element : this.uncommittedBlocks) {
                xmlWriter.writeXml(element, "Block");
            }
            xmlWriter.writeEndElement();
        }
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of BlockList from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of BlockList if the XmlReader was pointing to an instance of it, or null if it was pointing
     * to XML null.
     * @throws XMLStreamException If an error occurs while reading the BlockList.
     */
    @Generated
    public static BlockList fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of BlockList from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of BlockList if the XmlReader was pointing to an instance of it, or null if it was pointing
     * to XML null.
     * @throws XMLStreamException If an error occurs while reading the BlockList.
     */
    @Generated
    public static BlockList fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName
            = rootElementName == null || rootElementName.isEmpty() ? "BlockList" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            BlockList deserializedBlockList = new BlockList();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("CommittedBlocks".equals(elementName.getLocalPart())) {
                    while (reader.nextElement() != XmlToken.END_ELEMENT) {
                        elementName = reader.getElementName();
                        if ("Block".equals(elementName.getLocalPart())) {
                            if (deserializedBlockList.committedBlocks == null) {
                                deserializedBlockList.committedBlocks = new ArrayList<>();
                            }
                            deserializedBlockList.committedBlocks.add(Block.fromXml(reader, "Block"));
                        } else {
                            reader.skipElement();
                        }
                    }
                } else if ("UncommittedBlocks".equals(elementName.getLocalPart())) {
                    while (reader.nextElement() != XmlToken.END_ELEMENT) {
                        elementName = reader.getElementName();
                        if ("Block".equals(elementName.getLocalPart())) {
                            if (deserializedBlockList.uncommittedBlocks == null) {
                                deserializedBlockList.uncommittedBlocks = new ArrayList<>();
                            }
                            deserializedBlockList.uncommittedBlocks.add(Block.fromXml(reader, "Block"));
                        } else {
                            reader.skipElement();
                        }
                    }
                } else {
                    reader.skipElement();
                }
            }

            return deserializedBlockList;
        });
    }
}
