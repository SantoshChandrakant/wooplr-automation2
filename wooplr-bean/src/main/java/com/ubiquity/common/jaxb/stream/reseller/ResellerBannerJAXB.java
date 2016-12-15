package com.ubiquity.common.jaxb.stream.reseller;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by abhishek on 8/27/16.
 */
@XmlRootElement
public class ResellerBannerJAXB  implements Serializable{

    private final static Long serialVersionUID = 12343L;
    protected Long id;

    protected Date createDate;

    protected String imageUrl;

    protected Long ownerId;

    protected String description;

    protected String searchablebanner;

    protected String banner_type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSearchablebanner() {
        return searchablebanner;
    }

    public void setSearchablebanner(String searchablebanner) {
        this.searchablebanner = searchablebanner;
    }

    public String getBanner_type() {
        return banner_type;
    }

    public void setBanner_type(String banner_type) {
        this.banner_type = banner_type;
    }
}
