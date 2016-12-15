package com.ubiquity.common.jaxb.stream.content;

import javax.xml.bind.annotation.*;

/**
 * Created by subharthi on 10/29/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentPublishJAXB", propOrder = {
        "id",
        "publishTimestamp"
})
@XmlRootElement
public class ContentPublishJAXB {

    @XmlElement(required = true)
    private Long id;

    @XmlElement(required = false)
    private Long publishTimestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPublishTimestamp() {
        return publishTimestamp;
    }

    public void setPublishTimestamp(Long publishTimestamp) {
        this.publishTimestamp = publishTimestamp;
    }
}
