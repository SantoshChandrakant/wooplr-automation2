package com.ubiquity.common.jaxb.catalog;

import java.io.Serializable;

/**
 * Created by pmundhra on 05/10/16.
 */
public class MeasurementJAXB implements Serializable {
    private String type;
    private String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MeasurementJAXB{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
