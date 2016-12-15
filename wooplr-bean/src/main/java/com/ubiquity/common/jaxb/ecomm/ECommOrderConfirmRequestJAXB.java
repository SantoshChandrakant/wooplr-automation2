package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by subharthi on 5/24/16.
 */
@XmlRootElement
public class ECommOrderConfirmRequestJAXB implements Serializable {
    @XmlElement
    private Long orderId;
    @XmlElement
    private String merchantOrderId;
    @XmlElement
    private String comment;
    @XmlElement
    private Boolean forced;



    @XmlElement
    private Boolean placedStatus;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    public void setMerchantOrderId(String merchantOrderId) {
        this.merchantOrderId = merchantOrderId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getForced() {
        return forced;
    }

    public void setForced(Boolean forced) {
        this.forced = forced;
    }
    public Boolean getPlacedStatus() {
        return placedStatus;
    }

    public void setPlacedStatus(Boolean placedStatus) {
        this.placedStatus = placedStatus;
    }
}
