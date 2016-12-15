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
 * <p>Java class for StreamDealDetailJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreamDealDetailJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dealId" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="dealTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expiry" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="imageDetails" type="{}StreamImageDetailsJAXB"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamDealDetailJAXB", propOrder = {
    "dealId",
    "dealTitle",
    "expiry",
    "imageDetails"
})
@XmlRootElement public class StreamDealDetailJAXB
    implements Serializable
{

    private final static Long serialVersionUID = 12343L;
    protected Long dealId;
    @XmlElement(required = true)
    protected String dealTitle;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date expiry;
    @XmlElement(required = true)
    protected StreamImageDetailsJAXB imageDetails;

    /**
     * Gets the value of the dealId property.
     * 
     */
    public Long getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     * 
     */
    public void setDealId(Long value) {
        this.dealId = value;
    }

    public Boolean isSetDealId() {
        return true;
    }

    /**
     * Gets the value of the dealTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealTitle() {
        return dealTitle;
    }

    /**
     * Sets the value of the dealTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealTitle(String value) {
        this.dealTitle = value;
    }

    public Boolean isSetDealTitle() {
        return (this.dealTitle!= null);
    }

    /**
     * Gets the value of the expiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getExpiry() {
        return expiry;
    }

    /**
     * Sets the value of the expiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiry(Date value) {
        this.expiry = value;
    }

    public Boolean isSetExpiry() {
        return (this.expiry!= null);
    }

    /**
     * Gets the value of the imageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamImageDetailsJAXB }
     *     
     */
    public StreamImageDetailsJAXB getImageDetails() {
        return imageDetails;
    }

    /**
     * Sets the value of the imageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamImageDetailsJAXB }
     *     
     */
    public void setImageDetails(StreamImageDetailsJAXB value) {
        this.imageDetails = value;
    }

    public Boolean isSetImageDetails() {
        return (this.imageDetails!= null);
    }

}
