package com.ubiquity.common.jaxb.catalog;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pmundhra on 05/10/16.
 */
public class SizeFullJAXB implements Serializable {
	@SerializedName("store-id")
	@XmlElement(name = "store-id")
	Long storeId;
	String category;
	@SerializedName("wooplr-size")
	@XmlElement(name = "wooplr-size")
	String wooplrSize;
	@SerializedName("brand-size")
	@XmlElement(name = "brand-size")
	String brandSize;
	@SerializedName("uk-size")
	@XmlElement(name = "uk-size")
	String ukSize;
	String primaryMeasurement;
	String unit;
	List<MeasurementJAXB> measurements;

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

	public String getWooplrSize() {
		return wooplrSize;
	}

	public void setWooplrSize(String wooplrSize) {
		this.wooplrSize = wooplrSize;
	}

	public String getBrandSize() {
		return brandSize;
	}

	public void setBrandSize(String brandSize) {
		this.brandSize = brandSize;
	}

	public String getUkSize() {
		return ukSize;
	}

	public void setUkSize(String ukSize) {
		this.ukSize = ukSize;
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

	public List<MeasurementJAXB> getMeasurements() {
		return measurements;
	}

	public void setMeasurements(List<MeasurementJAXB> measurements) {
		this.measurements = measurements;
	}

	public String getMeasurement(String type) {
		for (MeasurementJAXB measurement : measurements) {
			if (measurement.getType().equals(type)) {
				return measurement.getValue();
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "SizeFullJAXB{" + "storeId='" + storeId + '\'' + ", category='" + category + '\'' + ", wooplrSize='"
				+ wooplrSize + '\'' + ", brandSize='" + brandSize + '\'' + ", ukSize='" + ukSize + '\''
				+ ", primaryMeasurement='" + primaryMeasurement + '\'' + ", unit='" + unit + '\'' + ", measurements="
				+ measurements + '}';
	}
}
