package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;

/**
 * Created by Rajagopal on 12/21/15.
 */
public class EcommOrderBotRequestJAXB implements Serializable {
	protected Long orderId;
	protected String email;
	protected String phoneNo;
	protected ShopifyAddress shippingAddress;
	protected ShopifyAddress billingAddress;
	protected EcommOrderBotProductJAXB product;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public ShopifyAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShopifyAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public ShopifyAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(ShopifyAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public EcommOrderBotProductJAXB getProduct() {
		return product;
	}

	public void setProduct(EcommOrderBotProductJAXB product) {
		this.product = product;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}
