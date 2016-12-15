package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;

/**
 * Created by Rajagopal on 2/25/16.
 */
public class PriceBreakupPayloadJAXB implements Serializable {
    protected String key;
    protected String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
