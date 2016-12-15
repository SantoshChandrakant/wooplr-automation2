
package com.ubiquity.common.jaxb.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userAddress" type="{}userAddressDetailsJAXB"/>
 *         &lt;element name="profileDetails" type="{}userProfileDetailsJAXB"/>
 *         &lt;element name="isFollowing" type="{http://www.w3.org/2001/XMLSchema}Boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userDetails", propOrder = {
    "userAddress",
    "profileDetails",
    "isFollowing"
})
public class UserDetails {

    @XmlElement(required = true)
    protected UserAddressDetailsJAXB userAddress;
    @XmlElement(required = true)
    protected UserProfileDetailsJAXB profileDetails;
    protected Boolean isFollowing;

    /**
     * Gets the value of the userAddress property.
     * 
     * @return
     *     possible object is
     *     {@link UserAddressDetailsJAXB }
     *     
     */
    public UserAddressDetailsJAXB getUserAddress() {
        return userAddress;
    }

    /**
     * Sets the value of the userAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAddressDetailsJAXB }
     *     
     */
    public void setUserAddress(UserAddressDetailsJAXB value) {
        this.userAddress = value;
    }

    /**
     * Gets the value of the profileDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UserProfileDetailsJAXB }
     *     
     */
    public UserProfileDetailsJAXB getProfileDetails() {
        return profileDetails;
    }

    /**
     * Sets the value of the profileDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProfileDetailsJAXB }
     *     
     */
    public void setProfileDetails(UserProfileDetailsJAXB value) {
        this.profileDetails = value;
    }

    /**
     * Gets the value of the isFollowing property.
     * 
     */
    public Boolean isIsFollowing() {
        return isFollowing;
    }

    /**
     * Sets the value of the isFollowing property.
     * 
     */
    public void setIsFollowing(Boolean value) {
        this.isFollowing = value;
    }

}
