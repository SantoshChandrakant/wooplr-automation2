package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by subharthi on 5/18/16.
 */
@XmlRootElement
public class ECommOrderStatsMapJAXB implements Serializable {
    @XmlElement
    private Long currentPage;

    @XmlElement
    private Long totalCount;

    @XmlElement(name = "orders")
    private Object orderStatsJAXBs;

    public Long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Object getOrderStatsJAXBs() {
        return orderStatsJAXBs;
    }

    public void setOrderStatsJAXBs(Object orderStatsJAXBs) {
        this.orderStatsJAXBs = orderStatsJAXBs;
    }
}
