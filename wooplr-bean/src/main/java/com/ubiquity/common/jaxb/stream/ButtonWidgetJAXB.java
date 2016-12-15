package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by pmundhra on 06/10/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ButtonWidgetJAXB", propOrder = {
        "text",
        "textColor",
        "bgColor",
        "deepLink"
})

@XmlRootElement
public class ButtonWidgetJAXB implements Serializable {
    protected String text;
    protected String textColor;
    protected String bgColor;
    protected String deepLink;

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

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getDeepLink() {
        return deepLink;
    }

    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }
}
