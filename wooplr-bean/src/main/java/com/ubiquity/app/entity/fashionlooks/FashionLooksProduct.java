package com.ubiquity.app.entity.fashionlooks;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * Created by abhishek on 4/6/15.
 */

@PersistenceCapable
public class FashionLooksProduct {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	// @Persistent
	// private Long entityId;
	@Persistent
	private Long looksId;
	@Persistent
	private Long fashionItemId;
	// @Persistent
	// private List<Long> productListId; //---- I think there should be list of
	// productIds,
	// // but not mentioned in doc. Please review
	// @Persistent
	// private List<String> imageUrls;
	@Persistent
	private Date createdDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// public Long getEntityId() {
	// return entityId;
	// }
	//
	// public void setEntityId(Long entityId) {
	// this.entityId = entityId;
	// }

	public Long getLooksId() {
		return looksId;
	}

	public void setLooksId(Long looksId) {
		this.looksId = looksId;
	}

	public Long getFashionItemId() {
		return fashionItemId;
	}

	public void setFashionItemId(Long fashionItemId) {
		this.fashionItemId = fashionItemId;
	}

	// public List<String> getImageUrls() {
	// return imageUrls;
	// }
	//
	// public void setImageUrls(List<String> imageUrls) {
	// this.imageUrls = imageUrls;
	// }
	//
	// public List<Long> getProductListId() {
	// return productListId;
	// }
	//
	// public void setProductListId(List<Long> productListId) {
	// this.productListId = productListId;
	// }

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
