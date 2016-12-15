package com.ubiquity.common.jaxb.stream.reseller;


import com.ubiquity.common.jaxb.ecomm.EcommProductUltraJAXB;

import java.io.Serializable;
import java.util.List;

/**
 * Created by abhishek on 8/24/16.
 */
public class ResellerStoreFullJAXB implements Serializable{

    private final static long serialversionuid = 12343l;

    protected ResellerStoreJAXB resellerstorejaxb;

    protected ResellerStoreBankDetailsJAXB bankdetailsjaxb;

    protected List<ReSellerCategoryJAXB> categories;

    protected List<ResellerCollectionJAXB> collectionjaxb;

    protected List<EcommProductUltraJAXB> storeproducts;


    public ResellerStoreJAXB getResellerstorejaxb() {
        return resellerstorejaxb;
    }

    public void setResellerstorejaxb(ResellerStoreJAXB resellerstorejaxb) {
        this.resellerstorejaxb = resellerstorejaxb;
    }

    public ResellerStoreBankDetailsJAXB getBankdetailsjaxb() {
        return bankdetailsjaxb;
    }

    public void setBankdetailsjaxb(ResellerStoreBankDetailsJAXB bankdetailsjaxb) {
        this.bankdetailsjaxb = bankdetailsjaxb;
    }

    public List<ReSellerCategoryJAXB> getCategories() {
        return categories;
    }

    public void setCategories(List<ReSellerCategoryJAXB> categories) {
        this.categories = categories;
    }

    public List<ResellerCollectionJAXB> getCollectionjaxb() {
        return collectionjaxb;
    }

    public void setCollectionjaxb(List<ResellerCollectionJAXB> collectionjaxb) {
        this.collectionjaxb = collectionjaxb;
    }

    public List<EcommProductUltraJAXB> getStoreproducts() {
        return storeproducts;
    }

    public void setStoreproducts(List<EcommProductUltraJAXB> storeproducts) {
        this.storeproducts = storeproducts;
    }
}
