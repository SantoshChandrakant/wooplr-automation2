//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.13 at 07:36:00 PM IST 
//


package com.ubiquity.common.jaxb.rating;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for producerProductCombinedJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="producerProductCombinedJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="producerProductRating" type="{}producerProductRatingJAXB" minOccurs="0"/>
 *         &lt;element name="userRating" type="{}userRatingJAXB" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producerProductCombinedJAXB", propOrder = {
    "producerProductRating",
    "userRating"
})
@XmlRootElement
public class ProducerProductCombinedJAXB {

    protected RatingJAXB producerProductRating;
    protected UserRatingJAXB userRating;

    /**
     * Gets the value of the producerProductRating property.
     * 
     * @return
     *     possible object is
     *     {@link RatingJAXB }
     *     
     */
    public RatingJAXB getProducerProductRating() {
        return producerProductRating;
    }

    /**
     * Sets the value of the producerProductRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingJAXB }
     *     
     */
    public void setProducerProductRating(RatingJAXB value) {
        this.producerProductRating = value;
    }

    /**
     * Gets the value of the userRating property.
     * 
     * @return
     *     possible object is
     *     {@link UserRatingJAXB }
     *     
     */
    public UserRatingJAXB getUserRating() {
        return userRating;
    }

    /**
     * Sets the value of the userRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRatingJAXB }
     *     
     */
    public void setUserRating(UserRatingJAXB value) {
        this.userRating = value;
    }

}