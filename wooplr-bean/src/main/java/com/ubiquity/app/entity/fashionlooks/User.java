/// *****************************************************************************
// * Copyright (c) 2001 - 2011 Wooplr, Inc.
// * All Rights Reserverd.
// *
// * This software is confidential and proprietary information of Wooplr Inc.
// * Any reproduction of this software without prior written authorization
// * from Wooplr Inc. is strictly prohibited.
// ****************************************************************************/
//
/// *
// * User: Arjun
// * Date: Feb 7, 2011
// */
//
// package com.ubiquity.app.entity.fashionlooks;
//
// import java.io.Serializable;
// import java.util.Date;
// import java.util.List;
//
// import javax.cache.CacheException;
// import javax.jdo.annotations.IdGeneratorStrategy;
// import javax.jdo.annotations.PersistenceCapable;
// import javax.jdo.annotations.Persistent;
// import javax.jdo.annotations.PrimaryKey;
//
// import com.google.appengine.api.datastore.ShortBlob;
// import com.ubiquity.common.jaxb.ecomm.EntityConstants;
//
// @PersistenceCapable
// public class User implements Serializable {
//
// @PrimaryKey
// @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
// private Long id;
// @Persistent
// private Long imageBlobId;
// @Persistent
// private String userid;
// @Persistent
// private String fname;
// @Persistent
// private String lname;
// @Persistent
// private String email;
// @Persistent
// private ShortBlob password;
// @Persistent
// private String designation;
// @Persistent
// private String gender;
// @Persistent
// private Date dob;
// @Persistent
// private String mobileCountryCode;
// @Persistent
// private String mobile;
// @Persistent
// private EntityConstants.UserCommentsSetting userCommentsSetting;
// @Persistent
// private EntityConstants.UserCollectionCommentSetting
/// userCollectionCommentSetting;
// @Persistent
// private String facebookId;
// @Persistent
// private String twitterId;
// @Persistent
// private String blogUrl;
// @Persistent
// private Integer influenceScore;
// @Persistent
// private Integer pointsEarned;
// @Persistent
// private Integer pointsPending;
// @Persistent
// private Integer pointsRedeemed;
// @Persistent
// private List<Long> userTags;
// @Persistent
// private List<Long> reviews;
// @Persistent
// private Date createDate;
// @Persistent
// private Double trendScore;
// @Persistent
// private Date lastTrend;
// @Persistent
// private String facebookHandle;
// @Persistent
// private String twitterHandle;
// @Persistent
// private String alias;
// @Persistent
// private Long version;
// @Persistent
// private String title;
// @Persistent
// private String searchText;
// @Persistent
// private Long searchIndexLevel;
// @Persistent
// private List<String> fullSearchText;
//
// @Persistent
// private Boolean privateUser;
//
// @Persistent
// private Boolean active;
// @Persistent
// private String googlePlusId;
// @Persistent
// private String googlePlusLink;
// @Persistent
// private List<String> additionalEmails;
// // @Persistent
// // private Boolean facebookCrawled;
//
// @Persistent
// private EntityConstants.UserInviteSource crawlSource;
//
// @Persistent
// private Boolean loggedIn;
//
// @Persistent
// private Boolean isSpecial; // for curator admin access
//
// @Persistent
// private String status;
//
// @Persistent
// private List<String> deviceUniqueId;
//
// @Persistent
// private Date lastGetActivityDate;
//
// @Persistent
// private Date lastPostActivityDate;
//
// @Persistent
// private Date lastActivityDate;
//
// private List<Integer> profileCompleteness;
//
// @Persistent
// private Boolean isVerified;
//
// @Persistent
// private EntityConstants.ProfileType profileType;
//
// @Persistent
// private Boolean isOfficial;
//
// @Persistent
// private String instagramHandle;
//
// @Persistent
// private Float styleQuotient;
//
// @Persistent
// private List<String> userGroupTags;
//
// @Persistent
//
// private Integer profileStepShown;
//
// @Persistent
// private String eCommerceEmail;
//
// @Persistent
// private Long inactivityStatus;
//
// @Persistent
// private List<Long> cards;
//
// @Persistent
// private String appVersion;
//
// @Persistent
// private String iosAppVersion;
//
// @Persistent
// private String instagramAccessToken;
//
// public String getInstagramAccessToken() {
// return instagramAccessToken;
// }
//
// public void setInstagramAccessToken(String instagramAccessToken) {
// this.instagramAccessToken = instagramAccessToken;
// }
//
// public EntityConstants.UserInviteSource getCrawlSource() {
// return crawlSource;
// }
//
// public EntityConstants.UserCommentsSetting getUserCommentsSetting() {
// return userCommentsSetting;
// }
//
// public void setUserCommentsSetting(EntityConstants.UserCommentsSetting
/// userCommentsSetting) {
// this.userCommentsSetting = userCommentsSetting;
// }
//
// public EntityConstants.UserCollectionCommentSetting
/// getUserCollectionCommentSetting() {
// return userCollectionCommentSetting;
// }
//
// public void
/// setUserCollectionCommentSetting(EntityConstants.UserCollectionCommentSetting
/// userCollectionCommentSetting) {
// this.userCollectionCommentSetting = userCollectionCommentSetting;
// }
//
// public void setCrawlSource(EntityConstants.UserInviteSource crawlSource) {
// this.crawlSource = crawlSource;
// }
//
// public List<String> getAdditionalEmails() {
// return additionalEmails;
// }
//
// public void setAdditionalEmails(List<String> additionalEmails) {
// this.additionalEmails = additionalEmails;
// }
//
// public String getGooglePlusLink() {
// return googlePlusLink;
// }
//
// public Boolean getPrivateUser() {
// return privateUser;
// }
//
// public void setPrivateUser(Boolean privateUser) {
// this.privateUser = privateUser;
// }
//
// public void setGooglePlusLink(String googlePlusLink) {
// this.googlePlusLink = googlePlusLink;
// }
//
// public Boolean getActive() {
// return active;
// }
//
// public Long getSearchIndexLevel() {
// return searchIndexLevel;
// }
//
// public void setSearchIndexLevel(Long searchIndexLevel) {
// this.searchIndexLevel = searchIndexLevel;
// }
//
// public String getGooglePlusId() {
// return googlePlusId;
// }
//
// public void setGooglePlusId(String googlePlusId) {
// this.googlePlusId = googlePlusId;
// }
//
// public void removeFromCache() {
// CacheSupport.cacheDelete(this.getClass().getName(), id, false);
// }
//
// public void addToCache() {
// getFname(); // call to any of the field functions to ensure that the
// // entity is loaded
// try {
// CacheSupport.cachePut(this.getClass().getName(), id, this, false);
// } catch (CacheException e) {
// e.printStackTrace(System.err);
// }
// }
//
// public Long getId() {
// return id;
// }
//
// public void setId(Long id) {
// this.id = id;
// }
//
// public Date getLastTrend() {
// return lastTrend;
// }
//
// public String getSearchText() {
// return searchText;
// }
//
// public void setSearchText(String searchText) {
// this.searchText = searchText;
// }
//
// public List<String> getFullSearchText() {
// return fullSearchText;
// }
//
// public void setFullSearchText(List<String> fullSearchText) {
// this.fullSearchText = fullSearchText;
// }
//
// public void setLastTrend(Date lastTrend) {
// this.lastTrend = lastTrend;
// }
//
// public Long getVersion() {
// return version;
// }
//
// public void setVersion(Long version) {
// this.version = version;
// }
//
// public String getTitle() {
// return title;
// }
//
// public void setTitle(String title) {
// this.title = title;
// }
//
// public Double getTrendScore() {
// return trendScore;
// }
//
// public void setTrendScore(Double trendScore) {
// this.trendScore = trendScore;
// }
//
// public String getUserid() {
// return userid;
// }
//
// public void setUserid(String userid) {
// this.userid = userid;
// }
//
// public String getFname() {
// return fname;
// }
//
// public Long getImageBlobId() {
// return imageBlobId;
// }
//
// public void setImageBlobId(Long imageBlobId) {
// this.imageBlobId = imageBlobId;
// }
//
// public void setFname(String fname) {
// this.fname = fname;
// }
//
// public String getLname() {
// return lname;
// }
//
// public void setLname(String lname) {
// this.lname = lname;
// }
//
// public String getEmail() {
// return email;
// }
//
// public void setEmail(String email) {
// email = email.toLowerCase();
// this.email = email;
// }
//
// public ShortBlob getPassword() {
// return password;
// }
//
// public void setPassword(ShortBlob password) {
// this.password = password;
// }
//
// public String getGender() {
// return gender;
// }
//
// public void setGender(String gender) {
// this.gender = gender;
// }
//
// public Date getDob() {
// return dob;
// }
//
// public void setDob(Date dob) {
// this.dob = dob;
// }
//
// public String getMobileCountryCode() {
// return mobileCountryCode;
// }
//
// public void setMobileCountryCode(String mobileCountryCode) {
// this.mobileCountryCode = mobileCountryCode;
// }
//
// public String getMobile() {
// return mobile;
// }
//
// public String getAlias() {
// return alias;
// }
//
// public void setAlias(String alias) {
// this.alias = alias;
// }
//
// public void setMobile(String mobile) {
// this.mobile = mobile;
// }
//
// public String getFacebookId() {
// return facebookId;
// }
//
// public void setFacebookId(String facebookId) {
// this.facebookId = facebookId;
// }
//
// public Integer getInfluenceScore() {
// return influenceScore;
// }
//
// public void setInfluenceScore(Integer influenceScore) {
// this.influenceScore = influenceScore;
// }
//
// public Integer getPointsEarned() {
// return pointsEarned;
// }
//
// public void setPointsEarned(Integer pointsEarned) {
// this.pointsEarned = pointsEarned;
// }
//
// public Integer getPointsPending() {
// return pointsPending;
// }
//
// public void setPointsPending(Integer pointsPending) {
// this.pointsPending = pointsPending;
// }
//
// public Integer getPointsRedeemed() {
// return pointsRedeemed;
// }
//
// public void setPointsRedeemed(Integer pointsRedeemed) {
// this.pointsRedeemed = pointsRedeemed;
// }
//
// public List<Long> getUserTags() {
// return userTags;
// }
//
// public void setUserTags(List<Long> userTags) {
// this.userTags = userTags;
// }
//
// public void addUserTag(Long userTagId) {
// getUserTags().add(userTagId);
// }
//
// public List<Long> getReviews() {
// return reviews;
// }
//
// public void setReviews(List<Long> reviews) {
// this.reviews = reviews;
// }
//
// public void addReviews(Long reviewId) {
// getReviews().add(reviewId);
// }
//
// public void deleteReview(Long reviewId) {
// getReviews().remove(reviewId);
// }
//
// public Date getCreateDate() {
// Long temp = new Date().getTime() - 2592000000L;
//
// return createDate == null ? new Date(temp) : createDate;
// }
//
// public void setCreateDate(Date createDate) {
// this.createDate = createDate;
// }
//
// public String getName() {
// return fname + (lname == null ? "" : Constants.space + getLname());
// }
//
// public String getTwitterId() {
// return twitterId;
// }
//
// public void setTwitterId(String twitterId) {
// this.twitterId = twitterId;
// }
//
// public String getBlogUrl() {
// return blogUrl;
// }
//
// public void setBlogUrl(String blogUrl) {
// this.blogUrl = blogUrl;
// }
//
// public String getFacebookHandle() {
// return facebookHandle;
// }
//
// public void setFacebookHandle(String facebookHandle) {
// this.facebookHandle = facebookHandle;
// }
//
// public String getTwitterHandle() {
// return twitterHandle;
// }
//
// public void setTwitterHandle(String twitterHandle) {
// this.twitterHandle = twitterHandle;
// }
//
// public Boolean isActive() {
// return active;
// }
//
// public void setActive(Boolean active) {
// this.active = active;
// }
//
// public String getDesignation() {
// return designation;
// }
//
// public void setDesignation(String designation) {
// this.designation = designation;
// }
//
// public Boolean getLoggedIn() {
// return loggedIn;
// }
//
// public void setLoggedIn(Boolean loggedIn) {
// this.loggedIn = loggedIn;
// }
//
// public Boolean getIsSpecial() {
// return isSpecial;
// }
//
// public void setIsSpecial(Boolean isSpecial) {
// this.isSpecial = isSpecial;
// }
//
// public String getStatus() {
// return status;
// }
//
// public void setStatus(String status) {
// this.status = status;
// }
//
// public List<String> getDeviceUniqueId() {
// return deviceUniqueId;
// }
//
// public void setDeviceUniqueId(List<String> deviceUniqueId) {
// this.deviceUniqueId = deviceUniqueId;
// }
//
// public Date getLastGetActivityDate() {
// return lastGetActivityDate;
// }
//
// public void setLastGetActivityDate(Date lastGetActivityDate) {
// this.lastGetActivityDate = lastGetActivityDate;
// }
//
// public Date getLastPostActivityDate() {
// return lastPostActivityDate;
// }
//
// public void setLastPostActivityDate(Date lastPostActivityDate) {
// this.lastPostActivityDate = lastPostActivityDate;
// }
//
// public Date getLastActivityDate() {
// return lastActivityDate;
// }
//
// public void setLastActivityDate(Date lastActivityDate) {
// this.lastActivityDate = lastActivityDate;
// }
//
// public Long getInactivityStatus() {
// return inactivityStatus;
// }
//
// public void setInactivityStatus(Long inactivityStatus) {
// this.inactivityStatus = inactivityStatus;
// }
//
// @Override
// public boolean equals(Object o) {
// if (this == o)
// return true;
// if (!(o instanceof User))
// return false;
//
// User user = (User) o;
//
// if (!id.equals(user.id))
// return false;
//
// return true;
// }
//
// @Override
// public int hashCode() {
// return id.hashCode();
// }
//
// public List<Integer> getProfileCompleteness() {
// return profileCompleteness;
// }
//
// public void setProfileCompleteness(List<Integer> profileCompleteness) {
// this.profileCompleteness = profileCompleteness;
// }
//
// public Boolean getIsVerified() {
// return isVerified;
// }
//
// public void setIsVerified(Boolean isVerified) {
// this.isVerified = isVerified;
// }
//
// public String getInstagramHandle() {
// return instagramHandle;
// }
//
// public void setInstagramHandle(String instagramHandle) {
// this.instagramHandle = instagramHandle;
// }
//
// public Float getStyleQuotient() {
// return styleQuotient;
// }
//
// public void setStyleQuotient(Float styleQuotient) {
// this.styleQuotient = styleQuotient;
// }
//
// public Boolean getIsOfficial() {
// return isOfficial;
// }
//
// public void setIsOfficial(Boolean isOfficial) {
// this.isOfficial = isOfficial;
// }
//
// public EntityConstants.ProfileType getProfileType() {
// return profileType;
// }
//
// public void setProfileType(EntityConstants.ProfileType profileType) {
// this.profileType = profileType;
// }
//
// public List<String> getUserGroupTags() {
// return userGroupTags;
// }
//
// public void setUserGroupTags(List<String> userGroupTags) {
// this.userGroupTags = userGroupTags;
// }
//
// public Integer getProfileStepShown() {
// return profileStepShown;
// }
//
// public void setProfileStepShown(Integer profileStepShown) {
// this.profileStepShown = profileStepShown;
// }
//
// public String geteCommerceEmail() {
// return eCommerceEmail;
// }
//
// public void seteCommerceEmail(String eCommerceEmail) {
// this.eCommerceEmail = eCommerceEmail;
// }
//
// public List<Long> getCards() {
// return cards;
// }
//
// public void setCards(List<Long> cards) {
// this.cards = cards;
// }
//
// public String getAppVersion() {
// return appVersion;
// }
//
// public void setAppVersion(String appVersion) {
// this.appVersion = appVersion;
// }
//
// public String getIosAppVersion() {
// return iosAppVersion;
// }
//
// public void setIosAppVersion(String iosAppVersion) {
// this.iosAppVersion = iosAppVersion;
// }
// }
