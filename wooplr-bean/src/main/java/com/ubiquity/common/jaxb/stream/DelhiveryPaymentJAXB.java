package com.ubiquity.common.jaxb.stream;

import java.io.Serializable;

/**
 * Created by abhishek on 8/16/16.
 */
public class DelhiveryPaymentJAXB implements Serializable {

    private final static Long serialVersionUID = 12343L;

    protected String paymentMode;
    protected String supported;     // intentionally made string

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getSupported() {
        return supported;
    }

    public void setSupported(String supported) {
        this.supported = supported;
    }
}
