
package com.ubiquity.common.jaxb.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProducerSignupBasicDetailsJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProducerSignupBasicDetailsJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="producercode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prPass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prConfirmpass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProducerSignupBasicDetailsJAXB", propOrder = {
    "prEmail",
    "producercode",
    "prPass",
    "prConfirmpass"
})
public class ProducerSignupBasicDetailsJAXB {

    protected String prEmail;
    @XmlElement(required = true)
    protected String producercode;
    @XmlElement(required = true)
    protected String prPass;
    @XmlElement(required = true)
    protected String prConfirmpass;

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

}
