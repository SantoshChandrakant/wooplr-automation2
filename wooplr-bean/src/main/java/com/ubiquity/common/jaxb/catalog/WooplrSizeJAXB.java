package com.ubiquity.common.jaxb.catalog;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by pmundhra on 08/08/16.
 */
public class WooplrSizeJAXB implements Serializable {
    String category;
    @SerializedName("primary-measurement")
    String primaryMeasurement;
    String unit;
    @SerializedName("wooplr-size")
    String wooplrSize;
    @SerializedName("uk-size")
    String ukSize;
    @SerializedName("measurement")
    String measurement;


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrimaryMeasurement() {
        return primaryMeasurement;
    }

    public void setPrimaryMeasurement(String primaryMeasurement) {
        this.primaryMeasurement = primaryMeasurement;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getWooplrSize() {
        return wooplrSize;
    }

    public void setWooplrSize(String wooplrSize) {
        this.wooplrSize = wooplrSize;
    }

    public String getUkSize() {
        return ukSize;
    }

    public void setUkSize(String ukSize) {
        this.ukSize = ukSize;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    @Override
    public String toString() {
        return "WooplrSizeJAXB{" +
                "category='" + category + '\'' +
                ", primaryMeasurement='" + primaryMeasurement + '\'' +
                ", unit='" + unit + '\'' +
                ", wooplrSize='" + wooplrSize + '\'' +
                ", ukSize='" + ukSize + '\'' +
                ", measurement='" + measurement + '\'' +
                '}';
    }
}
