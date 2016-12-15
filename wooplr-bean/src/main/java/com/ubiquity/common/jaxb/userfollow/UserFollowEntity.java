//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.07 at 02:22:55 PM IST 
//


package com.ubiquity.common.jaxb.userfollow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for UserFollowEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserFollowEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="entityType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="followerCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lovesReceived" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="followEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserFollowEntity", propOrder = {
    "userId",
    "entityId",
    "entityType",
    "followerCount",
    "lovesReceived",
    "name",
    "role",
    "city",
    "followEntity",
    "postCount",
     "isVerified",
    "showImage",
    "gender",
    "status",
    "handle",
    "isLoggedInUserFollowingUser",
        "isOfficial"
})
@XmlRootElement
public class UserFollowEntity
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Long userId;
    protected Long entityId;
    protected Long entityType;
    protected Long followerCount;
    protected Long lovesReceived;
    protected String name;
    protected String role;
    protected String city;
    protected Boolean followEntity;
    protected Long postCount;
    protected Boolean isVerified;
    protected Boolean showImage;
    protected String gender;
    protected String status;
    protected String handle;
    protected Boolean isLoggedInUserFollowingUser;
    protected Boolean isOfficial;

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

    public boolean isSetUserId() {
        return (this.userId!= null);
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityId(Long value) {
        this.entityId = value;
    }

    public boolean isSetEntityId() {
        return (this.entityId!= null);
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityType(Long value) {
        this.entityType = value;
    }

    public boolean isSetEntityType() {
        return (this.entityType!= null);
    }

    /**
     * Gets the value of the followerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFollowerCount() {
        return followerCount;
    }

    /**
     * Sets the value of the followerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFollowerCount(Long value) {
        this.followerCount = value;
    }

    public boolean isSetFollowerCount() {
        return (this.followerCount!= null);
    }

    /**
     * Gets the value of the lovesReceived property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLovesReceived() {
        return lovesReceived;
    }

    /**
     * Sets the value of the lovesReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLovesReceived(Long value) {
        this.lovesReceived = value;
    }

    public boolean isSetLovesReceived() {
        return (this.lovesReceived!= null);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    public boolean isSetCity() {
        return (this.city!= null);
    }

    /**
     * Gets the value of the followEntity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFollowEntity() {
        return followEntity;
    }

    /**
     * Sets the value of the followEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFollowEntity(Boolean value) {
        this.followEntity = value;
    }

    public boolean isSetFollowEntity() {
        return (this.followEntity!= null);
    }

    public Long getPostCount() {
        return postCount;
    }

    public void setPostCount(Long postCount) {
        this.postCount = postCount;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public Boolean getShowImage() {
        return showImage;
    }

    public void setShowImage(Boolean showImage) {
        this.showImage = showImage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public Boolean getIsLoggedInUserFollowingUser() {
        return isLoggedInUserFollowingUser;
    }

    public void setIsLoggedInUserFollowingUser(Boolean isLoggedInUserFollowingUser) {
        this.isLoggedInUserFollowingUser = isLoggedInUserFollowingUser;
    }

    public Boolean getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(Boolean isOfficial) {
        this.isOfficial = isOfficial;
    }
}