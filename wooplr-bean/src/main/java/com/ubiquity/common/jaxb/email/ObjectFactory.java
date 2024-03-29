//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.07 at 01:20:10 PM IST 
//


package com.ubiquity.common.jaxb.email;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ubiquity.common.jaxb.email package. 
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

    private final static QName _EmailResponseForm_QNAME = new QName("", "emailResponseForm");
    private final static QName _EmailForm_QNAME = new QName("", "emailForm");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ubiquity.common.jaxb.email
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmailJAXB }
     * 
     */
    public EmailJAXB createEmailJAXB() {
        return new EmailJAXB();
    }

    /**
     * Create an instance of {@link EmailResponseJAXB }
     * 
     */
    public EmailResponseJAXB createEmailResponseJAXB() {
        return new EmailResponseJAXB();
    }

    /**
     * Create an instance of {@link EmailSentResponseJAXB }
     * 
     */
    public EmailSentResponseJAXB createEmailSentResponseJAXB() {
        return new EmailSentResponseJAXB();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailResponseJAXB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "emailResponseForm")
    public JAXBElement<EmailResponseJAXB> createEmailResponseForm(EmailResponseJAXB value) {
        return new JAXBElement<EmailResponseJAXB>(_EmailResponseForm_QNAME, EmailResponseJAXB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailJAXB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "emailForm")
    public JAXBElement<EmailJAXB> createEmailForm(EmailJAXB value) {
        return new JAXBElement<EmailJAXB>(_EmailForm_QNAME, EmailJAXB.class, null, value);
    }

}
