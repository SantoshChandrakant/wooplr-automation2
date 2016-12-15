package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by subharthi on 5/11/16.
 */
@XmlRootElement
public class ECommOrderStatsResponseJAXB implements Serializable {
    @XmlElement
    private Map<String, Integer> orderStatus;

    @XmlElement
    private Double avgShipDays;

    @XmlElement
    private Integer totalOrders;

    @XmlElement
    private Integer totalOrdersCurrentMonth;

    @XmlElement
    private List<Integer> ordersWeekly;

    public Map<String, Integer> getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Map<String, Integer> orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getAvgShipDays() {
        return avgShipDays;
    }

    public void setAvgShipDays(Double avgShipDays) {
        this.avgShipDays = avgShipDays;
    }

    public Integer getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(Integer totalOrders) {
        this.totalOrders = totalOrders;
    }

    public Integer getTotalOrdersCurrentMonth() {
        return totalOrdersCurrentMonth;
    }

    public void setTotalOrdersCurrentMonth(Integer totalOrdersCurrentMonth) {
        this.totalOrdersCurrentMonth = totalOrdersCurrentMonth;
    }

    public List<Integer> getOrdersWeekly() {
        return ordersWeekly;
    }

    public void setOrdersWeekly(List<Integer> ordersWeekly) {
        this.ordersWeekly = ordersWeekly;
    }
}
