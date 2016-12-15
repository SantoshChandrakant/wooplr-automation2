package com.ubiquity.common.jaxb.ecomm.report;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by subharthi on 2/2/16.
 */
@XmlRootElement
public class ECommOrderReportJAXB implements Serializable {

	private Integer sNo;
	private Long transactionOrderId;
	private String merchantOrderId;
	private String store;
	private String manufacture;
	private String productName;
	private String purchaseDate;
	private String paymentType;
	private String orderStatus;
	private String paymentStatus;
	private String productSize;
	private String productBrandSize;
	private String productColor;
	private String productCategory;
	private Integer noOfItems;
	private Double productSellingPrice;
	private Double shippingCharge;
	private Double codCharge;
	private Double amountPaidByCustomer; // After all computation
	private Long styleMiles;
	private String customerName;
	private String shippingCustomerName;
	private String customerMobile;
	private String shippingCustomerMobile;
	private String shippingCity;

	private String productId;

	private String pickupDate; // ~
	private String deliveryDate; // ~
	private String cancellationDate; // ~

	private String receivedDate;
	private String confirmedDate;
	private String rejectedDate;
	// private String waitingForAWBDate; // Same as confirmedDate
	private String AWBGeneratedDate;
	private String readyToShipDate;
	private String returnedDate;

	private String reasonForCancellation;
	private String reasonForRejection;
	private String state;
	private String pincode;
	private String fullfilmentType; // ~ self / wooplr
	private String amountToBePaid; // ~ total + all kinds of discount
	private String PromoCodeType;
	private String wooplrPromoCode;
	private String storePromoCode; // ~
	private String wooplrPromoAmount; // This is the total transaction discount
	private String storePromoAmount; // ~
	private String wooplrDiscountBreakup; // THis is order discount applied
											// because of Wooplr PromoCode
	private String WayBillNumber; // AWB NUmber
	private String email;
	private String address;
	private String platform;
	private String shipmentCreateStatus;

	private String productUniqueId;
	private String productSkuId; // Merchant SKU ID
	private String productUrl;

	private Long subOrderId;

	private Long truncatedSubOrderId;
	private Boolean ServiceablePincode;
	private String paymentId;
	private String PartnerName;
	private String comments;

	private String reverseTrackingId;

	private Integer ordersCount;
	private Boolean isRepeatCustomer;

	private String transactionHandler;
	private String reSellerDomain;
	private Long reSellerId;

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
		if (merchantOrderId == null) {
			this.merchantOrderId = "NA";
			return;
		}
		this.merchantOrderId = merchantOrderId;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		if (store == null) {
			this.store = "NA";
			return;
		}
		this.store = store;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		if (manufacture == null) {
			this.manufacture = "NA";
			return;
		}
		this.manufacture = manufacture;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		if (productName == null) {
			this.productName = "NA";
			return;
		}
		this.productName = productName;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		isoFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		this.purchaseDate = isoFormat.format(purchaseDate);
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		if (paymentType == null) {
			this.paymentType = "NA";
			return;
		}
		this.paymentType = paymentType;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		if (orderStatus == null) {
			this.orderStatus = "NA";
			return;
		}
		this.orderStatus = orderStatus;
	}

	public Integer getsNo() {
		return sNo;
	}

	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		if (productSize == null) {
			this.productSize = "NA";
			return;
		}
		this.productSize = productSize;
	}

	public String getProductBrandSize() {
		return productBrandSize;
	}

	public void setProductBrandSize(String productBrandSize) {
		this.productBrandSize = productBrandSize;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		if (productColor == null) {
			this.productColor = "NA";
			return;
		}
		this.productColor = productColor;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		if (productCategory == null) {
			this.productCategory = "NA";
			return;
		}
		this.productCategory = productCategory;
	}

	public Integer getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(Integer noOfItems) {
		this.noOfItems = noOfItems;
	}

	public Double getProductSellingPrice() {
		return productSellingPrice;
	}

	public void setProductSellingPrice(Double productSellingPrice) {
		if (productSellingPrice == null) {
			this.productSellingPrice = 0.0;
			return;
		}
		this.productSellingPrice = productSellingPrice;
	}

	public Double getShippingCharge() {
		return shippingCharge;
	}

	public void setShippingCharge(Double shippingCharge) {
		if (shippingCharge == null) {
			this.shippingCharge = 0.0;
			return;
		}
		this.shippingCharge = shippingCharge;
	}

	public Double getCodCharge() {
		return codCharge;
	}

	public void setCodCharge(Double codCharge) {
		if (codCharge == null) {
			this.codCharge = 0.0;
			return;
		}
		this.codCharge = codCharge;
	}

	public Double getAmountPaidByCustomer() {
		return amountPaidByCustomer;
	}

	public void setAmountPaidByCustomer(Double amountPaidByCustomer) {
		if (amountPaidByCustomer == null) {
			this.amountPaidByCustomer = 0.0;
			return;
		}
		this.amountPaidByCustomer = amountPaidByCustomer;
	}

	public Long getStyleMiles() {
		return styleMiles;
	}

	public void setStyleMiles(Long styleMiles) {
		if (styleMiles == null) {
			this.styleMiles = 0L;
			return;
		}
		this.styleMiles = styleMiles;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		if (customerName == null) {
			this.customerName = "NA";
			return;
		}
		this.customerName = customerName;
	}

	public String getShippingCustomerName() {
		return shippingCustomerName;
	}

	public void setShippingCustomerName(String shippingCustomerName) {
		if (shippingCustomerName == null) {
			this.shippingCustomerName = "NA";
			return;
		}
		this.shippingCustomerName = shippingCustomerName;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		if (customerMobile == null) {
			this.customerMobile = "NA";
			return;
		}
		this.customerMobile = customerMobile;
	}

	public String getShippingCustomerMobile() {
		return shippingCustomerMobile;
	}

	public void setShippingCustomerMobile(String shippingCustomerMobile) {
		if (shippingCustomerMobile == null) {
			this.shippingCustomerMobile = "NA";
			return;
		}
		this.shippingCustomerMobile = shippingCustomerMobile;
	}

	public String getShippingCity() {
		return shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		if (shippingCity == null) {
			this.shippingCity = "NA";
			return;
		}
		this.shippingCity = shippingCity;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
		if (paymentStatus == null) {
			this.paymentStatus = "NA";
		}
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Date pickupDate) {
		SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		isoFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		this.pickupDate = isoFormat.format(pickupDate);
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		isoFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		this.deliveryDate = isoFormat.format(deliveryDate);
	}

	public String getCancellationDate() {
		return cancellationDate;
	}

	public void setCancellationDate(Date cancellationDate) {
		SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		isoFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		this.cancellationDate = isoFormat.format(cancellationDate);
	}

	public String getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		isoFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		this.receivedDate = isoFormat.format(receivedDate);
	}

	public String getConfirmedDate() {
		return confirmedDate;
	}

	public void setConfirmedDate(Date confirmedDate) {
		SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		isoFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		this.confirmedDate = isoFormat.format(confirmedDate);
	}

	public String getRejectedDate() {
		return rejectedDate;
	}

	public void setRejectedDate(Date rejectedDate) {
		SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		isoFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		this.rejectedDate = isoFormat.format(rejectedDate);
	}

	public String getAWBGeneratedDate() {
		return AWBGeneratedDate;
	}

	public void setAWBGeneratedDate(Date AWBGeneratedDate) {
		SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		isoFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		this.AWBGeneratedDate = isoFormat.format(AWBGeneratedDate);
	}

	public String getReadyToShipDate() {
		return readyToShipDate;
	}

	public void setReadyToShipDate(Date readyToShipDate) {
		SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		isoFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		this.readyToShipDate = isoFormat.format(readyToShipDate);
	}

	public String getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(Date returnedDate) {
		SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		isoFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		this.returnedDate = isoFormat.format(returnedDate);
	}

	public String getReasonForCancellation() {
		return reasonForCancellation;
	}

	public void setReasonForCancellation(String reasonForCancellation) {
		this.reasonForCancellation = reasonForCancellation;
		if (reasonForCancellation == null) {
			this.reasonForCancellation = "NA";
		}
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		if (state == null) {
			this.state = "NA";
		}
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
		if (pincode == null) {
			this.pincode = "NA";
		}
	}

	public String getFullfilmentType() {
		return fullfilmentType;
	}

	public void setFullfilmentType(String fullfilmentType) {
		this.fullfilmentType = fullfilmentType;
	}

	public String getAmountToBePaid() {
		return amountToBePaid;
	}

	public void setAmountToBePaid(String amountToBePaid) {
		this.amountToBePaid = amountToBePaid;
	}

	public String getWooplrPromoCode() {
		return wooplrPromoCode;
	}

	public void setWooplrPromoCode(String wooplrPromoCode) {
		this.wooplrPromoCode = wooplrPromoCode;
		if (wooplrPromoCode == null) {
			this.wooplrPromoCode = "NA";
		}
	}

	public String getStorePromoCode() {
		return storePromoCode;
	}

	public void setStorePromoCode(String storePromoCode) {
		this.storePromoCode = storePromoCode;
	}

	public String getWooplrPromoAmount() {
		return wooplrPromoAmount;
	}

	// public void setWooplrPromoAmount(String wooplrPromoAmount) {
	// this.wooplrPromoAmount = wooplrPromoAmount;
	// if (StringUtils.isNullOrEmpty(wooplrPromoAmount)) {
	// this.wooplrPromoAmount = "0";
	// }
	// }

	public String getStorePromoAmount() {
		return storePromoAmount;
	}

	public void setStorePromoAmount(String storePromoAmount) {
		this.storePromoAmount = storePromoAmount;
	}

	public String getWooplrDiscountBreakup() {
		return wooplrDiscountBreakup;
	}

	public void setWooplrDiscountBreakup(String wooplrDiscountBreakup) {
		this.wooplrDiscountBreakup = wooplrDiscountBreakup;
	}

	public String getWayBillNumber() {
		return WayBillNumber;
	}

	public void setWayBillNumber(String wayBillNumber) {
		this.WayBillNumber = wayBillNumber;
		if (wayBillNumber == null) {
			this.WayBillNumber = "NA";
		}
	}

	public String getPromoCodeType() {
		return PromoCodeType;
	}

	public void setPromoCodeType(String promoCodeType) {
		this.PromoCodeType = promoCodeType;
		if (promoCodeType == null) {
			this.PromoCodeType = "NA";
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	// public void setShipmentCreateStatus(EntityConstants.ShipmentCreateStatus
	// shipmentCreateStatus) {
	// this.shipmentCreateStatus = shipmentCreateStatus == null ? "NA" :
	// shipmentCreateStatus.toString();
	// }

	public String getProductUniqueId() {
		return productUniqueId;
	}

	// public void setProductUniqueId(String productUniqueId) {
	// this.productUniqueId = productUniqueId;
	// if (StringUtils.isNullOrEmpty(productUniqueId)) {
	// this.productUniqueId = "NA";
	// }
	// }

	public String getProductUrl() {
		return productUrl;
	}

	// public void setProductUrl(String productUrl) {
	// this.productUrl = productUrl;
	// if (StringUtils.isNullOrEmpty(productUrl)) {
	// this.productUrl = "NA";
	// }
	// }

	public Long getSubOrderId() {
		return subOrderId;
	}

	public void setSubOrderId(Long subOrderId) {
		this.subOrderId = subOrderId;
	}

	public Long getTruncatedSubOrderId() {
		return truncatedSubOrderId;
	}

	public void setTruncatedSubOrderId(Long truncatedSubOrderId) {
		this.truncatedSubOrderId = truncatedSubOrderId;
	}

	public String getProductSkuId() {
		return productSkuId;
	}

	public void setProductSkuId(String productSkuId) {
		this.productSkuId = productSkuId;
	}

	public Boolean getServiceablePincode() {
		return ServiceablePincode;
	}

	public void setServiceablePincode(Boolean serviceablePincode) {
		ServiceablePincode = serviceablePincode;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getPartnerName() {
		return PartnerName;
	}

	public void setPartnerName(String PartnerName) {
		this.PartnerName = PartnerName;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getReverseTrackingId() {
		return reverseTrackingId;
	}

	public void setReverseTrackingId(String reverseTrackingId) {
		this.reverseTrackingId = reverseTrackingId;
	}

	public Boolean getRepeatCustomer() {
		return isRepeatCustomer;
	}

	public void setRepeatCustomer(Boolean repeatCustomer) {
		isRepeatCustomer = repeatCustomer;
	}

	public Integer getOrdersCount() {
		return ordersCount;
	}

	public void setOrdersCount(Integer ordersCount) {
		this.ordersCount = ordersCount;
	}

	public String getTransactionHandler() {
		return transactionHandler;
	}

	public void setTransactionHandler(String transactionHandler) {
		this.transactionHandler = transactionHandler;
	}

	public String getReSellerDomain() {
		return reSellerDomain;
	}

	public void setReSellerDomain(String reSellerDomain) {
		this.reSellerDomain = reSellerDomain;
	}

	public Long getReSellerId() {
		return reSellerId;
	}

	public void setReSellerId(Long reSellerId) {
		this.reSellerId = reSellerId;
	}
}
