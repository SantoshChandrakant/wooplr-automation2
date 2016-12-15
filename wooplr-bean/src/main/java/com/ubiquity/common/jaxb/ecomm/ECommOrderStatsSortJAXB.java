package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by subharthi on 5/15/16.
 */
@XmlRootElement
@XmlType(name="ECommOrderStatsFilterJAXB", propOrder = {
        "sortField",
        "sortOrder"
})
public class ECommOrderStatsSortJAXB implements Serializable {


    @XmlTransient
    private static ECommOrderStatsSortJAXB DEFAULT = new ECommOrderStatsSortJAXB();

    @XmlElement(defaultValue = "createdDate")
    private String sortField;

    @XmlElement(defaultValue = "desc")
    private String sortOrder;

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public static ECommOrderStatsSortJAXB valueOf(String defaultValue){
        if("__DEFAULT".equals(defaultValue)){
            DEFAULT.setSortField("createdDate");
            DEFAULT.setSortOrder("desc");
            return DEFAULT;
        }
        return null;
    }
}
