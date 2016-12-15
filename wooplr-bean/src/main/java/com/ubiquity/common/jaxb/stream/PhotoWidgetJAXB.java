package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Map;

/**
 * Created by pmundhra on 06/10/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhotoWidgetJAXB", propOrder = {
        "pid",
        "isGif",
        "deepLink",
        "text",
        "imageHeight",
        "imageWidth",
        "wide",
        "miscellaneous"
})

public class PhotoWidgetJAXB implements Serializable {
    protected String pid;
    protected Boolean isGif;
    protected String deepLink;
    protected String text;
    protected Integer imageHeight;
    protected Integer imageWidth;
    protected Boolean wide;
    protected Map<String, String> miscellaneous;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Boolean getIsGif() {
        return isGif;
    }

    public void setIsGif(Boolean isGif) {
        this.isGif = isGif;
    }

    public String getDeepLink() {
        return deepLink;
    }

    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    public Integer getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    public Boolean isWide() {
        return wide;
    }

    public void setWide(Boolean wide) {
        this.wide = wide;
    }

    public Map<String, String> getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(Map<String, String> miscellaneous) {
        this.miscellaneous = miscellaneous;
    }
}
