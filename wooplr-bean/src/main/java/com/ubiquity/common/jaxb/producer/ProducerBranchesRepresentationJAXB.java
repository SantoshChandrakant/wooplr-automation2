
package com.ubiquity.common.jaxb.producer;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for producerBranchesRepresentationJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="producerBranchesRepresentationJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="branchEntries" type="{}producerBranchDetailsJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="producerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producerBranchesRepresentationJAXB", propOrder = {
    "branchEntries",
    "producerName"
})
@XmlRootElement
public class ProducerBranchesRepresentationJAXB {

    @XmlElement(nillable = true)
    protected List<ProducerBranchDetailsJAXB> branchEntries;
    protected String producerName;

    /**
     * Gets the value of the branchEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProducerBranchDetailsJAXB }
     * 
     * 
     */
    public List<ProducerBranchDetailsJAXB> getBranchEntries() {
        if (branchEntries == null) {
            branchEntries = new ArrayList<ProducerBranchDetailsJAXB>();
        }
        return this.branchEntries;
    }

    /**
     * Gets the value of the producerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerName() {
        return producerName;
    }

    /**
     * Sets the value of the producerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerName(String value) {
        this.producerName = value;
    }

}
