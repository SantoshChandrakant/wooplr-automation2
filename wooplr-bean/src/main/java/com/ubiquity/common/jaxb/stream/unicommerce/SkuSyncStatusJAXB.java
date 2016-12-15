package com.ubiquity.common.jaxb.stream.unicommerce;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by abhishek on 7/19/16.
 */

@XmlRootElement
public class SkuSyncStatusJAXB implements Serializable {

    private final static Long serialVersionUID = 12343L;

    @XmlElement(required = true)
    protected Long skuId;
    @XmlElement(required = true)
    protected Boolean isSynced;
    @XmlElement
    protected String message;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Boolean getIsSynced() {
        return isSynced;
    }

    public void setIsSynced(Boolean isSynced) {
        this.isSynced = isSynced;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
