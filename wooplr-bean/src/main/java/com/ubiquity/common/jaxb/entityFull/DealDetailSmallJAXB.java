//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.13 at 05:19:39 PM IST 
//


package com.ubiquity.common.jaxb.entityFull;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for DealDetailSmallJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealDetailSmallJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dealId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dealTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealDetailSmallJAXB", propOrder = {
    "dealId",
    "dealTitle"
})
public class DealDetailSmallJAXB
    implements Serializable
{

    private final static long serialVersionUID = 123434L;
    protected long dealId;
    @XmlElement(required = true)
    protected String dealTitle;

    /**
     * Gets the value of the dealId property.
     * 
     */
    public long getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     * 
     */
    public void setDealId(long value) {
        this.dealId = value;
    }

    public boolean isSetDealId() {
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

    public boolean isSetDealTitle() {
        return (this.dealTitle!= null);
    }

}