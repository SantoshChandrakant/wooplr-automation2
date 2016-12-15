package com.ubiquity.common.jaxb.stream;

import com.ubiquity.common.jaxb.entityFull.UserDetailBasicJAXB;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by abhishek on 5/28/15.
 */
@XmlRootElement
public class FashionLookLinkedProductsJAXB implements Serializable{

    Long tagId;

    List<StreamEcommProductJAXB> linkedProductList;

    public List<StreamEcommProductJAXB> getLinkedProductList() {
        return linkedProductList;
    }

    public void setLinkedProductList(List<StreamEcommProductJAXB> linkedProductList) {
        this.linkedProductList = linkedProductList;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}
