package com.ubiquity.common.jaxb.stream.content;

import java.io.Serializable;

/**
 * Created by Rajagopal on 11/30/15.
 */
public class ContentMetaJAXB implements Serializable {
    private final static Long serialVersionUID = 12343L;
    protected String contentType;
    protected String videoId;
    protected String text;
    protected String deepLink;
    protected Boolean quickContent;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDeepLink() {
        return deepLink;
    }

    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    public Boolean getQuickContent() {
        return quickContent;
    }

    public void setQuickContent(Boolean quickContent) {
        this.quickContent = quickContent;
    }
}
