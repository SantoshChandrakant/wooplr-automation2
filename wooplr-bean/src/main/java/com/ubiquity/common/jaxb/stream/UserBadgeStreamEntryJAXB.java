//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.11 at 01:55:25 PM IST 
//


package com.ubiquity.common.jaxb.stream;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for UserBadgeStreamEntryJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserBadgeStreamEntryJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="entrytype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="badgeDetails" type="{}StreamBadgeDetailJAXB"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="userDetails" type="{}StreamUserDetailJAXB"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserBadgeStreamEntryJAXB", propOrder = {
    "id",
    "entrytype",
    "weight",
    "timestamp",
    "badgeDetails",
    "createDate",
    "userDetails"
})
@XmlRootElement public class UserBadgeStreamEntryJAXB
    implements Serializable
{

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    @XmlElement(required = true)
    protected String entrytype;
    protected Long weight;
    protected Long timestamp;
    @XmlElement(required = true)
    protected StreamBadgeDetailJAXB badgeDetails;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date createDate;
    @XmlElement(required = true)
    protected StreamUserDetailJAXB userDetails;

    /**
     * Gets the value of the id property.
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(Long value) {
        this.id = value;
    }

    public Boolean isSetId() {
        return true;
    }

    /**
     * Gets the value of the entrytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrytype() {
        return entrytype;
    }

    /**
     * Sets the value of the entrytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrytype(String value) {
        this.entrytype = value;
    }

    public Boolean isSetEntrytype() {
        return (this.entrytype!= null);
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public Long getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(Long value) {
        this.weight = value;
    }

    public Boolean isSetWeight() {
        return true;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     */
    public void setTimestamp(Long value) {
        this.timestamp = value;
    }

    public Boolean isSetTimestamp() {
        return true;
    }

    /**
     * Gets the value of the badgeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamBadgeDetailJAXB }
     *     
     */
    public StreamBadgeDetailJAXB getBadgeDetails() {
        return badgeDetails;
    }

    /**
     * Sets the value of the badgeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamBadgeDetailJAXB }
     *     
     */
    public void setBadgeDetails(StreamBadgeDetailJAXB value) {
        this.badgeDetails = value;
    }

    public Boolean isSetBadgeDetails() {
        return (this.badgeDetails!= null);
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(Date value) {
        this.createDate = value;
    }

    public Boolean isSetCreateDate() {
        return (this.createDate!= null);
    }

    /**
     * Gets the value of the userDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamUserDetailJAXB }
     *     
     */
    public StreamUserDetailJAXB getUserDetails() {
        return userDetails;
    }

    /**
     * Sets the value of the userDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamUserDetailJAXB }
     *     
     */
    public void setUserDetails(StreamUserDetailJAXB value) {
        this.userDetails = value;
    }

    public Boolean isSetUserDetails() {
        return (this.userDetails!= null);
    }

}
