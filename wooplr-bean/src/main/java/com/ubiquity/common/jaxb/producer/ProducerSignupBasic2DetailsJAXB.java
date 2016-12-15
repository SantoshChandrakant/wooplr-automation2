
package com.ubiquity.common.jaxb.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProducerSignupBasic2DetailsJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProducerSignupBasic2DetailsJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isUserCreated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="molo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sourceUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="prType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prWebsite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prFacebookpage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prTwitterpage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProducerSignupBasic2DetailsJAXB", propOrder = {
    "prName",
    "isUserCreated",
    "molo",
    "sourceUserId",
    "prType",
    "prWebsite",
    "prFacebookpage",
    "prTwitterpage",
    "prDesc"
})
public class ProducerSignupBasic2DetailsJAXB {

    protected String prName;
    protected Boolean isUserCreated;
    protected Boolean molo;
    protected Long sourceUserId;
    protected int prType;
    @XmlElement(required = true)
    protected String prWebsite;
    @XmlElement(required = true)
    protected String prFacebookpage;
    @XmlElement(required = true)
    protected String prTwitterpage;
    @XmlElement(required = true)
    protected String prDesc;

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
     * Gets the value of the isUserCreated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsUserCreated() {
        return isUserCreated;
    }

    /**
     * Sets the value of the isUserCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUserCreated(Boolean value) {
        this.isUserCreated = value;
    }

    /**
     * Gets the value of the molo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMolo() {
        return molo;
    }

    /**
     * Sets the value of the molo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMolo(Boolean value) {
        this.molo = value;
    }

    /**
     * Gets the value of the sourceUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceUserId() {
        return sourceUserId;
    }

    /**
     * Sets the value of the sourceUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceUserId(Long value) {
        this.sourceUserId = value;
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
     * Gets the value of the prFacebookpage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrFacebookpage() {
        return prFacebookpage;
    }

    /**
     * Sets the value of the prFacebookpage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrFacebookpage(String value) {
        this.prFacebookpage = value;
    }

    /**
     * Gets the value of the prTwitterpage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrTwitterpage() {
        return prTwitterpage;
    }

    /**
     * Sets the value of the prTwitterpage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrTwitterpage(String value) {
        this.prTwitterpage = value;
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

}
