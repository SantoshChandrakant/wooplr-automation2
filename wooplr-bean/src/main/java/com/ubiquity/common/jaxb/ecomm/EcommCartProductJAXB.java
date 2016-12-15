package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by Debasish on 02/08/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcommCartProductJAXB", propOrder = {
        "skuId",
        "productId"
})
public class EcommCartProductJAXB implements Serializable {

    protected Long skuId;
    protected Long productId;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

}
