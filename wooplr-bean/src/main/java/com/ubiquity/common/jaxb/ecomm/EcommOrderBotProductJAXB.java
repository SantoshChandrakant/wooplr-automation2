package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;

/**
 * Created by Rajagopal on 12/21/15.
 */
public class EcommOrderBotProductJAXB implements Serializable {
    protected String webUrl;
    protected String size;
    protected Double amountPaid;
    protected String store;

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
