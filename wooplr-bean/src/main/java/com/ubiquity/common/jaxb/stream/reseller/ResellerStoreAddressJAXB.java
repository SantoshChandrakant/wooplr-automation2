package com.ubiquity.common.jaxb.stream.reseller;

import javax.jdo.annotations.Persistent;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by abhishek on 8/24/16.
 */
@XmlRootElement
public class ResellerStoreAddressJAXB implements Serializable {

    private final static Long serialVersionUID = 12343L;
    private Long id;
    @Persistent
    private Date createDate;
    @Persistent
    private Long resellerStoreId;
    @Persistent
    private Boolean default_addr;
    @Persistent
    private String line1;
    @Persistent
    private String line2;
    @Persistent
    private String first_name;
    @Persistent
    private String last_name;
    @Persistent
    private String phone;
    @Persistent
    private String city;
    @Persistent
    private String province;
    @Persistent
    private String country;
    @Persistent
    private String zip;
    @Persistent
    private String landmark;

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

    public Long getResellerStoreId() {
        return resellerStoreId;
    }

    public void setResellerStoreId(Long resellerStoreId) {
        this.resellerStoreId = resellerStoreId;
    }

    public Boolean getDefault_addr() {
        return default_addr;
    }

    public void setDefault_addr(Boolean default_addr) {
        this.default_addr = default_addr;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }
}
