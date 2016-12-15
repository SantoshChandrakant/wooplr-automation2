
package com.ubiquity.common.jaxb.ecomm;

import com.ubiquity.common.jaxb.promocode.PromotionCodeJAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


/**
 * <p>Java class for ecommOrderJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ecommOrderJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="paymentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcommOrderRequestJAXB", propOrder = {
    "id",
    "products",
    "shippingAddress",
    "totalPrice",
    "paymentType"
})
public class EcommOrderRequestJAXB {
    protected Long id;
    protected String name;
    protected String email;
    protected String phoneNo;
    protected List<EcommOrderRequestProductJAXB> products;
    protected ECommCustomerAddressJAXB shippingAddress;
    protected Double totalPrice;
    protected Double styleMiles;
    protected String paymentType;
    protected Boolean includeStyleMiles;
    protected Long version;
    protected PromotionCodeJAXB promoCode;
    protected Boolean fromCart;
    protected String platform;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<EcommOrderRequestProductJAXB> getProducts() {
        return products;
    }

    public void setProducts(List<EcommOrderRequestProductJAXB> products) {
        this.products = products;
    }

    public ECommCustomerAddressJAXB getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ECommCustomerAddressJAXB shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getStyleMiles() {
        return styleMiles;
    }

    public void setStyleMiles(Double styleMiles) {
        this.styleMiles = styleMiles;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Boolean getIncludeStyleMiles() {
        return includeStyleMiles;
    }

    public void setIncludeStyleMiles(Boolean includeStyleMiles) {
        this.includeStyleMiles = includeStyleMiles;
    }

    public PromotionCodeJAXB getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(PromotionCodeJAXB promoCode) {
        this.promoCode = promoCode;
    }

    public Boolean getFromCart() {
        return fromCart;
    }

    public void setFromCart(Boolean fromCart) {
        this.fromCart = fromCart;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "EcommOrderRequestJAXB{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", products=" + products +
                ", shippingAddress=" + shippingAddress +
                ", totalPrice=" + totalPrice +
                ", styleMiles=" + styleMiles +
                ", paymentType='" + paymentType + '\'' +
                ", includeStyleMiles=" + includeStyleMiles +
                ", version=" + version +
                ", promoCode=" + promoCode +
                ", fromCart=" + fromCart +
                ", platform='" + platform + '\'' +
                '}';
    }
}
