package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for SearchFacetJAXB complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SearchFacetJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="currentCount" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */

/**
 * Created by Rajagopal on 9/15/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchFacetJAXB", propOrder = {
        "totalCount",
        "currentCount",
        "previousTimestamp",
        "currentTimestamp",
        "aggregations"
})
public class SearchFacetJAXB implements Serializable {
    private final static Long serialVersionUID = 12321L;
    @XmlElement(name = "totalCount", required = true)
    private Long totalCount;
    @XmlElement(name = "currentCount", required = true)
    private Long currentCount;

    private Long currentTimestamp;
    private Long previousTimestamp;
    @XmlElement(name = "aggregations", nillable = true)
    private List<SearchFacetAggregationJAXB> aggregations;

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Long currentCount) {
        this.currentCount = currentCount;
    }

    public Long getCurrentTimestamp() {
        return currentTimestamp;
    }

    public void setCurrentTimestamp(Long currentTimestamp) {
        this.currentTimestamp = currentTimestamp;
    }

    public Long getPreviousTimestamp() {
        return previousTimestamp;
    }

    public void setPreviousTimestamp(Long previousTimestamp) {
        this.previousTimestamp = previousTimestamp;
    }

    public List<SearchFacetAggregationJAXB> getAggregations() {
        if(aggregations == null){
            aggregations = new ArrayList<SearchFacetAggregationJAXB>();
        }
        return aggregations;
    }

    public boolean isSetAggregations(){
        return aggregations != null && !aggregations.isEmpty();
    }

    public void unsetAggregations(){
        aggregations = null;
    }

}
