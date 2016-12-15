package com.ubiquity.common.jaxb.stream.reseller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by abhishek on 8/24/16.
 */
@XmlRootElement
public class ResellerStoreJAXB implements Serializable{

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    protected Date createDate;
    protected String name;
    protected String logo;
    protected String brandImage;
    protected String phone;
    protected Boolean isPhoneVerified;
    protected String email;
    protected Boolean isEmailVerified;
    protected String type;     //(Blogger, fashionist, student)
    protected Long wooplr_user_id;
    protected Long reseller_user_id;
    protected String tagLine;
    protected String panNumber;
    protected String nameOnPancard;
    protected String pancardImg;
    protected Boolean isPanVerified;
    protected String subDomainUrl;
    protected String password;
    protected Boolean isActive;
    @XmlElement(required = true)
    protected List<String> resellerProfileInCompleteness;
    protected String resellerStoreName;
    protected String storeStatus;
    protected String storeLevel;
    protected String userAbout;
    private String fname;
    private String lname;
    private String userProfileImg;

    protected String userImage;
    protected String blogUrl;
    protected String fbUrl;
    protected String twitterUrl;
    protected String instagramUrl;
    protected String pancardVerificationStatus;
    protected String permission;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setBrandImage(String brandImage) {
        this.brandImage = brandImage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getIsPhoneVerified() {
        return isPhoneVerified;
    }

    public void setIsPhoneVerified(Boolean isPhoneVerified) {
        this.isPhoneVerified = isPhoneVerified;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsEmailVerified() {
        return isEmailVerified;
    }

    public void setIsEmailVerified(Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getWooplr_user_id() {
        return wooplr_user_id;
    }

    public void setWooplr_user_id(Long wooplr_user_id) {
        this.wooplr_user_id = wooplr_user_id;
    }

    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public Boolean getIsPanVerified() {
        return isPanVerified;
    }

    public void setIsPanVerified(Boolean isPanVerified) {
        this.isPanVerified = isPanVerified;
    }

    public String getSubDomainUrl() {
        return subDomainUrl;
    }

    public void setSubDomainUrl(String subDomainUrl) {
        this.subDomainUrl = subDomainUrl;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public List<String> getResellerProfileInCompleteness() {
        return resellerProfileInCompleteness;
    }

    public void setResellerProfileInCompleteness(List<String> resellerProfileInCompleteness) {
        this.resellerProfileInCompleteness = resellerProfileInCompleteness;
    }

    public String getResellerStoreName() {
        return resellerStoreName;
    }

    public void setResellerStoreName(String resellerStoreName) {
        this.resellerStoreName = resellerStoreName;
    }

    public String getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(String storeStatus) {
        this.storeStatus = storeStatus;
    }

    public String getStoreLevel() {
        return storeLevel;
    }

    public void setStoreLevel(String storeLevel) {
        this.storeLevel = storeLevel;
    }

    public Long getReseller_user_id() {
        return reseller_user_id;
    }

    public void setReseller_user_id(Long reseller_user_id) {
        this.reseller_user_id = reseller_user_id;
    }

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserAbout() {
        return userAbout;
    }

    public void setUserAbout(String userAbout) {
        this.userAbout = userAbout;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getBlogUrl() {
        return blogUrl;
    }

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl;
    }

    public String getFbUrl() {
        return fbUrl;
    }

    public void setFbUrl(String fbUrl) {
        this.fbUrl = fbUrl;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getInstagramUrl() {
        return instagramUrl;
    }

    public void setInstagramUrl(String instagramUrl) {
        this.instagramUrl = instagramUrl;
    }

    public String getPancardImg() {
        return pancardImg;
    }

    public void setPancardImg(String pancardImg) {
        this.pancardImg = pancardImg;
    }

    public String getNameOnPancard() {
        return nameOnPancard;
    }

    public void setNameOnPancard(String nameOnPancard) {
        this.nameOnPancard = nameOnPancard;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUserProfileImg() {
        return userProfileImg;
    }

    public void setUserProfileImg(String userProfileImg) {
        this.userProfileImg = userProfileImg;
    }

    public String getPancardVerificationStatus() {
        return pancardVerificationStatus;
    }

    public void setPancardVerificationStatus(String pancardVerificationStatus) {
        this.pancardVerificationStatus = pancardVerificationStatus;
    }
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
