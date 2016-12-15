package com.ubiquity.app.entity.fashionlooks;

import java.util.Date;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Text;

/**
 * Created by soumenc3 on 4/6/15.
 */

@PersistenceCapable
public class FashionLook {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	@Persistent
	private String userTagItem;
	@Persistent
	private List<String> lookTags;
	@Persistent
	private String orphanImageId;
	@Persistent
	private Long userId;
	@Persistent
	private Boolean isAdmin;
	@Persistent
	private Boolean mobile;
	@Persistent
	private String lookSource;
	@Persistent
	private String externalLink;
	@Persistent
	private Double latitude;
	@Persistent
	private Double longitude;
	@Persistent
	private Text lookText;
	@Persistent
	private Date createDate;

	@Persistent
	private Long searchIndexLevel;

	@Persistent
	private Date searchIndexDate;

	@Persistent
	private Boolean searchIndexSuccess;

	@Persistent
	private Boolean isTagged;

	@Persistent
	private Boolean isLinked;

	@Persistent
	private Boolean isVerified;

	@Persistent
	private Double trendScore;
	@Persistent
	private Date lastTrend;

	@Persistent
	private Boolean staffPick;

	@Persistent
	private List<String> curatorAddedTags;

	@Persistent
	private List<String> notificationType;

	@Persistent
	private String curatorTitle;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserTagItem() {
		return userTagItem;
	}

	public void setUserTagItem(String userTagItem) {
		this.userTagItem = userTagItem;
	}

	public List<String> getLookTags() {
		return lookTags;
	}

	public void setLookTags(List<String> lookTags) {
		this.lookTags = lookTags;
	}

	public String getOrphanImageId() {
		return orphanImageId;
	}

	public void setOrphanImageId(String orphanImageId) {
		this.orphanImageId = orphanImageId;
	}

	public Boolean getAdmin() {
		return isAdmin;
	}

	public void setAdmin(Boolean admin) {
		isAdmin = admin;
	}

	public Boolean getMobile() {
		return mobile;
	}

	public void setMobile(Boolean mobile) {
		this.mobile = mobile;
	}

	public String getLookSource() {
		return lookSource.replaceAll("http://https://", "http://");
	}

	public void setLookSource(String lookSource) {
		this.lookSource = lookSource;
	}

	public String getExternalLink() {
		return externalLink;
	}

	public void setExternalLink(String externalLink) {
		this.externalLink = externalLink;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getLookText() {
		return lookText == null ? null : lookText.getValue();
	}

	public void setLookText(String lookText) {
		this.lookText = new Text(lookText);
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public void setLookText(Text lookText) {
		this.lookText = lookText;
	}

	public Long getSearchIndexLevel() {
		return searchIndexLevel;
	}

	public void setSearchIndexLevel(Long searchIndexLevel) {
		this.searchIndexLevel = searchIndexLevel;
	}

	public Date getSearchIndexDate() {
		return searchIndexDate;
	}

	public void setSearchIndexDate(Date searchIndexDate) {
		this.searchIndexDate = searchIndexDate;
	}

	public Boolean getSearchIndexSuccess() {
		return searchIndexSuccess;
	}

	public void setSearchIndexSuccess(Boolean searchIndexSuccess) {
		this.searchIndexSuccess = searchIndexSuccess;
	}

	public Boolean getIsLinked() {
		return isLinked;
	}

	public void setIsLinked(Boolean isLinked) {
		this.isLinked = isLinked;
	}

	public Boolean getIsTagged() {
		return isTagged;
	}

	public void setIsTagged(Boolean isTagged) {
		this.isTagged = isTagged;
	}

	public Double getTrendScore() {
		return trendScore;
	}

	public void setTrendScore(Double trendScore) {
		this.trendScore = trendScore;
	}

	public Date getLastTrend() {
		return lastTrend;
	}

	public void setLastTrend(Date lastTrend) {
		this.lastTrend = lastTrend;
	}

	public Boolean isStaffPick() {
		return staffPick;
	}

	public void setStaffPick(Boolean staffPick) {
		this.staffPick = staffPick;
	}

	public List<String> getCuratorAddedTags() {
		return curatorAddedTags;
	}

	public void setCuratorAddedTags(List<String> curatorAddedTags) {
		this.curatorAddedTags = curatorAddedTags;
	}

	public Boolean getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}

	public List<String> getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(List<String> notificationType) {
		this.notificationType = notificationType;
	}

	public String getCuratorTitle() {
		return curatorTitle;
	}

	public void setCuratorTitle(String curatorTitle) {
		this.curatorTitle = curatorTitle;
	}
}
