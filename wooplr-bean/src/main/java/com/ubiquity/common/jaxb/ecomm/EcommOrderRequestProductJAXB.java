package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by Rajagopal on 12/28/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcommOrderRequestProductJAXB", propOrder = {
        "id",
        "skuId",
        "productId",
        "storeId",
        "price"
})
public class EcommOrderRequestProductJAXB implements Serializable {
    protected Long id;
    protected Long skuId;
    protected Long productId;
    protected Long storeId;
    protected Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "EcommOrderRequestProductJAXB{" +
                "id=" + id +
                ", skuId=" + skuId +
                ", productId=" + productId +
                ", storeId=" + storeId +
                ", price=" + price +
                '}';
    }
}
