package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by debasish on 12/10/2015.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECommCustomerAddressJAXB", propOrder = {
        "id",
        "name",
        "type",
        "default_addr",
        "address1",
        "address2",
        "first_name",
        "last_name",
        "phone",
        "city",
        "province",
        "country",
        "zip",
        "landmark"

})
public class ECommCustomerAddressJAXB implements Serializable {


    private Long id;
    private String name;

    private String type;
    private Boolean default_addr;
    private String address1;

    private String address2;

    private String first_name;

    private String last_name;

    private String phone;

    private String city;

    private String province;

    private String country;

    private String zip;

    private String landmark;

    private Boolean codAvailable;

    private Boolean pgAvailable;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getDefault_addr() {
        return default_addr;
    }

    public void setDefault_addr(Boolean default_addr) {
        this.default_addr = default_addr;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public Boolean getCodAvailable() {
        return codAvailable;
    }

    public void setCodAvailable(Boolean codAvailable) {
        this.codAvailable = codAvailable;
    }

    public Boolean getPgAvailable() {
        return pgAvailable;
    }

    public void setPgAvailable(Boolean pgAvailable) {
        this.pgAvailable = pgAvailable;
    }

    @Override
    public String toString() {
        return "ECommCustomerAddressJAXB{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", default_addr=" + default_addr +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", zip='" + zip + '\'' +
                ", landmark='" + landmark + '\'' +
                '}';
    }
}
