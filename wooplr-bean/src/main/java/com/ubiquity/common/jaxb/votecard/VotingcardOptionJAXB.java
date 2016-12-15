package com.ubiquity.common.jaxb.votecard;

import javax.jdo.annotations.Persistent;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by vamshi on 6/13/16.
 */
@XmlRootElement
public class VotingcardOptionJAXB implements Serializable, Comparable<VotingcardOptionJAXB>{
    private final static Long serialVersionUID = 12344L;
    @XmlElement
    private Long id;
    @XmlElement
    private Long votecardId;
    @XmlElement
    private String imagePid;   
    @XmlElement
    private boolean isGif;
    @XmlElement
    private String width;
    @XmlElement
    private String height;
    @XmlElement
    private String text;
    @XmlElement
    private Long currentCount;
    @XmlElement
    private Long position;
    @XmlElement
    private List<String> tags;

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVotecardId() {
        return votecardId;
    }

    public void setVotecardId(Long votecardId) {
        this.votecardId = votecardId;
    }

    public String getImagePid() {
        return imagePid;
    }

    public void setImagePid(String imagePid) {
        this.imagePid = imagePid;
    }

    public boolean getIsGif() {
        return isGif;
    }

    public void setIsGif(boolean isGif) {
        this.isGif = isGif;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Long currentCount) {
        this.currentCount = currentCount;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

	public int compareTo(VotingcardOptionJAXB o) {
		// TODO Auto-generated method stub
		return 0;
	}


    /*@Override
    public int compareTo(VotingcardOptionJAXB o) {
        return this.position.compareTo(o.position);
    }*/
}
