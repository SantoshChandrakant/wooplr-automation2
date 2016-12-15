package com.ubiquity.common.jaxb.reaction;

import java.io.Serializable;

/**
 * Created by debasish on 6/10/2016.
 */
public class EntityReactionJAXB implements Serializable {

    private Long entityId;

    private Long entityType;

    private String type;

    private String image_pid;

    private Long reaction_id;

    private Boolean byMobile;

    private String comment;

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Long getEntityType() {
        return entityType;
    }

    public void setEntityType(Long entityType) {
        this.entityType = entityType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage_pid() {
        return image_pid;
    }

    public void setImage_pid(String image_pid) {
        this.image_pid = image_pid;
    }

    public Boolean getByMobile() {
        return byMobile;
    }

    public void setByMobile(Boolean byMobile) {
        this.byMobile = byMobile;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getReaction_id() {
        return reaction_id;
    }

    public void setReaction_id(Long reaction_id) {
        this.reaction_id = reaction_id;
    }
}
