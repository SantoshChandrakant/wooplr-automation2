package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Rajagopal on 1/9/16.
 */
public class ECommOrderTransactionJAXB implements Serializable {
    protected Long id;
    protected Long userId;
    protected String email;
    protected String name;
    protected String phone;
    protected String paymentType;
    protected String paymentGateway;
    protected String paymentStatus;
    protected String paymentId;
    protected Long orderDate;
    protected String couponCode;
    protected Double price;
    protected ECommCustomerAddressJAXB shippingAddress;
    protected List<ECommOrderJAXB> orders;
    protected Map<String, String> priceBreakup;
    protected String osType;
    protected Boolean isShipableByDelhivery;
    protected Boolean isRepeatCustomer;
    protected Integer orderCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Long getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Long orderDate) {
        this.orderDate = orderDate;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ECommCustomerAddressJAXB getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ECommCustomerAddressJAXB shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public List<ECommOrderJAXB> getOrders() {
        return orders;
    }

    public void setOrders(List<ECommOrderJAXB> orders) {
        this.orders = orders;
    }

    public Map<String, String> getPriceBreakup() {
        return priceBreakup;
    }

    public void setPriceBreakup(Map<String, String> priceBreakup) {
        this.priceBreakup = priceBreakup;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public Boolean getIsShipableByDelhivery() {
        return isShipableByDelhivery;
    }

    public void setIsShipableByDelhivery(Boolean isShipableByDelhivery) {
        this.isShipableByDelhivery = isShipableByDelhivery;
    }

    public Boolean getIsRepeatCustomer() {
        return isRepeatCustomer;
    }

    public void setIsRepeatCustomer(Boolean isRepeatCustomer) {
        this.isRepeatCustomer = isRepeatCustomer;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }
}
