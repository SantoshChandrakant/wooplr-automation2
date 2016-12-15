package com.ubiquity.common.jaxb.stream.content;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ubiquity.common.jaxb.ecomm.Countable;
import com.ubiquity.common.jaxb.entityFull.UserDetailBasicJAXB;
import com.ubiquity.common.jaxb.stream.ContentTypeJAXB;
import com.ubiquity.common.jaxb.stream.LookUserDetailJAXB;
import com.ubiquity.common.jaxb.stream.StreamRecommendationActionSmallJAXB;
import com.ubiquity.common.jaxb.stream.WidgetJAXB;

/**
 * Created by abhishek on 10/5/15.
 */

/**
 * <p>
 * Java class for ContentJAXB complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
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
@XmlType(name = "ContentJAXB", propOrder = { "id", "title", "banner", "bannerHeight", "bannerWidth", "detailsBanner",
		"detailBannerHeight", "detailBannerWidth", "deepLink", "type", "shortType", "typePid", "sequence", "tags",
		"isPublished", "isSticky", "createDate", "publishedDate", "userDetail", "callToAction", "webLink", "summary",
		"widgetList", "nextContentId", "viewCount", "cursor", "loveCount", "commentCount", "contentLoves",
		"contentComments", "isloggedInUserFollowContent", "meta", "isloggedInUserFollowChannel", "isBannerGif",
		"seoUrl", "seoSearchTerm", "widgetCount" })

@XmlRootElement
public class ContentJAXB implements Serializable, Countable {
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
	protected String type;
	protected String shortType;
	protected String typePid;
	protected Double sequence;
	protected List<String> tags;
	protected Boolean isPublished;
	private Boolean isSticky;
	protected Long createDate;
	protected Long publishedDate;
	protected LookUserDetailJAXB userDetail;
	protected String callToAction;
	protected String webLink;
	protected String summary;
	protected List<WidgetJAXB> widgetList;
	protected Long nextContentId;
	protected Long viewCount;
	protected String cursor;
	protected Long loveCount;
	protected Long commentCount;
	protected Boolean isloggedInUserFollowContent;
	@XmlElement(nillable = true)
	protected List<UserDetailBasicJAXB> contentLoves;
	@XmlElement(nillable = true)
	protected List<StreamRecommendationActionSmallJAXB> contentComments;
	@XmlElement(nillable = true)
	protected ContentMetaJAXB meta;
	protected Boolean isloggedInUserFollowChannel;
	protected Boolean isBannerGif;
	protected ContentTypeJAXB contentTypeJAXB;
	protected String seoUrl;
	protected String seoSearchTerm;
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

	public ContentTypeJAXB getContentTypeJAXB() {
		return contentTypeJAXB;
	}

	public void setContentTypeJAXB(ContentTypeJAXB contentTypeJAXB) {
		this.contentTypeJAXB = contentTypeJAXB;
	}

	public String getDeepLink() {
		return deepLink;
	}

	public void setDeepLink(String deepLink) {
		this.deepLink = deepLink;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getShortType() {
		return shortType;
	}

	public void setShortType(String shortType) {
		this.shortType = shortType;
	}

	public String getTypePid() {
		return typePid;
	}

	public void setTypePid(String typePid) {
		this.typePid = typePid;
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

	public Long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}

	public Long getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Long publishedDate) {
		this.publishedDate = publishedDate;
	}

	public LookUserDetailJAXB getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(LookUserDetailJAXB userDetail) {
		this.userDetail = userDetail;
	}

	public String getCallToAction() {
		return callToAction;
	}

	public void setCallToAction(String callToAction) {
		this.callToAction = callToAction;
	}

	public String getWebLink() {
		return webLink;
	}

	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public List<WidgetJAXB> getWidgetList() {
		return widgetList;
	}

	public void setWidgetList(List<WidgetJAXB> widgetJAXBList) {
		this.widgetList = widgetJAXBList;
	}

	public Double getSequence() {
		return sequence;
	}

	public void setSequence(Double sequence) {
		this.sequence = sequence;
	}

	public Long getNextContentId() {
		return nextContentId;
	}

	public void setNextContentId(Long nextContentId) {
		this.nextContentId = nextContentId;
	}

	public Long getViewCount() {
		return viewCount;
	}

	public void setViewCount(Long viewCount) {
		this.viewCount = viewCount;
	}

	public String getCursor() {
		return cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public Long getLoveCount() {
		return loveCount;
	}

	public void setLoveCount(Long loveCount) {
		this.loveCount = loveCount;
	}

	public List<UserDetailBasicJAXB> getContentLoves() {
		return contentLoves;
	}

	public void setContentLoves(List<UserDetailBasicJAXB> contentLoves) {
		this.contentLoves = contentLoves;
	}

	public Long getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}

	public List<StreamRecommendationActionSmallJAXB> getContentComments() {
		if (contentComments == null) {
			contentComments = new ArrayList<StreamRecommendationActionSmallJAXB>();
		}
		return contentComments;
	}

	public void setContentComments(List<StreamRecommendationActionSmallJAXB> contentComments) {
		this.contentComments = contentComments;
	}

	public Boolean getIsloggedInUserFollowContent() {
		return isloggedInUserFollowContent;
	}

	public void setIsloggedInUserFollowContent(Boolean isloggedInUserFollowContent) {
		this.isloggedInUserFollowContent = isloggedInUserFollowContent;
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

	public Boolean getIsloggedInUserFollowChannel() {
		return isloggedInUserFollowChannel;
	}

	public void setIsloggedInUserFollowChannel(Boolean isloggedInUserFollowChannel) {
		this.isloggedInUserFollowChannel = isloggedInUserFollowChannel;
	}

	public Boolean getIsBannerGif() {
		return isBannerGif;
	}

	public void setIsBannerGif(Boolean isBannerGif) {
		this.isBannerGif = isBannerGif;
	}

	public String getInformalTitle() {
		return informalTitle;
	}

	public void setInformalTitle(String informalTitle) {
		this.informalTitle = informalTitle;
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

	public int getWidgetCount() {
		return widgetCount;
	}

	public void setWidgetCount(int widgetCount) {
		this.widgetCount = widgetCount;
	}

	public Map<String, String> getMiscellaneous() {
		return miscellaneous;
	}

	public void setMiscellaneous(Map<String, String> miscellaneous) {
		this.miscellaneous = miscellaneous;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ContentJAXB{");
		sb.append("id=").append(id);
		sb.append(", title='").append(title).append('\'');
		sb.append(", banner='").append(banner).append('\'');
		sb.append(", bannerHeight=").append(bannerHeight);
		sb.append(", bannerWidth=").append(bannerWidth);
		sb.append(", detailsBanner='").append(detailsBanner).append('\'');
		sb.append(", detailBannerHeight=").append(detailBannerHeight);
		sb.append(", detailBannerWidth=").append(detailBannerWidth);
		sb.append(", deepLink='").append(deepLink).append('\'');
		sb.append(", type='").append(type).append('\'');
		sb.append(", shortType='").append(shortType).append('\'');
		sb.append(", typePid='").append(typePid).append('\'');
		sb.append(", sequence=").append(sequence);
		sb.append(", tags=").append(tags);
		sb.append(", isPublished=").append(isPublished);
		sb.append(", isSticky=").append(isSticky);
		sb.append(", createDate=").append(createDate);
		sb.append(", publishedDate=").append(publishedDate);
		sb.append(", userDetail=").append(userDetail);
		sb.append(", callToAction='").append(callToAction).append('\'');
		sb.append(", webLink='").append(webLink).append('\'');
		sb.append(", summary='").append(summary).append('\'');
		sb.append(", widgetList=").append(widgetList);
		sb.append(", nextContentId=").append(nextContentId);
		sb.append(", viewCount=").append(viewCount);
		sb.append(", cursor='").append(cursor).append('\'');
		sb.append(", loveCount=").append(loveCount);
		sb.append(", commentCount=").append(commentCount);
		sb.append(", isloggedInUserFollowContent=").append(isloggedInUserFollowContent);
		sb.append(", contentLoves=").append(contentLoves);
		sb.append(", contentComments=").append(contentComments);
		sb.append(", meta=").append(meta);
		sb.append(", isloggedInUserFollowChannel=").append(isloggedInUserFollowChannel);
		sb.append('}');
		return sb.toString();
	}
}
