
package com.ubiquity.common.jaxb.image;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orphanImageJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orphanImageJAXB">
 *   &lt;complexContent>
 *     &lt;extension base="{}savedOrphanImageJAXB">
 *       &lt;sequence>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="requestTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orphanImageJAXB", propOrder = {
    "image",
    "requestTimestamp",
    "userId"
})
public class OrphanImageJAXB
    extends SavedOrphanImageJAXB
{

    @XmlElement(required = true)
    protected byte[] image;
    @XmlElement(required = true)
    protected String requestTimestamp;
    protected Long userId;

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

    /**
     * Gets the value of the requestTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Sets the value of the requestTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTimestamp(String value) {
        this.requestTimestamp = value;
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

}
