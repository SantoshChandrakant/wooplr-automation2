//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.11 at 01:55:25 PM IST 
//


package com.ubiquity.common.jaxb.stream;

import com.ubiquity.common.jaxb.ecomm.EcommerceProductJAXB;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * <p>Java class for FashionLookJAXB complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FashionLookJAXB">
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
@XmlType(name = "FashionLookExtendedJAXB", propOrder = {
        "id",
        "entrytype",
        "text",
        "imageId",
        "externalLink",
        "webLink",
        "tags",
        "userDetails",
        "comments",
        "fashionItems",
        "fashionLooksProductJAXB",
        "loveCount",
        "commentCount",
        "viewCount",
        "hasBuyable",
        "createDate",
        "mobile",
        "source",
        "latitude",
        "longitude",
        "similarProducts",
        "similarLookJAXBList",
        "legacy",
        "image_pid",
        "isLinked",
        "isTagged",
        "isStaffPick",
        "curatorAddedTags",
        "imageDetails",
        "timestamp",
        "reviewLoves",
        "isloggedInUserFollowProductReview",
        "isloggedInUserSharedRecommendation",
        "linkedProducts"
})
@XmlRootElement public class FashionLookExtendedJAXB
        implements Serializable
{

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    @XmlElement(required = true)
    protected String entrytype;
    @XmlElement(required = true)
    protected Long timestamp;
    @XmlElement(required = true)
    protected String text;
    @XmlElement(required = true)
    protected String imageId;
    @XmlElement(required = true)
    protected String externalLink;
    @XmlElement(required = true)
    protected String webLink;
    @XmlElement(nillable = true)
    protected List<String> tags;
    @XmlElement(required = true)
    //protected StreamUserDetailJAXB userDetails;
    protected LookUserDetailJAXB userDetails;
    @XmlElement(nillable = true)
    protected List<StreamRecommendationActionSmallJAXB> comments;
    @XmlElement(nillable = true)
    protected List<StreamUserDetailJAXB> reviewLoves;
    @XmlElement(nillable = true)
    protected List<FashionItemJAXB> fashionItems;
    @XmlElement(nillable = true)
    protected List<FashionItemEcommSmallProductJAXB> fashionLooksProductJAXB;


    @XmlElement(nillable = true)
    protected List<FashionLookCommonJAXB> similarLookJAXBList;

    protected Long loveCount;
    protected Long commentCount;
    protected Long viewCount;

    protected Boolean hasBuyable;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date createDate;
    protected Boolean mobile;
    @XmlElement(required = true)
    protected String source;
    protected Double latitude;
    protected Double longitude;

    protected Boolean isloggedInUserFollowProductReview;
    protected Boolean isloggedInUserSharedRecommendation;

    protected Boolean isLinked;
    protected Boolean isTagged;

    @XmlElement(defaultValue="false", type = Boolean.class)
    protected Boolean legacy = false ;

    protected String image_pid;


    @XmlElement(nillable = true)
    protected List<FashionItemEcommSmallProductJAXB> linkedProducts;

    @XmlElement(nillable = true)
    protected List<EcommerceProductJAXB> similarProducts;
    private Boolean isStaffPick;
    private List<String> curatorAddedTags;
    private StreamImageDetailsJAXB imageDetails;

    public Boolean getLegacy() {
        return legacy;
    }

    public void setLegacy(Boolean legacy) {
        this.legacy = legacy;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void setComments(List<StreamRecommendationActionSmallJAXB> comments) {
        this.comments = comments;
    }

    public List<StreamUserDetailJAXB> getReviewLoves() {
        return reviewLoves;
    }

    public void setReviewLoves(List<StreamUserDetailJAXB> reviewLoves) {
        this.reviewLoves = reviewLoves;
    }

    public void setFashionItems(List<FashionItemJAXB> fashionItems) {
        this.fashionItems = fashionItems;
    }

    public void setFashionLooksProductJAXB(List<FashionItemEcommSmallProductJAXB> fashionLooksProductJAXB) {
        this.fashionLooksProductJAXB = fashionLooksProductJAXB;
    }

    public Boolean getHasBuyable() {
        return hasBuyable;
    }

    public Boolean getMobile() {
        return mobile;
    }

    public Boolean getIsloggedInUserFollowProductReview() {
        return isloggedInUserFollowProductReview;
    }

    public Boolean getIsloggedInUserSharedRecommendation() {
        return isloggedInUserSharedRecommendation;
    }

    public List<FashionItemEcommSmallProductJAXB> getLinkedProducts() {
        return linkedProducts;
    }

    public void setLinkedProducts(List<FashionItemEcommSmallProductJAXB> linkedProducts) {
        this.linkedProducts = linkedProducts;
    }

    public List<EcommerceProductJAXB> getSimmilarProducts() {
        return similarProducts;
    }

    public void setSimmilarProducts(List<EcommerceProductJAXB> simmilarProducts) {
        this.similarProducts = simmilarProducts;
    }



    public List<FashionItemEcommSmallProductJAXB> getFashionLooksProductJAXB() {
        if (fashionLooksProductJAXB == null) {
            fashionLooksProductJAXB = new ArrayList<FashionItemEcommSmallProductJAXB>();
        }
        return this.fashionLooksProductJAXB;
    }


    public List<FashionLookCommonJAXB> getSimilarLookJAXBList() {
        return similarLookJAXBList;
    }

    public void setSimilarLookJAXBList(List<FashionLookCommonJAXB> similarLookJAXBList) {
        this.similarLookJAXBList = similarLookJAXBList;
    }


    public Boolean isSetFashionLooksProductJAXB() {
        return ((this.fashionLooksProductJAXB!= null)&&(!this.fashionLooksProductJAXB.isEmpty()));
    }

    public void unsetFashionLooksProductJAXB() {
        this.fashionLooksProductJAXB = null;
    }

    /**
     * Gets the value of the isloggedInUserFollowProductReview property.
     *
     */
    public Boolean isIsloggedInUserFollowProductReview() {
        return isloggedInUserFollowProductReview;
    }

    /**
     * Sets the value of the isloggedInUserFollowProductReview property.
     *
     */
    public void setIsloggedInUserFollowProductReview(Boolean value) {
        this.isloggedInUserFollowProductReview = value;
    }

    public Boolean isSetIsloggedInUserFollowProductReview() {
        return true;
    }

    /**
     * Gets the value of the isloggedInUserSharedRecommendation property.
     *
     */
    public Boolean isIsloggedInUserSharedRecommendation() {
        return isloggedInUserSharedRecommendation;
    }

    /**
     * Sets the value of the isloggedInUserSharedRecommendation property.
     *
     */
    public void setIsloggedInUserSharedRecommendation(Boolean value) {
        this.isloggedInUserSharedRecommendation = value;
    }

    public Boolean isSetIsloggedInUserSharedRecommendation() {
        return true;
    }


    /**
     * Gets the value of the id property.
     *
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     */
    public void setId(Long value) {
        this.id = value;
    }

    public Boolean isSetId() {
        return true;
    }


    /**
     * Gets the value of the timestamp property.
     *
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     *
     */
    public void setTimestamp(Long value) {
        this.timestamp = value;
    }

    public Boolean isSetTimestamp() {
        return true;
    }

    /**
     * Gets the value of the text property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setText(String value) {
        this.text = value;
    }

    public Boolean isSetText() {
        return (this.text!= null);
    }

    /**
     * Gets the value of the imageId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * Sets the value of the imageId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImageId(String value) {
        this.imageId = value;
    }

    public Boolean isSetImageId() {
        return (this.imageId!= null);
    }

    /**
     * Gets the value of the externalLink property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExternalLink() {
        return externalLink;
    }

    /**
     * Sets the value of the externalLink property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExternalLink(String value) {
        this.externalLink = value;
    }

    public Boolean isSetExternalLink() {
        return (this.externalLink!= null);
    }

    /**
     * Gets the value of the webLink property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWebLink() {
        return webLink;
    }

    /**
     * Sets the value of the webLink property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWebLink(String value) {
        this.webLink = value;
    }

    public Boolean isSetWebLink() {
        return (this.webLink!= null);
    }

    /**
     * Gets the value of the tags property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tags property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTags().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getTags() {
        if (tags == null) {
            tags = new ArrayList<String>();
        }
        return this.tags;
    }

    public Boolean isSetTags() {
        return ((this.tags!= null)&&(!this.tags.isEmpty()));
    }

    public void unsetTags() {
        this.tags = null;
    }

    public LookUserDetailJAXB getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(LookUserDetailJAXB userDetails) {
        this.userDetails = userDetails;
    }

    public Boolean isSetUserDetails() {
        return (this.userDetails!= null);
    }

    /**
     * Gets the value of the comments property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.ubiquity.common.jaxb.stream.StreamRecommendationActionSmallJAXB }
     *
     *
     */
    public List<StreamRecommendationActionSmallJAXB> getComments() {
        if (comments == null) {
            comments = new ArrayList<StreamRecommendationActionSmallJAXB>();
        }
        return this.comments;
    }

    public Boolean isSetComments() {
        return ((this.comments!= null)&&(!this.comments.isEmpty()));
    }

    public void unsetComments() {
        this.comments = null;
    }

    /**
     * Gets the value of the fashionItems property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fashionItems property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFashionItems().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.ubiquity.common.jaxb.stream.FashionItemJAXB }
     *
     *
     */
    public List<FashionItemJAXB> getFashionItems() {
        if (fashionItems == null) {
            fashionItems = new ArrayList<FashionItemJAXB>();
        }
        return this.fashionItems;
    }

    public Boolean isSetFashionItems() {
        return ((this.fashionItems!= null)&&(!this.fashionItems.isEmpty()));
    }

    public void unsetFashionItems() {
        this.fashionItems = null;
    }

    /**
     * Gets the value of the loveCount property.
     *
     */
    public Long getLoveCount() {
        return loveCount;
    }

    /**
     * Sets the value of the loveCount property.
     *
     */
    public void setLoveCount(Long value) {
        this.loveCount = value;
    }

    public Boolean isSetLoveCount() {
        return true;
    }

    /**
     * Gets the value of the commentCount property.
     *
     */
    public Long getCommentCount() {
        return commentCount;
    }

    /**
     * Sets the value of the commentCount property.
     *
     */
    public void setCommentCount(Long value) {
        this.commentCount = value;
    }

    public Boolean isSetCommentCount() {
        return true;
    }

    /**
     * Gets the value of the viewCount property.
     *
     */
    public Long getViewCount() {
        return viewCount;
    }

    /**
     * Sets the value of the viewCount property.
     *
     */
    public void setViewCount(Long value) {
        this.viewCount = value;
    }

    public Boolean isSetViewCount() {
        return true;
    }

    /**
     * Gets the value of the hasBuyable property.
     *
     */
    public Boolean isHasBuyable() {
        return hasBuyable;
    }

    /**
     * Sets the value of the hasBuyable property.
     *
     */
    public void setHasBuyable(Boolean value) {
        this.hasBuyable = value;
    }

    public Boolean isSetHasBuyable() {
        return true;
    }

    /**
     * Gets the value of the createDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreateDate(Date value) {
        this.createDate = value;
    }

    public Boolean isSetCreateDate() {
        return (this.createDate!= null);
    }

    /**
     * Gets the value of the mobile property.
     *
     */
    public Boolean isMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     *
     */
    public void setMobile(Boolean value) {
        this.mobile = value;
    }

    public Boolean isSetMobile() {
        return true;
    }

    /**
     * Gets the value of the source property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSource(String value) {
        this.source = value;
    }

    public Boolean isSetSource() {
        return (this.source!= null);
    }

    /**
     * Gets the value of the latitude property.
     *
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     *
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    public Boolean isSetLatitude() {
        return true;
    }

    /**
     * Gets the value of the longitude property.
     *
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     *
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    public Boolean isSetLongitude() {
        return true;
    }

    public String getEntrytype() {
        return entrytype;
    }

    public void setEntrytype(String entrytype) {
        this.entrytype = entrytype;
    }

    public String getImage_pid() {
        return image_pid;
    }

    public void setImage_pid(String image_pid) {
        this.image_pid = image_pid;
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

    public Boolean getIsStaffPick() {
        return isStaffPick;
    }

    public void setIsStaffPick(Boolean staffPick) {
        this.isStaffPick = staffPick;
    }

    public List<String> getCuratorAddedTags() {
        return curatorAddedTags;
    }

    public void setCuratorAddedTags(List<String> curatorAddedTags) {
        this.curatorAddedTags = curatorAddedTags;
    }

    public StreamImageDetailsJAXB getImageDetails() {
        return imageDetails;
    }

    public void setImageDetails(StreamImageDetailsJAXB imageDetails) {
        this.imageDetails = imageDetails;
    }
}
