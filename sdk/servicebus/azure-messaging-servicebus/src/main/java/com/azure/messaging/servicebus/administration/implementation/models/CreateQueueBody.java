// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * The request body for creating a queue.
 */
@Fluent
public final class CreateQueueBody implements XmlSerializable<CreateQueueBody> {
    private static final String WWW_W3_ORG_TWO_ZERO_ZERO_FIVE_ATOM = "http://www.w3.org/2005/Atom";

    /*
     * QueueDescription for the new queue.
     */
    @Generated
    private CreateQueueBodyContent content;

    /**
     * Creates an instance of CreateQueueBody class.
     */
    @Generated
    public CreateQueueBody() {
    }

    /**
     * Get the content property: QueueDescription for the new queue.
     * 
     * @return the content value.
     */
    @Generated
    public CreateQueueBodyContent getContent() {
        return this.content;
    }

    /**
     * Set the content property: QueueDescription for the new queue.
     * 
     * @param content the content value to set.
     * @return the CreateQueueBody object itself.
     */
    @Generated
    public CreateQueueBody setContent(CreateQueueBodyContent content) {
        this.content = content;
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
        rootElementName = rootElementName == null || rootElementName.isEmpty() ? "entry" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeNamespace(WWW_W3_ORG_TWO_ZERO_ZERO_FIVE_ATOM);
        xmlWriter.writeXml(this.content, "content");
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of CreateQueueBody from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of CreateQueueBody if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the CreateQueueBody.
     */
    @Generated
    public static CreateQueueBody fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of CreateQueueBody from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of CreateQueueBody if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the CreateQueueBody.
     */
    @Generated
    public static CreateQueueBody fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = rootElementName == null || rootElementName.isEmpty() ? "entry" : rootElementName;
        return xmlReader.readObject(WWW_W3_ORG_TWO_ZERO_ZERO_FIVE_ATOM, finalRootElementName, reader -> {
            CreateQueueBody deserializedCreateQueueBody = new CreateQueueBody();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("content".equals(elementName.getLocalPart())
                    && WWW_W3_ORG_TWO_ZERO_ZERO_FIVE_ATOM.equals(elementName.getNamespaceURI())) {
                    deserializedCreateQueueBody.content = CreateQueueBodyContent.fromXml(reader, "content");
                } else {
                    reader.skipElement();
                }
            }

            return deserializedCreateQueueBody;
        });
    }
}
