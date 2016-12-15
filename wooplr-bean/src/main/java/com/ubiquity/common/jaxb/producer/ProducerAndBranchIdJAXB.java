
package com.ubiquity.common.jaxb.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProducerAndBranchIdJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProducerAndBranchIdJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="producerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProducerAndBranchIdJAXB", propOrder = {
    "producerId",
    "branchId"
})
@XmlRootElement
public class ProducerAndBranchIdJAXB {

    protected long producerId;
    protected long branchId;

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

    /**
     * Gets the value of the branchId property.
     * 
     */
    public long getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     */
    public void setBranchId(long value) {
        this.branchId = value;
    }

}
