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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userFBAccessTokenPermissionsJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userFBAccessTokenPermissionsJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="facebookId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expires" type="{http://www.w3.org/2001/XMLSchema}Long" minOccurs="0"/>
 *         &lt;element name="fb_permission_offlineAccess" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="fb_permission_installed" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="fb_permission_status_update" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="fb_permission_photo_upload" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="fb_permission_video_upload" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="fb_permission_email" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="fb_permission_create_note" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="fb_permission_share_item" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="fb_permission_publish_stream" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="fb_permission_publish_actions" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="fb_permission_user_birthday" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="fb_permission_user_location" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="fb_permission_user_likes" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="fb_permission_user_about_me" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userFBAccessTokenPermissionsJAXB", propOrder = {
    "facebookId",
    "accessToken",
    "expires",
    "fbPermissionOfflineAccess",
    "fbPermissionInstalled",
    "fbPermissionStatusUpdate",
    "fbPermissionPhotoUpload",
    "fbPermissionVideoUpload",
    "fbPermissionEmail",
    "fbPermissionCreateNote",
    "fbPermissionShareItem",
    "fbPermissionPublishStream",
    "fbPermissionPublishActions",
    "fbPermissionUserBirthday",
    "fbPermissionUserLocation",
    "fbPermissionUserLikes",
    "fbPermissionUserAboutMe"
})
public class UserFBAccessTokenPermissionsJAXB
    implements Serializable
{

    private final static Long serialVersionUID = 12344L;
    protected String facebookId;
    protected String accessToken;
    protected Long expires;
    @XmlElement(name = "fb_permission_offlineAccess")
    protected Boolean fbPermissionOfflineAccess;
    @XmlElement(name = "fb_permission_installed")
    protected Boolean fbPermissionInstalled;
    @XmlElement(name = "fb_permission_status_update")
    protected Boolean fbPermissionStatusUpdate;
    @XmlElement(name = "fb_permission_photo_upload")
    protected Boolean fbPermissionPhotoUpload;
    @XmlElement(name = "fb_permission_video_upload")
    protected Boolean fbPermissionVideoUpload;
    @XmlElement(name = "fb_permission_email")
    protected Boolean fbPermissionEmail;
    @XmlElement(name = "fb_permission_create_note")
    protected Boolean fbPermissionCreateNote;
    @XmlElement(name = "fb_permission_share_item")
    protected Boolean fbPermissionShareItem;
    @XmlElement(name = "fb_permission_publish_stream")
    protected Boolean fbPermissionPublishStream;
    @XmlElement(name = "fb_permission_publish_actions")
    protected Boolean fbPermissionPublishActions;
    @XmlElement(name = "fb_permission_user_birthday")
    protected Boolean fbPermissionUserBirthday;
    @XmlElement(name = "fb_permission_user_location")
    protected Boolean fbPermissionUserLocation;
    @XmlElement(name = "fb_permission_user_likes")
    protected Boolean fbPermissionUserLikes;
    @XmlElement(name = "fb_permission_user_about_me")
    protected Boolean fbPermissionUserAboutMe;

    /**
     * Gets the value of the facebookId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebookId() {
        return facebookId;
    }

    /**
     * Sets the value of the facebookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebookId(String value) {
        this.facebookId = value;
    }

    public Boolean isSetFacebookId() {
        return (this.facebookId!= null);
    }

    /**
     * Gets the value of the accessToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of the accessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

    public Boolean isSetAccessToken() {
        return (this.accessToken!= null);
    }

    /**
     * Gets the value of the expires property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpires(Long value) {
        this.expires = value;
    }

    public Boolean isSetExpires() {
        return (this.expires!= null);
    }

    /**
     * Gets the value of the fbPermissionOfflineAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFbPermissionOfflineAccess() {
        return fbPermissionOfflineAccess;
    }

    /**
     * Sets the value of the fbPermissionOfflineAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFbPermissionOfflineAccess(Boolean value) {
        this.fbPermissionOfflineAccess = value;
    }

    public Boolean isSetFbPermissionOfflineAccess() {
        return (this.fbPermissionOfflineAccess!= null);
    }

    /**
     * Gets the value of the fbPermissionInstalled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFbPermissionInstalled() {
        return fbPermissionInstalled;
    }

    /**
     * Sets the value of the fbPermissionInstalled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFbPermissionInstalled(Boolean value) {
        this.fbPermissionInstalled = value;
    }

    public Boolean isSetFbPermissionInstalled() {
        return (this.fbPermissionInstalled!= null);
    }

    /**
     * Gets the value of the fbPermissionStatusUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFbPermissionStatusUpdate() {
        return fbPermissionStatusUpdate;
    }

    /**
     * Sets the value of the fbPermissionStatusUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFbPermissionStatusUpdate(Boolean value) {
        this.fbPermissionStatusUpdate = value;
    }

    public Boolean isSetFbPermissionStatusUpdate() {
        return (this.fbPermissionStatusUpdate!= null);
    }

    /**
     * Gets the value of the fbPermissionPhotoUpload property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFbPermissionPhotoUpload() {
        return fbPermissionPhotoUpload;
    }

    /**
     * Sets the value of the fbPermissionPhotoUpload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFbPermissionPhotoUpload(Boolean value) {
        this.fbPermissionPhotoUpload = value;
    }

    public Boolean isSetFbPermissionPhotoUpload() {
        return (this.fbPermissionPhotoUpload!= null);
    }

    /**
     * Gets the value of the fbPermissionVideoUpload property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFbPermissionVideoUpload() {
        return fbPermissionVideoUpload;
    }

    /**
     * Sets the value of the fbPermissionVideoUpload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFbPermissionVideoUpload(Boolean value) {
        this.fbPermissionVideoUpload = value;
    }

    public Boolean isSetFbPermissionVideoUpload() {
        return (this.fbPermissionVideoUpload!= null);
    }

    /**
     * Gets the value of the fbPermissionEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFbPermissionEmail() {
        return fbPermissionEmail;
    }

    /**
     * Sets the value of the fbPermissionEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFbPermissionEmail(Boolean value) {
        this.fbPermissionEmail = value;
    }

    public Boolean isSetFbPermissionEmail() {
        return (this.fbPermissionEmail!= null);
    }

    /**
     * Gets the value of the fbPermissionCreateNote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFbPermissionCreateNote() {
        return fbPermissionCreateNote;
    }

    /**
     * Sets the value of the fbPermissionCreateNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFbPermissionCreateNote(Boolean value) {
        this.fbPermissionCreateNote = value;
    }

    public Boolean isSetFbPermissionCreateNote() {
        return (this.fbPermissionCreateNote!= null);
    }

    /**
     * Gets the value of the fbPermissionShareItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFbPermissionShareItem() {
        return fbPermissionShareItem;
    }

    /**
     * Sets the value of the fbPermissionShareItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFbPermissionShareItem(Boolean value) {
        this.fbPermissionShareItem = value;
    }

    public Boolean isSetFbPermissionShareItem() {
        return (this.fbPermissionShareItem!= null);
    }

    /**
     * Gets the value of the fbPermissionPublishStream property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFbPermissionPublishStream() {
        return fbPermissionPublishStream;
    }

    /**
     * Sets the value of the fbPermissionPublishStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFbPermissionPublishStream(Boolean value) {
        this.fbPermissionPublishStream = value;
    }

    public Boolean isSetFbPermissionPublishStream() {
        return (this.fbPermissionPublishStream!= null);
    }

    /**
     * Gets the value of the fbPermissionPublishActions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFbPermissionPublishActions() {
        return fbPermissionPublishActions;
    }

    /**
     * Sets the value of the fbPermissionPublishActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFbPermissionPublishActions(Boolean value) {
        this.fbPermissionPublishActions = value;
    }

    public Boolean isSetFbPermissionPublishActions() {
        return (this.fbPermissionPublishActions!= null);
    }

    /**
     * Gets the value of the fbPermissionUserBirthday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFbPermissionUserBirthday() {
        return fbPermissionUserBirthday;
    }

    /**
     * Sets the value of the fbPermissionUserBirthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFbPermissionUserBirthday(Boolean value) {
        this.fbPermissionUserBirthday = value;
    }

    public Boolean isSetFbPermissionUserBirthday() {
        return (this.fbPermissionUserBirthday!= null);
    }

    /**
     * Gets the value of the fbPermissionUserLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFbPermissionUserLocation() {
        return fbPermissionUserLocation;
    }

    /**
     * Sets the value of the fbPermissionUserLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFbPermissionUserLocation(Boolean value) {
        this.fbPermissionUserLocation = value;
    }

    public Boolean isSetFbPermissionUserLocation() {
        return (this.fbPermissionUserLocation!= null);
    }

    /**
     * Gets the value of the fbPermissionUserLikes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFbPermissionUserLikes() {
        return fbPermissionUserLikes;
    }

    /**
     * Sets the value of the fbPermissionUserLikes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFbPermissionUserLikes(Boolean value) {
        this.fbPermissionUserLikes = value;
    }

    public Boolean isSetFbPermissionUserLikes() {
        return (this.fbPermissionUserLikes!= null);
    }

    /**
     * Gets the value of the fbPermissionUserAboutMe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFbPermissionUserAboutMe() {
        return fbPermissionUserAboutMe;
    }

    /**
     * Sets the value of the fbPermissionUserAboutMe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFbPermissionUserAboutMe(Boolean value) {
        this.fbPermissionUserAboutMe = value;
    }

    public Boolean isSetFbPermissionUserAboutMe() {
        return (this.fbPermissionUserAboutMe!= null);
    }

}
