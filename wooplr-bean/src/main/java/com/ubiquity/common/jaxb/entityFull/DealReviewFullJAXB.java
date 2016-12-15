//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.13 at 05:19:39 PM IST 
//


package com.ubiquity.common.jaxb.entityFull;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for DealReviewFullJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealReviewFullJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reviewRating" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="producerDetails" type="{}ProducerDetailSmallJAXB"/>
 *         &lt;element name="dealDetails" type="{}DealDetailSmallJAXB"/>
 *         &lt;element name="userDetails" type="{}UserDetailSmallJAXB"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="userReviewRating" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="bySms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="likes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="shareCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="reviewView" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="relatedReviews" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rating" type="{}userRatingDetailJAXB"/>
 *         &lt;element name="tags" type="{}EntityTagsDetailFullJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealReviewFullJAXB", propOrder = {
    "id",
    "title",
    "reviewRating",
    "description",
    "producerDetails",
    "dealDetails",
    "userDetails",
    "createDate",
    "userReviewRating",
    "bySms",
    "likes",
    "comments",
    "shareCount",
    "reviewView",
    "relatedReviews",
    "rating",
    "tags"
})
public class DealReviewFullJAXB
    implements Serializable
{

    private final static long serialVersionUID = 123434L;
    protected long id;
    @XmlElement(required = true)
    protected String title;
    protected double reviewRating;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected ProducerDetailSmallJAXB producerDetails;
    @XmlElement(required = true)
    protected DealDetailSmallJAXB dealDetails;
    @XmlElement(required = true)
    protected UserDetailSmallJAXB userDetails;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    protected double userReviewRating;
    protected boolean bySms;
    protected long likes;
    protected long comments;
    protected long shareCount;
    protected long reviewView;
    protected long relatedReviews;
    @XmlElement(required = true)
    protected UserRatingDetailJAXB rating;
    @XmlElement(nillable = true)
    protected List<EntityTagsDetailFullJAXB> tags;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    public boolean isSetId() {
        return true;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the reviewRating property.
     * 
     */
    public double getReviewRating() {
        return reviewRating;
    }

    /**
     * Sets the value of the reviewRating property.
     * 
     */
    public void setReviewRating(double value) {
        this.reviewRating = value;
    }

    public boolean isSetReviewRating() {
        return true;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the producerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerDetailSmallJAXB }
     *     
     */
    public ProducerDetailSmallJAXB getProducerDetails() {
        return producerDetails;
    }

    /**
     * Sets the value of the producerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerDetailSmallJAXB }
     *     
     */
    public void setProducerDetails(ProducerDetailSmallJAXB value) {
        this.producerDetails = value;
    }

    public boolean isSetProducerDetails() {
        return (this.producerDetails!= null);
    }

    /**
     * Gets the value of the dealDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DealDetailSmallJAXB }
     *     
     */
    public DealDetailSmallJAXB getDealDetails() {
        return dealDetails;
    }

    /**
     * Sets the value of the dealDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealDetailSmallJAXB }
     *     
     */
    public void setDealDetails(DealDetailSmallJAXB value) {
        this.dealDetails = value;
    }

    public boolean isSetDealDetails() {
        return (this.dealDetails!= null);
    }

    /**
     * Gets the value of the userDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetailSmallJAXB }
     *     
     */
    public UserDetailSmallJAXB getUserDetails() {
        return userDetails;
    }

    /**
     * Sets the value of the userDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetailSmallJAXB }
     *     
     */
    public void setUserDetails(UserDetailSmallJAXB value) {
        this.userDetails = value;
    }

    public boolean isSetUserDetails() {
        return (this.userDetails!= null);
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    public boolean isSetCreateDate() {
        return (this.createDate!= null);
    }

    /**
     * Gets the value of the userReviewRating property.
     * 
     */
    public double getUserReviewRating() {
        return userReviewRating;
    }

    /**
     * Sets the value of the userReviewRating property.
     * 
     */
    public void setUserReviewRating(double value) {
        this.userReviewRating = value;
    }

    public boolean isSetUserReviewRating() {
        return true;
    }

    /**
     * Gets the value of the bySms property.
     * 
     */
    public boolean isBySms() {
        return bySms;
    }

    /**
     * Sets the value of the bySms property.
     * 
     */
    public void setBySms(boolean value) {
        this.bySms = value;
    }

    public boolean isSetBySms() {
        return true;
    }

    /**
     * Gets the value of the likes property.
     * 
     */
    public long getLikes() {
        return likes;
    }

    /**
     * Sets the value of the likes property.
     * 
     */
    public void setLikes(long value) {
        this.likes = value;
    }

    public boolean isSetLikes() {
        return true;
    }

    /**
     * Gets the value of the comments property.
     * 
     */
    public long getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     */
    public void setComments(long value) {
        this.comments = value;
    }

    public boolean isSetComments() {
        return true;
    }

    /**
     * Gets the value of the shareCount property.
     * 
     */
    public long getShareCount() {
        return shareCount;
    }

    /**
     * Sets the value of the shareCount property.
     * 
     */
    public void setShareCount(long value) {
        this.shareCount = value;
    }

    public boolean isSetShareCount() {
        return true;
    }

    /**
     * Gets the value of the reviewView property.
     * 
     */
    public long getReviewView() {
        return reviewView;
    }

    /**
     * Sets the value of the reviewView property.
     * 
     */
    public void setReviewView(long value) {
        this.reviewView = value;
    }

    public boolean isSetReviewView() {
        return true;
    }

    /**
     * Gets the value of the relatedReviews property.
     * 
     */
    public long getRelatedReviews() {
        return relatedReviews;
    }

    /**
     * Sets the value of the relatedReviews property.
     * 
     */
    public void setRelatedReviews(long value) {
        this.relatedReviews = value;
    }

    public boolean isSetRelatedReviews() {
        return true;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link UserRatingDetailJAXB }
     *     
     */
    public UserRatingDetailJAXB getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRatingDetailJAXB }
     *     
     */
    public void setRating(UserRatingDetailJAXB value) {
        this.rating = value;
    }

    public boolean isSetRating() {
        return (this.rating!= null);
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
     * {@link EntityTagsDetailFullJAXB }
     * 
     * 
     */
    public List<EntityTagsDetailFullJAXB> getTags() {
        if (tags == null) {
            tags = new ArrayList<EntityTagsDetailFullJAXB>();
        }
        return this.tags;
    }

    public boolean isSetTags() {
        return ((this.tags!= null)&&(!this.tags.isEmpty()));
    }

    public void unsetTags() {
        this.tags = null;
    }

}