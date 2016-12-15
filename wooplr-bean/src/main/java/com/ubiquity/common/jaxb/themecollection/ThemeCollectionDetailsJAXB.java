package com.ubiquity.common.jaxb.themecollection;

import java.io.Serializable;
import java.util.List;

public class ThemeCollectionDetailsJAXB implements Serializable {

	private String name;
	private long id;
	private String shortName;

	private int loveCount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private boolean loggedInUserFollow;

	private String description;

	private List<Long> owner_id;

	private String ownerName;

	private String collection_type;

	private String banner_image;

	private String owner_type;

	private Long createDate;

	private boolean isCurated;

	private boolean isFeatured;

	private String webLink;

	private boolean isPrivate;

	private String call_action_override;

	private List<String> productList;

	private List<String> lookList;

	private String cursor;

	private boolean showName;

	private String seoUrl;

	private String seoSearchTerm;

	private String longName;

	private String tags;

	private String viewCount;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setLoveCount(int loveCount) {
		this.loveCount = loveCount;
	}

	public int getLoveCount() {
		return this.loveCount;
	}

	public void setLoggedInUserFollow(boolean loggedInUserFollow) {
		this.loggedInUserFollow = loggedInUserFollow;
	}

	public boolean getLoggedInUserFollow() {
		return this.loggedInUserFollow;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setOwner_id(List<Long> owner_id) {
		this.owner_id = owner_id;
	}

	public List<Long>

			getOwner_id() {
		return this.owner_id;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setCollection_type(String collection_type) {
		this.collection_type = collection_type;
	}

	public String getCollection_type() {
		return this.collection_type;
	}

	public void setBanner_image(String banner_image) {
		this.banner_image = banner_image;
	}

	public String getBanner_image() {
		return this.banner_image;
	}

	public void setOwner_type(String owner_type) {
		this.owner_type = owner_type;
	}

	public String getOwner_type() {
		return this.owner_type;
	}

	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}

	public long getCreateDate() {
		return this.createDate;
	}

	public void setIsCurated(boolean isCurated) {
		this.isCurated = isCurated;
	}

	public boolean getIsCurated() {
		return this.isCurated;
	}

	public void setIsFeatured(boolean isFeatured) {
		this.isFeatured = isFeatured;
	}

	public boolean getIsFeatured() {
		return this.isFeatured;
	}

	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}

	public String getWebLink() {
		return this.webLink;
	}

	public void setIsPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public boolean getIsPrivate() {
		return this.isPrivate;
	}

	public void setCall_action_override(String call_action_override) {
		this.call_action_override = call_action_override;
	}

	public String getCall_action_override() {
		return this.call_action_override;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

	public List<String> getProductList() {
		return this.productList;
	}

	public void setLookList(List<String> lookList) {
		this.lookList = lookList;
	}

	public List<String> getLookList() {
		return this.lookList;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getCursor() {
		return this.cursor;
	}

	public void setShowName(boolean showName) {
		this.showName = showName;
	}

	public boolean getShowName() {
		return this.showName;
	}

	public void setSeoUrl(String seoUrl) {
		this.seoUrl = seoUrl;
	}

	public String getSeoUrl() {
		return this.seoUrl;
	}

	public void setSeoSearchTerm(String seoSearchTerm) {
		this.seoSearchTerm = seoSearchTerm;
	}

	public String getSeoSearchTerm() {
		return this.seoSearchTerm;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getLongName() {
		return this.longName;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTags() {
		return this.tags;
	}

	public void setViewCount(String viewCount) {
		this.viewCount = viewCount;
	}

	public String getViewCount() {
		return this.viewCount;
	}
}
