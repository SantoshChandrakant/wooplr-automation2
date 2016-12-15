package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;

/**
 * Created by Rajagopal on 1/27/16.
 */
public class ECommPaymentResponseJAXB implements Serializable{
    protected boolean status;
    protected Long transactionId;
    protected String email;

    public ECommPaymentResponseJAXB(){
        status = false;
        transactionId = null;
        email = null;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
