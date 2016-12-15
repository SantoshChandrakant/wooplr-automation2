package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by abhishek on 1/12/16.
 */



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECommerceStoreBranchJAXB", propOrder = {
        "id",
        "name",
        "createDate",
        "updateDate",
        "storeId",
        "description",
        "contactPerson",
        "contactNumber",
        "contactStreet",
        "contactArea",
        "contactCity",
        "contactPincode"


})
@XmlRootElement
public class ECommerceStoreBranchJAXB implements Serializable {

    private final static Long serialVersionUID = 12343L;
    protected Long id;

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Date createDate;
    @XmlElement(required = true)
    protected Date updateDate;

    @XmlElement(required = true)
    protected Long storeId;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String contactPerson;

    @XmlElement(required = true)
    protected String contactNumber;
    @XmlElement(required = true)
    protected String contactStreet;
    @XmlElement(required = true)
    protected String contactArea;
    @XmlElement(required = true)
    protected String contactCity;
    @XmlElement(required = true)
    protected String contactPincode;


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

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactStreet() {
        return contactStreet;
    }

    public void setContactStreet(String contactStreet) {
        this.contactStreet = contactStreet;
    }

    public String getContactArea() {
        return contactArea;
    }

    public void setContactArea(String contactArea) {
        this.contactArea = contactArea;
    }

    public String getContactCity() {
        return contactCity;
    }

    public void setContactCity(String contactCity) {
        this.contactCity = contactCity;
    }

    public String getContactPincode() {
        return contactPincode;
    }

    public void setContactPincode(String contactPincode) {
        this.contactPincode = contactPincode;
    }
}
