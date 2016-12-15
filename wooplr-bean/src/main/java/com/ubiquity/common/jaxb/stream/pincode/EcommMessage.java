package com.ubiquity.common.jaxb.stream.pincode;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by abhishek on 5/25/16.
 *
 */

@XmlRootElement(name = "EcommMessage")
public class EcommMessage implements Serializable {

    private final static Long serialVersionUID = 12343L;
    protected String text;
    protected String type;
    protected String color;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
