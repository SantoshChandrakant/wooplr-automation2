package com.ubiquity.common.jaxb.stream.unicommerce;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Rajagopal on 6/30/16.
 */
public class UniCommerceProductSmallJAXB implements Serializable {
    protected Long id;
    protected List<UniCommerceSkuSmallJAXB> skus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<UniCommerceSkuSmallJAXB> getSkus() {
        return skus;
    }

    public void setSkus(List<UniCommerceSkuSmallJAXB> skus) {
        this.skus = skus;
    }
}
