
package com.ubiquity.common.jaxb.rest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileInviteWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileInviteWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invites" type="{}MobileInvite" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileInviteWrapper", propOrder = {
    "invites"
})
public class MobileInviteWrapper {

    @XmlElement(nillable = true)
    protected List<MobileInvite> invites;

    /**
     * Gets the value of the invites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobileInvite }
     * 
     * 
     */
    public List<MobileInvite> getInvites() {
        if (invites == null) {
            invites = new ArrayList<MobileInvite>();
        }
        return this.invites;
    }

}
