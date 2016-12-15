package com.ubiquity.common.jaxb.stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajagopal on 10/8/15.
 */
public class SearchFacetAggregationJAXB implements Serializable {
    private final static Long serialVersionUID = 12323L;
    private String type;
    private List<SearchFacetAggregationDetailsJAXB> details;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<SearchFacetAggregationDetailsJAXB> getDetails() {
        if(details == null){
            details = new ArrayList<SearchFacetAggregationDetailsJAXB>();
        }
        return details;
    }

    public boolean isSetDetails(){
        return details != null && !details.isEmpty();
    }

    public void unsetDetails(){
        details = null;
    }
}
