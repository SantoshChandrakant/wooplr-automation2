package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajagopal on 5/31/16.
 */
public class PincodeDetailJAXB implements Serializable {
    protected String pincode;
    protected String address;
    protected String city;
    protected String state;
    protected String country;
    protected Boolean codAvailable;
    protected Boolean pgAvailable;
    protected Boolean pincodeValid;
    protected Boolean isServicable;
    protected List<ECommerceMessageJAXB> messages;

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public Boolean getPincodeValid() {
        return pincodeValid;
    }

    public void setPincodeValid(Boolean pincodeValid) {
        this.pincodeValid = pincodeValid;
    }

    public Boolean getServicable() {
        return isServicable;
    }

    public void setServicable(Boolean servicable) {
        isServicable = servicable;
    }

    public List<ECommerceMessageJAXB> getMessages() {
        if (messages == null){
            messages = new ArrayList<ECommerceMessageJAXB>();
        }
        return messages;
    }
}
