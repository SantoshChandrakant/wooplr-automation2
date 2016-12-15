package com.ubiquity.common.jaxb.ecomm;

import com.ubiquity.common.jaxb.promocode.PromotionCodeJAXB;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Rajagopal on 2/2/16.
 */
public class EcommTotalPriceBreakupJAXB implements Serializable {
    protected List<EcommItemPriceBreakupJAXB> itemPriceBreakup;
    protected Double totalPrice;
    protected Map<String, String> breakup;
    protected List<PriceBreakupPayloadJAXB> breakupOrder;
    protected String paymentType;
    protected List<ECommerceMessageJAXB> messageList;
    protected Boolean valid;
    protected Boolean isValidVoucher;

    public List<EcommItemPriceBreakupJAXB> getItemPriceBreakup() {
        return itemPriceBreakup;
    }

    public void setItemPriceBreakup(List<EcommItemPriceBreakupJAXB> itemPriceBreakup) {
        this.itemPriceBreakup = itemPriceBreakup;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Map<String, String> getBreakup() {
        return breakup;
    }

    public void setBreakup(Map<String, String> breakup) {
        this.breakup = breakup;
    }

    public List<PriceBreakupPayloadJAXB> getBreakupOrder() {
        return breakupOrder;
    }

    public void setBreakupOrder(List<PriceBreakupPayloadJAXB> breakupOrder) {
        this.breakupOrder = breakupOrder;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public List<ECommerceMessageJAXB> getMessageList() {
        if(this.messageList == null){
            this.messageList = new ArrayList<ECommerceMessageJAXB>();
        }
        return messageList;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Boolean getIsValidVoucher() {
        return isValidVoucher;
    }

    public void setIsValidVoucher(Boolean isValidVoucher) {
        this.isValidVoucher = isValidVoucher;
    }
}
