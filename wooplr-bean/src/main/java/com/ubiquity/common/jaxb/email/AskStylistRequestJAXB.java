package com.ubiquity.common.jaxb.email;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Map;

/**
 * Created by subharthi on 9/22/16.
 */
@XmlRootElement
public class AskStylistRequestJAXB implements Serializable {

    @XmlElement
    private String email;
    @XmlElement
    private String mobile;
    @XmlElement
    private String message;
    @XmlElement
    private Map<String, String> miscellaneous;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String> getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(Map<String, String> miscellaneous) {
        this.miscellaneous = miscellaneous;
    }
}
