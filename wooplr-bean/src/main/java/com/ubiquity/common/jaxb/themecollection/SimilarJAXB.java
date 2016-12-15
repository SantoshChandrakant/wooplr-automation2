package com.ubiquity.common.jaxb.themecollection;

/**
 * Created by abhishek on 3/18/16.
 */

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimilarJAXB", propOrder = {
        "entityId",
        "entityType",
        "image",
        "title",
        "parentEntityId"
})
public class SimilarJAXB implements Serializable {

    private final static Long serialVersionUID = 12343L;
    protected Long entityId;
    protected String entityType;
    protected String image;
    protected String title;
    protected Long parentEntityId;

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getParentEntityId() {
        return parentEntityId;
    }

    public void setParentEntityId(Long parentEntityId) {
        this.parentEntityId = parentEntityId;
    }
}
