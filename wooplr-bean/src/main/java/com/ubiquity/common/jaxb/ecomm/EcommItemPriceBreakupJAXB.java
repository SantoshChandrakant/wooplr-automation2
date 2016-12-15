package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Rajagopal on 2/2/16.
 */
public class EcommItemPriceBreakupJAXB implements Serializable {
    protected Long skuId;
    protected Long productId;
    protected Double totalPrice;
    protected String productName;
    protected Map<String, String> breakup;
    protected List<PriceBreakupPayloadJAXB> breakupOrder;
    protected List<ECommerceMessageJAXB> messageList;
    protected Boolean valid;

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

    public List<ECommerceMessageJAXB> getMessageList() {
        if (messageList == null){
            messageList = new ArrayList<ECommerceMessageJAXB>();
        }
        return messageList;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
