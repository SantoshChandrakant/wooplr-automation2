package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by abhishek on 11/23/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPreferenceJAXB", propOrder = {
        "id",
        "createDate",
        "userId",
        "type",
        "preference",
        "isSubscribed"
})

@XmlRootElement
public class UserPreferenceJAXB implements Serializable {

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    @XmlElement(required = true)
    private Long createDate;
    @XmlElement(required = true)
    private Long userId;
    @XmlElement(required = true)
    private String type;
    @XmlElement(required = true)
    private String preference;
    @XmlElement(required = true)
    private String isSubscribed;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public String getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(String isSubscribed) {
        this.isSubscribed = isSubscribed;
    }
}
