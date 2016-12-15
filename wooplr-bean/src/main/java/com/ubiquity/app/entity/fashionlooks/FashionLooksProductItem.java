package com.ubiquity.app.entity.fashionlooks;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 */

@PersistenceCapable
public class FashionLooksProductItem {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;

	@Persistent
	private Long looksProductId;

	@Persistent
	private Long productId;

	@Persistent
	private Date createDate;
	@Persistent
	private Integer priority;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getLooksProductId() {
		return looksProductId;
	}

	public void setLooksProductId(Long looksProductId) {
		this.looksProductId = looksProductId;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("FashionLooksProductItem{");
		sb.append("id=").append(id);
		sb.append(", looksProductId=").append(looksProductId);
		sb.append(", productId=").append(productId);
		sb.append(", createDate=").append(createDate);
		sb.append(", priority=").append(priority);
		sb.append('}');
		return sb.toString();
	}
}
