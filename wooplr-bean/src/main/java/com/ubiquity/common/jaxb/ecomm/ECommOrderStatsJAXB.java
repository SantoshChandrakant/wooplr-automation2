package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by subharthi on 5/16/16.
 */
@XmlRootElement
public class ECommOrderStatsJAXB implements Serializable {

	@XmlElement(name = "refNo")
	private Long transactionOrderId;
	private String merchantOrderId;
	private Long purchaseDate;
	private String paymentType;
	private String orderStatus;
	private String paymentStatus;
	private String paymentGateway;
	private String paymentId;
	private String wooplrPromoCode;
	private Long truncatedOrderId;

	private String customerName;
	private String customerMobile;
	private Boolean isRepeatCustomer;
	private Integer customerOrderCount;

	private Long pickupDate; // ~
	private Long deliveryDate; // ~
	private Long cancellationDate; // ~

	private Boolean cancellable;
	private Boolean returnable;
	private Long receivedDate;
	private Long confirmedDate;
	private Long rejectedDate;
	// private String waitingForAWBDate; // Same as confirmedDate
	private Long AWBGeneratedDate;
	private Long readyToShipDate;
	private Long returnedDate;

	private String fullfilmentType; // ~ self / wooplr
	private String PromoCodeType;

	private String WayBillNumber; // AWB NUmber
	private String email;
	private ECommOrderAddressJAXB address;
	private String platform;
	private String shipmentCreateStatus;

	private ECommOrderProductJAXB product;
	private Long subOrderId;
	private String freshDeskIds;
	private String invalidatedReason;
	private String invalidatedComment;
	private String notes;
	protected String trackingId;
	protected String trackingUrl;
	protected String partner;
	protected String reverseTrackingId;
	protected String reverseTrackingUrl;
	protected String reverseShipmentStatus;
	private String refundStatus;
	private Long resellerId;

	protected Map<String, String> priceBreakup;

	public Long getTruncatedOrderId() {
		return truncatedOrderId;
	}

	public void setTruncatedOrderId(Long truncatedOrderId) {
		this.truncatedOrderId = truncatedOrderId;
	}

	public Long getTransactionOrderId() {
		return transactionOrderId;
	}

	public void setTransactionOrderId(Long transactionOrderId) {
		this.transactionOrderId = transactionOrderId;
	}

	public String getMerchantOrderId() {
		return merchantOrderId;
	}

	public void setMerchantOrderId(String merchantOrderId) {
		this.merchantOrderId = merchantOrderId;
	}

	public Long getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate.getTime();
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public void setPickupDate(Date pickupDate) {
		if (pickupDate != null)
			this.pickupDate = pickupDate.getTime();
	}

	public void setDeliveryDate(Date deliveryDate) {
		if (deliveryDate != null)
			this.deliveryDate = deliveryDate.getTime();
	}

	public Long getCancellationDate() {
		return cancellationDate;
	}

	public void setCancellationDate(Date cancellationDate) {
		if (cancellationDate != null)
			this.cancellationDate = cancellationDate.getTime();
	}

	public Long getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		if (receivedDate != null)
			this.receivedDate = receivedDate.getTime();
	}

	public Long getConfirmedDate() {
		return confirmedDate;
	}

	public void setConfirmedDate(Date confirmedDate) {
		if (confirmedDate != null)
			this.confirmedDate = confirmedDate.getTime();
	}

	public Long getRejectedDate() {
		return rejectedDate;
	}

	public void setRejectedDate(Date rejectedDate) {
		if (rejectedDate != null)
			this.rejectedDate = rejectedDate.getTime();
	}

	public Long getAWBGeneratedDate() {
		return AWBGeneratedDate;
	}

	public void setAWBGeneratedDate(Date AWBGeneratedDate) {
		if (AWBGeneratedDate != null)
			this.AWBGeneratedDate = AWBGeneratedDate.getTime();
	}

	public Long getReadyToShipDate() {
		return readyToShipDate;
	}

	public void setReadyToShipDate(Date readyToShipDate) {
		if (readyToShipDate != null)
			this.readyToShipDate = readyToShipDate.getTime();
	}

	public Long getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(Date returnedDate) {
		if (returnedDate != null)
			this.returnedDate = returnedDate.getTime();
	}

	public String getFullfilmentType() {
		return fullfilmentType;
	}

	public void setFullfilmentType(String fullfilmentType) {
		this.fullfilmentType = fullfilmentType;
	}

	public String getWooplrPromoCode() {
		return wooplrPromoCode;
	}

	public void setWooplrPromoCode(String wooplrPromoCode) {
		this.wooplrPromoCode = wooplrPromoCode;
	}

	public String getWayBillNumber() {
		return WayBillNumber;
	}

	public void setWayBillNumber(String wayBillNumber) {
		this.WayBillNumber = wayBillNumber;
	}

	public String getPromoCodeType() {
		return PromoCodeType;
	}

	public void setPromoCodeType(String promoCodeType) {
		this.PromoCodeType = promoCodeType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ECommOrderAddressJAXB getAddress() {
		return address;
	}

	public void setAddress(EsEcommOrderAddress address) {
		ECommOrderAddressJAXB eCommOrderAddressJAXB = new ECommOrderAddressJAXB();
		eCommOrderAddressJAXB.setUserId(address.getUserId());
		eCommOrderAddressJAXB.setCity(address.getCity());
		eCommOrderAddressJAXB.setCountry(address.getCountry());
		eCommOrderAddressJAXB.setCustomerId(address.getCustomerId());
		eCommOrderAddressJAXB.setDefaultAddr(address.getDefault_addr());
		eCommOrderAddressJAXB.setFirstName(address.getFirst_name());
		eCommOrderAddressJAXB.setLandmark(address.getLandmark());
		eCommOrderAddressJAXB.setLastName(address.getLast_name());
		eCommOrderAddressJAXB.setLine1(address.getLine1());
		eCommOrderAddressJAXB.setLine2(address.getLine2());
		eCommOrderAddressJAXB.setPhone(address.getPhone());
		eCommOrderAddressJAXB.setProvince(address.getProvince());
		eCommOrderAddressJAXB.setType(address.getType());
		eCommOrderAddressJAXB.setZip(address.getZip());
		eCommOrderAddressJAXB.setName(address.getName());

		this.address = eCommOrderAddressJAXB;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getShipmentCreateStatus() {
		return shipmentCreateStatus;
	}

	public Long getPickupDate() {
		return pickupDate;
	}

	public Long getDeliveryDate() {
		return deliveryDate;
	}

	public void setShipmentCreateStatus(EntityConstants.ShipmentCreateStatus shipmentCreateStatus) {
		this.shipmentCreateStatus = shipmentCreateStatus.getValue();
	}

	public ECommOrderProductJAXB getProduct() {
		return product;
	}

	public void setProduct(EsEcommOrderProduct product) {
		ECommOrderProductJAXB eCommOrderProductJAXB = new ECommOrderProductJAXB();
		eCommOrderProductJAXB.setId(Long.valueOf(product.getProductId()));
		eCommOrderProductJAXB.setName(product.getName());
		eCommOrderProductJAXB.setStoreId(product.getStoreId());
		eCommOrderProductJAXB.setStoreName(product.getStoreName());
		eCommOrderProductJAXB.setImage_pid(product.getImagePid());
		eCommOrderProductJAXB.setPrice(product.getPrice());
		eCommOrderProductJAXB.setSize(product.getSize());
		eCommOrderProductJAXB.setColor(product.getColor());
		eCommOrderProductJAXB.setSku(product.getSku_id());
		eCommOrderProductJAXB.setUnique_id(product.getUnique_id());
		eCommOrderProductJAXB.setMerchantUrl(product.getMerchantUrl());

		this.product = eCommOrderProductJAXB;
	}

	public Long getSubOrderId() {
		return subOrderId;
	}

	public void setSubOrderId(Long subOrderId) {
		this.subOrderId = subOrderId;
	}

	public Map<String, String> getPriceBreakup() {
		return priceBreakup;
	}

	public void setPriceBreakup(Map<String, String> priceBreakup) {
		this.priceBreakup = priceBreakup;
	}

	public Boolean getIsRepeatCustomer() {
		return isRepeatCustomer;
	}

	public void setIsRepeatCustomer(Boolean isRepeatCustomer) {
		this.isRepeatCustomer = isRepeatCustomer;
	}

	public Integer getCustomerOrderCount() {
		return customerOrderCount;
	}

	public void setCustomerOrderCount(Integer customerOrderCount) {
		this.customerOrderCount = customerOrderCount;
	}

	public String getPaymentGateway() {
		return paymentGateway;
	}

	public void setPaymentGateway(String paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public Boolean getCancellable() {
		return cancellable;
	}

	public void setCancellable(Boolean cancellable) {
		this.cancellable = cancellable;
	}

	public Boolean getReturnable() {
		return returnable;
	}

	public void setReturnable(Boolean returnable) {
		this.returnable = returnable;
	}

	public String getFreshDeskIds() {
		return freshDeskIds;
	}

	public void setFreshDeskIds(String freshDeskIds) {
		this.freshDeskIds = freshDeskIds;
	}

	public String getInvalidatedComment() {
		return invalidatedComment;
	}

	public void setInvalidatedComment(String invalidatedComment) {
		this.invalidatedComment = invalidatedComment;
	}

	public String getInvalidatedReason() {
		return invalidatedReason;
	}

	public void setInvalidatedReason(String invalidatedReason) {
		this.invalidatedReason = invalidatedReason;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
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

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Long getResellerId() {
		return resellerId;
	}

	public void setResellerId(Long resellerId) {
		this.resellerId = resellerId;
	}
}
