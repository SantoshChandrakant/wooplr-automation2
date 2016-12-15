
package com.ubiquity.common.jaxb.personalization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CSPFeedEntry complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CSPFeedEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activityString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subjectIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="attributeTags" type="{}AttributeTag" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSPFeedEntry", propOrder = {
        "activityString",
        "objectId",
        "objectType",
        "subjectIds",
        "attributeTags"
})
public class CSPFeedEntry implements Serializable {

    @XmlElement(required = true)
    protected String activityString;
    @XmlElement(required = true, nillable = true)
    protected String objectId;
    @XmlElement(required = true, nillable = true)
    protected String objectType;
    @XmlElement(required = true)
    protected List<String> subjectIds;
    @XmlElement(required = true)
    protected List<AttributeTag> attributeTags;

    public CSPFeedEntry() {}

    public CSPFeedEntry(String activityString, String objectId, String objectType, List<String> subjectIds, List<AttributeTag> attributeTags) {
        this.activityString = activityString;
        this.objectId = objectId;
        this.objectType = objectType;
        this.subjectIds = subjectIds;
        this.attributeTags = attributeTags;
    }

    /**
     * Gets the value of the activityString property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActivityString() {
        return activityString;
    }

    /**
     * Sets the value of the activityString property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActivityString(String value) {
        this.activityString = value;
    }

    public boolean isSetActivityString() {
        return (this.activityString!= null);
    }

    /**
     * Gets the value of the objectId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    public boolean isSetObjectId() {
        return (this.objectId!= null);
    }

    /**
     * Gets the value of the objectType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    public boolean isSetObjectType() {
        return (this.objectType!= null);
    }

    /**
     * Gets the value of the subjectIds property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectIds property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectIds().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getSubjectIds() {
        if (subjectIds == null) {
            subjectIds = new ArrayList<String>();
        }
        return this.subjectIds;
    }

    public boolean isSetSubjectIds() {
        return ((this.subjectIds!= null)&&(!this.subjectIds.isEmpty()));
    }

    public void unsetSubjectIds() {
        this.subjectIds = null;
    }

    /**
     * Gets the value of the attributeTags property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeTags property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeTags().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeTag }
     *
     *
     */
    public List<AttributeTag> getAttributeTags() {
        if (attributeTags == null) {
            attributeTags = new ArrayList<AttributeTag>();
        }
        return this.attributeTags;
    }

    public boolean isSetAttributeTags() {
        return ((this.attributeTags!= null)&&(!this.attributeTags.isEmpty()));
    }

    public void unsetAttributeTags() {
        this.attributeTags = null;
    }

}
