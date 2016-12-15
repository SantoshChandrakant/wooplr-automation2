package com.ubiquity.common.jaxb.stream;

/**
 * Created by abhishek on 8/12/15.
 */

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;


/**
 * <p>Java class for FashionLookJAXB complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FashionLookJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollegeUserJAXB", propOrder = {
        "id",
        "createDate",
        "userName",
        "userId",
        "creatorId",
        "collegeCampusId",
        "ownerType"
})
@XmlRootElement
public class CollegeUserJAXB implements Serializable
{

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    @XmlElement(required = true)
    protected Long userId;
    @XmlSchemaType(name = "dateTime")
    protected Date createDate;
    protected Long creatorId;
    protected Long collegeCampusId;
    protected String ownerType;
    protected String userName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Long getCollegeCampusId() {
        return collegeCampusId;
    }

    public void setCollegeCampusId(Long collegeCampusId) {
        this.collegeCampusId = collegeCampusId;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

