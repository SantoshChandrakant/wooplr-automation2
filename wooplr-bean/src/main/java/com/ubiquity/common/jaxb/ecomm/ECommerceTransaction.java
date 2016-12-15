package com.ubiquity.common.jaxb.ecomm;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

/**
 * Created by subharthi on 8/20/15.
 */
@PersistenceCapable
public class ECommerceTransaction extends BaseEntity {

	@Persistent
	private Long storeId;

	@Persistent
	private Long productId;

	@Persistent
	private Double salesPrice;

	@Persistent
	private String transactionId;

	@Persistent
	private Long userId;

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
