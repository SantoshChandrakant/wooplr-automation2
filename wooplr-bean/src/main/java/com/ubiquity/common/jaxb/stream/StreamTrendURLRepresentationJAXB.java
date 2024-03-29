//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.11 at 01:55:25 PM IST 
//


package com.ubiquity.common.jaxb.stream;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StreamTrendURLRepresentationJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreamTrendURLRepresentationJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trendKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tagId" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tagType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoryGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayTextUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="areaName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityId" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trendType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamTrendURLRepresentationJAXB", propOrder = {
    "trendKey",
    "tagId",
    "tagName",
    "tagType",
    "categoryGroup",
    "gender",
    "url",
    "displayTextUrl",
    "areaName",
    "cityId",
    "cityName",
    "categoryId",
    "categoryName",
    "trendType",
    "createDate"
})
@XmlSeeAlso({
    TrendURLRepresentationJAXB.class
})
@XmlRootElement public class StreamTrendURLRepresentationJAXB
    implements Serializable
{

    private final static Long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected String trendKey;
    protected Long tagId;
    @XmlElement(required = true)
    protected String tagName;
    @XmlElement(required = true)
    protected String tagType;
    @XmlElement(required = true)
    protected String categoryGroup;
    @XmlElement(required = true)
    protected String gender;
    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected String displayTextUrl;
    @XmlElement(required = true)
    protected String areaName;
    protected Long cityId;
    @XmlElement(required = true)
    protected String cityName;
    protected Long categoryId;
    @XmlElement(required = true)
    protected String categoryName;
    @XmlElement(required = true)
    protected String trendType;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date createDate;

    /**
     * Gets the value of the trendKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrendKey() {
        return trendKey;
    }

    /**
     * Sets the value of the trendKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrendKey(String value) {
        this.trendKey = value;
    }

    public Boolean isSetTrendKey() {
        return (this.trendKey!= null);
    }

    /**
     * Gets the value of the tagId property.
     * 
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * Sets the value of the tagId property.
     * 
     */
    public void setTagId(Long value) {
        this.tagId = value;
    }

    public Boolean isSetTagId() {
        return true;
    }

    /**
     * Gets the value of the tagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * Sets the value of the tagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagName(String value) {
        this.tagName = value;
    }

    public Boolean isSetTagName() {
        return (this.tagName!= null);
    }

    /**
     * Gets the value of the tagType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagType() {
        return tagType;
    }

    /**
     * Sets the value of the tagType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagType(String value) {
        this.tagType = value;
    }

    public Boolean isSetTagType() {
        return (this.tagType!= null);
    }

    /**
     * Gets the value of the categoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryGroup() {
        return categoryGroup;
    }

    /**
     * Sets the value of the categoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryGroup(String value) {
        this.categoryGroup = value;
    }

    public Boolean isSetCategoryGroup() {
        return (this.categoryGroup!= null);
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    public Boolean isSetGender() {
        return (this.gender!= null);
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    public Boolean isSetUrl() {
        return (this.url!= null);
    }

    /**
     * Gets the value of the displayTextUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayTextUrl() {
        return displayTextUrl;
    }

    /**
     * Sets the value of the displayTextUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayTextUrl(String value) {
        this.displayTextUrl = value;
    }

    public Boolean isSetDisplayTextUrl() {
        return (this.displayTextUrl!= null);
    }

    /**
     * Gets the value of the areaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * Sets the value of the areaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaName(String value) {
        this.areaName = value;
    }

    public Boolean isSetAreaName() {
        return (this.areaName!= null);
    }

    /**
     * Gets the value of the cityId property.
     * 
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     * 
     */
    public void setCityId(Long value) {
        this.cityId = value;
    }

    public Boolean isSetCityId() {
        return true;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    public Boolean isSetCityName() {
        return (this.cityName!= null);
    }

    /**
     * Gets the value of the categoryId property.
     * 
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     */
    public void setCategoryId(Long value) {
        this.categoryId = value;
    }

    public Boolean isSetCategoryId() {
        return true;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    public Boolean isSetCategoryName() {
        return (this.categoryName!= null);
    }

    /**
     * Gets the value of the trendType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrendType() {
        return trendType;
    }

    /**
     * Sets the value of the trendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrendType(String value) {
        this.trendType = value;
    }

    public Boolean isSetTrendType() {
        return (this.trendType!= null);
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(Date value) {
        this.createDate = value;
    }

    public Boolean isSetCreateDate() {
        return (this.createDate!= null);
    }

}
