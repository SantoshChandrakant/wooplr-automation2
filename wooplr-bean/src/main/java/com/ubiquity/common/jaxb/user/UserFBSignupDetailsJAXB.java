//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.20 at 03:37:02 PM IST 
//


package com.ubiquity.common.jaxb.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for userFBSignupDetailsJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userFBSignupDetailsJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}Long" minOccurs="0"/>
 *         &lt;element name="accessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facebookId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fbHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="imageMimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="influenceScore" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *         &lt;element name="pointsEarned" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *         &lt;element name="pointsPending" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *         &lt;element name="pointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *         &lt;element name="accessTokenPermissions" type="{}userFBAccessTokenPermissionsJAXB"/>
 *         &lt;element name="reviews" type="{http://www.w3.org/2001/XMLSchema}Long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userTags" type="{http://www.w3.org/2001/XMLSchema}Long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pilot" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="event" type="{http://www.w3.org/2001/XMLSchema}Boolean" minOccurs="0"/>
 *         &lt;element name="eventCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userFBSignupDetailsJAXB", propOrder = {
    "id",
    "accessToken",
    "userid",
    "email",
    "password",
    "facebookId",
    "fbHandle",
    "fname",
    "lname",
    "dob",
    "gender",
    "location",
    "city",
    "mobile",
    "image",
    "imageMimeType",
    "influenceScore",
    "pointsEarned",
    "pointsPending",
    "pointsRedeemed",
    "accessTokenPermissions",
    "reviews",
    "userTags",
    "pilot",
    "event",
    "eventCode",
    "deviceUniqueId",
    "userStatus"
})
public class UserFBSignupDetailsJAXB
    implements Serializable
{

    private final static Long serialVersionUID = 12344L;
    protected Long id;
    protected String accessToken;
    protected String userid;
    protected String email;
    protected String password;
    protected String facebookId;
    protected String fbHandle;
    protected String fname;
    protected String lname;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date dob;
    protected String gender;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String city;
    protected String mobile;
    @XmlElement(required = true)
    protected byte[] image;
    @XmlElement(required = true)
    protected String imageMimeType;
    protected Integer influenceScore;
    protected Integer pointsEarned;
    protected Integer pointsPending;
    protected Integer pointsRedeemed;
    @XmlElement(required = true)
    protected UserFBAccessTokenPermissionsJAXB accessTokenPermissions;
    @XmlElement(nillable = true)
    protected List<Long> reviews;
    @XmlElement(nillable = true)
    protected List<Long> userTags;
    protected Boolean pilot;
    protected Boolean event;
    protected String eventCode;
    protected List<String> deviceUniqueId;
    protected String userStatus;

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

    public Boolean isSetId() {
        return (this.id!= null);
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
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    public Boolean isSetUserid() {
        return (this.userid!= null);
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    public Boolean isSetEmail() {
        return (this.email!= null);
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    public Boolean isSetPassword() {
        return (this.password!= null);
    }

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
     * Gets the value of the fbHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFbHandle() {
        return fbHandle;
    }

    /**
     * Sets the value of the fbHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFbHandle(String value) {
        this.fbHandle = value;
    }

    public Boolean isSetFbHandle() {
        return (this.fbHandle!= null);
    }

    /**
     * Gets the value of the fname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFname() {
        return fname;
    }

    /**
     * Sets the value of the fname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFname(String value) {
        this.fname = value;
    }

    public Boolean isSetFname() {
        return (this.fname!= null);
    }

    /**
     * Gets the value of the lname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLname() {
        return lname;
    }

    /**
     * Sets the value of the lname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLname(String value) {
        this.lname = value;
    }

    public Boolean isSetLname() {
        return (this.lname!= null);
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDob(Date value) {
        this.dob = value;
    }

    public Boolean isSetDob() {
        return (this.dob!= null);
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    public Boolean isSetLocation() {
        return (this.location!= null);
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

    public Boolean isSetCity() {
        return (this.city!= null);
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    public Boolean isSetMobile() {
        return (this.mobile!= null);
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = ((byte[]) value);
    }

    public Boolean isSetImage() {
        return (this.image!= null);
    }

    /**
     * Gets the value of the imageMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageMimeType() {
        return imageMimeType;
    }

    /**
     * Sets the value of the imageMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageMimeType(String value) {
        this.imageMimeType = value;
    }

    public Boolean isSetImageMimeType() {
        return (this.imageMimeType!= null);
    }

    /**
     * Gets the value of the influenceScore property.
     * 
     */
    public Integer getInfluenceScore() {
        return influenceScore;
    }

    /**
     * Sets the value of the influenceScore property.
     * 
     */
    public void setInfluenceScore(Integer value) {
        this.influenceScore = value;
    }

    public Boolean isSetInfluenceScore() {
        return true;
    }

    /**
     * Gets the value of the pointsEarned property.
     * 
     */
    public Integer getPointsEarned() {
        return pointsEarned;
    }

    /**
     * Sets the value of the pointsEarned property.
     * 
     */
    public void setPointsEarned(Integer value) {
        this.pointsEarned = value;
    }

    public Boolean isSetPointsEarned() {
        return true;
    }

    /**
     * Gets the value of the pointsPending property.
     * 
     */
    public Integer getPointsPending() {
        return pointsPending;
    }

    /**
     * Sets the value of the pointsPending property.
     * 
     */
    public void setPointsPending(Integer value) {
        this.pointsPending = value;
    }

    public Boolean isSetPointsPending() {
        return true;
    }

    /**
     * Gets the value of the pointsRedeemed property.
     * 
     */
    public Integer getPointsRedeemed() {
        return pointsRedeemed;
    }

    /**
     * Sets the value of the pointsRedeemed property.
     * 
     */
    public void setPointsRedeemed(Integer value) {
        this.pointsRedeemed = value;
    }

    public Boolean isSetPointsRedeemed() {
        return true;
    }

    /**
     * Gets the value of the accessTokenPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link UserFBAccessTokenPermissionsJAXB }
     *     
     */
    public UserFBAccessTokenPermissionsJAXB getAccessTokenPermissions() {
        return accessTokenPermissions;
    }

    /**
     * Sets the value of the accessTokenPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFBAccessTokenPermissionsJAXB }
     *     
     */
    public void setAccessTokenPermissions(UserFBAccessTokenPermissionsJAXB value) {
        this.accessTokenPermissions = value;
    }

    public Boolean isSetAccessTokenPermissions() {
        return (this.accessTokenPermissions!= null);
    }

    /**
     * Gets the value of the reviews property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reviews property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReviews().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getReviews() {
        if (reviews == null) {
            reviews = new ArrayList<Long>();
        }
        return this.reviews;
    }

    public Boolean isSetReviews() {
        return ((this.reviews!= null)&&(!this.reviews.isEmpty()));
    }

    public void unsetReviews() {
        this.reviews = null;
    }

    /**
     * Gets the value of the userTags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userTags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserTags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getUserTags() {
        if (userTags == null) {
            userTags = new ArrayList<Long>();
        }
        return this.userTags;
    }

    public Boolean isSetUserTags() {
        return ((this.userTags!= null)&&(!this.userTags.isEmpty()));
    }

    public void unsetUserTags() {
        this.userTags = null;
    }

    /**
     * Gets the value of the pilot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPilot() {
        return pilot;
    }

    /**
     * Sets the value of the pilot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPilot(Boolean value) {
        this.pilot = value;
    }

    public Boolean isSetPilot() {
        return (this.pilot!= null);
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEvent(Boolean value) {
        this.event = value;
    }

    public Boolean isSetEvent() {
        return (this.event!= null);
    }

    /**
     * Gets the value of the eventCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCode() {
        return eventCode;
    }

    /**
     * Sets the value of the eventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCode(String value) {
        this.eventCode = value;
    }

    public Boolean isSetEventCode() {
        return (this.eventCode!= null);
    }

    public List<String> getDeviceUniqueId() {
        return deviceUniqueId;
    }

    public void setDeviceUniqueId(List<String> deviceUniqueId) {
        this.deviceUniqueId = deviceUniqueId;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
}
