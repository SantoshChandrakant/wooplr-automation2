package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.ubiquity.common.jaxb.entityFull.UserDetailBasicJAXB;

/**
 * Created by debasish on 12/7/2015.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ecommerceProductJAXB", propOrder = { "id", "name", "categoryName", "description", "model",
		"manufacture", "color", "uniqueId", "productUrl", "image_pid", "store", "storeId", "createDate",

		"subcategory", "subcategory2", "prodtag", "relptag", "gender", "sizingChartUrl", "curated", "stylingTips",
		"stylingAuthor", "staffPick",

		"webLink", "affiliateUrl", "cursor", "viewCount", "external_productId", "skus", "attributes", "salesPrice",
		"retailPrice", "size", "stock", "available", "extensionJAXB", "discount", "isNew" })
public class EcommerceProductFullJAXB implements Serializable, Countable {

	protected Long id;
	@XmlElement(required = false)
	protected String name;
	@XmlElement(required = false)
	protected String categoryName;
	@XmlElement(required = false)
	protected String description;
	@XmlElement(required = false)
	protected String model;
	@XmlElement(required = false)
	protected String manufacture;
	@XmlElement(required = false)
	protected String color;
	protected String uniqueId;
	protected String productUrl;
	@XmlElement(required = false)
	protected ArrayList<String> image_pid;
	@XmlElement(required = false)
	protected String store;
	protected Long storeId;
	protected Long createDate;
	@XmlElement(required = false)
	protected String subcategory;
	@XmlElement(required = false)
	protected String subcategory2;
	@XmlElement(required = false)
	protected String prodtag;
	@XmlElement(required = false)
	protected String relptag;
	@XmlElement(required = false)
	protected String gender;

	protected String sizingChartUrl;

	protected Boolean curated = false;
	@XmlElement(required = true)
	protected String stylingTips;
	@XmlElement(required = true)
	protected UserDetailBasicJAXB stylingAuthor;

	protected Boolean staffPick = false;

	protected String webLink;

	protected String affiliateUrl;
	@XmlElement(required = false)
	protected String cursor;
	@XmlElement(required = false)
	protected Long viewCount;
	@XmlElement(required = false)
	protected Long external_productId;

	protected List<EcommProductSKUJAXB> skus;

	protected List<EcommProductAttributeJAXB> attributes;

	@XmlElement(defaultValue = "0.0")
	protected Double salesPrice;
	@XmlElement(defaultValue = "0.0")
	protected Double retailPrice;
	@XmlElement(required = false)
	protected String size;
	@XmlElement(name = "stock")
	protected Integer stock;
	@XmlElement(name = "available", defaultValue = "true")
	protected Boolean available;
	@XmlElement(name = "uniCommerceSupported")
	protected Boolean uniCommerceSupported;

	protected Boolean isNew = Boolean.FALSE;

	protected ECommerceProductExtensionJAXB extensionJAXB;

	protected boolean discount = false;

	protected String promotionalText;

	public String getAffiliateUrl() {
		return affiliateUrl;
	}

	public void setAffiliateUrl(String affiliateUrl) {
		this.affiliateUrl = affiliateUrl;
	}

	public List<EcommProductAttributeJAXB> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<EcommProductAttributeJAXB> attributes) {
		this.attributes = attributes;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean getCurated() {
		return curated;
	}

	public void setCurated(Boolean curated) {
		this.curated = curated;
	}

	public String getCursor() {
		return cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArrayList<String> getImage_pid() {
		return image_pid;
	}

	public void setImage_pid(ArrayList<String> image_pid) {
		this.image_pid = image_pid;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProdtag() {
		return prodtag;
	}

	public void setProdtag(String prodtag) {
		this.prodtag = prodtag;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	public String getRelptag() {
		return relptag;
	}

	public void setRelptag(String relptag) {
		this.relptag = relptag;
	}

	public String getSizingChartUrl() {
		return sizingChartUrl;
	}

	public void setSizingChartUrl(String sizingChartUrl) {
		this.sizingChartUrl = sizingChartUrl;
	}

	public List<EcommProductSKUJAXB> getSkus() {
		return skus;
	}

	public void setSkus(List<EcommProductSKUJAXB> skus) {
		this.skus = skus;
	}

	public Boolean getStaffPick() {
		return staffPick;
	}

	public void setStaffPick(Boolean staffPick) {
		this.staffPick = staffPick;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getStylingTips() {
		return stylingTips;
	}

	public void setStylingTips(String stylingTips) {
		this.stylingTips = stylingTips;
	}

	public String getSubcategory2() {
		return subcategory2;
	}

	public void setSubcategory2(String subcategory2) {
		this.subcategory2 = subcategory2;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public Long getViewCount() {
		return viewCount;
	}

	public void setViewCount(Long viewCount) {
		this.viewCount = viewCount;
	}

	public String getWebLink() {
		return webLink;
	}

	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}

	public Long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}

	public Long getExternal_productId() {
		return external_productId;
	}

	public void setExternal_productId(Long external_productId) {
		this.external_productId = external_productId;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public ECommerceProductExtensionJAXB getExtensionJAXB() {
		return extensionJAXB;
	}

	public void setExtensionJAXB(ECommerceProductExtensionJAXB extensionJAXB) {
		this.extensionJAXB = extensionJAXB;
	}

	public boolean isDiscount() {
		return discount;
	}

	public void setDiscount(boolean discount) {
		this.discount = discount;
	}

	public String getPromotionalText() {
		return promotionalText;
	}

	public void setPromotionalText(String promotionalText) {
		this.promotionalText = promotionalText;
	}

	public UserDetailBasicJAXB getStylingAuthor() {
		// TODO: temp fix putting it null
		return null;
	}

	public void setStylingAuthor(UserDetailBasicJAXB stylingAuthor) {
		// TODO: temp fix putting it null
		this.stylingAuthor = null;
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

	public Boolean getUniCommerceSupported() {
		return uniCommerceSupported;
	}

	public void setUniCommerceSupported(Boolean uniCommerceSupported) {
		this.uniCommerceSupported = uniCommerceSupported;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("EcommerceProductFullJAXB{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", categoryName='").append(categoryName).append('\'');
		sb.append(", description='").append(description).append('\'');
		sb.append(", model='").append(model).append('\'');
		sb.append(", manufacture='").append(manufacture).append('\'');
		sb.append(", color='").append(color).append('\'');
		sb.append(", uniqueId='").append(uniqueId).append('\'');
		sb.append(", productUrl='").append(productUrl).append('\'');
		sb.append(", image_pid=").append(image_pid);
		sb.append(", store='").append(store).append('\'');
		sb.append(", storeId=").append(storeId);
		sb.append(", createDate=").append(createDate);
		sb.append(", subcategory='").append(subcategory).append('\'');
		sb.append(", subcategory2='").append(subcategory2).append('\'');
		sb.append(", prodtag='").append(prodtag).append('\'');
		sb.append(", relptag='").append(relptag).append('\'');
		sb.append(", gender='").append(gender).append('\'');
		sb.append(", sizingChartUrl='").append(sizingChartUrl).append('\'');
		sb.append(", curated=").append(curated);
		sb.append(", stylingTips='").append(stylingTips).append('\'');
		sb.append(", stylingAuthor=").append(stylingAuthor);
		sb.append(", staffPick=").append(staffPick);
		sb.append(", webLink='").append(webLink).append('\'');
		sb.append(", affiliateUrl='").append(affiliateUrl).append('\'');
		sb.append(", cursor='").append(cursor).append('\'');
		sb.append(", viewCount=").append(viewCount);
		sb.append(", external_productId=").append(external_productId);
		sb.append(", skus=").append(skus);
		sb.append(", attributes=").append(attributes);
		sb.append(", salesPrice=").append(salesPrice);
		sb.append(", retailPrice=").append(retailPrice);
		sb.append(", size='").append(size).append('\'');
		sb.append(", stock=").append(stock);
		sb.append(", available=").append(available);
		sb.append(", extensionJAXB=").append(extensionJAXB);
		sb.append(", discount=").append(discount);
		sb.append(", promotionalText='").append(promotionalText).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
