
package com.ubiquity.common.jaxb.personalization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for AttributeTag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeTag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attribute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attributeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tagWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeTag", propOrder = {
    "attribute",
    "attributeValue",
    "tagWeight"
})
public class AttributeTag implements Serializable{

    @XmlElement(required = true)
    protected String attribute;
    @XmlElement(required = true)
    protected String attributeValue;
    protected double tagWeight;

    public AttributeTag(){}

    public AttributeTag(String attribute, String attributeValue, double tagWeight) {
        this.attribute = attribute;
        this.attributeValue = attributeValue;
        this.tagWeight = tagWeight;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute(String value) {
        this.attribute = value;
    }

    public boolean isSetAttribute() {
        return (this.attribute!= null);
    }

    /**
     * Gets the value of the attributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * Sets the value of the attributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeValue(String value) {
        this.attributeValue = value;
    }

    public boolean isSetAttributeValue() {
        return (this.attributeValue!= null);
    }

    /**
     * Gets the value of the tagWeight property.
     * 
     */
    public double getTagWeight() {
        return tagWeight;
    }

    /**
     * Sets the value of the tagWeight property.
     * 
     */
    public void setTagWeight(double value) {
        this.tagWeight = value;
    }

    public boolean isSetTagWeight() {
        return true;
    }

    @Override
    public String toString() {
        return  attribute + "=" + attributeValue+", TagWt="+ tagWeight;
    }
}
