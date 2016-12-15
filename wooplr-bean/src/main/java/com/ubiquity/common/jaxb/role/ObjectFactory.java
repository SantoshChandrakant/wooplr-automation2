//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.05 at 12:51:14 AM IST 
//


package com.ubiquity.common.jaxb.role;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ubiquity.common.jaxb.role package. 
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

    private final static QName _UserRoleForm_QNAME = new QName("", "userRoleForm");
    private final static QName _RoleForm_QNAME = new QName("", "roleForm");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ubiquity.common.jaxb.role
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RoleJAXB }
     * 
     */
    public RoleJAXB createRoleJAXB() {
        return new RoleJAXB();
    }

    /**
     * Create an instance of {@link UserRoleJAXB }
     * 
     */
    public UserRoleJAXB createUserRoleJAXB() {
        return new UserRoleJAXB();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRoleJAXB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "userRoleForm")
    public JAXBElement<UserRoleJAXB> createUserRoleForm(UserRoleJAXB value) {
        return new JAXBElement<UserRoleJAXB>(_UserRoleForm_QNAME, UserRoleJAXB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleJAXB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "roleForm")
    public JAXBElement<RoleJAXB> createRoleForm(RoleJAXB value) {
        return new JAXBElement<RoleJAXB>(_RoleForm_QNAME, RoleJAXB.class, null, value);
    }

}