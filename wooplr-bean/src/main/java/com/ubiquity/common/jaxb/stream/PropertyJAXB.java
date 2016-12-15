package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by abhishek on 11/17/15.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyJAXB", propOrder = {
        "key",
        "value"
})


@XmlRootElement
public class PropertyJAXB implements Serializable {
    private final static Long serialVersionUID = 12343L;

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
