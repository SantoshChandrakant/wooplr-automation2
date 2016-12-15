package com.ubiquity.common.jaxb.producer;

import javax.jdo.annotations.Persistent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for producerSignupContanctDetailsJAXB complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="producerSignupContanctDetailsJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prContactemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prContactphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{}addressDetailsJAXB" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producerSignupContanctDetailsJAXB", propOrder = {
        "prContactemail",
        "prContactphone",
        "prContactPerson",
        "prContactStreet",
        "prContactArea",
        "prContactLandmark",
        "prContactCity",
        "prContactBuilding",
        "prContactPinCode",
        "address"
})
public class ProducerSignupContanctDetailsJAXB {

    protected String prContactemail;
    protected String prContactphone;
    private String prContactPerson;
    private String prContactStreet;
    private String prContactArea;
    private String prContactLandmark;
    private String prContactCity;
    private String prContactPinCode;
    private String prContactBuilding;



    protected AddressDetailsJAXB address;

    /**
     * Gets the value of the prContactemail property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPrContactemail() {
        return prContactemail;
    }

    /**
     * Sets the value of the prContactemail property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrContactemail(String value) {
        this.prContactemail = value;
    }

    /**
     * Gets the value of the prContactphone property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPrContactphone() {
        return prContactphone;
    }

    /**
     * Sets the value of the prContactphone property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrContactphone(String value) {
        this.prContactphone = value;
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

    public String getPrContactPerson() {
        return prContactPerson;
    }

    public void setPrContactPerson(String prContactPerson) {
        this.prContactPerson = prContactPerson;
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

    public String getPrContactLandmark() {
        return prContactLandmark;
    }

    public void setPrContactLandmark(String prContactLandmark) {
        this.prContactLandmark = prContactLandmark;
    }

    public String getPrContactCity() {
        return prContactCity;
    }

    public void setPrContactCity(String prContactCity) {
        this.prContactCity = prContactCity;
    }

    public String getPrContactPinCode() {
        return prContactPinCode;
    }

    public void setPrContactPinCode(String prContactPinCode) {
        this.prContactPinCode = prContactPinCode;
    }

    public String getPrContactBuilding() {
        return prContactBuilding;
    }

    public void setPrContactBuilding(String prContactBuilding) {
        this.prContactBuilding = prContactBuilding;
    }
}
