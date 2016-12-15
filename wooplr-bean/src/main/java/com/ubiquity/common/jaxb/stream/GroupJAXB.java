package com.ubiquity.common.jaxb.stream;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ubiquity.common.jaxb.entityFull.UserDetailBasicJAXB;

/**
 * Created by abhishek on 2/8/16.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupJAXB", propOrder = { "id", "createDate", "groupTag", "bannerImg", "sequence", "description",
		"imageList", "isCoreGroup", "userList", "groupLoves", "isloggedInUserFollowGroup", "weblink" })

@XmlRootElement
public class GroupJAXB implements Serializable {
	private final static Long serialVersionUID = 12343L;
	protected Long id;
	protected Long createDate;
	protected String groupTag;
	protected String bannerImg;
	protected Double sequence;
	protected String description;
	protected List<String> imageList;
	protected Boolean isCoreGroup;
	// protected List<TopEntityRecommendations> userList;
	protected List<UserDetailBasicJAXB> groupLoves;
	protected Boolean isloggedInUserFollowGroup;
	protected String weblink;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}

	public String getGroupTag() {
		return groupTag;
	}

	public void setGroupTag(String groupTag) {
		this.groupTag = groupTag;
	}

	public String getBannerImg() {
		return bannerImg;
	}

	public void setBannerImg(String bannerImg) {
		this.bannerImg = bannerImg;
	}

	public Double getSequence() {
		return sequence;
	}

	public void setSequence(Double sequence) {
		this.sequence = sequence;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getImageList() {
		return imageList;
	}

	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}

	public Boolean getIsCoreGroup() {
		return isCoreGroup;
	}

	public void setIsCoreGroup(Boolean isCoreGroup) {
		this.isCoreGroup = isCoreGroup;
	}

	// public List<TopEntityRecommendations> getUserList() {
	// return userList;
	// }
	//
	// public void setUserList(List<TopEntityRecommendations> userList) {
	// this.userList = userList;
	// }

	public List<UserDetailBasicJAXB> getGroupLoves() {
		return groupLoves;
	}

	public void setGroupLoves(List<UserDetailBasicJAXB> groupLoves) {
		this.groupLoves = groupLoves;
	}

	public Boolean getIsloggedInUserFollowGroup() {
		return isloggedInUserFollowGroup;
	}

	public void setIsloggedInUserFollowGroup(Boolean isloggedInUserFollowGroup) {
		this.isloggedInUserFollowGroup = isloggedInUserFollowGroup;
	}

	public String getWeblink() {
		return weblink;
	}

	public void setWeblink(String weblink) {
		this.weblink = weblink;
	}
}
