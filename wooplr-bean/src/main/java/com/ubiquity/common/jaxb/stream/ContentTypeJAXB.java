package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by abhishek on 10/5/15.
 */


/**
 * <p>Java class for ContentTypeJAXB complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ContentTypeJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentTypeJAXB", propOrder = {
        "id",
        "userId",
        "createDate",
        "shortName",
        "displayName",
        "imagePid",
        "isLoggedInUserFollowChannel",
        "followCount",
        "contentCount",
        "description",
        "identityColor",

})


@XmlRootElement
public class ContentTypeJAXB implements Serializable {
    private final static Long serialVersionUID = 12343L;
    protected Long id;
    protected Long userId;
    protected Long createDate;
    protected String shortName;
    protected String displayName;
    protected String imagePid;
    protected String description;
    protected String identityColor;
    @XmlElement(defaultValue = "false")
    protected Boolean isLoggedInUserFollowChannel;
    protected Long followCount;
    protected Long contentCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getImagePid() {
        return imagePid;
    }

    public void setImagePid(String imagePid) {
        this.imagePid = imagePid;
    }

    public Boolean getIsLoggedInUserFollowChannel() {
        return isLoggedInUserFollowChannel;
    }

    public void setIsLoggedInUserFollowChannel(Boolean isLoggedInUserFollowChannel) {
        this.isLoggedInUserFollowChannel = isLoggedInUserFollowChannel;
    }

    public Long getFollowCount() {
        return followCount;
    }

    public void setFollowCount(Long followCount) {
        this.followCount = followCount;
    }

    public Long getContentCount() {
        return contentCount;
    }

    public void setContentCount(Long contentCount) {
        this.contentCount = contentCount;
    }

    public String getIdentityColor() {
        return identityColor;
    }

    public void setIdentityColor(String identityColor) {
        this.identityColor = identityColor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


