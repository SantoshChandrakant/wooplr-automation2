package com.ubiquity.common.jaxb.ecomm.inmobi;

import java.util.List;

/**
 * Created by pravesh on 06/04/16.
 */
public class InmobiProductImageJAXB {
    String primaryImageLink;
    List<String> additionalImageLinks;

    public String getPrimaryImageLink() {
        return primaryImageLink;
    }

    public void setPrimaryImageLink(String primaryImageLink) {
        this.primaryImageLink = primaryImageLink;
    }

    public List<String> getAdditionalImageLinks() {
        return additionalImageLinks;
    }

    public void setAdditionalImageLinks(List<String> additionalImageLinks) {
        this.additionalImageLinks = additionalImageLinks;
    }
}
