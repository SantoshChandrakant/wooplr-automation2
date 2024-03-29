//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.13 at 05:19:39 PM IST 
//


package com.ubiquity.common.jaxb.entityFull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for sponsoredRequestJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sponsoredRequestJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="campaigntype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="imageMimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="suspend" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="multipleParticipation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pointId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reviewPoints" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tags" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sponsorId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userlimit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sponsorType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="producerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="points" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="approved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tagsFull" type="{}EntityTagsDetailFullJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sponsoredRequestJAXB", propOrder = {
    "title",
    "description",
    "campaigntype",
    "image",
    "imageMimeType",
    "type",
    "admin",
    "suspend",
    "multipleParticipation",
    "endDate",
    "id",
    "pointId",
    "startDate",
    "reviewPoints",
    "tags",
    "sponsorId",
    "userlimit",
    "sponsorType",
    "producerId",
    "points",
    "approved",
    "tagsFull"
})
public class SponsoredRequestJAXB
    implements Serializable
{

    private final static long serialVersionUID = 123434L;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String campaigntype;
    @XmlElement(required = true)
    protected byte[] image;
    @XmlElement(required = true)
    protected String imageMimeType;
    @XmlElement(required = true)
    protected String type;
    protected boolean admin;
    protected boolean suspend;
    protected boolean multipleParticipation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Long id;
    protected Long pointId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected long reviewPoints;
    @XmlElement(required = true)
    protected String tags;
    protected long sponsorId;
    protected long userlimit;
    @XmlElement(required = true)
    protected String sponsorType;
    protected long producerId;
    protected int points;
    protected boolean approved;
    @XmlElement(nillable = true)
    protected List<EntityTagsDetailFullJAXB> tagsFull;

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
     * Gets the value of the campaigntype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaigntype() {
        return campaigntype;
    }

    /**
     * Sets the value of the campaigntype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaigntype(String value) {
        this.campaigntype = value;
    }

    public boolean isSetCampaigntype() {
        return (this.campaigntype!= null);
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = ((byte[]) value);
    }

    public boolean isSetImage() {
        return (this.image!= null);
    }

    /**
     * Gets the value of the imageMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageMimeType() {
        return imageMimeType;
    }

    /**
     * Sets the value of the imageMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageMimeType(String value) {
        this.imageMimeType = value;
    }

    public boolean isSetImageMimeType() {
        return (this.imageMimeType!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the admin property.
     * 
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * Sets the value of the admin property.
     * 
     */
    public void setAdmin(boolean value) {
        this.admin = value;
    }

    public boolean isSetAdmin() {
        return true;
    }

    /**
     * Gets the value of the suspend property.
     * 
     */
    public boolean isSuspend() {
        return suspend;
    }

    /**
     * Sets the value of the suspend property.
     * 
     */
    public void setSuspend(boolean value) {
        this.suspend = value;
    }

    public boolean isSetSuspend() {
        return true;
    }

    /**
     * Gets the value of the multipleParticipation property.
     * 
     */
    public boolean isMultipleParticipation() {
        return multipleParticipation;
    }

    /**
     * Sets the value of the multipleParticipation property.
     * 
     */
    public void setMultipleParticipation(boolean value) {
        this.multipleParticipation = value;
    }

    public boolean isSetMultipleParticipation() {
        return true;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    public boolean isSetEndDate() {
        return (this.endDate!= null);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    /**
     * Gets the value of the pointId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPointId() {
        return pointId;
    }

    /**
     * Sets the value of the pointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPointId(Long value) {
        this.pointId = value;
    }

    public boolean isSetPointId() {
        return (this.pointId!= null);
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    public boolean isSetStartDate() {
        return (this.startDate!= null);
    }

    /**
     * Gets the value of the reviewPoints property.
     * 
     */
    public long getReviewPoints() {
        return reviewPoints;
    }

    /**
     * Sets the value of the reviewPoints property.
     * 
     */
    public void setReviewPoints(long value) {
        this.reviewPoints = value;
    }

    public boolean isSetReviewPoints() {
        return true;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTags(String value) {
        this.tags = value;
    }

    public boolean isSetTags() {
        return (this.tags!= null);
    }

    /**
     * Gets the value of the sponsorId property.
     * 
     */
    public long getSponsorId() {
        return sponsorId;
    }

    /**
     * Sets the value of the sponsorId property.
     * 
     */
    public void setSponsorId(long value) {
        this.sponsorId = value;
    }

    public boolean isSetSponsorId() {
        return true;
    }

    /**
     * Gets the value of the userlimit property.
     * 
     */
    public long getUserlimit() {
        return userlimit;
    }

    /**
     * Sets the value of the userlimit property.
     * 
     */
    public void setUserlimit(long value) {
        this.userlimit = value;
    }

    public boolean isSetUserlimit() {
        return true;
    }

    /**
     * Gets the value of the sponsorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorType() {
        return sponsorType;
    }

    /**
     * Sets the value of the sponsorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorType(String value) {
        this.sponsorType = value;
    }

    public boolean isSetSponsorType() {
        return (this.sponsorType!= null);
    }

    /**
     * Gets the value of the producerId property.
     * 
     */
    public long getProducerId() {
        return producerId;
    }

    /**
     * Sets the value of the producerId property.
     * 
     */
    public void setProducerId(long value) {
        this.producerId = value;
    }

    public boolean isSetProducerId() {
        return true;
    }

    /**
     * Gets the value of the points property.
     * 
     */
    public int getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     */
    public void setPoints(int value) {
        this.points = value;
    }

    public boolean isSetPoints() {
        return true;
    }

    /**
     * Gets the value of the approved property.
     * 
     */
    public boolean isApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     */
    public void setApproved(boolean value) {
        this.approved = value;
    }

    public boolean isSetApproved() {
        return true;
    }

    /**
     * Gets the value of the tagsFull property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tagsFull property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTagsFull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityTagsDetailFullJAXB }
     * 
     * 
     */
    public List<EntityTagsDetailFullJAXB> getTagsFull() {
        if (tagsFull == null) {
            tagsFull = new ArrayList<EntityTagsDetailFullJAXB>();
        }
        return this.tagsFull;
    }

    public boolean isSetTagsFull() {
        return ((this.tagsFull!= null)&&(!this.tagsFull.isEmpty()));
    }

    public void unsetTagsFull() {
        this.tagsFull = null;
    }

}
