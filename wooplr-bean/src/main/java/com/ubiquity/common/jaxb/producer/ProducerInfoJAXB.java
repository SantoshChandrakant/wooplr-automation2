package com.ubiquity.common.jaxb.producer;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for producerInfoJAXB complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="producerInfoJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="producerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="address" type="{}addressDetailsJAXB" minOccurs="0"/>
 *         &lt;element name="storeCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="productCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="followers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recommendations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facebookHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="twitterHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="producerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isUserFollowing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="categories" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="imageDetails" type="{}ImageDetailsJAXB"/>
 *         &lt;element name="storesAddress" type="{}addressDetailsJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producerInfoJAXB", propOrder = {
        "producerId",
        "address",
        "storeCount",
        "type",
        "productCount",
        "followers",
        "recommendations",
        "website",
        "contactEmail",
        "contactNumber",
        "contactArea",
        "contactCity",
        "contactLandMark",
        "contactStreet",
        "contactPincode",
        "contactName",
        "facebookHandle",
        "twitterHandle",
        "producerName",
        "desc",
        "storeType",
        "isUserFollowing",
        "categories",
        "imageDetails",
        "storeImageDetails",
        "pricingPlan",
        "pricingPlanEnabled",
        "storesAddress",
        "needCachSyncUp",
        "logo_pid",
        "banner_pid"
})
@XmlRootElement
public class ProducerInfoJAXB implements Serializable {

    protected Long producerId;
    protected AddressDetailsJAXB address;
    protected Integer storeCount;
    protected Integer type;
    protected Integer productCount;
    protected Integer followers;
    protected Integer recommendations;
    protected String website;
    protected String contactEmail;
    protected String contactNumber;
    protected String contactArea;
    protected String contactStreet;
    protected String contactCity;
    protected String contactLandMark;
    protected String contactPincode;
    protected String contactName;
    protected String facebookHandle;
    protected String twitterHandle;
    protected String producerName;
    protected String desc;
    protected String storeType;
    protected Boolean isUserFollowing;
    protected Boolean pricingPlanEnabled;
    protected Long pricingPlan;
    @XmlElement(nillable = true)
    protected List<String> categories;
    @XmlElement(required = true)
    protected ImageDetailsJAXB imageDetails;
    @XmlElement(required = true)
    protected ImageDetailsJAXB storeImageDetails;
    @XmlElement(nillable = true)
    protected List<AddressDetailsJAXB> storesAddress;
    @XmlElement(required = true)
    protected Boolean needCachSyncUp = false;
    protected String logo_pid;
    protected String banner_pid;
    /**
     * Gets the value of the producerId property.
     *
     * @return possible object is
     *         {@link Long }
     */
    public Long getProducerId() {
        return producerId;
    }

    /**
     * Sets the value of the producerId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setProducerId(Long value) {
        this.producerId = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return possible object is
     *         {@link AddressDetailsJAXB }
     */
    public AddressDetailsJAXB getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value allowed object is
     *              {@link AddressDetailsJAXB }
     */
    public void setAddress(AddressDetailsJAXB value) {
        this.address = value;
    }

    /**
     * Gets the value of the storeCount property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getStoreCount() {
        return storeCount;
    }

    /**
     * Sets the value of the storeCount property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setStoreCount(Integer value) {
        this.storeCount = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setType(Integer value) {
        this.type = value;
    }

    /**
     * Gets the value of the productCount property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * Sets the value of the productCount property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setProductCount(Integer value) {
        this.productCount = value;
    }

    /**
     * Gets the value of the followers property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getFollowers() {
        return followers;
    }

    /**
     * Sets the value of the followers property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setFollowers(Integer value) {
        this.followers = value;
    }

    /**
     * Gets the value of the recommendations property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getRecommendations() {
        return recommendations;
    }

    /**
     * Sets the value of the recommendations property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setRecommendations(Integer value) {
        this.recommendations = value;
    }

    /**
     * Gets the value of the website property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the contactEmail property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the contactNumber property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the value of the contactNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContactNumber(String value) {
        this.contactNumber = value;
    }

    /**
     * Gets the value of the facebookHandle property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getFacebookHandle() {
        return facebookHandle;
    }

    /**
     * Sets the value of the facebookHandle property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFacebookHandle(String value) {
        this.facebookHandle = value;
    }

    /**
     * Gets the value of the twitterHandle property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTwitterHandle() {
        return twitterHandle;
    }

    /**
     * Sets the value of the twitterHandle property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTwitterHandle(String value) {
        this.twitterHandle = value;
    }

    /**
     * Gets the value of the producerName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getProducerName() {
        return producerName;
    }

    /**
     * Sets the value of the producerName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProducerName(String value) {
        this.producerName = value;
    }

    /**
     * Gets the value of the desc property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the storeType property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStoreType() {
        return storeType;
    }

    /**
     * Sets the value of the storeType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStoreType(String value) {
        this.storeType = value;
    }

    /**
     * Gets the value of the isUserFollowing property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean getIsUserFollowing() {
        return isUserFollowing;
    }

    /**
     * Sets the value of the isUserFollowing property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsUserFollowing(Boolean value) {
        this.isUserFollowing = value;
    }

    /**
     * Gets the value of the categories property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categories property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategories().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getCategories() {
        if (categories == null) {
            categories = new ArrayList<String>();
        }
        return this.categories;
    }

    /**
     * Gets the value of the imageDetails property.
     *
     * @return possible object is
     *         {@link ImageDetailsJAXB }
     */
    public ImageDetailsJAXB getImageDetails() {
        return imageDetails;
    }

    /**
     * Sets the value of the imageDetails property.
     *
     * @param value allowed object is
     *              {@link ImageDetailsJAXB }
     */
    public void setImageDetails(ImageDetailsJAXB value) {
        this.imageDetails = value;
    }

    /**
     * Gets the value of the storesAddress property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storesAddress property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoresAddress().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressDetailsJAXB }
     */
    public List<AddressDetailsJAXB> getStoresAddress() {
        if (storesAddress == null) {
            storesAddress = new ArrayList<AddressDetailsJAXB>();
        }
        return this.storesAddress;
    }

    public String getContactArea() {
        return contactArea;
    }

    public void setContactArea(String contactArea) {
        this.contactArea = contactArea;
    }

    public String getContactStreet() {
        return contactStreet;
    }

    public void setContactStreet(String contactStreet) {
        this.contactStreet = contactStreet;
    }

    public String getContactCity() {
        return contactCity;
    }

    public void setContactCity(String contactCity) {
        this.contactCity = contactCity;
    }

    public String getContactLandMark() {
        return contactLandMark;
    }

    public void setContactLandMark(String contactLandMark) {
        this.contactLandMark = contactLandMark;
    }

    public String getContactPincode() {
        return contactPincode;
    }

    public void setContactPincode(String contactPincode) {
        this.contactPincode = contactPincode;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public ImageDetailsJAXB getStoreImageDetails() {
        return storeImageDetails;
    }

    public void setStoreImageDetails(ImageDetailsJAXB storeImageDetails) {
        this.storeImageDetails = storeImageDetails;
    }

    public Boolean getPricingPlanEnabled() {
        return pricingPlanEnabled;
    }

    public void setPricingPlanEnabled(Boolean pricingPlanEnabled) {
        this.pricingPlanEnabled = pricingPlanEnabled;
    }

    public Long getPricingPlan() {
        return pricingPlan;
    }

    public void setPricingPlan(Long pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    public Boolean getNeedCachSyncUp() {
        return needCachSyncUp;
    }

    public void setNeedCachSyncUp(Boolean needCachSyncUp) {
        this.needCachSyncUp = needCachSyncUp;
    }

    public String getLogo_pid() {
        return logo_pid;
    }

    public void setLogo_pid(String logo_pid) {
        this.logo_pid = logo_pid;
    }

    public String getBanner_pid() {
        return banner_pid;
    }

    public void setBanner_pid(String banner_pid) {
        this.banner_pid = banner_pid;
    }
}


