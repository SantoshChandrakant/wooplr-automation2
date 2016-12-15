
package com.ubiquity.common.jaxb.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for addressDetailsJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressDetailsJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="producerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pr_building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pr_street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pr_city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pr_area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pr_landmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pr_pincode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pr_latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pr_longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressDetailsJAXB", propOrder = {
    "producerId",
    "branchId",
    "prBuilding",
    "prStreet",
    "prCity",
    "prArea",
    "prLandmark",
    "prState",
    "prCountry",
    "prFoursquareId",
    "prPincode",
        "prLatitude",
        "prLongitude",
        "prDLatitude",
        "prDLongitude"
})
public class AddressDetailsJAXB implements Serializable {

    protected Long producerId;
    protected Long branchId;
    @XmlElement(name = "pr_building")
    protected String prBuilding;
    @XmlElement(name = "pr_street")
    protected String prStreet;
    @XmlElement(name = "pr_city")
    protected String prCity;
    @XmlElement(name = "pr_area")
    protected String prArea;
    @XmlElement(name = "pr_landmark")
    protected String prLandmark;
    @XmlElement(name = "pr_State")
    protected String prState;
    @XmlElement(name = "pr_Country")
    protected String prCountry;
    @XmlElement(name = "pr_FoursquareId")
    protected String prFoursquareId;
    @XmlElement(name = "pr_pincode")
    protected String prPincode;
    @XmlElement(name = "pr_latitude")
    protected String prLatitude;
    @XmlElement(name = "pr_longitude")
    protected String prLongitude;
    @XmlElement(name = "pr_dlatitude")
    protected double prDLatitude;
    @XmlElement(name = "pr_dlongitude")
    protected double prDLongitude;

    public double getPrDLatitude() {
        return prDLatitude;
    }

    public void setPrDLatitude(double prDLatitude) {
        this.prDLatitude = prDLatitude;
    }

    public double getPrDLongitude() {
        return prDLongitude;
    }

    public void setPrDLongitude(double prDLongitude) {
        this.prDLongitude = prDLongitude;
    }




    public String getPrState() {
        return prState;
    }

    public void setPrState(String prState) {
        this.prState = prState;
    }

    public String getPrCountry() {
        return prCountry;
    }

    public void setPrCountry(String prCountry) {
        this.prCountry = prCountry;
    }

    public String getPrFoursquareId() {
        return prFoursquareId;
    }

    public void setPrFoursquareId(String prFoursquareId) {
        this.prFoursquareId = prFoursquareId;
    }

    /**
     * Gets the value of the producerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProducerId() {
        return producerId;
    }

    /**
     * Sets the value of the producerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProducerId(Long value) {
        this.producerId = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBranchId(Long value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the prBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrBuilding() {
        return prBuilding;
    }

    /**
     * Sets the value of the prBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrBuilding(String value) {
        this.prBuilding = value;
    }

    /**
     * Gets the value of the prStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrStreet() {
        return prStreet;
    }

    /**
     * Sets the value of the prStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrStreet(String value) {
        this.prStreet = value;
    }

    /**
     * Gets the value of the prCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrCity() {
        return prCity;
    }

    /**
     * Sets the value of the prCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrCity(String value) {
        this.prCity = value;
    }

    /**
     * Gets the value of the prArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrArea() {
        return prArea;
    }

    /**
     * Sets the value of the prArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrArea(String value) {
        this.prArea = value;
    }

    /**
     * Gets the value of the prLandmark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrLandmark() {
        return prLandmark;
    }

    /**
     * Sets the value of the prLandmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrLandmark(String value) {
        this.prLandmark = value;
    }

    /**
     * Gets the value of the prPincode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrPincode() {
        return prPincode;
    }

    /**
     * Sets the value of the prPincode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrPincode(String value) {
        this.prPincode = value;
    }

    /**
     * Gets the value of the prLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrLatitude() {
        return prLatitude;
    }

    /**
     * Sets the value of the prLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrLatitude(String value) {
        this.prLatitude = value;
    }

    /**
     * Gets the value of the prLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrLongitude() {
        return prLongitude;
    }

    /**
     * Sets the value of the prLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrLongitude(String value) {
        this.prLongitude = value;
    }

}
