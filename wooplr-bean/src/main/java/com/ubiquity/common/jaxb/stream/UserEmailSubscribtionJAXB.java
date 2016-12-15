package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by abhishek on 7/19/16.
 */

@XmlRootElement
public class UserEmailSubscribtionJAXB implements Serializable {

    private final static Long serialVersionUID = 12344L;
    protected Long id;
    protected Date createDate;
    protected String emailId;
    protected List<String> unsubscribedKind;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<String> getUnsubscribedKind() {
        return unsubscribedKind;
    }

    public void setUnsubscribedKind(List<String> unsubscribedKind) {
        this.unsubscribedKind = unsubscribedKind;
    }
}
