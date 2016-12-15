package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by abhishek on 3/31/16.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FashionLookJAXB", propOrder = {
        "id",
        "createDate",
        "entityType",
        "entityId",
        "name",
        "parentEntityId",
})
@XmlRootElement
public class PromotionJAXB implements Serializable {
    private final static Long serialVersionUID = 12343L;
    protected Long id;
    @XmlElement(required = true)
    protected Date createDate;
    @XmlElement(required = true)
    protected String entityType;
    @XmlElement(required = true)
    protected Long entityId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Long parentEntityId;

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

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentEntityId() {
        return parentEntityId;
    }

    public void setParentEntityId(Long parentEntityId) {
        this.parentEntityId = parentEntityId;
    }
}
