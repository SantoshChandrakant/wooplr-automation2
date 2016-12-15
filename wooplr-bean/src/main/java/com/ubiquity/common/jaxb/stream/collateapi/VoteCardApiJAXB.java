package com.ubiquity.common.jaxb.stream.collateapi;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by subharthi on 7/5/16.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppCardApiJAXB", propOrder = {
        "timestamp",
        "pageNumber",
})
public class VoteCardApiJAXB implements Serializable{

    @XmlElement(required = true, defaultValue = "0L")
    private Long timestamp;

    @XmlElement(required = true, defaultValue = "1L")
    private Long pageNumber;

    @XmlElement(required = true, defaultValue = "1L")
    private Boolean after;

    @XmlTransient
    private static VoteCardApiJAXB DEFAULT = new VoteCardApiJAXB();

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public static VoteCardApiJAXB getDEFAULT() {
        return DEFAULT;
    }

    public static void setDEFAULT(VoteCardApiJAXB DEFAULT) {
        VoteCardApiJAXB.DEFAULT = DEFAULT;
    }

    public Boolean getAfter() {
        return after;
    }

    public void setAfter(Boolean after) {
        this.after = after;
    }

    public static VoteCardApiJAXB valueOf(String defaultValue){
        if("__DEFAULT".equals(defaultValue)){
            DEFAULT.setTimestamp(new Date().getTime());
            DEFAULT.setPageNumber(1L);
            DEFAULT.setAfter(Boolean.FALSE);
            return DEFAULT;
        }
        return null;
    }
}
