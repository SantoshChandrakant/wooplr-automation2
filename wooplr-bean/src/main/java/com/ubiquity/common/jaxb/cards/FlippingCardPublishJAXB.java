package com.ubiquity.common.jaxb.cards;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by subharthi on 7/4/16.
 */
@XmlRootElement
public class FlippingCardPublishJAXB {
    @XmlElement
    private Long id;
    @XmlElement
    private Boolean publish;
    @XmlElement
    private Long publishDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getPublish() {
        return publish;
    }

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    public Long getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Long publishDate) {
        this.publishDate = publishDate;
    }
}
