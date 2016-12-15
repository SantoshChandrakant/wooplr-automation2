package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;

/**
 * Created by Rajagopal on 5/23/16.
 */
public class ECommerceMessageJAXB implements Serializable {
    protected String text;
    protected String type; //Corresponds to cloudinary folder
    protected String color;  //Hex color code

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
