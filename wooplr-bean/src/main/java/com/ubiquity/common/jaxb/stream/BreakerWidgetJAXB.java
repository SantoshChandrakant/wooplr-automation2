package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by subharthi on 6/29/16.
 */


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeparatorWidgetJAXB", propOrder = {
        "bgColor",
        "text",
        "textColor"
})

@XmlRootElement
public class BreakerWidgetJAXB implements Serializable {

    protected String bgColor;
    protected String text;
    protected String textColor;

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }
}
