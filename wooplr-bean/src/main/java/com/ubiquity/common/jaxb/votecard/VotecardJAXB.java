package com.ubiquity.common.jaxb.votecard;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.ubiquity.common.jaxb.stream.ContentTypeJAXB;

/**
 * Created by vamshi on 6/13/16.
 */
@XmlRootElement
public class VotecardJAXB implements Serializable {
	private final static Long serialVersionUID = 12344L;
	@XmlElement
	private Long id;
	@XmlElement
	private String name;
	@XmlElement
	private String deeplink;
	@XmlElement
	private String title;
	@XmlElement
	private List<VotingcardOptionJAXB> optionsList;
	@XmlElement
	private List<VotingDescriptionJAXB> descriptionsList;
	@XmlElement
	private Long startTime;
	@XmlElement
	private Long endTime;
	@XmlElement
	private String contentType;
	@XmlElement(required = false)
	private ContentTypeJAXB contentTypeJAXB;
	@XmlElement
	private VotingResultJAXB votingResultJAXB;
	@XmlElement
	private String webLink;
	@XmlElement
	private Long createDate;

	public static Long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeeplink() {
		return deeplink;
	}

	public void setDeeplink(String deeplink) {
		this.deeplink = deeplink;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<VotingcardOptionJAXB> getOptionsList() {
		return optionsList;
	}

	public void setOptionsList(List<VotingcardOptionJAXB> optionsList) {
		this.optionsList = optionsList;
	}

	public Long getStartTime() {
		return startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getEndTime() {
		return endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<VotingDescriptionJAXB> getDescriptionsList() {
		return descriptionsList;
	}

	public void setDescriptionsList(List<VotingDescriptionJAXB> descriptionsList) {
		this.descriptionsList = descriptionsList;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public ContentTypeJAXB getContentTypeJAXB() {
		return contentTypeJAXB;
	}

	public void setContentTypeJAXB(ContentTypeJAXB contentTypeJAXB) {
		this.contentTypeJAXB = contentTypeJAXB;
	}

	public VotingResultJAXB getVotingResultJAXB() {
		return votingResultJAXB;
	}

	public void setVotingResultJAXB(VotingResultJAXB votingResultJAXB) {
		this.votingResultJAXB = votingResultJAXB;
	}

	public String getWebLink() {
		return webLink;
	}

	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}

	public Long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "VotecardJAXB{" + "id=" + id + ", name='" + name + '\'' + ", deeplink='" + deeplink + '\'' + ", title='"
				+ title + '\'' + ", optionsList=" + optionsList + ", descriptionsList=" + descriptionsList
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", contentType='" + contentType + '\''
				+ ", contentTypeJAXB=" + contentTypeJAXB + ", votingResultJAXB=" + votingResultJAXB + ", webLink='"
				+ webLink + '\'' + '}';
	}
}
