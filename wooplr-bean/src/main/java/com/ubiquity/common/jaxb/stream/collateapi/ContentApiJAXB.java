package com.ubiquity.common.jaxb.stream.collateapi;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by subharthi on 10/7/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentApiJAXB", propOrder = {
        "after",
        "sequence",
        "pageNumber",
        "published"
})
public class ContentApiJAXB implements Serializable{
    @XmlElement(required = true, defaultValue = "false")
    private Boolean after;
    @XmlElement(required = true, defaultValue = "0.0")
    private Double sequence;
    @XmlElement(required = false, defaultValue = "1L")
    private Long pageNumber;
    @XmlElement(required = true, defaultValue = "true")
    private Boolean published;
    @XmlTransient
    private Boolean sticky;
    @XmlTransient
    private static ContentApiJAXB DEFAULT = new ContentApiJAXB();

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Boolean getAfter() {
        return after;
    }

    public void setAfter(Boolean after) {
        this.after = after;
    }

    public Double getSequence() {
        return sequence;
    }

    public void setSequence(Double sequence) {
        this.sequence = sequence;
    }

    public Long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Boolean getSticky() {
        return sticky;
    }

    public void setSticky(Boolean sticky) {
        this.sticky = sticky;
    }

    public static ContentApiJAXB valueOf(String defaultValue){
        if("__DEFAULT".equals(defaultValue)){
            DEFAULT.setAfter(Boolean.FALSE);
            DEFAULT.setPageNumber(1L);
            DEFAULT.setPublished(Boolean.TRUE);
            DEFAULT.setSticky(Boolean.TRUE);
            return DEFAULT;
        }
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContentApiJAXB{");
        sb.append("after=").append(after);
        sb.append(", sequence=").append(sequence);
        sb.append(", pageNumber=").append(pageNumber);
        sb.append(", published=").append(published);
        sb.append(", sticky=").append(sticky);
        sb.append('}');
        return sb.toString();
    }
}
