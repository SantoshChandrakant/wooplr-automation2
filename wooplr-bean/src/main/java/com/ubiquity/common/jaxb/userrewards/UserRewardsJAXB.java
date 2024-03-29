//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.04 at 02:50:59 PM IST 
//


package com.ubiquity.common.jaxb.userrewards;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for userRewardsJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userRewardsJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="earnedScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pendingScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="redeemedPoints" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rewardId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="badges" type="{}userRewardBadgesJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sponsoredPoints" type="{}userSponsoredPointsJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userRewardsJAXB", propOrder = {
    "id",
    "earnedScore",
    "pendingScore",
    "redeemedPoints",
    "userId",
    "rewardId",
    "badges",
    "sponsoredPoints",
    "title",
    "description"
})
@XmlRootElement
public class UserRewardsJAXB {

    protected Long id;
    protected int earnedScore;
    protected int pendingScore;
    protected int redeemedPoints;
    protected Long userId;
    protected Long rewardId;
    @XmlElement(nillable = true)
    protected List<UserRewardBadgesJAXB> badges;
    @XmlElement(nillable = true)
    protected List<UserSponsoredPointsJAXB> sponsoredPoints;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String description;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the earnedScore property.
     * 
     */
    public int getEarnedScore() {
        return earnedScore;
    }

    /**
     * Sets the value of the earnedScore property.
     * 
     */
    public void setEarnedScore(int value) {
        this.earnedScore = value;
    }

    /**
     * Gets the value of the pendingScore property.
     * 
     */
    public int getPendingScore() {
        return pendingScore;
    }

    /**
     * Sets the value of the pendingScore property.
     * 
     */
    public void setPendingScore(int value) {
        this.pendingScore = value;
    }

    /**
     * Gets the value of the redeemedPoints property.
     * 
     */
    public int getRedeemedPoints() {
        return redeemedPoints;
    }

    /**
     * Sets the value of the redeemedPoints property.
     * 
     */
    public void setRedeemedPoints(int value) {
        this.redeemedPoints = value;
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

    /**
     * Gets the value of the badges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the badges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBadges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserRewardBadgesJAXB }
     * 
     * 
     */
    public List<UserRewardBadgesJAXB> getBadges() {
        if (badges == null) {
            badges = new ArrayList<UserRewardBadgesJAXB>();
        }
        return this.badges;
    }

    /**
     * Gets the value of the sponsoredPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sponsoredPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSponsoredPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserSponsoredPointsJAXB }
     * 
     * 
     */
    public List<UserSponsoredPointsJAXB> getSponsoredPoints() {
        if (sponsoredPoints == null) {
            sponsoredPoints = new ArrayList<UserSponsoredPointsJAXB>();
        }
        return this.sponsoredPoints;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
