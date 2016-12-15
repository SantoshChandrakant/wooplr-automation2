package com.ubiquity.common.jaxb.stream.campaign;

import com.ubiquity.common.jaxb.stream.GenericStreamEntry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Rajagopal on 12/3/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignJAXB", propOrder = {
        "id",
        "campaignTitle",
        "campaignType",
        "bannerImage",
        "startDate",
        "endDate",
        "hashTagToShow",
        "hashTagToSearch",
        "summary",
        "details",
        "storeId",
        "storeName",
        "termsAndCondition",
        "leadingEntities",
        "leadingListType",
        "winnersUpdatedAt"
})
@XmlRootElement
public class CampaignJAXB implements Serializable {
    private final static Long serialVersionUID = 12343L;
    protected Long id;
    protected String campaignTitle;
    protected String campaignType;
    protected String bannerImage;
    protected Long startDate;
    protected Long endDate;
    protected String hashTagToShow;
    protected List<String> hashTagToSearch;
    protected String summary;
    protected String details;
    protected Long storeId;
    protected String storeName;
    protected String termsAndCondition;
    protected List<GenericStreamEntry> leadingEntities;
    protected String leadingListType;
    protected Long winnersUpdatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCampaignTitle() {
        return campaignTitle;
    }

    public void setCampaignTitle(String campaignTitle) {
        this.campaignTitle = campaignTitle;
    }

    public String getCampaignType() {
        return campaignType;
    }

    public void setCampaignType(String campaignType) {
        this.campaignType = campaignType;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public String getHashTagToShow() {
        return hashTagToShow;
    }

    public void setHashTagToShow(String hashTagToShow) {
        this.hashTagToShow = hashTagToShow;
    }

    public List<String> getHashTagToSearch() {
        return hashTagToSearch;
    }

    public void setHashTagToSearch(List<String> hashTagToSearch) {
        this.hashTagToSearch = hashTagToSearch;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getTermsAndCondition() {
        return termsAndCondition;
    }

    public void setTermsAndCondition(String termsAndCondition) {
        this.termsAndCondition = termsAndCondition;
    }

    public List<GenericStreamEntry> getLeadingEntities() {
        return leadingEntities;
    }

    public void setLeadingEntities(List<GenericStreamEntry> leadingEntities) {
        this.leadingEntities = leadingEntities;
    }

    public String getLeadingListType() {
        return leadingListType;
    }

    public void setLeadingListType(String leadingListType) {
        this.leadingListType = leadingListType;
    }

    public Long getWinnersUpdatedAt() {
        return winnersUpdatedAt;
    }

    public void setWinnersUpdatedAt(Long winnersUpdatedAt) {
        this.winnersUpdatedAt = winnersUpdatedAt;
    }
}
