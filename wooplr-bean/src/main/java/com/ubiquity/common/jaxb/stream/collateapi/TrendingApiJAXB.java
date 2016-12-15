package com.ubiquity.common.jaxb.stream.collateapi;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by subharthi on 10/7/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrendingApiJAXB", propOrder = {
        "timestamp",
        "after",
        "pageNumber",
})
public class TrendingApiJAXB implements Serializable{
    @XmlElement(required = true, defaultValue = "0L")
    private Long timestamp;
    @XmlElement(required = true, defaultValue = "false")
    private Boolean after;
    @XmlElement(required = true, defaultValue = "1L")
    private Long pageNumber;
    @XmlTransient
    private static TrendingApiJAXB DEFAULT = new TrendingApiJAXB();

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getAfter() {
        return after;
    }

    public void setAfter(Boolean after) {
        this.after = after;
    }

    public Long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public static TrendingApiJAXB valueOf(String defaultValue){
        if("__DEFAULT".equals(defaultValue)){
            DEFAULT.setTimestamp(0L);
            DEFAULT.setAfter(Boolean.FALSE);
            DEFAULT.setPageNumber(1L);
            return DEFAULT;
        }
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TrendingApiJAXB{");
        sb.append("timestamp=").append(timestamp);
        sb.append(", after=").append(after);
        sb.append(", pageNumber=").append(pageNumber);
        sb.append('}');
        return sb.toString();
    }
}
