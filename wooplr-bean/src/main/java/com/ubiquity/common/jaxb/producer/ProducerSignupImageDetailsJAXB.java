
package com.ubiquity.common.jaxb.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProducerSignupImageDetailsJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProducerSignupImageDetailsJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orphanImageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pr_image" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="imageMimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProducerSignupImageDetailsJAXB", propOrder = {
    "orphanImageId",
    "prImage",
    "imageMimeType"
})
public class ProducerSignupImageDetailsJAXB {

    protected long orphanImageId;
    @XmlElement(name = "pr_image", required = true)
    protected byte[] prImage;
    @XmlElement(required = true)
    protected String imageMimeType;

    /**
     * Gets the value of the orphanImageId property.
     * 
     */
    public long getOrphanImageId() {
        return orphanImageId;
    }

    /**
     * Sets the value of the orphanImageId property.
     * 
     */
    public void setOrphanImageId(long value) {
        this.orphanImageId = value;
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

}
