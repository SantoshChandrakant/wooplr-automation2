package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by abhishek on 6/30/16.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnicommercePackingSlipJAXB", propOrder = {
        "orderId",
        "packingslipurl",
        "waybillnumber",
        "delivery_partner"

})
@XmlRootElement
public class UnicommercePackingSlipJAXB implements Serializable {

    private final static Long serialVersionUID = 12343L;

    protected Long orderId;
    protected String packingslipurl;
    @XmlElement(required = true)
    protected String waybillnumber;
    @XmlElement(required = true)
    protected String delivery_partner;
    protected Boolean status;
    protected String message;


    public String getPackingslipurl() {
        return packingslipurl;
    }

    public void setPackingslipurl(String packingslipurl) {
        this.packingslipurl = packingslipurl;
    }

    public String getWaybillnumber() {
        return waybillnumber;
    }

    public void setWaybillnumber(String waybillnumber) {
        this.waybillnumber = waybillnumber;
    }

    public String getDelivery_partner() {
        return delivery_partner;
    }

    public void setDelivery_partner(String delivery_partner) {
        this.delivery_partner = delivery_partner;
    }

    public Long getOrderId() {

        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
