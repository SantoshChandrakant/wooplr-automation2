package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by abhishek on 3/16/16.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedbackJAXB", propOrder = {
        "id",
        "createDate",
        "userId",
        "comment",
        "email",
        "rating",
        "entityType",
        "entityId",
        "platformInfo"
})
@XmlRootElement
public class FeedbackJAXB implements Serializable {

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    @XmlElement(required = true)
    protected Date createDate;
    @XmlElement(required = true)
    protected Long userId;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected Double rating;
    @XmlElement(required = true)
    protected String entityType;
    @XmlElement(required = true)
    protected Long entityId;
    @XmlElement(required = true)
    protected String  platformInfo;


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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getPlatformInfo() {
        return platformInfo;
    }

    public void setPlatformInfo(String platformInfo) {
        this.platformInfo = platformInfo;
    }
}
