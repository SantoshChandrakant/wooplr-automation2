package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by subharthi on 5/10/16.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECommOrderStatsFilterJAXB", propOrder = { "pageNumber", "count", "sort" })
public class ECommOrderStatsFilterJAXB implements Serializable {

	@XmlTransient
	private static ECommOrderStatsFilterJAXB DEFAULT = new ECommOrderStatsFilterJAXB();

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

	@XmlElement
	private String orderStatus;

	@XmlElement
	private String shippedOrderStatus;

	@XmlElement
	private Long truncatedOrderId;

	@XmlElement
	private Long productId;

	@XmlElement(name = "sort")
	private ECommOrderStatsSortJAXB sort;

	@XmlElement(name = "pageNumber", defaultValue = "1", required = true)
	private Long pageNumber;

	@XmlElement(defaultValue = "10", required = true)
	private Long count;

	@XmlElement
	private Long resellerId;

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
		if (sort == null) {
			sort = ECommOrderStatsSortJAXB.valueOf("__DEFAULT");
		}
		return sort;
	}

	public void setSort(ECommOrderStatsSortJAXB sort) {
		this.sort = sort;
	}

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
		if (pageNumber == null) {
			pageNumber = 1L;
		}
		return pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getCount() {
		if (count == null) {
			count = 20L;
		}
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getResellerId() {
		return resellerId;
	}

	public void setResellerId(Long resellerId) {
		this.resellerId = resellerId;
	}

	public static ECommOrderStatsFilterJAXB valueOf(String defaultValue) {
		if ("__DEFAULT".equals(defaultValue)) {
			DEFAULT.setOrderStatus("UNCONFIRMED");
			DEFAULT.setCount(50L);
			DEFAULT.setPageNumber(0L);
			DEFAULT.setSort(ECommOrderStatsSortJAXB.valueOf("__DEFAULT"));
			return DEFAULT;
		}
		return null;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ECommOrderStatsFilterJAXB{");
		sb.append("refNo=").append(refNo);
		sb.append(", orderId=").append(orderId);
		sb.append(", customerEmail='").append(customerEmail).append('\'');
		sb.append(", storeId=").append(storeId);
		sb.append(", userName='").append(userName).append('\'');
		sb.append(", userId=").append(userId);
		sb.append(", phoneNumber=").append(phoneNumber);
		sb.append(", orderStatus='").append(orderStatus).append('\'');
		sb.append(", shippedOrderStatus='").append(shippedOrderStatus).append('\'');
		sb.append(", truncatedOrderId=").append(truncatedOrderId);
		sb.append(", productId=").append(productId);
		sb.append(", sort=").append(sort);
		sb.append(", pageNumber=").append(pageNumber);
		sb.append(", count=").append(count);
		sb.append('}');
		return sb.toString();
	}
}
