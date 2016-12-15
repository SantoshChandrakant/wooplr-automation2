package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by pravesh on 15/02/16.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMessageHistoryJAXB", propOrder = {
        "id",

        "createDate",
        "entityId",
        "notificationType",
        "payLoad"
})
@XmlRootElement
public class NotificationMessageHistoryJAXB implements Serializable {

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    //protected String name;
    protected Long createDate;
    //protected Long updateDate;
    //protected Long targetUserId;    // User who receives the notification
    //protected List<Long> userId;    // who ever made the action
    //protected Integer userCount;
    protected Long entityId;        // Look or Collection ID for which the notification is sent
    //protected String entityType;
    protected String notificationType;  // Love, Comment, Milestone etc.
    protected String payLoad;
    //protected String iosPayLoad;
    protected Boolean read;

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


    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(String payLoad) {
        this.payLoad = payLoad;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }
}
