//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.11 at 01:55:25 PM IST 
//


package com.ubiquity.common.jaxb.stream;

import com.ubiquity.common.jaxb.reaction.ReactionJAXB;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StreamRecommendationActionSmallJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreamRecommendationActionSmallJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="share" type="{http://www.w3.org/2001/XMLSchema}Boolean"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="byMobile" type="{http://www.w3.org/2001/XMLSchema}Boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamRecommendationActionSmallJAXB", propOrder = {
    "id",
    "share",
    "userId",
    "userName",
    "text",
    "createdDate",
    "byMobile",
    "showImage",
    "gender",
    "status",
        "reaction"
})
@XmlRootElement public class StreamRecommendationActionSmallJAXB
    implements Serializable
{

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    protected Boolean share;
    protected Long userId;
    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String text;

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date createdDate;
    protected Boolean byMobile;
    protected Boolean showImage;
    protected String gender;
    protected String status;

    protected ReactionJAXB reaction;

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
     * Gets the value of the share property.
     * 
     */
    public Boolean isShare() {
        return share;
    }

    /**
     * Sets the value of the share property.
     * 
     */
    public void setShare(Boolean value) {
        this.share = value;
    }

    public Boolean isSetShare() {
        return true;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    public Boolean isSetUserId() {
        return true;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    public Boolean isSetUserName() {
        return (this.userName!= null);
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
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    public Boolean isSetCreatedDate() {
        return (this.createdDate!= null);
    }

    /**
     * Gets the value of the byMobile property.
     * 
     */
    public Boolean isByMobile() {
        return byMobile;
    }

    /**
     * Sets the value of the byMobile property.
     * 
     */
    public void setByMobile(Boolean value) {
        this.byMobile = value;
    }

    public Boolean isSetByMobile() {
        return true;
    }

    public Boolean getShowImage() {
        return showImage;
    }

    public void setShowImage(Boolean showImage) {
        this.showImage = showImage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ReactionJAXB getReaction() {
        return reaction;
    }

    public void setReaction(ReactionJAXB reaction) {
        this.reaction = reaction;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StreamRecommendationActionSmallJAXB{");
        sb.append("id=").append(id);
        sb.append(", share=").append(share);
        sb.append(", userId=").append(userId);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append(", createdDate=").append(createdDate);
        sb.append(", byMobile=").append(byMobile);
        sb.append('}');
        return sb.toString();
    }

}
