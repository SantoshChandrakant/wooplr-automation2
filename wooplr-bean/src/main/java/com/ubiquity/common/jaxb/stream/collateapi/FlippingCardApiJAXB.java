package com.ubiquity.common.jaxb.stream.collateapi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by subharthi on 7/5/16.
 */
@XmlType(name = "FlippingCardApiJAXB", propOrder = {
        "timestamp",
        "after",
        "sequence"
})
public class FlippingCardApiJAXB implements Serializable {

    @XmlElement(required = true, defaultValue = "0L")
    private Long timestamp;
    @XmlElement(required = true, defaultValue = "1L")
    private Boolean after;
    @XmlElement(required = true, defaultValue = "0.0")
    private Double sequence;

    @XmlTransient
    private static FlippingCardApiJAXB DEFAULT = new FlippingCardApiJAXB();

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

    public Double getSequence() {
        return sequence;
    }

    public void setSequence(Double sequence) {
        this.sequence = sequence;
    }

    public static FlippingCardApiJAXB valueOf(String defaultValue){
        if("__DEFAULT".equals(defaultValue)){
            DEFAULT.setTimestamp(0L);
            DEFAULT.setAfter(Boolean.FALSE);
            DEFAULT.setSequence(Double.MAX_VALUE);
            return DEFAULT;
        }
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FlippingCardApiJAXB{");
        sb.append("timestamp=").append(timestamp);
        sb.append(", after=").append(after);
        sb.append(", sequence=").append(sequence);
        sb.append('}');
        return sb.toString();
    }
}
