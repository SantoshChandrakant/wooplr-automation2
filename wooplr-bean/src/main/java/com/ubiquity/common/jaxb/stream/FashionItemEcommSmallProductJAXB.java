//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.11 at 01:55:25 PM IST 
//


package com.ubiquity.common.jaxb.stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FashionItemEcommSmallProductJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FashionItemEcommSmallProductJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fashionItem" type="{}FashionItemJAXB"/>
 *         &lt;element name="productList" type="{}StreamEcommProductJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FashionItemEcommSmallProductJAXB", propOrder = {
    "fashionItemId",
    "productList",
        "productCount"
})
@XmlRootElement public class FashionItemEcommSmallProductJAXB
    implements Serializable
{

    private final static Long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected Long fashionItemId;
    @XmlElement(nillable = true)
    protected List<StreamEcommProductJAXB> productList;
    @XmlElement(required = true)
    protected Integer productCount;

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getProductCount() {
        return productCount;
    }

    /**
     * Gets the value of the fashionItem property.
     * 
     * @return
     *     possible object is
     *     {@link FashionItemJAXB }
     *     
     */
    public Long getFashionItem() {
        return fashionItemId;
    }

    /**
     * Sets the value of the fashionItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link FashionItemJAXB }
     *     
     */
    public void setFashionItem(Long value) {
        this.fashionItemId = value;
    }

    public Boolean isSetFashionItem() {
        return (this.fashionItemId!= null);
    }

    /**
     * Gets the value of the productList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreamEcommProductJAXB }
     * 
     * 
     */
    public List<StreamEcommProductJAXB> getProductList() {
        if (productList == null) {
            productList = new ArrayList<StreamEcommProductJAXB>();
        }
        return productList;
    }

    public void setProductList(List<StreamEcommProductJAXB> productList) {
        this.productList = productList;
    }

    public Boolean isSetProductList() {
        return ((this.productList!= null)&&(!this.productList.isEmpty()));
    }

    public void unsetProductList() {
        this.productList = null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FashionItemEcommSmallProductJAXB{");
        sb.append("fashionItemId=").append(fashionItemId);
        sb.append(", productList=").append(productList);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FashionItemEcommSmallProductJAXB that = (FashionItemEcommSmallProductJAXB) o;

        if (fashionItemId != null ? !fashionItemId.equals(that.fashionItemId) : that.fashionItemId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return fashionItemId != null ? fashionItemId.hashCode() : 0;
    }
}