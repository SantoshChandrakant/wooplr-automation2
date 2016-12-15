package com.ubiquity.common.jaxb.stream.reseller;

import com.ubiquity.common.jaxb.ecomm.EcommProductLimitedJAXB;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Rajagopal on 10/14/16.
 */
public class ResellerCollectionProductsJAXB implements Serializable {
    protected ResellerCollectionJAXB collection;
    protected List<EcommProductLimitedJAXB> products;

    public ResellerCollectionJAXB getCollection() {
        return collection;
    }

    public void setCollection(ResellerCollectionJAXB collection) {
        this.collection = collection;
    }

    public List<EcommProductLimitedJAXB> getProducts() {
        return products;
    }

    public void setProducts(List<EcommProductLimitedJAXB> products) {
        this.products = products;
    }
}
