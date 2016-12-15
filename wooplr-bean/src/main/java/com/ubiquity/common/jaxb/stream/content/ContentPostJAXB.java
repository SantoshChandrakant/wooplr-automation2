package com.ubiquity.common.jaxb.stream.content;

import com.ubiquity.common.jaxb.stream.ContentTypeJAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by abhishek on 10/5/15.
 */


/**
 * <p>Java class for ContentJAXB complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ContentJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tags" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userDetails" type="{}StreamUserDetailJAXB"/>
 *         &lt;element name="comments" type="{}StreamRecommendationActionSmallJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fashionItems" type="{}FashionItemJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loveCount" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="commentCount" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="viewCount" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="hasBuyable" type="{http://www.w3.org/2001/XMLSchema}Boolean"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}Boolean"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}Double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}Double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentPostJAXB", propOrder = {
        "id",
        "title",
        "banner",
        "bannerHeight",
        "bannerWidth",
        "deepLink",
        "shortType",
        "tags",
        "isPublished",
        "isSticky",
        "createDate",
        "publishedDate",
        "authorId",
        "callToAction",
        "summary",
        "meta",
        "isBannerGif",
        "seoUrl",
        "seoSearchTerm"
})


@XmlRootElement
public class ContentPostJAXB implements Serializable {
    private final static Long serialVersionUID = 12343L;
    protected Long id;
    protected String title;
    protected String informalTitle;
    protected String banner;
    protected Long bannerHeight;
    protected Long bannerWidth;
    protected String detailsBanner;
    protected Long detailBannerHeight;
    protected Long detailBannerWidth;
    protected String deepLink;
    protected String shortType;
    protected List<String> tags;
    protected Boolean isPublished;
    protected Boolean isSticky;
    protected Date createDate;
    protected Date publishedDate;
    protected Long authorId;
    protected String callToAction;
    protected String summary;
    protected ContentMetaJAXB meta;
    protected Boolean isBannerGif;
    protected String seoUrl;



    protected String seoSearchTerm;
    //do not use this, kept for dashboard update call
    protected ContentTypeJAXB contentTypeJAXB;
    protected int widgetCount;
    protected Map<String, String> miscellaneous;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInformalTitle() {
        return informalTitle;
    }

    public void setInformalTitle(String informalTitle) {
        this.informalTitle = informalTitle;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String bannerUrl) {
        this.banner = bannerUrl;
    }

    public Long getBannerHeight() {
        return bannerHeight;
    }

    public void setBannerHeight(Long bannerHeight) {
        this.bannerHeight = bannerHeight;
    }

    public Long getBannerWidth() {
        return bannerWidth;
    }

    public void setBannerWidth(Long bannerWidth) {
        this.bannerWidth = bannerWidth;
    }

    public String getDeepLink() {
        return deepLink;
    }

    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    public String getShortType() {
        return shortType;
    }

    public void setShortType(String shortType) {
        this.shortType = shortType;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    public Boolean getIsSticky() {
        return isSticky;
    }

    public void setIsSticky(Boolean isSticky) {
        this.isSticky = isSticky;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getCallToAction() {
        return callToAction;
    }

    public void setCallToAction(String callToAction) {
        this.callToAction = callToAction;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ContentMetaJAXB getMeta() {
        return meta;
    }

    public void setMeta(ContentMetaJAXB meta) {
        this.meta = meta;
    }

    public String getDetailsBanner() {
        return detailsBanner;
    }

    public void setDetailsBanner(String detailsBanner) {
        this.detailsBanner = detailsBanner;
    }

    public Long getDetailBannerHeight() {
        return detailBannerHeight;
    }

    public void setDetailBannerHeight(Long detailBannerHeight) {
        this.detailBannerHeight = detailBannerHeight;
    }

    public Long getDetailBannerWidth() {
        return detailBannerWidth;
    }

    public void setDetailBannerWidth(Long detailBannerWidth) {
        this.detailBannerWidth = detailBannerWidth;
    }

    public Boolean getIsBannerGif() {
        return isBannerGif;
    }

    public void setIsBannerGif(Boolean isBannerGif) {
        this.isBannerGif = isBannerGif;
    }

    public String getSeoUrl() {
        return seoUrl;
    }

    public void setSeoUrl(String seoUrl) {
        this.seoUrl = seoUrl;
    }

    public String getSeoSearchTerm() {
        return seoSearchTerm;
    }

    public void setSeoSearchTerm(String seoSearchTerm) {
        this.seoSearchTerm = seoSearchTerm;
    }

    public Map<String, String> getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(Map<String, String> miscellaneous) {
        this.miscellaneous = miscellaneous;
    }
}

