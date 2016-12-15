package com.ubiquity.common.jaxb.stream.pincode;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by abhishek on 5/25/16.
 */

@XmlRootElement(name = "PincodeResultResponse")
public class PincodeResultResponse implements Serializable {

    private final static Long serialVersionUID = 12343L;
    protected Boolean valid;
    protected List<EcommMessage> messages;

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public List<EcommMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<EcommMessage> messages) {
        this.messages = messages;
    }
}
