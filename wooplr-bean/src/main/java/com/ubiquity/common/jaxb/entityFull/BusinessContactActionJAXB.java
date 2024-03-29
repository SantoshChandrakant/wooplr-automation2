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
 * <p>Java class for BusinessContactActionJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessContactActionJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userDetails" type="{}UserDetailSmallJAXB"/>
 *         &lt;element name="producerDetails" type="{}ProducerDetailSmallJAXB"/>
 *         &lt;element name="producerAddress" type="{}ProducerAddressDetailJAXB"/>
 *         &lt;element name="reviewDetails" type="{}RecommendationDetailsBasicJAXB"/>
 *         &lt;element name="producerSMSSentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="producerContactNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="producerEmailSentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="producerContactEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userSMSSentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="contactNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userEmailSentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="contactEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="contactFname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactLname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessContactActionJAXB", propOrder = {
    "userDetails",
    "producerDetails",
    "producerAddress",
    "reviewDetails",
    "producerSMSSentDate",
    "producerContactNumber",
    "producerEmailSentDate",
    "producerContactEmail",
    "userSMSSentDate",
    "contactNumber",
    "userEmailSentDate",
    "contactEmail",
    "createDate",
    "contactFname",
    "contactLname"
})
@XmlRootElement
public class BusinessContactActionJAXB
    implements Serializable
{

    private final static long serialVersionUID = 123434L;
    @XmlElement(required = true)
    protected UserDetailSmallJAXB userDetails;
    @XmlElement(required = true)
    protected ProducerDetailSmallJAXB producerDetails;
    @XmlElement(required = true)
    protected ProducerAddressDetailJAXB producerAddress;
    @XmlElement(required = true)
    protected RecommendationDetailsBasicJAXB reviewDetails;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Date producerSMSSentDate;
    @XmlElement(required = true)
    protected String producerContactNumber;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Date producerEmailSentDate;
    @XmlElement(required = true)
    protected String producerContactEmail;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Date userSMSSentDate;
    @XmlElement(required = true)
    protected String contactNumber;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Date userEmailSentDate;
    @XmlElement(required = true)
    protected String contactEmail;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Date createDate;
    @XmlElement(required = true)
    protected String contactFname;
    @XmlElement(required = true)
    protected String contactLname;

    /**
     * Gets the value of the userDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetailSmallJAXB }
     *     
     */
    public UserDetailSmallJAXB getUserDetails() {
        return userDetails;
    }

    /**
     * Sets the value of the userDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetailSmallJAXB }
     *     
     */
    public void setUserDetails(UserDetailSmallJAXB value) {
        this.userDetails = value;
    }

    public boolean isSetUserDetails() {
        return (this.userDetails!= null);
    }

    /**
     * Gets the value of the producerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerDetailSmallJAXB }
     *     
     */
    public ProducerDetailSmallJAXB getProducerDetails() {
        return producerDetails;
    }

    /**
     * Sets the value of the producerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerDetailSmallJAXB }
     *     
     */
    public void setProducerDetails(ProducerDetailSmallJAXB value) {
        this.producerDetails = value;
    }

    public boolean isSetProducerDetails() {
        return (this.producerDetails!= null);
    }

    /**
     * Gets the value of the producerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerAddressDetailJAXB }
     *     
     */
    public ProducerAddressDetailJAXB getProducerAddress() {
        return producerAddress;
    }

    /**
     * Sets the value of the producerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerAddressDetailJAXB }
     *     
     */
    public void setProducerAddress(ProducerAddressDetailJAXB value) {
        this.producerAddress = value;
    }

    public boolean isSetProducerAddress() {
        return (this.producerAddress!= null);
    }

    /**
     * Gets the value of the reviewDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RecommendationDetailsBasicJAXB }
     *     
     */
    public RecommendationDetailsBasicJAXB getReviewDetails() {
        return reviewDetails;
    }

    /**
     * Sets the value of the reviewDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendationDetailsBasicJAXB }
     *     
     */
    public void setReviewDetails(RecommendationDetailsBasicJAXB value) {
        this.reviewDetails = value;
    }

    public boolean isSetReviewDetails() {
        return (this.reviewDetails!= null);
    }

    /**
     * Gets the value of the producerSMSSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getProducerSMSSentDate() {
        return producerSMSSentDate;
    }

    /**
     * Sets the value of the producerSMSSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerSMSSentDate(Date value) {
        this.producerSMSSentDate = value;
    }

    public boolean isSetProducerSMSSentDate() {
        return (this.producerSMSSentDate!= null);
    }

    /**
     * Gets the value of the producerContactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerContactNumber() {
        return producerContactNumber;
    }

    /**
     * Sets the value of the producerContactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerContactNumber(String value) {
        this.producerContactNumber = value;
    }

    public boolean isSetProducerContactNumber() {
        return (this.producerContactNumber!= null);
    }

    /**
     * Gets the value of the producerEmailSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getProducerEmailSentDate() {
        return producerEmailSentDate;
    }

    /**
     * Sets the value of the producerEmailSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerEmailSentDate(Date value) {
        this.producerEmailSentDate = value;
    }

    public boolean isSetProducerEmailSentDate() {
        return (this.producerEmailSentDate!= null);
    }

    /**
     * Gets the value of the producerContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerContactEmail() {
        return producerContactEmail;
    }

    /**
     * Sets the value of the producerContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerContactEmail(String value) {
        this.producerContactEmail = value;
    }

    public boolean isSetProducerContactEmail() {
        return (this.producerContactEmail!= null);
    }

    /**
     * Gets the value of the userSMSSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getUserSMSSentDate() {
        return userSMSSentDate;
    }

    /**
     * Sets the value of the userSMSSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSMSSentDate(Date value) {
        this.userSMSSentDate = value;
    }

    public boolean isSetUserSMSSentDate() {
        return (this.userSMSSentDate!= null);
    }

    /**
     * Gets the value of the contactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the value of the contactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumber(String value) {
        this.contactNumber = value;
    }

    public boolean isSetContactNumber() {
        return (this.contactNumber!= null);
    }

    /**
     * Gets the value of the userEmailSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getUserEmailSentDate() {
        return userEmailSentDate;
    }

    /**
     * Sets the value of the userEmailSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEmailSentDate(Date value) {
        this.userEmailSentDate = value;
    }

    public boolean isSetUserEmailSentDate() {
        return (this.userEmailSentDate!= null);
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    public boolean isSetContactEmail() {
        return (this.contactEmail!= null);
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
     * Gets the value of the contactFname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFname() {
        return contactFname;
    }

    /**
     * Sets the value of the contactFname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFname(String value) {
        this.contactFname = value;
    }

    public boolean isSetContactFname() {
        return (this.contactFname!= null);
    }

    /**
     * Gets the value of the contactLname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLname() {
        return contactLname;
    }

    /**
     * Sets the value of the contactLname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLname(String value) {
        this.contactLname = value;
    }

    public boolean isSetContactLname() {
        return (this.contactLname!= null);
    }

}
