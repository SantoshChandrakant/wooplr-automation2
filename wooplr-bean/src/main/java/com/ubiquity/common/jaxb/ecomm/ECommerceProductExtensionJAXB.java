package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

/**
 * Created by debasish on 12/30/2015.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ecommerceProductExtensionJAXB", propOrder = {
        "cod_charge",
        "shipping_charge",
        "tax",
        "shipping_time",
        "convenience_charge",
        "payments",
        "refund_time",
        "return_time",
        "sizing_chart_url",
        "sizing_chart_version",
        "shipping_method"
})
public class ECommerceProductExtensionJAXB implements Serializable {

    private Double cod_charge = 0.0;

    private Double shipping_charge = 0.0;

    private Double tax = 0.0;

    private String shipping_time;

    private String wooplr_reason;

    private Double convenience_charge = 0.0;

    private List<ECommerceProductPaymentJAXB> payments;

    private String refund_time;

    private String return_time;

    private String sizing_chart_url;

    private int sizing_chart_version;

    private String shipping_method;

    public Double getCod_charge() {
        return cod_charge;
    }

    public void setCod_charge(Double cod_charge) {
        this.cod_charge = cod_charge;
    }

    public Double getShipping_charge() {
        return shipping_charge;
    }

    public void setShipping_charge(Double shipping_charge) {
        this.shipping_charge = shipping_charge;
    }

    public String getWooplr_reason() {
        return wooplr_reason;
    }

    public void setWooplr_reason(String wooplr_reason) {
        this.wooplr_reason = wooplr_reason;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public String getShipping_time() {
        return shipping_time;
    }

    public void setShipping_time(String shipping_time) {
        this.shipping_time = shipping_time;
    }

    public Double getConvenience_charge() {
        return convenience_charge;
    }

    public void setConvenience_charge(Double convenience_charge) {
        this.convenience_charge = convenience_charge;
    }

    public List<ECommerceProductPaymentJAXB> getPayments() {
        return payments;
    }

    public void setPayments(List<ECommerceProductPaymentJAXB> payments) {
        this.payments = payments;
    }

    public String getRefund_time() {
        return refund_time;
    }

    public void setRefund_time(String refund_time) {
        this.refund_time = refund_time;
    }

    public String getReturn_time() {
        return return_time;
    }

    public void setReturn_time(String return_time) {
        this.return_time = return_time;
    }

    public String getSizing_chart_url() {
        return sizing_chart_url;
    }

    public void setSizing_chart_url(String sizing_chart_url) {
        this.sizing_chart_url = sizing_chart_url;
    }

    public int getSizing_chart_version() {
        return sizing_chart_version;
    }

    public void setSizing_chart_version(int sizing_chart_version) {
        this.sizing_chart_version = sizing_chart_version;
    }

    public String getShipping_method() {
        return shipping_method;
    }

    public void setShipping_method(String shipping_method) {
        this.shipping_method = shipping_method;
    }
}
