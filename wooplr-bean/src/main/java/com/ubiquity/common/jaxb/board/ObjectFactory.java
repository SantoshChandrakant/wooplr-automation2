
package com.ubiquity.common.jaxb.board;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ubiquity.common.jaxb.board package. 
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

    private final static QName _UserBoardForm_QNAME = new QName("", "userBoardForm");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ubiquity.common.jaxb.board
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserBoardJAXB }
     * 
     */
    public UserBoardJAXB createUserBoardJAXB() {
        return new UserBoardJAXB();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserBoardJAXB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "userBoardForm")
    public JAXBElement<UserBoardJAXB> createUserBoardForm(UserBoardJAXB value) {
        return new JAXBElement<UserBoardJAXB>(_UserBoardForm_QNAME, UserBoardJAXB.class, null, value);
    }

}
