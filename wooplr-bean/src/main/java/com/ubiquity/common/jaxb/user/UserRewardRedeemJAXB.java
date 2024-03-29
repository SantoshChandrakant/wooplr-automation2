//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.20 at 03:37:02 PM IST 
//


package com.ubiquity.common.jaxb.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userRewardRedeemJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userRewardRedeemJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{}userAddressDetailsJAXB" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}Long" minOccurs="0"/>
 *         &lt;element name="rewardId" type="{http://www.w3.org/2001/XMLSchema}Long" minOccurs="0"/>
 *         &lt;element name="points" type="{http://www.w3.org/2001/XMLSchema}Integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userRewardRedeemJAXB", propOrder = {
    "address",
    "userId",
    "rewardId",
    "points"
})
public class UserRewardRedeemJAXB
    implements Serializable
{

    private final static Long serialVersionUID = 12344L;
    protected UserAddressDetailsJAXB address;
    protected Long userId;
    protected Long rewardId;
    protected Integer points;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link UserAddressDetailsJAXB }
     *     
     */
    public UserAddressDetailsJAXB getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAddressDetailsJAXB }
     *     
     */
    public void setAddress(UserAddressDetailsJAXB value) {
        this.address = value;
    }

    public Boolean isSetAddress() {
        return (this.address!= null);
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    public Boolean isSetUserId() {
        return (this.userId!= null);
    }

    /**
     * Gets the value of the rewardId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRewardId() {
        return rewardId;
    }

    /**
     * Sets the value of the rewardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRewardId(Long value) {
        this.rewardId = value;
    }

    public Boolean isSetRewardId() {
        return (this.rewardId!= null);
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPoints(Integer value) {
        this.points = value;
    }

    public Boolean isSetPoints() {
        return (this.points!= null);
    }

}
