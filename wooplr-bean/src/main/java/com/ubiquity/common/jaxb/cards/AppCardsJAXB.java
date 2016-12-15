package com.ubiquity.common.jaxb.cards;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by debasish on 3/17/2016.
 */
public class AppCardsJAXB implements Serializable {

    private Long id;

    private String name;

    private Date createDate;

    private String description;

    private String type;

    private String banner;

    private String smallImage;

    private String callToAction;

    private String deepLink;

    private String bgColor;

    private String layoutType;

    private Long rewards;

    private Boolean isGiff;

    private Long priority;

    private Long appVersion;

    private Integer width;

    private Integer height;

    private Boolean published;

    private List<SubAppCardsJAXB> subcards;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public String getCallToAction() {
        return callToAction;
    }

    public void setCallToAction(String callToAction) {
        this.callToAction = callToAction;
    }

    public String getDeepLink() {
        return deepLink;
    }

    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getLayoutType() {
        return layoutType;
    }

    public void setLayoutType(String layoutType) {
        this.layoutType = layoutType;
    }

    public Long getRewards() {
        return rewards;
    }

    public void setRewards(Long rewards) {
        this.rewards = rewards;
    }

    public Boolean getIsGiff() {
        return isGiff;
    }

    public void setIsGiff(Boolean isGiff) {
        this.isGiff = isGiff;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Long getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(Long appVersion) {
        this.appVersion = appVersion;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public List<SubAppCardsJAXB> getSubcards() {
        return subcards;
    }

    public void setSubcards(List<SubAppCardsJAXB> subcards) {
        this.subcards = subcards;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }
}
