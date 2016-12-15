package com.ubiquity.common.jaxb.stream.unicommerce;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/**
 * Created by Rajagopal on 6/30/16.
 */
public class UniCommerceSkuSmallJAXB implements Serializable {
    protected Long id;
    protected Long productId;
    protected String skuId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
}
