package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by abhishek on 10/15/15.
 */

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "ReportJAXB", propOrder = {
            "id",
            "createDate",
            "entityId",
            "entityType",
            "reporterId",
            "action",
            "message",
            "isClosed",
            "entityOwnerId"
    })


    @XmlRootElement
    public class ReportJAXB implements Serializable {
    private final static Long serialVersionUID = 12343L;

    private Long id;
    private Long createDate;
    private Long entityId;
    private String entityType;
    private Long reporterId;
    private String action;
    private String message;
    private Boolean isClosed;
    private Long entityOwnerId;

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

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Long getReporterId() {
        return reporterId;
    }

    public void setReporterId(Long reporterId) {
        this.reporterId = reporterId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public Long getEntityOwnerId() {
        return entityOwnerId;
    }

    public void setEntityOwnerId(Long entityOwnerId) {
        this.entityOwnerId = entityOwnerId;
    }
}
