package com.ubiquity.common.jaxb.ecomm;

import com.ubiquity.common.jaxb.promocode.PromotionCodeJAXB;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajagopal on 2/9/16.
 */
public class ECommCartJAXB implements Serializable {
    protected Long totalCount;
    protected List<EcommerceProductJAXB> products;
    protected List<EcommTotalPriceBreakupJAXB> priceBreakup;
    protected boolean isValid;
    protected String error;
    protected List<PromotionCodeJAXB> promotionCodes;
    protected String promotionalText;
    protected String appliedPromocode;
    protected List<ECommerceMessageJAXB> messageList;

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public List<EcommerceProductJAXB> getProducts() {
        return products;
    }

    public void setProducts(List<EcommerceProductJAXB> products) {
        this.products = products;
    }

    public List<EcommTotalPriceBreakupJAXB> getPriceBreakup() {
        return priceBreakup;
    }

    public void setPriceBreakup(List<EcommTotalPriceBreakupJAXB> priceBreakup) {
        this.priceBreakup = priceBreakup;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<PromotionCodeJAXB> getPromotionCodes() {
        return promotionCodes;
    }

    public void setPromotionCodes(List<PromotionCodeJAXB> promotionCodes) {
        this.promotionCodes = promotionCodes;
    }

    public String getPromotionalText() {
        return promotionalText;
    }

    public void setPromotionalText(String promotionalText) {
        this.promotionalText = promotionalText;
    }

    public String getAppliedPromocode() {
        return appliedPromocode;
    }

    public void setAppliedPromocode(String appliedPromocode) {
        this.appliedPromocode = appliedPromocode;
    }

    public List<ECommerceMessageJAXB> getMessageList() {
        if (messageList == null){
            messageList = new ArrayList<ECommerceMessageJAXB>();
        }
        return messageList;
    }

    public void setMessageList(List<ECommerceMessageJAXB> messageList) {
        this.messageList = messageList;
    }

}
