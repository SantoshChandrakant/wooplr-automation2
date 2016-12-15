package com.ubiquity.common.jaxb.ecomm;

/**
 * Created by subharthi on 4/26/16.
 */
public class EsEcommOrderProduct extends EsDocument {

	private Double price;
	private String imagePid;
	private String storeName;
	private Long storeId;
	private Long productId;
	private Long skuId;
	private String size;
	private String brandSize;
	private Double salesPrice;
	private Double retailPrice;
	private Double discount;
	private String category;
	private String subCategory;
	private String subCategory2;
	private String manufacture;
	private String color;
	private String unique_id;
	private String sku_id;
	private String merchantUrl;
	private String name;
	private String productUrl;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getMerchantUrl() {
		return merchantUrl;
	}

	public void setMerchantUrl(String merchantUrl) {
		this.merchantUrl = merchantUrl;
	}

	public String getImagePid() {
		return imagePid;
	}

	public void setImagePid(String imagePid) {
		this.imagePid = imagePid;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

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

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getBrandSize() {
		return brandSize;
	}

	public void setBrandSize(String brandSize) {
		this.brandSize = brandSize;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getSubCategory2() {
		return subCategory2;
	}

	public void setSubCategory2(String subCategory2) {
		this.subCategory2 = subCategory2;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getUnique_id() {
		return unique_id;
	}

	public void setUnique_id(String unique_id) {
		this.unique_id = unique_id;
	}

	public String getSku_id() {
		return sku_id;
	}

	public void setSku_id(String sku_id) {
		this.sku_id = sku_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	@Override
	public String toString() {
		return "EsEcommOrderProduct{" + "price=" + price + ", imagePid='" + imagePid + '\'' + ", storeName='"
				+ storeName + '\'' + ", storeId=" + storeId + ", productId=" + productId + ", skuId=" + skuId
				+ ", size='" + size + '\'' + ", brandSize='" + brandSize + '\'' + ", salesPrice=" + salesPrice
				+ ", retailPrice=" + retailPrice + ", discount=" + discount + ", category='" + category + '\''
				+ ", subCategory='" + subCategory + '\'' + ", subCategory2='" + subCategory2 + '\'' + ", manufacture='"
				+ manufacture + '\'' + ", color='" + color + '\'' + ", unique_id='" + unique_id + '\'' + ", sku_id='"
				+ sku_id + '\'' + ", merchantUrl='" + merchantUrl + '\'' + ", name='" + name + '\'' + ", productUrl='"
				+ productUrl + '\'' + '}';
	}
}
