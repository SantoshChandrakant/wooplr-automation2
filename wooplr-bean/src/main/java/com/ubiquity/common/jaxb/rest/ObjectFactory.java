
package com.ubiquity.common.jaxb.rest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ubiquity.common.jaxb.rest package. 
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

    private final static QName _Keys_QNAME = new QName("", "keys");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ubiquity.common.jaxb.rest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RestKeys }
     * 
     */
    public RestKeys createRestKeys() {
        return new RestKeys();
    }

    /**
     * Create an instance of {@link MobileInviteWrapper }
     * 
     */
    public MobileInviteWrapper createMobileInviteWrapper() {
        return new MobileInviteWrapper();
    }

    /**
     * Create an instance of {@link MobileInvite }
     * 
     */
    public MobileInvite createMobileInvite() {
        return new MobileInvite();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestKeys }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "keys")
    public JAXBElement<RestKeys> createKeys(RestKeys value) {
        return new JAXBElement<RestKeys>(_Keys_QNAME, RestKeys.class, null, value);
    }

}
