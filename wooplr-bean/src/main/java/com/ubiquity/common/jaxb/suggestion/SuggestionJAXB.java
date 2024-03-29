//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.06 at 02:06:28 PM IST 
//


package com.ubiquity.common.jaxb.suggestion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suggestionJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="suggestionJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pointsId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="suggestTo" type="{}suggestedPersonJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="suggestedByUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="entityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suggestionJAXB", propOrder = {
    "id",
    "pointsId",
    "suggestTo",
    "suggestedByUserId",
    "entityId",
    "entityType",
    "message",
    "website"
})
public class SuggestionJAXB {

    protected Long id;
    protected Long pointsId;
    @XmlElement(nillable = true)
    protected List<SuggestedPersonJAXB> suggestTo;
    protected Long suggestedByUserId;
    protected long entityId;
    @XmlElement(required = true)
    protected String entityType;
    @XmlElement(required = true)
    protected String message;
    protected boolean website;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the pointsId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPointsId() {
        return pointsId;
    }

    /**
     * Sets the value of the pointsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPointsId(Long value) {
        this.pointsId = value;
    }

    /**
     * Gets the value of the suggestTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuggestedPersonJAXB }
     * 
     * 
     */
    public List<SuggestedPersonJAXB> getSuggestTo() {
        if (suggestTo == null) {
            suggestTo = new ArrayList<SuggestedPersonJAXB>();
        }
        return this.suggestTo;
    }

    /**
     * Gets the value of the suggestedByUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSuggestedByUserId() {
        return suggestedByUserId;
    }

    /**
     * Sets the value of the suggestedByUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSuggestedByUserId(Long value) {
        this.suggestedByUserId = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     */
    public long getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     */
    public void setEntityId(long value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the website property.
     * 
     */
    public boolean isWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     */
    public void setWebsite(boolean value) {
        this.website = value;
    }

}
