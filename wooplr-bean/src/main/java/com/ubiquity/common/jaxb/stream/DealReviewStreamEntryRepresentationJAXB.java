//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.11 at 01:55:25 PM IST 
//


package com.ubiquity.common.jaxb.stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DealReviewStreamEntryRepresentationJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealReviewStreamEntryRepresentationJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="entrytype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dealDetails" type="{}StreamDealDetailJAXB"/>
 *         &lt;element name="userDetails" type="{}StreamUserDetailJAXB"/>
 *         &lt;element name="producerDetails" type="{}StreamProducerDetailJAXB"/>
 *         &lt;element name="branchDetails" type="{}StreamProducerBranchDetailJAXB"/>
 *         &lt;element name="imageDetails" type="{}StreamImageDetailsJAXB"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}Double"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="likes" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="relatedReviews" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="reviewView" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="userRating" type="{}userRatingDetailJAXB"/>
 *         &lt;element name="tags" type="{}StreamTagsDetailJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealReviewStreamEntryRepresentationJAXB", propOrder = {
    "id",
    "entrytype",
    "weight",
    "timestamp",
    "description",
    "category",
    "title",
    "dealDetails",
    "userDetails",
    "producerDetails",
    "branchDetails",
    "imageDetails",
    "rating",
    "createDate",
    "likes",
    "comments",
    "relatedReviews",
    "reviewView",
    "userRating",
    "tags"
})
@XmlRootElement public class DealReviewStreamEntryRepresentationJAXB
    implements Serializable
{

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    @XmlElement(required = true)
    protected String entrytype;
    protected Long weight;
    protected Long timestamp;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected StreamDealDetailJAXB dealDetails;
    @XmlElement(required = true)
    protected StreamUserDetailJAXB userDetails;
    @XmlElement(required = true)
    protected StreamProducerDetailJAXB producerDetails;
    @XmlElement(required = true)
    protected StreamProducerBranchDetailJAXB branchDetails;
    @XmlElement(required = true)
    protected StreamImageDetailsJAXB imageDetails;
    protected Double rating;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date createDate;
    protected Long likes;
    protected Long comments;
    protected Long relatedReviews;
    protected Long reviewView;
    @XmlElement(required = true)
    protected UserRatingDetailJAXB userRating;
    @XmlElement(nillable = true)
    protected List<StreamTagsDetailJAXB> tags;

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
     * Gets the value of the entrytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrytype() {
        return entrytype;
    }

    /**
     * Sets the value of the entrytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrytype(String value) {
        this.entrytype = value;
    }

    public Boolean isSetEntrytype() {
        return (this.entrytype!= null);
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public Long getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(Long value) {
        this.weight = value;
    }

    public Boolean isSetWeight() {
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

    public Boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    public Boolean isSetCategory() {
        return (this.category!= null);
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

    public Boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the dealDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamDealDetailJAXB }
     *     
     */
    public StreamDealDetailJAXB getDealDetails() {
        return dealDetails;
    }

    /**
     * Sets the value of the dealDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamDealDetailJAXB }
     *     
     */
    public void setDealDetails(StreamDealDetailJAXB value) {
        this.dealDetails = value;
    }

    public Boolean isSetDealDetails() {
        return (this.dealDetails!= null);
    }

    /**
     * Gets the value of the userDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamUserDetailJAXB }
     *     
     */
    public StreamUserDetailJAXB getUserDetails() {
        return userDetails;
    }

    /**
     * Sets the value of the userDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamUserDetailJAXB }
     *     
     */
    public void setUserDetails(StreamUserDetailJAXB value) {
        this.userDetails = value;
    }

    public Boolean isSetUserDetails() {
        return (this.userDetails!= null);
    }

    /**
     * Gets the value of the producerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamProducerDetailJAXB }
     *     
     */
    public StreamProducerDetailJAXB getProducerDetails() {
        return producerDetails;
    }

    /**
     * Sets the value of the producerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamProducerDetailJAXB }
     *     
     */
    public void setProducerDetails(StreamProducerDetailJAXB value) {
        this.producerDetails = value;
    }

    public Boolean isSetProducerDetails() {
        return (this.producerDetails!= null);
    }

    /**
     * Gets the value of the branchDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamProducerBranchDetailJAXB }
     *     
     */
    public StreamProducerBranchDetailJAXB getBranchDetails() {
        return branchDetails;
    }

    /**
     * Sets the value of the branchDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamProducerBranchDetailJAXB }
     *     
     */
    public void setBranchDetails(StreamProducerBranchDetailJAXB value) {
        this.branchDetails = value;
    }

    public Boolean isSetBranchDetails() {
        return (this.branchDetails!= null);
    }

    /**
     * Gets the value of the imageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StreamImageDetailsJAXB }
     *     
     */
    public StreamImageDetailsJAXB getImageDetails() {
        return imageDetails;
    }

    /**
     * Sets the value of the imageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamImageDetailsJAXB }
     *     
     */
    public void setImageDetails(StreamImageDetailsJAXB value) {
        this.imageDetails = value;
    }

    public Boolean isSetImageDetails() {
        return (this.imageDetails!= null);
    }

    /**
     * Gets the value of the rating property.
     * 
     */
    public Double getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     */
    public void setRating(Double value) {
        this.rating = value;
    }

    public Boolean isSetRating() {
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
     * Gets the value of the likes property.
     * 
     */
    public Long getLikes() {
        return likes;
    }

    /**
     * Sets the value of the likes property.
     * 
     */
    public void setLikes(Long value) {
        this.likes = value;
    }

    public Boolean isSetLikes() {
        return true;
    }

    /**
     * Gets the value of the comments property.
     * 
     */
    public Long getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     */
    public void setComments(Long value) {
        this.comments = value;
    }

    public Boolean isSetComments() {
        return true;
    }

    /**
     * Gets the value of the relatedReviews property.
     * 
     */
    public Long getRelatedReviews() {
        return relatedReviews;
    }

    /**
     * Sets the value of the relatedReviews property.
     * 
     */
    public void setRelatedReviews(Long value) {
        this.relatedReviews = value;
    }

    public Boolean isSetRelatedReviews() {
        return true;
    }

    /**
     * Gets the value of the reviewView property.
     * 
     */
    public Long getReviewView() {
        return reviewView;
    }

    /**
     * Sets the value of the reviewView property.
     * 
     */
    public void setReviewView(Long value) {
        this.reviewView = value;
    }

    public Boolean isSetReviewView() {
        return true;
    }

    /**
     * Gets the value of the userRating property.
     * 
     * @return
     *     possible object is
     *     {@link UserRatingDetailJAXB }
     *     
     */
    public UserRatingDetailJAXB getUserRating() {
        return userRating;
    }

    /**
     * Sets the value of the userRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRatingDetailJAXB }
     *     
     */
    public void setUserRating(UserRatingDetailJAXB value) {
        this.userRating = value;
    }

    public Boolean isSetUserRating() {
        return (this.userRating!= null);
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
     * {@link StreamTagsDetailJAXB }
     * 
     * 
     */
    public List<StreamTagsDetailJAXB> getTags() {
        if (tags == null) {
            tags = new ArrayList<StreamTagsDetailJAXB>();
        }
        return this.tags;
    }

    public Boolean isSetTags() {
        return ((this.tags!= null)&&(!this.tags.isEmpty()));
    }

    public void unsetTags() {
        this.tags = null;
    }

}
