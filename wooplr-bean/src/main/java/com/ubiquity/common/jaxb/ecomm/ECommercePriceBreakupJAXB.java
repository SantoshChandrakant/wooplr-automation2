package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;

/**
 * Created by Rajagopal on 1/2/16.
 */
public class ECommercePriceBreakupJAXB implements Serializable {
    protected Double productPrice;
    protected Double codCharge;
    protected Double shippingCharge;
    protected Double ConvenienceCharge;
    protected Double discount;

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Double getCodCharge() {
        return codCharge;
    }

    public void setCodCharge(Double codCharge) {
        this.codCharge = codCharge;
    }

    public Double getShippingCharge() {
        return shippingCharge;
    }

    public void setShippingCharge(Double shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    public Double getConvenienceCharge() {
        return ConvenienceCharge;
    }

    public void setConvenienceCharge(Double convenienceCharge) {
        ConvenienceCharge = convenienceCharge;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
