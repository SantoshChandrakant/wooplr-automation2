package com.ubiquity.common.jaxb.stream.reseller;

import java.io.Serializable;

/**
 * Created by Rajagopal on 9/1/16.
 */
public class ReSellerSubCategoryJAXB implements Serializable {
    protected String subCategory;
    protected Long count;

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
