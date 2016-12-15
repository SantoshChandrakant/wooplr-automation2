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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for dealReviewDetailsJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dealReviewDetailsJAXB">
 *   &lt;complexContent>
 *     &lt;extension base="{}reviewJAXB">
 *       &lt;sequence>
 *         &lt;element name="dealId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dealTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="producerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="producerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="producerProducts" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dealReviewDetailsJAXB", propOrder = {
    "dealId",
    "dealTitle",
    "producerId",
    "producerCode",
    "producerProducts"
})
public class DealReviewDetailsJAXB
    extends ReviewJAXB
    implements Serializable
{

    private final static long serialVersionUID = 123434L;
    protected long dealId;
    @XmlElement(required = true)
    protected String dealTitle;
    protected long producerId;
    protected String producerCode;
    @XmlElement(nillable = true)
    protected List<Long> producerProducts;

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

    /**
     * Gets the value of the producerId property.
     * 
     */
    public long getProducerId() {
        return producerId;
    }

    /**
     * Sets the value of the producerId property.
     * 
     */
    public void setProducerId(long value) {
        this.producerId = value;
    }

    public boolean isSetProducerId() {
        return true;
    }

    /**
     * Gets the value of the producerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerCode() {
        return producerCode;
    }

    /**
     * Sets the value of the producerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerCode(String value) {
        this.producerCode = value;
    }

    public boolean isSetProducerCode() {
        return (this.producerCode!= null);
    }

    /**
     * Gets the value of the producerProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producerProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducerProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getProducerProducts() {
        if (producerProducts == null) {
            producerProducts = new ArrayList<Long>();
        }
        return this.producerProducts;
    }

    public boolean isSetProducerProducts() {
        return ((this.producerProducts!= null)&&(!this.producerProducts.isEmpty()));
    }

    public void unsetProducerProducts() {
        this.producerProducts = null;
    }

}