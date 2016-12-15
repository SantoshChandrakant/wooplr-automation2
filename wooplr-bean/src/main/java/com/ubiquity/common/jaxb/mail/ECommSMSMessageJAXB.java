package com.ubiquity.common.jaxb.mail;

/**
 * Created by debasish on 1/18/2016.
 */
public class ECommSMSMessageJAXB {

    private String sms_template;

    private String userName;

    private String orderId;

    private String productName;

    private String userMobile;

    private String userEmail;

    public String getSms_template() {
        return sms_template;
    }

    public void setSms_template(String sms_template) {
        this.sms_template = sms_template;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
