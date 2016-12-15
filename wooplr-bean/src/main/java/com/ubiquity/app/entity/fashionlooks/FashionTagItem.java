package com.ubiquity.app.entity.fashionlooks;

import java.util.Date;
import com.google.appengine.api.datastore.Text;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * Created by abhishek on 4/6/15.
 */

@PersistenceCapable
public class FashionTagItem {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
//    @Persistent
//    private Long itemId;
    @Persistent
    private String userTagItem;
    @Persistent
    private String curatedTagItem;
    @Persistent
    private String userBrandMerchant;
    @Persistent
    private String curatedBrandMerchant;
    @Persistent
    private Long looksId;
    @Persistent
    private Double itemRadius;
    @Persistent
    private Integer item_x_pos;
    @Persistent
    private Integer item_y_pos;
    @Persistent
    private String category;
    @Persistent
    private Long brandOrMerchantId;
//    @Persistent
//    private Long brandId;
    @Persistent
    private Long legacyId;

    @Persistent
    private String subCategory;

    @Persistent
    private String subCategory2;

    @Persistent
    private Integer item_width;

    @Persistent
    private Integer item_height;

    @Persistent
    private String color;

    @Persistent
    private String pattern;

    @Persistent
    private String style;

    @Persistent
    private String sleeve_style;

    @Persistent
    private String option1;

    @Persistent
    private String option2;

    @Persistent
    private Date createDate;

    @Persistent
    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserTagItem() {
        return userTagItem;
    }

    public void setUserTagItem(String userTagItem) {
        this.userTagItem = userTagItem;
    }

    public String getCuratedTagItem() {
        return curatedTagItem;
    }

    public void setCuratedTagItem(String curatedTagItem) {
        this.curatedTagItem = curatedTagItem;
    }

    public String getUserBrandMerchant() {
        return userBrandMerchant;
    }

    public void setUserBrandMerchant(String userBrandMerchant) {
        this.userBrandMerchant = userBrandMerchant;
    }

    public String getCuratedBrandMerchant() {
        return curatedBrandMerchant;
    }

    public void setCuratedBrandMerchant(String curatedBrandMerchant) {
        this.curatedBrandMerchant = curatedBrandMerchant;
    }

    public Long getLooksId() {
        return looksId;
    }

    public void setLooksId(Long looksId) {
        this.looksId = looksId;
    }

    public Double getItemRadius() {
        return itemRadius;
    }

    public void setItemRadius(Double itemRadius) {
        this.itemRadius = itemRadius;
    }

    public Integer getItem_x_pos() {
        return item_x_pos;
    }

    public void setItem_x_pos(Integer item_x_pos) {
        this.item_x_pos = item_x_pos;
    }

    public Integer getItem_y_pos() {
        return item_y_pos;
    }

    public void setItem_y_pos(Integer item_y_pos) {
        this.item_y_pos = item_y_pos;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public Long getBrandOrMerchantId() {
        return brandOrMerchantId;

    }

    public void setBrandOrMerchantId(Long brandOrMerchantId) {
        this.brandOrMerchantId = brandOrMerchantId;
    }

    /*public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
*/

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getSubCategory2() {
        return subCategory2;
    }

    public void setSubCategory2(String subCategory2) {
        this.subCategory2 = subCategory2;
    }

    public Long getLegacyId() {
        return legacyId;
    }

    public void setLegacyId(Long legacyId) {
        this.legacyId = legacyId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getItem_height() {
        return item_height;
    }

    public void setItem_height(Integer item_height) {
        this.item_height = item_height;
    }

    public Integer getItem_width() {
        return item_width;
    }

    public void setItem_width(Integer item_width) {
        this.item_width = item_width;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getSleeve_style() {
        return sleeve_style;
    }

    public void setSleeve_style(String sleeve_style) {
        this.sleeve_style = sleeve_style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
