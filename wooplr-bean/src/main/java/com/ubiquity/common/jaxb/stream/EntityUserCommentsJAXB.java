package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;


/**
 * Created by abhishek on 5/29/15.
 */
@XmlRootElement
public class EntityUserCommentsJAXB implements Serializable{

    private Long entityId;
    private List<StreamRecommendationActionSmallJAXB> userCommentsList;

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public List<StreamRecommendationActionSmallJAXB> getUserCommentsList() {
        return userCommentsList;
    }

    public void setUserCommentsList(List<StreamRecommendationActionSmallJAXB> userCommentsList) {
        this.userCommentsList = userCommentsList;
    }
}