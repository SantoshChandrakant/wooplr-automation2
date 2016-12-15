package com.ubiquity.common.jaxb.stream;

import com.ubiquity.common.jaxb.entityFull.UserDetailBasicJAXB;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by debasish on 5/28/15.
 */
@XmlRootElement
public class EntityUserLovesJAXB implements Serializable{

    Long entityId;
    List<UserDetailBasicJAXB> userLovesList;

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public List<UserDetailBasicJAXB> getUserLovesList() {
        return userLovesList;
    }

    public void setUserLovesList(List<UserDetailBasicJAXB> userLovesList) {
        this.userLovesList = userLovesList;
    }
}
