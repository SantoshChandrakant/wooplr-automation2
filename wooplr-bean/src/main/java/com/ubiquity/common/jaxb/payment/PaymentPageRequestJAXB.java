package com.ubiquity.common.jaxb.payment;

import java.io.Serializable;

/**
 * Created by Rajagopal on 12/30/15.
 */
public class PaymentPageRequestJAXB implements Serializable {
    protected Long wooplrTransactionId;
    protected String productName;
    protected String imageUrl;
    protected String userName;
    protected String email;
    protected Double amount;
    protected String callbackUrl;
    protected String apiKey;
    protected Boolean valid;
    protected String phoneNo;
    protected String purchaseDescription;

    public Long getWooplrTransactionId() {
        return wooplrTransactionId;
    }

    public void setWooplrTransactionId(Long wooplrTransactionId) {
        this.wooplrTransactionId = wooplrTransactionId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPurchaseDescription() {
        return purchaseDescription;
    }

    public void setPurchaseDescription(String purchaseDescription) {
        this.purchaseDescription = purchaseDescription;
    }
}
