package com.ubiquity.common.jaxb.stream.reseller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by subharthi on 9/27/16.
 */
@XmlRootElement
public class ResellerSearchFilterJAXB implements Serializable{

    @XmlElement
    private String resellerId;
    @XmlElement
    private String name;
    @XmlElement
    private String phone;
    @XmlElement
    private String email;
    @XmlElement
    private String panNumber;
    @XmlElement
    private String resellerStoreName;
    @XmlElement
    private String subDomainUrl;
    @XmlElement
    private String pancardVerificationStatus;

    public String getResellerId() {
        return resellerId;
    }

    public void setResellerId(String resellerId) {
        this.resellerId = resellerId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getResellerStoreName() {
        return resellerStoreName;
    }

    public void setResellerStoreName(String resellerStoreName) {
        this.resellerStoreName = resellerStoreName;
    }

    public String getSubDomainUrl() {
        return subDomainUrl;
    }

    public void setSubDomainUrl(String subDomainUrl) {
        this.subDomainUrl = subDomainUrl;
    }

    public String getPancardVerificationStatus() {
        return pancardVerificationStatus;
    }

    public void setPancardVerificationStatus(String pancardVerificationStatus) {
        this.pancardVerificationStatus = pancardVerificationStatus;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResellerSearchFilterJAXB{");
        sb.append("resellerId='").append(resellerId).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", panNumber='").append(panNumber).append('\'');
        sb.append(", resellerStoreName='").append(resellerStoreName).append('\'');
        sb.append(", subDomainUrl='").append(subDomainUrl).append('\'');
        sb.append(", pancardVerificationStatus='").append(pancardVerificationStatus).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
