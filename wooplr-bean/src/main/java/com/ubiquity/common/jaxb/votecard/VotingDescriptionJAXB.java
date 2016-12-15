package com.ubiquity.common.jaxb.votecard;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by vamshi on 6/14/16.
 */
@XmlRootElement
public class VotingDescriptionJAXB implements Serializable{
    private final static Long serialVersionUID = 12344L;
    @XmlElement
    private Long id;
    @XmlElement
    private Long votecardId;
    @XmlElement
    private String type;
    @XmlElement
    private String description;
    @XmlElement
    private String descriptionColor;
    @XmlElement
    private String descriptionDeeplink;
    @XmlElement
    private String subTitle;

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionColor() {
        return descriptionColor;
    }

    public void setDescriptionColor(String descriptionColor) {
        this.descriptionColor = descriptionColor;
    }

    public String getDescriptionDeeplink() {
        return descriptionDeeplink;
    }

    public void setDescriptionDeeplink(String descriptionDeeplink) {
        this.descriptionDeeplink = descriptionDeeplink;
    }

    public Long getVotecardId() {
        return votecardId;
    }

    public void setVotecardId(Long votecardId) {
        this.votecardId = votecardId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Override
    public String toString() {
        return "VotingDescriptionJAXB{" +
                "id=" + id +
                ", votecardId=" + votecardId +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", descriptionColor='" + descriptionColor + '\'' +
                ", descriptionDeeplink='" + descriptionDeeplink + '\'' +
                ", subTitle='" + subTitle + '\'' +
                '}';
    }
}
