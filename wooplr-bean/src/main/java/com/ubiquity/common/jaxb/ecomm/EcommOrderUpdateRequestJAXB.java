package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by abhishek on 4/26/16.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcommOrderUpdateRequestJAXB", propOrder = {
        "ecommOrderRequestJAXB",
        "returnTime",
        "status"
})

public class EcommOrderUpdateRequestJAXB  {
    protected EcommOrderRequestJAXB ecommOrderRequestJAXB;
    protected Long returnTime;
    protected String status;

    public EcommOrderRequestJAXB getEcommOrderRequestJAXB() {
        return ecommOrderRequestJAXB;
    }

    public void setEcommOrderRequestJAXB(EcommOrderRequestJAXB ecommOrderRequestJAXB) {
        this.ecommOrderRequestJAXB = ecommOrderRequestJAXB;
    }

    public Long getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Long returnTime) {
        this.returnTime = returnTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
