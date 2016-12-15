package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by subharthi on 5/24/16.
 */
@XmlRootElement
public class ECommOrderUpdateShippingRequest implements Serializable{
    @XmlElement
    private Long orderId;
    @XmlElement
    private String trackingId;
    @XmlElement
    private String trackingUrl;
    @XmlElement
    private String partner;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getTrackingUrl() {
        return trackingUrl;
    }

    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }
}
