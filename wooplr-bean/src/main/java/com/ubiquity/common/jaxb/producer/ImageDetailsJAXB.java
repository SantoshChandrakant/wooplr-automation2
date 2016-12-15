
package com.ubiquity.common.jaxb.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;


/**
 * <p>Java class for ImageDetailsJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageDetailsJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imageBlobId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cdnKeyOriginal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cdnKeyTiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cdnKeyThumb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cdnKeySquare" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cdnKeyWeb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cdnKeyBig" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cdnKeyWebList" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="imageMimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageDetailsJAXB", propOrder = {
    "imageBlobId",
    "cdnKeyOriginal",
    "cdnKeyTiny",
    "cdnKeyThumb",
    "cdnKeySquare",
    "cdnKeyWeb",
    "cdnKeyBig",
    "cdnKeyWebList",
    "cdnKeyBanner",
    "createDate",
    "imageMimeType"
})
public class ImageDetailsJAXB implements Serializable {

    protected long imageBlobId;
    @XmlElement(required = true)
    protected String cdnKeyOriginal;
    @XmlElement(required = true)
    protected String cdnKeyTiny;
    @XmlElement(required = true)
    protected String cdnKeyThumb;
    @XmlElement(required = true)
    protected String cdnKeySquare;
    @XmlElement(required = true)
    protected String cdnKeyWeb;
    @XmlElement(required = true)
    protected String cdnKeyBig;
    @XmlElement(required = true)
    protected String cdnKeyWebList;
    @XmlElement(required = true)
    protected String cdnKeyBanner;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(required = true)
    protected String imageMimeType;



    /**
     * Gets the value of the imageBlobId property.
     * 
     */
    public long getImageBlobId() {
        return imageBlobId;
    }

    /**
     * Sets the value of the imageBlobId property.
     * 
     */
    public void setImageBlobId(long value) {
        this.imageBlobId = value;
    }

    /**
     * Gets the value of the cdnKeyOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdnKeyOriginal() {
        return cdnKeyOriginal;
    }

    /**
     * Sets the value of the cdnKeyOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdnKeyOriginal(String value) {
        this.cdnKeyOriginal = value;
    }

    /**
     * Gets the value of the cdnKeyTiny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdnKeyTiny() {
        return cdnKeyTiny;
    }

    /**
     * Sets the value of the cdnKeyTiny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdnKeyTiny(String value) {
        this.cdnKeyTiny = value;
    }

    /**
     * Gets the value of the cdnKeyThumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdnKeyThumb() {
        return cdnKeyThumb;
    }

    /**
     * Sets the value of the cdnKeyThumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdnKeyThumb(String value) {
        this.cdnKeyThumb = value;
    }

    /**
     * Gets the value of the cdnKeySquare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdnKeySquare() {
        return cdnKeySquare;
    }

    /**
     * Sets the value of the cdnKeySquare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdnKeySquare(String value) {
        this.cdnKeySquare = value;
    }

    /**
     * Gets the value of the cdnKeyWeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdnKeyWeb() {
        return cdnKeyWeb;
    }

    /**
     * Sets the value of the cdnKeyWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdnKeyWeb(String value) {
        this.cdnKeyWeb = value;
    }

    /**
     * Gets the value of the cdnKeyBig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdnKeyBig() {
        return cdnKeyBig;
    }

    /**
     * Sets the value of the cdnKeyBig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdnKeyBig(String value) {
        this.cdnKeyBig = value;
    }

    /**
     * Gets the value of the cdnKeyWebList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdnKeyWebList() {
        return cdnKeyWebList;
    }

    /**
     * Sets the value of the cdnKeyWebList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdnKeyWebList(String value) {
        this.cdnKeyWebList = value;
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

    public String getCdnKeyBanner() {
        return cdnKeyBanner;
    }

    public void setCdnKeyBanner(String cdnKeyBanner) {
        this.cdnKeyBanner = cdnKeyBanner;
    }
}
