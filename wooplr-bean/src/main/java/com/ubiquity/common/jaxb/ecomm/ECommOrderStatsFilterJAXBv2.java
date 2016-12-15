package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by subharthi on 9/15/16.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ECommOrderStatsFilterJAXB", propOrder = {
        "pageNumber",
        "count",
        "sort"
})
public class ECommOrderStatsFilterJAXBv2 implements Serializable {
    @XmlTransient
    private static ECommOrderStatsFilterJAXBv2 DEFAULT = new ECommOrderStatsFilterJAXBv2();

    @XmlElement
    private Long refNo;

    @XmlElement
    private Long orderId;

    @XmlElement
    private String customerEmail;

    @XmlElement
    private Long storeId;

    @XmlElement
    private String userName;

    @XmlElement
    private Long userId;

    @XmlElement
    private Long phoneNumber;

    private List<OrderStatusShippedStatusJAXB> status;

    @XmlElement
    private Long truncatedOrderId;

    @XmlElement
    private Long productId;

    @XmlElement(name = "sort")
    private ECommOrderStatsSortJAXB sort;

    @XmlElement(name= "pageNumber", defaultValue = "1", required = true)
    private Long pageNumber;

    @XmlElement(defaultValue = "10", required = true)
    private Long count;


    public Long getRefNo() {
        return refNo;
    }

    public void setRefNo(Long refNo) {
        this.refNo = refNo;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ECommOrderStatsSortJAXB getSort() {
        return sort;
    }

    public void setSort(ECommOrderStatsSortJAXB sort) {
        this.sort = sort;
    }

    public List<OrderStatusShippedStatusJAXB> getstatus() {
        return status;
    }

    public void setStatus(List<OrderStatusShippedStatusJAXB> status) {
        this.status = status;
    }

    public Long getTruncatedOrderId() {
        return truncatedOrderId;
    }

    public void setTruncatedOrderId(Long truncatedOrderId) {
        this.truncatedOrderId = truncatedOrderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getPageNumber() {
        if(pageNumber == null){
            pageNumber = 1L;
        }
        return pageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Long getCount() {
        if(count == null){
            count=20L;
        }
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public static ECommOrderStatsFilterJAXBv2 valueOf(String defaultValue){
        if("__DEFAULT".equals(defaultValue)){
            DEFAULT.setStatus(new ArrayList<OrderStatusShippedStatusJAXB>(){{add(OrderStatusShippedStatusJAXB.valueOf("__DEFAULT"));}});
            DEFAULT.setCount(50L);
            DEFAULT.setPageNumber(0L);
            DEFAULT.setSort(ECommOrderStatsSortJAXB.valueOf("__DEFAULT"));
            return DEFAULT;
        }
        return null;
    }

    @XmlRootElement
    public static class OrderStatusShippedStatusJAXB implements Serializable {

        @XmlTransient
        private static OrderStatusShippedStatusJAXB DEFAULT = new OrderStatusShippedStatusJAXB();
        @XmlElement
        private String orderStatus;
        @XmlElement(required = false)
        private String shippedOrderStatus;

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getShippedOrderStatus() {
            return shippedOrderStatus;
        }

        public void setShippedOrderStatus(String shippedOrderStatus) {
            this.shippedOrderStatus = shippedOrderStatus;
        }

        public static OrderStatusShippedStatusJAXB valueOf(String defaultValue){
            if("__DEFAULT".equals(defaultValue)){
                DEFAULT.setOrderStatus("UNCONFIRMED");
                return DEFAULT;
            }
            return null;
        }
    }
}

