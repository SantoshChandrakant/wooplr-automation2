//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.07 at 01:05:27 PM IST 
//


package com.ubiquity.common.jaxb.privatebetauser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivateBetaUserJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivateBetaUserJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inviteCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alreadyRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="emailsent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivateBetaUserJAXB", propOrder = {
    "email",
    "name",
    "inviteCode",
    "alreadyRegistered",
    "emailsent"
})
public class PrivateBetaUserJAXB {

    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String inviteCode;
    protected boolean alreadyRegistered;
    protected boolean emailsent;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the inviteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviteCode() {
        return inviteCode;
    }

    /**
     * Sets the value of the inviteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviteCode(String value) {
        this.inviteCode = value;
    }

    /**
     * Gets the value of the alreadyRegistered property.
     * 
     */
    public boolean isAlreadyRegistered() {
        return alreadyRegistered;
    }

    /**
     * Sets the value of the alreadyRegistered property.
     * 
     */
    public void setAlreadyRegistered(boolean value) {
        this.alreadyRegistered = value;
    }

    /**
     * Gets the value of the emailsent property.
     * 
     */
    public boolean isEmailsent() {
        return emailsent;
    }

    /**
     * Sets the value of the emailsent property.
     * 
     */
    public void setEmailsent(boolean value) {
        this.emailsent = value;
    }

}
