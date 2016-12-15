package com.ubiquity.common.jaxb.votecard;

import com.ubiquity.common.jaxb.stream.ContentTypeJAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by vamshi on 7/8/16.
 */

@XmlRootElement
public class VotecardCreateResultJAXB implements Serializable {
    private final static Long serialVersionUID = 12344L;
    @XmlElement
    private Long id;
    @XmlElement
    private boolean status;
    @XmlElement
    private String errorMessage;


    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
