package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by subharthi on 5/27/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcommProductLimitedJAXB", propOrder = { "id", "name", "storeName", "storeId", "price", "discount",
		"stock", "image_pid", "available", "salesPrice", "webLink", "affiliateUrl", "manufacture", "isEcommSupported",
		"isNew", "category", "subcategory", "subcategory2", "attributes" })
@XmlRootElement
public class EcommProductLimitedJAXB implements Serializable, Countable {

	public static enum FIELDS {
		ID("ID"), NAME("NAME"), STORE_NAME("STORE_NAME"), STORE_ID("STORE_ID"), PRICE("PRICE"), DISCOUNT(
				"DISCOUNT"), STOCK("STOCK"), IMAGE_PID("IMAGE_PID"), AVAILABLE("AVAILABLE"), SALES_PRICE(
						"SALES_PRICE"), WEB_LINK("WEB_LINK"), AFFILIATE_URL("AFFILIATE_URL"), MANUFACTURE(
								"MANUFACTURE"), IS_ECOMM_SUPPORTED("IS_ECOMM_SUPPORTED"), CATEGORY(
										"CATEGORY"), SUBCATEGORY(
												"SUBCATEGORY"), SUBCATEGORY2("SUBCATEGORY2"), ATTRIBUTE("ATTRIBUTES");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		FIELDS(String value) {
			this.value = value;
		}
	}

	private final static Long serialVersionUID = 12343L;
	protected Long id;
	@XmlElement(required = true)
	protected String name;
	@XmlElement(required = true)
	protected String storeName;
	protected Long storeId;
	protected Double price;
	protected Integer discount;
	protected Integer stock;
	protected String image_pid;
	protected Double salesPrice;
	protected Boolean available;
	protected String webLink;
	protected String affiliateUrl;
	protected String manufacture;
	protected String size;
	protected Boolean isEcommSupported;
	protected Long sequenceInCollection;
	protected Boolean isNew = Boolean.FALSE;
	protected String subcategory;
	protected String subcategory2;
	protected List<EcommProductAttributeJAXB> attributes;
	protected String category;

	/**
	 * Gets the value of the id property.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 */
	public void setId(Long value) {
		this.id = value;
	}

	public Boolean isSetId() {
		return true;
	}

	/**
	 * Gets the value of the name property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setName(String value) {
		this.name = value;
	}

	public Boolean isSetName() {
		return (this.name != null);
	}

	/**
	 * Gets the value of the storeName property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * Sets the value of the storeName property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setStoreName(String value) {
		this.storeName = value;
	}

	public Boolean isSetStoreName() {
		return (this.storeName != null);
	}

	/**
	 * Gets the value of the storeId property.
	 */
	public Long getStoreId() {
		return storeId;
	}

	/**
	 * Sets the value of the storeId property.
	 */
	public void setStoreId(Long value) {
		this.storeId = value;
	}

	public Boolean isSetStoreId() {
		return true;
	}

	/**
	 * Gets the value of the price property.
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * Sets the value of the price property.
	 */
	public void setPrice(Double value) {
		this.price = value;
	}

	public Boolean isSetPrice() {
		return true;
	}

	/**
	 * Gets the value of the discount property.
	 */
	public Integer getDiscount() {
		return discount;
	}

	/**
	 * Sets the value of the discount property.
	 */
	public void setDiscount(Integer value) {
		this.discount = value;
	}

	public Boolean isSetDiscount() {
		return true;
	}

	/**
	 * Gets the value of the stock property.
	 */
	public Integer getStock() {
		return stock;
	}

	/**
	 * Sets the value of the stock property.
	 */
	public void setStock(Integer value) {
		this.stock = value;
	}

	public Boolean isSetStock() {
		return true;
	}

	public String getImage_pid() {
		return image_pid;
	}

	public void setImage_pid(String image_pid) {
		this.image_pid = image_pid;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		if (available == null) {
			available = false;
		}
		this.available = available;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String getWebLink() {
		return webLink;
	}

	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}

	public String getAffiliateUrl() {
		return affiliateUrl;
	}

	public void setAffiliateUrl(String affiliateUrl) {
		this.affiliateUrl = affiliateUrl;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Boolean getIsEcommSupported() {
		return isEcommSupported;
	}

	public void setIsEcommSupported(Boolean isEcommSupported) {
		this.isEcommSupported = isEcommSupported;
	}

	public Long getSequenceInCollection() {
		return sequenceInCollection;
	}

	public void setSequenceInCollection(Long sequenceInCollection) {
		this.sequenceInCollection = sequenceInCollection;
	}

	public Boolean getNew() {
		return isNew;
	}

	public void setNew(Boolean aNew) {
		if (aNew == null) {
			this.isNew = Boolean.FALSE;
		} else {
			isNew = aNew;
		}
	}

	public String getCategoryName() {
		return category;
	}

	public void setCategoryName(String categoryName) {
		this.category = categoryName;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public String getSubcategory2() {
		return subcategory2;
	}

	public void setSubcategory2(String subcategory2) {
		this.subcategory2 = subcategory2;
	}

	public List<EcommProductAttributeJAXB> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<EcommProductAttributeJAXB> attributes) {
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		return "EcommProductLimitedJAXB{" + "id=" + id + ", name='" + name + '\'' + ", storeName='" + storeName + '\''
				+ ", storeId=" + storeId + ", price=" + price + ", discount=" + discount + ", stock=" + stock
				+ ", image_pid='" + image_pid + '\'' + ", salesPrice=" + salesPrice + ", available=" + available
				+ ", webLink='" + webLink + '\'' + ", affiliateUrl='" + affiliateUrl + '\'' + ", manufacture='"
				+ manufacture + '\'' + ", size='" + size + '\'' + ", isEcommSupported=" + isEcommSupported
				+ ", sequenceInCollection=" + sequenceInCollection + ", category='" + category + '\''
				+ ", subcategory='" + subcategory + '\'' + ", subcategory2='" + subcategory2 + '\'' + ", attributes="
				+ attributes + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		EcommProductLimitedJAXB that = (EcommProductLimitedJAXB) o;

		if (discount != null ? !discount.equals(that.discount) : that.discount != null)
			return false;
		if (!id.equals(that.id))
			return false;
		if (!name.equals(that.name))
			return false;
		if (price != null ? !price.equals(that.price) : that.price != null)
			return false;
		if (stock != null ? !stock.equals(that.stock) : that.stock != null)
			return false;
		if (!storeId.equals(that.storeId))
			return false;
		if (storeName != null ? !storeName.equals(that.storeName) : that.storeName != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id.hashCode();
		result = 31 * result + name.hashCode();
		result = 31 * result + (storeName != null ? storeName.hashCode() : 0);
		result = 31 * result + storeId.hashCode();
		result = 31 * result + (price != null ? price.hashCode() : 0);
		result = 31 * result + (discount != null ? discount.hashCode() : 0);
		result = 31 * result + (stock != null ? stock.hashCode() : 0);
		return result;
	}

}
