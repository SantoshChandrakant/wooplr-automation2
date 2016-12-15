package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by abhishek on 2/2/16.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FashionLookJAXB", propOrder = {
        "id",
        "name",
        "createDate",
        "updateDate",
        "orderId",
        "updatedBy",
        "updaterType",
        "statusFrom",
        "statusTo",
        "note",
        "type"
})
@XmlRootElement
public class EcommerceOrderHistoryJAXB implements Serializable {
    private final static Long serialVersionUID = 12343L;
    protected Long id;
    protected String name;
    protected Date createDate;
    protected Date updateDate;
    protected Long orderId;
    protected String updatedBy;
    protected String updaterType;
    protected String statusFrom;
    protected String statusTo;
    protected String note;
    protected String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdaterType() {
        return updaterType;
    }

    public void setUpdaterType(String updaterType) {
        this.updaterType = updaterType;
    }

    public String getStatusFrom() {
        return statusFrom;
    }

    public void setStatusFrom(String statusFrom) {
        this.statusFrom = statusFrom;
    }

    public String getStatusTo() {
        return statusTo;
    }

    public void setStatusTo(String statusTo) {
        this.statusTo = statusTo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
