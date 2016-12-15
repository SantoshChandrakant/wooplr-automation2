package com.ubiquity.common.jaxb.ecomm;

import com.ubiquity.common.jaxb.stream.EcommerceOrderHistoryJAXB;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Rajagopal on 1/2/16.
 */
public class ECommOrderJAXB implements Serializable {
    protected Long id;
    protected Long truncatedOrderId;
    protected ECommOrderProductJAXB product;
    protected Double price;
    protected Map<String, String> priceBreakup;
    protected Long orderDate;
    protected Long orderUpdateDate;
    protected String orderStatus;
    protected String trackingId;
    protected String trackingUrl;
    protected String partner;
    protected Boolean isCancellable = Boolean.FALSE;
    protected Boolean isReturnable = Boolean.FALSE;
    protected String orderType;
    protected Boolean orderPlacedStatus = Boolean.TRUE;
    protected String orderComment;
    protected String shippingTime;
    protected String refundTime;
    protected String invalidatedReason;
    protected String invalidatedComment;
    protected String merchantOrderId;
    protected Long expectedDeliveryDate;
    protected String notes;
    protected String shipmentCreateStatus;
    protected String refundStatus;
    protected Double refundedAmount;
    protected Double refundedStyleMiles;
    protected String freshdeskIds;
    protected Long referenceId;
    protected List<EcommerceOrderHistoryJAXB> orderHistory;
    protected String reverseTrackingId;
    protected String reverseTrackingUrl;
    protected String reverseShipmentStatus;
    protected Double userRating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTruncatedOrderId() {
        return truncatedOrderId;
    }

    public void setTruncatedOrderId(Long truncatedOrderId) {
        this.truncatedOrderId = truncatedOrderId;
    }

    public ECommOrderProductJAXB getProduct() {
        return product;
    }

    public void setProduct(ECommOrderProductJAXB product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Long orderDate) {
        this.orderDate = orderDate;
    }

    public Long getOrderUpdateDate() {
        return orderUpdateDate;
    }

    public void setOrderUpdateDate(Long orderUpdateDate) {
        this.orderUpdateDate = orderUpdateDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getTrackingUrl() {
        return trackingUrl;
    }

    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    public Boolean getCancellable() {
        return isCancellable;
    }

    public void setCancellable(Boolean cancellable) {
        isCancellable = cancellable;
    }

    public Boolean getReturnable() {
        return isReturnable;
    }

    public void setReturnable(Boolean returnable) {
        isReturnable = returnable;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Boolean getOrderPlacedStatus() {
        return orderPlacedStatus;
    }

    public void setOrderPlacedStatus(Boolean orderPlacedStatus) {
        this.orderPlacedStatus = orderPlacedStatus;
    }

    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

    public Map<String, String> getPriceBreakup() {
        return priceBreakup;
    }

    public void setPriceBreakup(Map<String, String> priceBreakup) {
        this.priceBreakup = priceBreakup;
    }

    public String getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(String shippingTime) {
        this.shippingTime = shippingTime;
    }

    public String getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(String refundTime) {
        this.refundTime = refundTime;
    }

    public String getInvalidatedReason() {
        return invalidatedReason;
    }

    public void setInvalidatedReason(String invalidatedReason) {
        this.invalidatedReason = invalidatedReason;
    }

    public String getInvalidatedComment() {
        return invalidatedComment;
    }

    public void setInvalidatedComment(String invalidatedComment) {
        this.invalidatedComment = invalidatedComment;
    }

    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    public void setMerchantOrderId(String merchantOrderId) {
        this.merchantOrderId = merchantOrderId;
    }

    public Long getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(Long expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getShipmentCreateStatus() {
        return shipmentCreateStatus;
    }

    public void setShipmentCreateStatus(String shipmentCreateStatus) {
        this.shipmentCreateStatus = shipmentCreateStatus;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Double getRefundedAmount() {
        return refundedAmount;
    }

    public void setRefundedAmount(Double refundedAmount) {
        this.refundedAmount = refundedAmount;
    }

    public Double getRefundedStyleMiles() {
        return refundedStyleMiles;
    }

    public void setRefundedStyleMiles(Double refundedStyleMiles) {
        this.refundedStyleMiles = refundedStyleMiles;
    }

    public String getFreshdeskIds() {
        return freshdeskIds;
    }

    public void setFreshdeskIds(String freshdeskIds) {
        this.freshdeskIds = freshdeskIds;
    }

    public Long getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Long referenceId) {
        this.referenceId = referenceId;
    }

    public List<EcommerceOrderHistoryJAXB> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<EcommerceOrderHistoryJAXB> orderHistory) {
        this.orderHistory = orderHistory;
    }

    public String getReverseTrackingId() {
        return reverseTrackingId;
    }

    public void setReverseTrackingId(String reverseTrackingId) {
        this.reverseTrackingId = reverseTrackingId;
    }

    public String getReverseTrackingUrl() {
        return reverseTrackingUrl;
    }

    public void setReverseTrackingUrl(String reverseTrackingUrl) {
        this.reverseTrackingUrl = reverseTrackingUrl;
    }

    public String getReverseShipmentStatus() {
        return reverseShipmentStatus;
    }

    public void setReverseShipmentStatus(String reverseShipmentStatus) {
        this.reverseShipmentStatus = reverseShipmentStatus;
    }

    public Double getUserRating() {
        return userRating;
    }

    public void setUserRating(Double userRating) {
        this.userRating = userRating;
    }
}
