//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.23 at 01:30:41 AM IST 
//


package com.ubiquity.common.jaxb.attribute;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeImageJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeImageJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="attributename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
@XmlType(name = "AttributeImageJAXB", propOrder = {
    "id",
    "attributename",
    "image",
    "imageMimeType"
})
public class AttributeImageJAXB {

    protected long id;
    @XmlElement(required = true)
    protected String attributename;
    @XmlElement(required = true)
    protected byte[] image;
    @XmlElement(required = true)
    protected String imageMimeType;

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
     * Gets the value of the attributename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributename() {
        return attributename;
    }

    /**
     * Sets the value of the attributename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributename(String value) {
        this.attributename = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = ((byte[]) value);
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
