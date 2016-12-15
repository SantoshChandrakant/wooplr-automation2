package com.ubiquity.common.jaxb.ecomm;

import com.ubiquity.common.jaxb.ecomm.inmobi.InmobiProductJAXB;

import java.util.List;

/**
 * Created by pravesh on 05/04/16.
 */
public class SharedECommProductListJAXB {

    String nextIndex;
    List<InmobiProductJAXB> productJAXBs;

    public String getNextIndex() {
        return nextIndex;
    }

    public void setNextIndex(String nextIndex) {
        this.nextIndex = nextIndex;
    }

    public List<InmobiProductJAXB> getProductJAXBs() {
        return productJAXBs;
    }

    public void setProductJAXBs(List<InmobiProductJAXB> productJAXBs) {
        this.productJAXBs = productJAXBs;
    }
}
