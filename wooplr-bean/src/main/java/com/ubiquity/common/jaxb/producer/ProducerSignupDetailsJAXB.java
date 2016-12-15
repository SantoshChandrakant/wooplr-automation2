
package com.ubiquity.common.jaxb.producer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for producerSignupDetailsJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="producerSignupDetailsJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categories" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facebookHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="twitterHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="producerid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="producercode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pr_pass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pr_confirmpass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pr_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pr_email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pr_image" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="imageMimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pr_type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pr_desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{}addressDetailsJAXB"/>
 *         &lt;element name="pr_contactname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pr_contactemail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pr_contactphone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pr_website" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pr_adminCreated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pr_light" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pr_active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pr_MOLO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producerSignupDetailsJAXB", propOrder = {
    "categories",
    "tags",
    "facebookHandle",
    "twitterHandle",
    "producerid",
    "producercode",
    "prPass",
    "prConfirmpass",
    "prName",
    "prEmail",
    "prImage",
    "imageMimeType",
    "prType",
    "prDesc",
    "address",
    "prContactname",
    "prContactemail",
    "prContactphone",
    "prContactStreet",
    "prContactPincode",
    "prContactCity",
    "prContactArea",
    "prContactLandMark",
    "prContactBuilding",
    "prWebsite",
    "prAdminCreated",
    "prLight",
    "prActive",
    "prMOLO",
    "prResetPassword"
})
public class ProducerSignupDetailsJAXB {

    @XmlElement(nillable = true)
    protected List<String> categories;
    protected String tags;
    protected String facebookHandle;
    protected String twitterHandle;
    protected long producerid;
    @XmlElement(required = true)
    protected String producercode;
    @XmlElement(name = "pr_pass", required = true)
    protected String prPass;
    @XmlElement(name = "pr_confirmpass", required = true)
    protected String prConfirmpass;
    @XmlElement(name = "pr_name", required = true)
    protected String prName;
    @XmlElement(name = "pr_email", required = true)
    protected String prEmail;
    @XmlElement(name = "pr_image", required = true)
    protected byte[] prImage;
    @XmlElement(required = true)
    protected String imageMimeType;
    @XmlElement(name = "pr_type")
    protected int prType;
    @XmlElement(name = "pr_desc", required = true)
    protected String prDesc;
    @XmlElement(required = true)
    protected AddressDetailsJAXB address;
    @XmlElement(name = "pr_contactname", required = true)
    protected String prContactname;
    @XmlElement(name = "pr_contactemail", required = true)
    protected String prContactemail;
    @XmlElement(name = "pr_contactphone", required = true)
    protected String prContactphone;
    @XmlElement(name = "pr_contactphone", required = true)
    protected String prContactStreet;
    @XmlElement(name = "pr_contactphone", required = true)
    protected String prContactArea;
    @XmlElement(name = "pr_contactphone", required = true)
    protected String prContactCity;
    @XmlElement(name = "pr_contactphone", required = true)
    protected String prContactLandMark;
    @XmlElement(name = "pr_contactphone", required = true)
    protected String prContactBuilding;
    @XmlElement(name = "pr_contactphone", required = true)
    protected String prContactPincode;
    @XmlElement(name = "pr_website", required = true)
    protected String prWebsite;
    @XmlElement(name = "pr_adminCreated")
    protected Boolean prAdminCreated;
    @XmlElement(name = "pr_light")
    protected Boolean prLight;
    @XmlElement(name = "pr_active")
    protected Boolean prActive;
    @XmlElement(name = "pr_MOLO")
    protected Boolean prMOLO;
    @XmlElement(name = "pr_resetPassword")
    protected Boolean prResetPassword;

    /**
     * Gets the value of the categories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCategories() {
        if (categories == null) {
            categories = new ArrayList<String>();
        }
        return this.categories;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTags(String value) {
        this.tags = value;
    }

    /**
     * Gets the value of the facebookHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebookHandle() {
        return facebookHandle;
    }

    /**
     * Sets the value of the facebookHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebookHandle(String value) {
        this.facebookHandle = value;
    }

    /**
     * Gets the value of the twitterHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwitterHandle() {
        return twitterHandle;
    }

    /**
     * Sets the value of the twitterHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwitterHandle(String value) {
        this.twitterHandle = value;
    }

    /**
     * Gets the value of the producerid property.
     * 
     */
    public long getProducerid() {
        return producerid;
    }

    /**
     * Sets the value of the producerid property.
     * 
     */
    public void setProducerid(long value) {
        this.producerid = value;
    }

    /**
     * Gets the value of the producercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducercode() {
        return producercode;
    }

    /**
     * Sets the value of the producercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducercode(String value) {
        this.producercode = value;
    }

    /**
     * Gets the value of the prPass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrPass() {
        return prPass;
    }

    /**
     * Sets the value of the prPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrPass(String value) {
        this.prPass = value;
    }

    /**
     * Gets the value of the prConfirmpass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrConfirmpass() {
        return prConfirmpass;
    }

    /**
     * Sets the value of the prConfirmpass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrConfirmpass(String value) {
        this.prConfirmpass = value;
    }

    /**
     * Gets the value of the prName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrName() {
        return prName;
    }

    /**
     * Sets the value of the prName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrName(String value) {
        this.prName = value;
    }

    /**
     * Gets the value of the prEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrEmail() {
        return prEmail;
    }

    /**
     * Sets the value of the prEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrEmail(String value) {
        this.prEmail = value;
    }

    /**
     * Gets the value of the prImage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPrImage() {
        return prImage;
    }

    /**
     * Sets the value of the prImage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPrImage(byte[] value) {
        this.prImage = ((byte[]) value);
    }

    /**
     * Gets the value of the imageMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageMimeType() {
        return imageMimeType;
    }

    /**
     * Sets the value of the imageMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageMimeType(String value) {
        this.imageMimeType = value;
    }

    /**
     * Gets the value of the prType property.
     * 
     */
    public int getPrType() {
        return prType;
    }

    /**
     * Sets the value of the prType property.
     * 
     */
    public void setPrType(int value) {
        this.prType = value;
    }

    /**
     * Gets the value of the prDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrDesc() {
        return prDesc;
    }

    /**
     * Sets the value of the prDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrDesc(String value) {
        this.prDesc = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailsJAXB }
     *     
     */
    public AddressDetailsJAXB getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailsJAXB }
     *     
     */
    public void setAddress(AddressDetailsJAXB value) {
        this.address = value;
    }

    /**
     * Gets the value of the prContactname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrContactname() {
        return prContactname;
    }

    /**
     * Sets the value of the prContactname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrContactname(String value) {
        this.prContactname = value;
    }

    /**
     * Gets the value of the prContactemail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrContactemail() {
        return prContactemail;
    }

    /**
     * Sets the value of the prContactemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrContactemail(String value) {
        this.prContactemail = value;
    }

    /**
     * Gets the value of the prContactphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrContactphone() {
        return prContactphone;
    }

    /**
     * Sets the value of the prContactphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrContactphone(String value) {
        this.prContactphone = value;
    }

    /**
     * Gets the value of the prWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrWebsite() {
        return prWebsite;
    }

    /**
     * Sets the value of the prWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrWebsite(String value) {
        this.prWebsite = value;
    }

    /**
     * Gets the value of the prAdminCreated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPrAdminCreated() {
        return prAdminCreated;
    }

    /**
     * Sets the value of the prAdminCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrAdminCreated(Boolean value) {
        this.prAdminCreated = value;
    }

    /**
     * Gets the value of the prLight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPrLight() {
        return prLight;
    }

    /**
     * Sets the value of the prLight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrLight(Boolean value) {
        this.prLight = value;
    }

    /**
     * Gets the value of the prActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPrActive() {
        return prActive;
    }

    /**
     * Sets the value of the prActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrActive(Boolean value) {
        this.prActive = value;
    }

    /**
     * Gets the value of the prMOLO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPrMOLO() {
        return prMOLO;
    }

    /**
     * Sets the value of the prMOLO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrMOLO(Boolean value) {
        this.prMOLO = value;
    }

    public String getPrContactStreet() {
        return prContactStreet;
    }

    public void setPrContactStreet(String prContactStreet) {
        this.prContactStreet = prContactStreet;
    }

    public String getPrContactArea() {
        return prContactArea;
    }

    public void setPrContactArea(String prContactArea) {
        this.prContactArea = prContactArea;
    }

    public String getPrContactCity() {
        return prContactCity;
    }

    public void setPrContactCity(String prContactCity) {
        this.prContactCity = prContactCity;
    }

    public String getPrContactLandMark() {
        return prContactLandMark;
    }

    public void setPrContactLandMark(String prContactLandMark) {
        this.prContactLandMark = prContactLandMark;
    }

    public String getPrContactPincode() {
        return prContactPincode;
    }

    public void setPrContactPincode(String prContactPincode) {
        this.prContactPincode = prContactPincode;
    }

    public String getPrContactBuilding() {
        return prContactBuilding;
    }

    public void setPrContactBuilding(String prContactBuilding) {
        this.prContactBuilding = prContactBuilding;
    }

    public Boolean getPrResetPassword() {
        return prResetPassword;
    }

    public void setPrResetPassword(Boolean prResetPassword) {
        this.prResetPassword = prResetPassword;
    }
}
