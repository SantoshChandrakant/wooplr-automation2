//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 12:20:03 PM IST 
//


package com.ubiquity.common.jaxb.ecomm;

import com.ubiquity.common.jaxb.catalog.SizeFullJAXB;
import com.ubiquity.common.jaxb.stream.Adapter1;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Date;


/**
 * <p>Java class for ecommProductSKUJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ecommProductSKUJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sku_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sku_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sku_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mpn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sales_price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="retail_price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inventory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fullfillment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipping_charge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sku_image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ecommProductSKUJAXB", propOrder = {
        "id",
    "productId",
    "skuName",
    "skuDescription",
    "skuId",
    "mpn",
    "salesPrice",
    "retailPrice",
    "taxable",
    "discount",
    "size",
    "inventory",
    "fullfillment",
    "shippingCharge",
    "createDate",
        "available",
        "barcode",
        "weight",
        "weight_unit",
        "stock"
})
public class EcommProductSKUJAXB implements Serializable {


    protected Long id;

    protected Long productId;
    @XmlElement(required = false)
    protected String skuName;
    @XmlElement(required = false)
    protected String skuDescription;
    @XmlElement(required = false)
    protected String skuId;
    @XmlElement(required = false)
    protected String mpn;
    @XmlElement(required = false)
    protected double salesPrice;
    @XmlElement(required = false)
    protected double retailPrice;
    @XmlElement(required = false)
    protected Boolean taxable;
    @XmlElement(required = false)
    protected boolean discount;

    protected String size;

    @Deprecated
    protected Integer inventory;
    @XmlElement(required = false)
    protected String fullfillment;
    @XmlElement(required = false)
    protected String shippingCharge;
//    @XmlElement(name = "sku_image_url", required = true)
//    protected String skuImageUrl;
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    @XmlElement(required = false)
    protected Date createDate;

    protected Integer stock;

    protected Boolean available;
    @XmlElement(required = false)
    protected String barcode;
    @XmlElement(required = false)
    protected String weight;
    @XmlElement(required = false)
    protected String weight_unit;
    @XmlElement(required = false)
    protected Long external_skuId;

    @XmlElement(name = "brand-size")
    protected SizeFullJAXB brandSize;
    /**
     * Gets the value of the productId property.
     * 
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the skuName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * Sets the value of the skuName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuName(String value) {
        this.skuName = value;
    }

    /**
     * Gets the value of the skuDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuDescription() {
        return skuDescription;
    }

    /**
     * Sets the value of the skuDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuDescription(String value) {
        this.skuDescription = value;
    }

    /**
     * Gets the value of the skuId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuId() {
        return skuId;
    }

    /**
     * Sets the value of the skuId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuId(String value) {
        this.skuId = value;
    }

    /**
     * Gets the value of the mpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpn() {
        return mpn;
    }

    /**
     * Sets the value of the mpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpn(String value) {
        this.mpn = value;
    }

    /**
     * Gets the value of the salesPrice property.
     * 
     */
    public double getSalesPrice() {
        return salesPrice;
    }

    /**
     * Sets the value of the salesPrice property.
     * 
     */
    public void setSalesPrice(double value) {
        this.salesPrice = value;
    }

    /**
     * Gets the value of the retailPrice property.
     * 
     */
    public double getRetailPrice() {
        return retailPrice;
    }

    /**
     * Sets the value of the retailPrice property.
     * 
     */
    public void setRetailPrice(double value) {
        this.retailPrice = value;
    }

    /**
     * Gets the value of the taxcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isTaxable() {
        return taxable;
    }

    /**
     * Sets the value of the taxcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxable(Boolean value) {
        this.taxable = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     */
    public boolean isDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     */
    public void setDiscount(boolean value) {
        this.discount = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the inventory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Deprecated
    public Integer getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Deprecated
    public void setInventory(Integer value) {
        this.inventory = value;
    }

    /**
     * Gets the value of the fullfillment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullfillment() {
        return fullfillment;
    }

    /**
     * Sets the value of the fullfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullfillment(String value) {
        this.fullfillment = value;
    }

    /**
     * Gets the value of the shippingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCharge() {
        return shippingCharge;
    }

    /**
     * Sets the value of the shippingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCharge(String value) {
        this.shippingCharge = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight_unit() {
        return weight_unit;
    }

    public void setWeight_unit(String weight_unit) {
        this.weight_unit = weight_unit;
    }

    public Boolean getTaxable() {
        return taxable;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Long getExternal_skuId() {
        return external_skuId;
    }

    public void setExternal_skuId(Long external_skuId) {
        this.external_skuId = external_skuId;
    }

    public SizeFullJAXB getBrandSize() {
        return brandSize;
    }

    public void setBrandSize(SizeFullJAXB brandSize) {
        this.brandSize = brandSize;
    }

    @Override
    public String toString() {
        return "EcommProductSKUJAXB{" +
                "id=" + id +
                ", productId=" + productId +
                ", skuName='" + skuName + '\'' +
                ", skuDescription='" + skuDescription + '\'' +
                ", skuId='" + skuId + '\'' +
                ", mpn='" + mpn + '\'' +
                ", salesPrice=" + salesPrice +
                ", retailPrice=" + retailPrice +
                ", taxable=" + taxable +
                ", discount=" + discount +
                ", size='" + size + '\'' +
                ", inventory=" + inventory +
                ", fullfillment='" + fullfillment + '\'' +
                ", shippingCharge='" + shippingCharge + '\'' +
                ", createDate=" + createDate +
                ", stock=" + stock +
                ", available=" + available +
                ", barcode='" + barcode + '\'' +
                ", weight='" + weight + '\'' +
                ", weight_unit='" + weight_unit + '\'' +
                ", external_skuId=" + external_skuId +
                ", brandSize=" + brandSize +
                '}';
    }
}
