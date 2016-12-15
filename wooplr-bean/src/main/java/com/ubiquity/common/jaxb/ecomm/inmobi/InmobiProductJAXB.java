package com.ubiquity.common.jaxb.ecomm.inmobi;

/**
 * Created by pravesh on 06/04/16.
 */
public class InmobiProductJAXB {

    Boolean available;
    String productId;
    String productTitle;
    String currency;
    InmobiProductPriceJAXB price;
    String itemLink;
    InmobiProductImageJAXB image;
    String category;
    String description;
    InmobiProductBrandJAXB brand;

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public InmobiProductPriceJAXB getPrice() {
        return price;
    }

    public void setPrice(InmobiProductPriceJAXB price) {
        this.price = price;
    }

    public String getItemLink() {
        return itemLink;
    }

    public void setItemLink(String itemLink) {
        this.itemLink = itemLink;
    }

    public InmobiProductImageJAXB getImage() {
        return image;
    }

    public void setImage(InmobiProductImageJAXB image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InmobiProductBrandJAXB getBrand() {
        return brand;
    }

    public void setBrand(InmobiProductBrandJAXB brand) {
        this.brand = brand;
    }
}
