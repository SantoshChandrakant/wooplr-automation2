package com.ubiquity.common.jaxb.stream.reseller;

import java.io.Serializable;

/**
 * Created by atul on 29/08/16.
 */
public class ResellerCollectionJAXB implements Serializable {

    protected Long id;
    protected String name;
    protected String banner;
    protected Double sequence;
    protected String webLink;
    protected String collectionType;
    protected Boolean isCurated;
    protected String tags;
    protected Boolean autosync;

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

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public Double getSequence() {
        return sequence;
    }

    public void setSequence(Double sequence) {
        this.sequence = sequence;
    }

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public String getCollectionType() {
        return collectionType;
    }

    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType;
    }

    public Boolean getIsCurated() {
        return isCurated;
    }

    public void setIsCurated(Boolean isCurated) {
        this.isCurated = isCurated;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Boolean getAutosync() {
        return autosync;
    }

    public void setAutosync(Boolean autosync) {
        this.autosync = autosync;
    }
}
