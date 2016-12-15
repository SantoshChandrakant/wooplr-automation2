package com.ubiquity.common.jaxb.ecomm;

/**
 * Created by pmundhra on 29/12/15.
 */

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * <p>Java class for ECommStoreRuleJAXB complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ECommStoreRuleJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="storeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECommStoreRuleJAXB", propOrder = {
        "id",
        "type",
        "storeId",
        "category",
        "low",
        "high",
        "value",
        "unit"})
public class ECommStoreRuleJAXB implements Serializable {
    protected Long id;
    protected String type;
    protected Long storeId;
    protected String category;
    protected Long low;
    protected Long high;
    protected String value;
    protected String unit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getLow() {
        return low;
    }

    public void setLow(Long low) {
        this.low = low;
    }

    public Long getHigh() {
        return high;
    }

    public void setHigh(Long high) {
        this.high = high;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "ECommStoreRuleJAXB{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", storeId=" + storeId +
                ", category='" + category + '\'' +
                ", low=" + low +
                ", high=" + high +
                ", value='" + value + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
