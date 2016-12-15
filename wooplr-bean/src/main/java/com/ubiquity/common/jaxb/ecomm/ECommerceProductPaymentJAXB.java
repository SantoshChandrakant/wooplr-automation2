package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by debasish on 12/30/2015.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ecommerceProductPaymentJAXB", propOrder = {
        "pmt_type",
        "wooplr_supported"
})
public class ECommerceProductPaymentJAXB implements Serializable {

    private String pmt_type;

    private boolean wooplr_supported;

    public String getPmt_type() {
        return pmt_type;
    }

    public void setPmt_type(String pmt_type) {
        this.pmt_type = pmt_type;
    }

    public boolean isWooplr_supported() {
        return wooplr_supported;
    }

    public void setWooplr_supported(boolean wooplr_supported) {
        this.wooplr_supported = wooplr_supported;
    }
}
