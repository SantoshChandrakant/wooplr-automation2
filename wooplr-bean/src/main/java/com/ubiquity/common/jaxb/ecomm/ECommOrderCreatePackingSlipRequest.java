package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by subharthi on 5/23/16.
 */
@XmlRootElement
public class ECommOrderCreatePackingSlipRequest implements Serializable {
    @XmlElement
    private Long orderId;

    @XmlElement
    private String partner;

    @XmlElement
    private String wayBill;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getWayBill() {
        return wayBill;
    }

    public void setWayBill(String wayBill) {
        this.wayBill = wayBill;
    }
}
