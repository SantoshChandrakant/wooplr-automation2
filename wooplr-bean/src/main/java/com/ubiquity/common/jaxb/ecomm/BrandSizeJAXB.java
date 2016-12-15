package com.ubiquity.common.jaxb.ecomm;

import com.google.gson.annotations.SerializedName;
import com.ubiquity.common.jaxb.catalog.MeasurementJAXB;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by pmundhra on 06/08/16.
 */
public class BrandSizeJAXB implements Serializable {
    @XmlElement(name = "store-id")
    @SerializedName("store-id")
    private Long storeId;
    private String category;
    @XmlElement(name = "brand-size")
    @SerializedName("brand-size")
    private String brandSize;
    // inches or cm
    @XmlElement(name = "unit")
    @SerializedName("unit")
    private String unit;
    private List<MeasurementJAXB> measurements;

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrandSize() {
        return brandSize;
    }

    public void setBrandSize(String brandSize) {
        this.brandSize = brandSize;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<MeasurementJAXB> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<MeasurementJAXB> measurements) {
        this.measurements = measurements;
    }

    public String getMeasurement(String type) {
        for (MeasurementJAXB measurement : measurements) {
            if (measurement.getType().equalsIgnoreCase(type)) {
                return measurement.getValue();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "BrandSizeJAXB{" +
                "storeId=" + storeId +
                ", category='" + category + '\'' +
                ", brandSize='" + brandSize + '\'' +
                ", unit='" + unit + '\'' +
                ", measurements=" + measurements +
                '}';
    }
}
