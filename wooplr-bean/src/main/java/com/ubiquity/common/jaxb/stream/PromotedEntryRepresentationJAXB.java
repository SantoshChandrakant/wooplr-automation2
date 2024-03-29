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
 * <p>Java class for PromotedEntryRepresentationJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotedEntryRepresentationJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promotedEntityId" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="promotedEntityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creatorDetails" type="{}StreamUserDetailJAXB"/>
 *         &lt;element name="producerDetails" type="{}StreamProducerDetailJAXB"/>
 *         &lt;element name="branchDetails" type="{}StreamProducerBranchDetailJAXB"/>
 *         &lt;element name="producerproductDetails" type="{}StreamProductDetailJAXB"/>
 *         &lt;element name="imageDetails" type="{}StreamImageDetailsJAXB"/>
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
@XmlType(name = "PromotedEntryRepresentationJAXB", propOrder = {
    "promotedEntityId",
    "promotedEntityType",
    "creatorDetails",
    "producerDetails",
    "branchDetails",
    "producerproductDetails",
    "imageDetails",
    "createDate"
})
@Deprecated
@XmlRootElement public class PromotedEntryRepresentationJAXB
    implements Serializable
{

    private final static Long serialVersionUID = 12343L;
    protected Long promotedEntityId;
    @XmlElement(required = true)
    protected String promotedEntityType;
    @XmlElement(required = true)
    protected StreamUserDetailJAXB creatorDetails;
    @XmlElement(required = true)
    protected StreamProducerDetailJAXB producerDetails;
    @XmlElement(required = true)
    protected StreamProducerBranchDetailJAXB branchDetails;
    @XmlElement(required = true)
    protected StreamProductDetailJAXB producerproductDetails;
    @XmlElement(required = true)
    protected StreamImageDetailsJAXB imageDetails;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date createDate;

    /**
     * Gets the value of the promotedEntityId property.
     * 
     */
    public Long getPromotedEntityId() {
        return promotedEntityId;
    }

    /**
     * Sets the value of the promotedEntityId property.
     * 
     */
    public void setPromotedEntityId(Long value) {
        this.promotedEntityId = value;
    }

    public Boolean isSetPromotedEntityId() {
        return true;
    }

    /**
     * Gets the value of the promotedEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotedEntityType() {
        return promotedEntityType;
    }

    /**
     * Sets the value of the promotedEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotedEntityType(String value) {
        this.promotedEntityType = value;
    }

    public Boolean isSetPromotedEntityType() {
        return (this.promotedEntityType!= null);
    }

    /**
     * Gets the value of the creatorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamUserDetailJAXB }
     *     
     */
    public StreamUserDetailJAXB getCreatorDetails() {
        return creatorDetails;
    }

    /**
     * Sets the value of the creatorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamUserDetailJAXB }
     *     
     */
    public void setCreatorDetails(StreamUserDetailJAXB value) {
        this.creatorDetails = value;
    }

    public Boolean isSetCreatorDetails() {
        return (this.creatorDetails!= null);
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

    public Boolean isSetProducerDetails() {
        return (this.producerDetails!= null);
    }

    /**
     * Gets the value of the branchDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamProducerBranchDetailJAXB }
     *     
     */
    public StreamProducerBranchDetailJAXB getBranchDetails() {
        return branchDetails;
    }

    /**
     * Sets the value of the branchDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamProducerBranchDetailJAXB }
     *     
     */
    public void setBranchDetails(StreamProducerBranchDetailJAXB value) {
        this.branchDetails = value;
    }

    public Boolean isSetBranchDetails() {
        return (this.branchDetails!= null);
    }

    /**
     * Gets the value of the producerproductDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamProductDetailJAXB }
     *     
     */
    public StreamProductDetailJAXB getProducerproductDetails() {
        return producerproductDetails;
    }

    /**
     * Sets the value of the producerproductDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamProductDetailJAXB }
     *     
     */
    public void setProducerproductDetails(StreamProductDetailJAXB value) {
        this.producerproductDetails = value;
    }

    public Boolean isSetProducerproductDetails() {
        return (this.producerproductDetails!= null);
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

}
