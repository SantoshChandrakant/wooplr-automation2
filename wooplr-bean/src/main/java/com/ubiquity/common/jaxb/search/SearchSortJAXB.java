package com.ubiquity.common.jaxb.search;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by pravesh on 18/03/16.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "source",
        "entityType",
        "sortOptions"
})
@XmlRootElement(name = "SearchSortJAXB")
public class SearchSortJAXB implements Serializable {

    @XmlElement(required = true)
    protected String source;
    @XmlElement(required = true)
    protected String entityType;
    @XmlElement(required = true)
    protected List<SortOptionsJAXB> sortOptions;


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public List<SortOptionsJAXB> getSortOptions() {
        return sortOptions;
    }

    public void setSortOptions(List<SortOptionsJAXB> sortOptions) {
        this.sortOptions = sortOptions;
    }
}