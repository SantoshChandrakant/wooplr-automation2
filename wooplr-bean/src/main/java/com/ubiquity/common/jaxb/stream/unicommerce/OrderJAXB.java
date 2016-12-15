package com.ubiquity.common.jaxb.stream.unicommerce;

/**
 * Created by abhishek on 5/11/16.
 */

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FashionLookJAXB", propOrder = {
        "orderId",
        "orderItemId",
        "fulfillmentType"

})
@XmlRootElement
public class OrderJAXB implements Serializable {
    private final static Long serialVersionUID = 12343L;
    protected String orderId;
    protected String orderItemId;
    protected String fulfillmentType;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getFulfillmentType() {
        return fulfillmentType;
    }

    public void setFulfillmentType(String fulfillmentType) {
        this.fulfillmentType = fulfillmentType;
    }
}
