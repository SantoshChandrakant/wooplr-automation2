//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.11 at 01:55:25 PM IST 
//


package com.ubiquity.common.jaxb.stream;

import java.io.Serializable;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StreamImageJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreamImageJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imgUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isHyperLink" type="{http://www.w3.org/2001/XMLSchema}Boolean"/>
 *         &lt;element name="HyperLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamImageJAXB", propOrder = {
    "imgUrl",
    "displayText",
    "isHyperLink",
    "hyperLink"
})
@XmlRootElement public class StreamImageJAXB
    implements Serializable
{

    private final static Long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected String imgUrl;
    @XmlElement(required = true)
    protected String displayText;
    protected Boolean isHyperLink;
    @XmlElement(name = "HyperLink", required = true)
    protected String hyperLink;

    /**
     * Gets the value of the imgUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * Sets the value of the imgUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgUrl(String value) {
        this.imgUrl = value;
    }

    public Boolean isSetImgUrl() {
        return (this.imgUrl!= null);
    }

    /**
     * Gets the value of the displayText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayText(String value) {
        this.displayText = value;
    }

    public Boolean isSetDisplayText() {
        return (this.displayText!= null);
    }

    /**
     * Gets the value of the isHyperLink property.
     * 
     */
    public Boolean isIsHyperLink() {
        return isHyperLink;
    }

    /**
     * Sets the value of the isHyperLink property.
     * 
     */
    public void setIsHyperLink(Boolean value) {
        this.isHyperLink = value;
    }

    public Boolean isSetIsHyperLink() {
        return true;
    }

    /**
     * Gets the value of the hyperLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyperLink() {
        return hyperLink;
    }

    /**
     * Sets the value of the hyperLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyperLink(String value) {
        this.hyperLink = value;
    }

    public Boolean isSetHyperLink() {
        return (this.hyperLink!= null);
    }

}
