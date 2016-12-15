package com.ubiquity.common.jaxb.stream.reseller;

import java.io.Serializable;
import java.util.List;

/**
 * Created by abhishek on 8/29/16.
 */
public class ReSellerCategoryJAXB implements Serializable {
    protected String category;
    protected Long count;
    protected List<ReSellerSubCategoryJAXB> subCategories;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<ReSellerSubCategoryJAXB> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<ReSellerSubCategoryJAXB> subCategories) {
        this.subCategories = subCategories;
    }
}
