
package com.ubiquity.common.jaxb.autosuggest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuggestionStreamRepresentationJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuggestionStreamRepresentationJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="suggestionEntries" type="{}AttributeEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestionStreamRepresentationJAXB", propOrder = {
    "suggestionEntries"
})
public class SuggestionStreamRepresentationJAXB {

    @XmlElement(nillable = true)
    protected List<AttributeEntry> suggestionEntries;

    /**
     * Gets the value of the suggestionEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestionEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestionEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeEntry }
     * 
     * 
     */
    public List<AttributeEntry> getSuggestionEntries() {
        if (suggestionEntries == null) {
            suggestionEntries = new ArrayList<AttributeEntry>();
        }
        return this.suggestionEntries;
    }

}
