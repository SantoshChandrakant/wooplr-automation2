
package com.ubiquity.common.jaxb.producer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for producerListRepresentationJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="producerListRepresentationJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="producerEntries" type="{}producerSignupDetailsJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producerListRepresentationJAXB", propOrder = {
    "producerEntries"
})
public class ProducerListRepresentationJAXB {

    @XmlElement(nillable = true)
    protected List<ProducerSignupDetailsJAXB> producerEntries;

    /**
     * Gets the value of the producerEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producerEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducerEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProducerSignupDetailsJAXB }
     * 
     * 
     */
    public List<ProducerSignupDetailsJAXB> getProducerEntries() {
        if (producerEntries == null) {
            producerEntries = new ArrayList<ProducerSignupDetailsJAXB>();
        }
        return this.producerEntries;
    }

}
