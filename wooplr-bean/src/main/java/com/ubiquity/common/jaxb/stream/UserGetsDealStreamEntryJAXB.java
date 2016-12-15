//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.04 at 11:50:41 PM IST 
//


package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserGetsDealStreamEntryJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserGetsDealStreamEntryJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="userDetails" type="{}StreamUserDetailJAXB"/>
 *         &lt;element name="dealDetails" type="{}StreamDealDetailJAXB"/>
 *         &lt;element name="producerDetails" type="{}StreamProducerDetailJAXB"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserGetsDealStreamEntryJAXB", propOrder = {
    "userId",
    "userDetails",
    "dealDetails",
    "producerDetails",
    "createDate"
})
@XmlRootElement
public class   UserGetsDealStreamEntryJAXB {

    protected Long userId;
    @XmlElement(required = true)
    protected StreamUserDetailJAXB userDetails;
    @XmlElement(required = true)
    protected StreamDealDetailJAXB dealDetails;
    @XmlElement(required = true)
    protected StreamProducerDetailJAXB producerDetails;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;

    /**
     * Gets the value of the userId property.
     * 
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(Long value) {
        this.userId = value;
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

    /**
     * Gets the value of the dealDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamDealDetailJAXB }
     *     
     */
    public StreamDealDetailJAXB getDealDetails() {
        return dealDetails;
    }

    /**
     * Sets the value of the dealDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamDealDetailJAXB }
     *     
     */
    public void setDealDetails(StreamDealDetailJAXB value) {
        this.dealDetails = value;
    }

    /**
     * Gets the value of the producerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamProducerDetailJAXB }
     *     
     */
    public StreamProducerDetailJAXB getProducerDetails() {
        return producerDetails;
    }

    /**
     * Sets the value of the producerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamProducerDetailJAXB }
     *     
     */
    public void setProducerDetails(StreamProducerDetailJAXB value) {
        this.producerDetails = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

}
