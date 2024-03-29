//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.11 at 01:55:25 PM IST 
//

package com.ubiquity.common.jaxb.stream;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ubiquity.common.jaxb.ecomm.Countable;

/**
 * <p>
 * Java class for StreamEcommProductJAXB complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="StreamEcommProductJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="storeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="storeId" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}Double"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamEcommProductJAXB", propOrder = { "id", "name", "storeName", "storeId", "price", "discount",
		"stock", "image_pid", "available", "salesPrice", "affiliateUrl", "manufacture", "isEcommSupported", "isNew"

})
@XmlRootElement
public class StreamEcommProductJAXB implements Serializable, Countable {

	private final static Long serialVersionUID = 12343L;
	protected Long id;
	@XmlElement(required = true)
	protected String name;
	@XmlElement(required = true)
	protected String storeName;
	protected Long storeId;
	protected Double price;
	protected Integer discount;
	protected Double salesPrice;
	protected Long stock;
	protected String image_pid;
	protected Boolean available;
	protected String affiliateUrl;
	protected String manufacture;
	protected String size;
	protected Boolean isEcommSupported;
	protected Boolean isNew;

	public String getImage_pid() {
		return image_pid;
	}

	public void setImage_pid(String image_pid) {
		this.image_pid = image_pid;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
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
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
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
	 * 
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * Sets the value of the storeName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStoreName(String value) {
		this.storeName = value;
	}

	public Boolean isSetStoreName() {
		return (this.storeName != null);
	}

	/**
	 * Gets the value of the storeId property.
	 * 
	 */
	public Long getStoreId() {
		return storeId;
	}

	/**
	 * Sets the value of the storeId property.
	 * 
	 */
	public void setStoreId(Long value) {
		this.storeId = value;
	}

	public Boolean isSetStoreId() {
		return true;
	}

	/**
	 * Gets the value of the price property.
	 * 
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * Sets the value of the price property.
	 * 
	 */
	public void setPrice(Double value) {
		this.price = value;
	}

	public Boolean isSetPrice() {
		return true;
	}

	/**
	 * Gets the value of the discount property.
	 * 
	 */
	public Integer getDiscount() {
		return discount;
	}

	/**
	 * Sets the value of the discount property.
	 * 
	 */
	public void setDiscount(Integer value) {
		this.discount = value;
	}

	public Boolean isSetDiscount() {
		return true;
	}

	/**
	 * Gets the value of the stock property.
	 * 
	 */
	public Long getStock() {
		return stock;
	}

	/**
	 * Sets the value of the stock property.
	 * 
	 */
	public void setStock(Long value) {
		this.stock = value;
	}

	public Boolean isSetStock() {
		return true;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
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

	public Boolean getNew() {
		return isNew;
	}

	public void setNew(Boolean aNew) {
		isNew = aNew;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("StreamEcommProductJAXB{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", storeName='").append(storeName).append('\'');
		sb.append(", storeId=").append(storeId);
		sb.append(", price=").append(price);
		sb.append(", discount=").append(discount);
		sb.append(", salesPrice=").append(salesPrice);
		sb.append(", stock=").append(stock);
		sb.append(", image_pid='").append(image_pid).append('\'');
		sb.append(", available=").append(available);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		StreamEcommProductJAXB that = (StreamEcommProductJAXB) o;

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
