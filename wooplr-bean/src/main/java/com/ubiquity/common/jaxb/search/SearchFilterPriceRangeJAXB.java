
package com.ubiquity.common.jaxb.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for SearchFilterPriceRangeJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchFilterPriceRangeJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lowerLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="upperLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchFilterPriceRangeJAXB", propOrder = {
    "lowerLimit",
    "upperLimit"
})
public class SearchFilterPriceRangeJAXB implements Serializable {

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double lowerLimit;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double upperLimit;

    /**
     * Gets the value of the lowerLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Sets the value of the lowerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLowerLimit(Double value) {
        this.lowerLimit = value;
    }

    public boolean isSetLowerLimit() {
        return (this.lowerLimit!= null);
    }

    /**
     * Gets the value of the upperLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUpperLimit(Double value) {
        this.upperLimit = value;
    }

    public boolean isSetUpperLimit() {
        return (this.upperLimit!= null);
    }

    @Override
    public String toString() {
        return "{" +
                "lowerLimit=" + lowerLimit +
                ", upperLimit=" + upperLimit +
                '}';
    }
}
