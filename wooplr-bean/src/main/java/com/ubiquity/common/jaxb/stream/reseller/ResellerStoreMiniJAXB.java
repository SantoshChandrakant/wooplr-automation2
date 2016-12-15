package com.ubiquity.common.jaxb.stream.reseller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by abhishek on 8/24/16.
 */
@XmlRootElement
public class ResellerStoreMiniJAXB implements Serializable{

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    @XmlElement(required = true)
    protected Date createDate;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String logo;
    @XmlElement(required = true)
    protected String brandImage;
    @XmlElement(required = true)
    protected String tagLine;
    @XmlElement(required = true)
    protected String resellerStoreName;

    protected String userAbout;

    protected String userImage;
    protected String blogUrl;
    protected String fbUrl;
    protected String twitterUrl;
    protected String instagramUrl;
    protected String fname;
    protected String lname;
    protected String pancard;
    protected String email;
    protected String phone;

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


    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }


    public String getResellerStoreName() {
        return resellerStoreName;
    }

    public void setResellerStoreName(String resellerStoreName) {
        this.resellerStoreName = resellerStoreName;
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

    public String getPancard() {
        return pancard;
    }

    public void setPancard(String pancard) {
        this.pancard = pancard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}

