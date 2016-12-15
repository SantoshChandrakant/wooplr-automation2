package com.ubiquity.common.jaxb;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by abhishek on 10/7/16.
 */
public class ResellerPanUltraInfo implements Serializable {
    Long resellerId;
    Date createDate;
    String nameOnPancard;
    String panNumber;
    String pancardImg;
    String pancardVerificationStatus;


    public Long getResellerId() {
        return resellerId;
    }

    public void setResellerId(Long resellerId) {
        this.resellerId = resellerId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getNameOnPancard() {
        return nameOnPancard;
    }

    public void setNameOnPancard(String nameOnPancard) {
        this.nameOnPancard = nameOnPancard;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getPancardImg() {
        return pancardImg;
    }

    public void setPancardImg(String pancardImg) {
        this.pancardImg = pancardImg;
    }

    public String getPancardVerificationStatus() {
        return pancardVerificationStatus;
    }

    public void setPancardVerificationStatus(String pancardVerificationStatus) {
        this.pancardVerificationStatus = pancardVerificationStatus;
    }


}
