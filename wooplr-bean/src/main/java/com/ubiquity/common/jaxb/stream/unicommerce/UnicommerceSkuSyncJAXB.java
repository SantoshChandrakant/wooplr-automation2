package com.ubiquity.common.jaxb.stream.unicommerce;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by abhishek on 6/16/16.
 */
@XmlRootElement
public class UnicommerceSkuSyncJAXB implements Serializable {

    private final static Long serialVersionUID = 12343L;

    @XmlElement(required = true)
    protected Long skuId;
    @XmlElement(required = true)
    protected Integer quantity;
    @XmlElement(required = true)
    protected Double price;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
