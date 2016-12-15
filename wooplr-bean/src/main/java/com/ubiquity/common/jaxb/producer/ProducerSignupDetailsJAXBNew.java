
package com.ubiquity.common.jaxb.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for producerSignupDetailsJAXBNew complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="producerSignupDetailsJAXBNew">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pr_adminCreated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pr_light" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pr_basic" type="{}ProducerSignupBasicDetailsJAXB" minOccurs="0"/>
 *         &lt;element name="pr_basic2" type="{}ProducerSignupBasic2DetailsJAXB" minOccurs="0"/>
 *         &lt;element name="pr_contact" type="{}producerSignupContanctDetailsJAXB" minOccurs="0"/>
 *         &lt;element name="pr_categoriestags" type="{}producerSignupCategoriesAndTagsDetailsJAXB" minOccurs="0"/>
 *         &lt;element name="pr_image" type="{}ProducerSignupImageDetailsJAXB" minOccurs="0"/>
 *         &lt;element name="pr_active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="producerid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producerSignupDetailsJAXBNew", propOrder = {
    "prAdminCreated",
    "prLight",
    "prBasic",
    "prBasic2",
    "prContact",
    "prCategoriestags",
    "prImage",
    "prActive",
    "producerid",
    "branchId"
})
public class ProducerSignupDetailsJAXBNew {

    @XmlElement(name = "pr_adminCreated")
    protected Boolean prAdminCreated;
    @XmlElement(name = "pr_light")
    protected Boolean prLight;
    @XmlElement(name = "pr_basic")
    protected ProducerSignupBasicDetailsJAXB prBasic;
    @XmlElement(name = "pr_basic2")
    protected ProducerSignupBasic2DetailsJAXB prBasic2;
    @XmlElement(name = "pr_contact")
    protected ProducerSignupContanctDetailsJAXB prContact;
    @XmlElement(name = "pr_categoriestags")
    protected ProducerSignupCategoriesAndTagsDetailsJAXB prCategoriestags;
    @XmlElement(name = "pr_image")
    protected ProducerSignupImageDetailsJAXB prImage;
    @XmlElement(name = "pr_active")
    protected Boolean prActive;
    protected long producerid;
    protected long branchId;

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
     * Gets the value of the prBasic property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerSignupBasicDetailsJAXB }
     *     
     */
    public ProducerSignupBasicDetailsJAXB getPrBasic() {
        return prBasic;
    }

    /**
     * Sets the value of the prBasic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerSignupBasicDetailsJAXB }
     *     
     */
    public void setPrBasic(ProducerSignupBasicDetailsJAXB value) {
        this.prBasic = value;
    }

    /**
     * Gets the value of the prBasic2 property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerSignupBasic2DetailsJAXB }
     *     
     */
    public ProducerSignupBasic2DetailsJAXB getPrBasic2() {
        return prBasic2;
    }

    /**
     * Sets the value of the prBasic2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerSignupBasic2DetailsJAXB }
     *     
     */
    public void setPrBasic2(ProducerSignupBasic2DetailsJAXB value) {
        this.prBasic2 = value;
    }

    /**
     * Gets the value of the prContact property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerSignupContanctDetailsJAXB }
     *     
     */
    public ProducerSignupContanctDetailsJAXB getPrContact() {
        return prContact;
    }

    /**
     * Sets the value of the prContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerSignupContanctDetailsJAXB }
     *     
     */
    public void setPrContact(ProducerSignupContanctDetailsJAXB value) {
        this.prContact = value;
    }

    /**
     * Gets the value of the prCategoriestags property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerSignupCategoriesAndTagsDetailsJAXB }
     *     
     */
    public ProducerSignupCategoriesAndTagsDetailsJAXB getPrCategoriestags() {
        return prCategoriestags;
    }

    /**
     * Sets the value of the prCategoriestags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerSignupCategoriesAndTagsDetailsJAXB }
     *     
     */
    public void setPrCategoriestags(ProducerSignupCategoriesAndTagsDetailsJAXB value) {
        this.prCategoriestags = value;
    }

    /**
     * Gets the value of the prImage property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerSignupImageDetailsJAXB }
     *     
     */
    public ProducerSignupImageDetailsJAXB getPrImage() {
        return prImage;
    }

    /**
     * Sets the value of the prImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerSignupImageDetailsJAXB }
     *     
     */
    public void setPrImage(ProducerSignupImageDetailsJAXB value) {
        this.prImage = value;
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
     * Gets the value of the branchId property.
     * 
     */
    public long getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     */
    public void setBranchId(long value) {
        this.branchId = value;
    }

}
