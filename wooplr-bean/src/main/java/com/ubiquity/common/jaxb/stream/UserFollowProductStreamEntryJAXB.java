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
 * <p>Java class for UserFollowProductStreamEntryJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserFollowProductStreamEntryJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="followId" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="entrytype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="followerDetails" type="{}StreamUserDetailJAXB"/>
 *         &lt;element name="followCount" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="productDetails" type="{}StreamProductDetailJAXB"/>
 *         &lt;element name="producerDetails" type="{}StreamProducerDetailJAXB"/>
 *         &lt;element name="branchDetails" type="{}StreamProducerBranchDetailJAXB"/>
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
@XmlType(name = "UserFollowProductStreamEntryJAXB", propOrder = {
    "followId",
    "entrytype",
    "weight",
    "timestamp",
    "followerDetails",
    "followCount",
    "productDetails",
    "producerDetails",
    "branchDetails",
    "createDate"
})
@XmlRootElement public class UserFollowProductStreamEntryJAXB
    implements Serializable
{

    private final static Long serialVersionUID = 12343L;
    protected Long followId;
    @XmlElement(required = true)
    protected String entrytype;
    protected Long weight;
    protected Long timestamp;
    @XmlElement(required = true)
    protected StreamUserDetailJAXB followerDetails;
    protected Long followCount;
    @XmlElement(required = true)
    protected StreamProductDetailJAXB productDetails;
    @XmlElement(required = true)
    protected StreamProducerDetailJAXB producerDetails;
    @XmlElement(required = true)
    protected StreamProducerBranchDetailJAXB branchDetails;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date createDate;

    /**
     * Gets the value of the followId property.
     * 
     */
    public Long getFollowId() {
        return followId;
    }

    /**
     * Sets the value of the followId property.
     * 
     */
    public void setFollowId(Long value) {
        this.followId = value;
    }

    public Boolean isSetFollowId() {
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
     * Gets the value of the followerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamUserDetailJAXB }
     *     
     */
    public StreamUserDetailJAXB getFollowerDetails() {
        return followerDetails;
    }

    /**
     * Sets the value of the followerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamUserDetailJAXB }
     *     
     */
    public void setFollowerDetails(StreamUserDetailJAXB value) {
        this.followerDetails = value;
    }

    public Boolean isSetFollowerDetails() {
        return (this.followerDetails!= null);
    }

    /**
     * Gets the value of the followCount property.
     * 
     */
    public Long getFollowCount() {
        return followCount;
    }

    /**
     * Sets the value of the followCount property.
     * 
     */
    public void setFollowCount(Long value) {
        this.followCount = value;
    }

    public Boolean isSetFollowCount() {
        return true;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamProductDetailJAXB }
     *     
     */
    public StreamProductDetailJAXB getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamProductDetailJAXB }
     *     
     */
    public void setProductDetails(StreamProductDetailJAXB value) {
        this.productDetails = value;
    }

    public Boolean isSetProductDetails() {
        return (this.productDetails!= null);
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
