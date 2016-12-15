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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProducerProductEntryExtendedRepresentationJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProducerProductEntryExtendedRepresentationJAXB">
 *   &lt;complexContent>
 *     &lt;extension base="{}ProducerProductEntryRepresentationJAXB">
 *       &lt;sequence>
 *         &lt;element name="deals" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="stores" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="tryCount" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="wishCount" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="userTried" type="{http://www.w3.org/2001/XMLSchema}Boolean"/>
 *         &lt;element name="userWish" type="{http://www.w3.org/2001/XMLSchema}Boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProducerProductEntryExtendedRepresentationJAXB", propOrder = {
    "deals",
    "stores",
    "tryCount",
    "wishCount",
    "userTried",
    "userWish"
})
@XmlRootElement public class ProducerProductEntryExtendedRepresentationJAXB
    extends ProducerProductEntryRepresentationJAXB
    implements Serializable
{

    private final static Long serialVersionUID = 12343L;
    protected Long deals;
    protected Long stores;
    protected Long tryCount;
    protected Long wishCount;
    protected Boolean userTried;
    protected Boolean userWish;

    /**
     * Gets the value of the deals property.
     * 
     */
    public Long getDeals() {
        return deals;
    }

    /**
     * Sets the value of the deals property.
     * 
     */
    public void setDeals(Long value) {
        this.deals = value;
    }

    public Boolean isSetDeals() {
        return true;
    }

    /**
     * Gets the value of the stores property.
     * 
     */
    public Long getStores() {
        return stores;
    }

    /**
     * Sets the value of the stores property.
     * 
     */
    public void setStores(Long value) {
        this.stores = value;
    }

    public Boolean isSetStores() {
        return true;
    }

    /**
     * Gets the value of the tryCount property.
     * 
     */
    public Long getTryCount() {
        return tryCount;
    }

    /**
     * Sets the value of the tryCount property.
     * 
     */
    public void setTryCount(Long value) {
        this.tryCount = value;
    }

    public Boolean isSetTryCount() {
        return true;
    }

    /**
     * Gets the value of the wishCount property.
     * 
     */
    public Long getWishCount() {
        return wishCount;
    }

    /**
     * Sets the value of the wishCount property.
     * 
     */
    public void setWishCount(Long value) {
        this.wishCount = value;
    }

    public Boolean isSetWishCount() {
        return true;
    }

    /**
     * Gets the value of the userTried property.
     * 
     */
    public Boolean isUserTried() {
        return userTried;
    }

    /**
     * Sets the value of the userTried property.
     * 
     */
    public void setUserTried(Boolean value) {
        this.userTried = value;
    }

    public Boolean isSetUserTried() {
        return true;
    }

    /**
     * Gets the value of the userWish property.
     * 
     */
    public Boolean isUserWish() {
        return userWish;
    }

    /**
     * Sets the value of the userWish property.
     * 
     */
    public void setUserWish(Boolean value) {
        this.userWish = value;
    }

    public Boolean isSetUserWish() {
        return true;
    }

}
