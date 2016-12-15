
package com.ubiquity.common.jaxb.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for producerAuthenticationDetailsJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="producerAuthenticationDetailsJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pr_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pr_website" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producerAuthenticationDetailsJAXB", propOrder = {
    "id",
    "prName",
    "prWebsite"
})
public class ProducerAuthenticationDetailsJAXB {

    protected long id;
    @XmlElement(name = "pr_name")
    protected String prName;
    @XmlElement(name = "pr_website", required = true)
    protected String prWebsite;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
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

}
