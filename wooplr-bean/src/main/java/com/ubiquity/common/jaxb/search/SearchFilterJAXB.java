
package com.ubiquity.common.jaxb.search;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="on_sale" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sort_by" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="price_range" type="{}SearchFilterPriceRangeJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "customsearchId",
        "brand",
        "on_sale",
        "sort_by",
        "price_range",
        "store",
        "blacklistStore",
        "category",
        "subCategory",
        "subCategory2",
        "startTimestamp",
        "endTimestamp",
        "collection"
})
@XmlRootElement(name = "SearchFilterJAXB")
public class SearchFilterJAXB implements Serializable {
    @XmlElement(required = true)
    protected Long id;
    @XmlElement(required = true)
    protected Long customsearchId;
    private final static Long serialVersionUID = 12343L;
    @XmlElement(nillable = true)
    protected List<String> brand;
    @XmlElement(name = "on_sale", nillable = true)
    protected List<String> on_sale;
    @XmlElement(name = "sort_by", nillable = true)
    protected List<String> sort_by;
    @XmlElement(name = "price_range", nillable = true)
    protected List<SearchFilterPriceRangeJAXB> price_range;
    @XmlElement(name = "store", nillable = true)
    protected List<String> store;
    @XmlElement(name = "blacklistStore", nillable = true)
    protected List<String> blacklistStore;
    @XmlElement(name = "category", nillable = true)
    protected List<String> category;
    @XmlElement(name = "subCategory", nillable = true)
    protected List<String> subCategory;
    @XmlElement(name = "subCategory2", nillable = true)
    protected List<String> subCategory2;
    @XmlElement(name = "startTimestamp", nillable = true)
    protected Long startTimestamp;
    @XmlElement(name = "endTimestamp", nillable = true)
    protected Long endTimestamp;
    @XmlElement(name = "collection", nillable = true)
    protected List<String> collection;
    protected Boolean available = Boolean.TRUE;


    /**
     * Gets the value of the brand property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brand property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrand().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getBrand() {
        if (brand == null) {
            brand = new ArrayList<String>();
        }
        return this.brand;
    }

    public boolean isSetBrand() {
        return ((this.brand != null) && (!this.brand.isEmpty()));
    }

    public void unsetBrand() {
        this.brand = null;
    }

    /**
     * Gets the value of the onSale property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onSale property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnSale().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getOn_sale() {
        if (on_sale == null) {
            on_sale = new ArrayList<String>();
        }
        return this.on_sale;
    }

    public boolean isSetOn_sale() {
        return ((this.on_sale != null) && (!this.on_sale.isEmpty()));
    }

    public void unsetOn_sale() {
        this.on_sale = null;
    }

    /**
     * Gets the value of the sortBy property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortBy property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortBy().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */

    public List<String> getSort_by() {
        if (sort_by == null) {
            sort_by = new ArrayList<String>();
        }
        return this.sort_by;
    }

    public boolean isSetSort_by() {
        return ((this.sort_by != null) && (!this.sort_by.isEmpty()));
    }

    public void unsetSort_by() {
        this.sort_by = null;
    }

    /**
     * Gets the value of the priceRange property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceRange property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceRange().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchFilterPriceRangeJAXB }
     */
    public List<SearchFilterPriceRangeJAXB> getPrice_range() {
        if (price_range == null) {
            price_range = new ArrayList<SearchFilterPriceRangeJAXB>();
        }
        return this.price_range;
    }

    public boolean isSetPrice_range() {
        return ((this.price_range != null) && (!this.price_range.isEmpty()));
    }

    public void unsetPrice_range() {
        this.price_range = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomsearchId() {
        return customsearchId;
    }

    public void setCustomsearchId(Long customsearchId) {
        this.customsearchId = customsearchId;
    }

    /**
     * Gets the value of the store property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the store property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStore().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getStore() {
        if (store == null) {
            store = new ArrayList<String>();
        }
        return this.store;
    }

    public boolean isSetStore() {
        return ((this.store != null) && (!this.store.isEmpty()));
    }

    public void unsetStore() {
        this.store = null;
    }

    public List<String> getBlacklistStore() {
        if (blacklistStore == null) {
            blacklistStore = new ArrayList<String>();
        }
        return this.blacklistStore;
    }

    public boolean isSetBlacklistStore() {
        return ((this.blacklistStore != null) && (!this.blacklistStore.isEmpty()));
    }

    public void unsetBlacklistStore() {
        this.blacklistStore = null;
    }

    public List<String> getCategory() {
        if (category == null) {
            category = new ArrayList<String>();
        }
        return this.category;
    }

    public boolean isSetCategory() {
        return ((this.category != null) && (!this.category.isEmpty()));
    }

    public void unsetCategory() {
        this.category = null;
    }

    public List<String> getSubCategory() {
        if (subCategory == null) {
            subCategory = new ArrayList<String>();
        }
        return this.subCategory;
    }

    public boolean isSetSubCategory() {
        return ((this.subCategory != null) && (!this.subCategory.isEmpty()));
    }

    public void unsetSubCategory() {
        this.subCategory = null;
    }

    public List<String> getSubCategory2() {
        if (subCategory2 == null) {
            subCategory2 = new ArrayList<String>();
        }
        return this.subCategory2;
    }

    public boolean isSetSubCategory2() {
        return ((this.subCategory2 != null) && (!this.subCategory2.isEmpty()));
    }

    public void unsetSubCategory2() {
        this.subCategory2 = null;
    }

    public Long getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public Long getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
    }
    public List<String> getCollection() {
        if (collection == null) {
            collection = new ArrayList<String>();
        }
        return this.collection;
    }

    public boolean isSetCollection() {
        return ((this.collection != null) && (!this.collection.isEmpty()));
    }

    public void unsetCollection() {
        this.collection = null;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
