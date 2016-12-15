package com.ubiquity.common.jaxb.stream;

import com.ubiquity.common.jaxb.entityFull.RecommendationActionDetailFullJAXB;
import com.ubiquity.common.jaxb.entityFull.UserDetailBasicJAXB;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by abhishek on 5/28/15.
 */
@XmlRootElement
public class FashionLookUserLovesJAXB implements Serializable{

    Long lookId;
    List<UserDetailBasicJAXB> userLovesList;

    public Long getLookId() {
        return lookId;
    }

    public void setLookId(Long lookId) {
        this.lookId = lookId;
    }

    public List<UserDetailBasicJAXB> getUserLovesList() {
        return userLovesList;
    }

    public void setUserLovesList(List<UserDetailBasicJAXB> userLovesList) {
        this.userLovesList = userLovesList;
    }
}
