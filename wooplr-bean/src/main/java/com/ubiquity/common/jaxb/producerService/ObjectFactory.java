//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.19 at 01:32:38 AM IST 
//


package com.ubiquity.common.jaxb.producerService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ubiquity.common.jaxb.producerService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProducerServiceForm_QNAME = new QName("", "producerServiceForm");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ubiquity.common.jaxb.producerService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProducerServiceAttributesJAXB }
     * 
     */
    public ProducerServiceAttributesJAXB createProducerServiceAttributesJAXB() {
        return new ProducerServiceAttributesJAXB();
    }

    /**
     * Create an instance of {@link ProducerServiceDetailsJAXB }
     * 
     */
    public ProducerServiceDetailsJAXB createProducerServiceDetailsJAXB() {
        return new ProducerServiceDetailsJAXB();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducerServiceDetailsJAXB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "producerServiceForm")
    public JAXBElement<ProducerServiceDetailsJAXB> createProducerServiceForm(ProducerServiceDetailsJAXB value) {
        return new JAXBElement<ProducerServiceDetailsJAXB>(_ProducerServiceForm_QNAME, ProducerServiceDetailsJAXB.class, null, value);
    }

}
