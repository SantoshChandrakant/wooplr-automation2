package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by abhishek on 8/16/16.
 */
public class DelhiveryPincodeServiceableJAXB implements Serializable {

    private final static Long serialVersionUID = 12343L;

    @XmlElement(required = true)
    protected String pincode;
    @XmlElement(required = true)
    protected Boolean isServiceable;
    @XmlElement(required = true)
    protected String shipmentMode;  // fast or slow
    @XmlElement(required = true, nillable = true)
    protected List<DelhiveryPaymentJAXB> delhiveryPaymentJAXBList;

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Boolean getIsServiceable() {
        return isServiceable;
    }

    public void setIsServiceable(Boolean isServiceable) {
        this.isServiceable = isServiceable;
    }

    public String getShipmentMode() {
        return shipmentMode;
    }

    public void setShipmentMode(String shipmentMode) {
        this.shipmentMode = shipmentMode;
    }

    public List<DelhiveryPaymentJAXB> getDelhiveryPaymentJAXBList() {
        return delhiveryPaymentJAXBList;
    }

    public void setDelhiveryPaymentJAXBList(List<DelhiveryPaymentJAXB> delhiveryPaymentJAXBList) {
        this.delhiveryPaymentJAXBList = delhiveryPaymentJAXBList;
    }
}
