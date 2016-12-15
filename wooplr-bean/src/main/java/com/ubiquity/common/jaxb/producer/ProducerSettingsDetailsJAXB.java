
package com.ubiquity.common.jaxb.producer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for producerSettingsDetailsJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="producerSettingsDetailsJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="profileDetails" type="{}producerSignupDetailsJAXBNew"/>
 *         &lt;element name="category" type="{}producerSignupDetailsJAXB"/>
 *         &lt;element name="producerSettingFields" type="{}producerSettingFields" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producerSettingsDetailsJAXB", propOrder = {
    "id",
    "profileDetails",
    "category",
    "producerSettingFields"
})
public class ProducerSettingsDetailsJAXB {

    protected Long id;
    @XmlElement(required = true)
    protected ProducerSignupDetailsJAXBNew profileDetails;
    @XmlElement(required = true)
    protected ProducerSignupDetailsJAXB category;
    @XmlElement(nillable = true)
    protected List<ProducerSettingFields> producerSettingFields;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the profileDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerSignupDetailsJAXBNew }
     *     
     */
    public ProducerSignupDetailsJAXBNew getProfileDetails() {
        return profileDetails;
    }

    /**
     * Sets the value of the profileDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerSignupDetailsJAXBNew }
     *     
     */
    public void setProfileDetails(ProducerSignupDetailsJAXBNew value) {
        this.profileDetails = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerSignupDetailsJAXB }
     *     
     */
    public ProducerSignupDetailsJAXB getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerSignupDetailsJAXB }
     *     
     */
    public void setCategory(ProducerSignupDetailsJAXB value) {
        this.category = value;
    }

    /**
     * Gets the value of the producerSettingFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producerSettingFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducerSettingFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProducerSettingFields }
     * 
     * 
     */
    public List<ProducerSettingFields> getProducerSettingFields() {
        if (producerSettingFields == null) {
            producerSettingFields = new ArrayList<ProducerSettingFields>();
        }
        return this.producerSettingFields;
    }

}
