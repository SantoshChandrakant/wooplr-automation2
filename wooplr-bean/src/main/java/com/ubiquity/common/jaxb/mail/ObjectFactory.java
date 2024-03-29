
package com.ubiquity.common.jaxb.mail;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ubiquity.common.jaxb.mail package. 
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

    private final static QName _EmailForm_QNAME = new QName("", "emailForm");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ubiquity.common.jaxb.mail
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmailDetailsJAXB }
     * 
     */
    public EmailDetailsJAXB createEmailDetailsJAXB() {
        return new EmailDetailsJAXB();
    }

    /**
     * Create an instance of {@link EmailMessageJAXB }
     * 
     */
    public EmailMessageJAXB createEmailMessageJAXB() {
        return new EmailMessageJAXB();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailDetailsJAXB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "emailForm")
    public JAXBElement<EmailDetailsJAXB> createEmailForm(EmailDetailsJAXB value) {
        return new JAXBElement<EmailDetailsJAXB>(_EmailForm_QNAME, EmailDetailsJAXB.class, null, value);
    }

}
