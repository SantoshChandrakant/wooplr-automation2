package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by abhishek on 8/24/15.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookAutoLoveResponseJAXB", propOrder = {
        "uid",
        "notification",
        "status"
})

@XmlRootElement
public class LookAutoLoveResponseJAXB implements Serializable {
    private final static Long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected Long uid;
    @XmlElement(required = true)
    protected Boolean notification;
    protected Boolean status;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Boolean getNotification() {
        return notification;
    }

    public void setNotification(Boolean notification) {
        this.notification = notification;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
