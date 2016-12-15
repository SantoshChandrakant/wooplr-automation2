package com.ubiquity.common.jaxb.stream.delhivery;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by abhishek on 1/19/16.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupLocation", propOrder = {
        "address",
        "city",
        "country",
        "name",
        "phone",
        "pin"
})

@XmlRootElement
public class PickupLocation implements Serializable{

    private final static Long serialVersionUID = 12343L;
    @XmlElement(required = true,nillable = true)
    protected String address;
    @XmlElement(required = true,nillable = true)
    protected String city;
    @XmlElement(required = true,nillable = true)
    protected String country;
    @XmlElement(required = true,nillable = true)
    protected String name;
    @XmlElement(required = true,nillable = true)
    protected String phone;
    @XmlElement(required = true,nillable = true)
    protected String pin;

    public String getAdd() {
        return address;
    }

    public void setAdd(String add) {
        this.address = add;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
