//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.13 at 05:19:39 PM IST 
//


package com.ubiquity.common.jaxb.entityFull;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Date;


/**
 * <p>Java class for UserNotificationJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserNotificationJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subjectDetails" type="{}UserDetailSmallJAXB"/>
 *         &lt;element name="targetUserDetails" type="{}UserDetailSmallJAXB"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="objectProducerReviewDetails" type="{}ProducerReviewSmallJAXB"/>
 *         &lt;element name="objectProductReviewDetails" type="{}ProducerProductReviewSmallJAXB"/>
 *         &lt;element name="objectUserDetails" type="{}UserDetailSmallJAXB"/>
 *         &lt;element name="objectTagDetails" type="{}EntityTagsDetailFullJAXB"/>
 *         &lt;element name="objectProducerDetails" type="{}ProducerDetailSmallJAXB"/>
 *         &lt;element name="objectProducerProductDetails" type="{}ProductDetailSmallJAXB"/>
 *         &lt;element name="notificationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="new" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserNotificationJAXB", propOrder = {
    "id",
    "subjectDetails",
    "targetUserDetails",
    "createDate",
    "objectProducerReviewDetails",
    "objectProductReviewDetails",
    "objectUserDetails",
    "objectTagDetails",
    "objectProducerDetails",
    "objectProducerProductDetails",
    "notificationType",
    "_new"
})
public class UserNotificationJAXB
    implements Serializable
{

    private final static long serialVersionUID = 123434L;
    protected Long id;
    @XmlElement(required = true)
    protected UserDetailSmallJAXB subjectDetails;
    @XmlElement(required = true)
    protected UserDetailSmallJAXB targetUserDetails;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Date createDate;
    @XmlElement(required = true)
    protected ProducerReviewSmallJAXB objectProducerReviewDetails;
    @XmlElement(required = true)
    protected ProducerProductReviewSmallJAXB objectProductReviewDetails;
    @XmlElement(required = true)
    protected UserDetailSmallJAXB objectUserDetails;
    @XmlElement(required = true)
    protected EntityTagsDetailFullJAXB objectTagDetails;
    @XmlElement(required = true)
    protected ProducerDetailSmallJAXB objectProducerDetails;
    @XmlElement(required = true)
    protected ProductDetailSmallJAXB objectProducerProductDetails;
    @XmlElement(required = true)
    protected String notificationType;
    @XmlElement(name = "new")
    protected boolean _new;

    /**
     * Gets the value of the subjectDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetailSmallJAXB }
     *     
     */
    public UserDetailSmallJAXB getSubjectDetails() {
        return subjectDetails;
    }

    /**
     * Sets the value of the subjectDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetailSmallJAXB }
     *     
     */
    public void setSubjectDetails(UserDetailSmallJAXB value) {
        this.subjectDetails = value;
    }

    public boolean isSetSubjectDetails() {
        return (this.subjectDetails!= null);
    }

    /**
     * Gets the value of the targetUserDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetailSmallJAXB }
     *     
     */
    public UserDetailSmallJAXB getTargetUserDetails() {
        return targetUserDetails;
    }

    /**
     * Sets the value of the targetUserDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetailSmallJAXB }
     *     
     */
    public void setTargetUserDetails(UserDetailSmallJAXB value) {
        this.targetUserDetails = value;
    }

    public boolean isSetTargetUserDetails() {
        return (this.targetUserDetails!= null);
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

    public boolean isSetCreateDate() {
        return (this.createDate!= null);
    }

    /**
     * Gets the value of the objectProducerReviewDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerReviewSmallJAXB }
     *     
     */
    public ProducerReviewSmallJAXB getObjectProducerReviewDetails() {
        return objectProducerReviewDetails;
    }

    /**
     * Sets the value of the objectProducerReviewDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerReviewSmallJAXB }
     *     
     */
    public void setObjectProducerReviewDetails(ProducerReviewSmallJAXB value) {
        this.objectProducerReviewDetails = value;
    }

    public boolean isSetObjectProducerReviewDetails() {
        return (this.objectProducerReviewDetails!= null);
    }

    /**
     * Gets the value of the objectProductReviewDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerProductReviewSmallJAXB }
     *     
     */
    public ProducerProductReviewSmallJAXB getObjectProductReviewDetails() {
        return objectProductReviewDetails;
    }

    /**
     * Sets the value of the objectProductReviewDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerProductReviewSmallJAXB }
     *     
     */
    public void setObjectProductReviewDetails(ProducerProductReviewSmallJAXB value) {
        this.objectProductReviewDetails = value;
    }

    public boolean isSetObjectProductReviewDetails() {
        return (this.objectProductReviewDetails!= null);
    }

    /**
     * Gets the value of the objectUserDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetailSmallJAXB }
     *     
     */
    public UserDetailSmallJAXB getObjectUserDetails() {
        return objectUserDetails;
    }

    /**
     * Sets the value of the objectUserDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetailSmallJAXB }
     *     
     */
    public void setObjectUserDetails(UserDetailSmallJAXB value) {
        this.objectUserDetails = value;
    }

    public boolean isSetObjectUserDetails() {
        return (this.objectUserDetails!= null);
    }

    /**
     * Gets the value of the objectTagDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTagsDetailFullJAXB }
     *     
     */
    public EntityTagsDetailFullJAXB getObjectTagDetails() {
        return objectTagDetails;
    }

    /**
     * Sets the value of the objectTagDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTagsDetailFullJAXB }
     *     
     */
    public void setObjectTagDetails(EntityTagsDetailFullJAXB value) {
        this.objectTagDetails = value;
    }

    public boolean isSetObjectTagDetails() {
        return (this.objectTagDetails!= null);
    }

    /**
     * Gets the value of the objectProducerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerDetailSmallJAXB }
     *     
     */
    public ProducerDetailSmallJAXB getObjectProducerDetails() {
        return objectProducerDetails;
    }

    /**
     * Sets the value of the objectProducerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerDetailSmallJAXB }
     *     
     */
    public void setObjectProducerDetails(ProducerDetailSmallJAXB value) {
        this.objectProducerDetails = value;
    }

    public boolean isSetObjectProducerDetails() {
        return (this.objectProducerDetails!= null);
    }

    /**
     * Gets the value of the objectProducerProductDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetailSmallJAXB }
     *     
     */
    public ProductDetailSmallJAXB getObjectProducerProductDetails() {
        return objectProducerProductDetails;
    }

    /**
     * Sets the value of the objectProducerProductDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetailSmallJAXB }
     *     
     */
    public void setObjectProducerProductDetails(ProductDetailSmallJAXB value) {
        this.objectProducerProductDetails = value;
    }

    public boolean isSetObjectProducerProductDetails() {
        return (this.objectProducerProductDetails!= null);
    }

    /**
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationType(String value) {
        this.notificationType = value;
    }

    public boolean isSetNotificationType() {
        return (this.notificationType!= null);
    }

    /**
     * Gets the value of the new property.
     * 
     */
    public boolean isNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     */
    public void setNew(boolean value) {
        this._new = value;
    }

    public boolean isSetNew() {
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

