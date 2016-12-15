package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Created by Rajagopal on 6/11/15.
 */
public abstract class EsDocument implements Serializable {
	private static Logger logger = Logger.getLogger(EsDocument.class);
	private static SimpleDateFormat dateFormat = new SimpleDateFormat(EsUtils.TIMESTAMP_FORMAT);

	protected String id;
	protected Date createdDate;
	protected Date updatedDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public static String dateToString(Date date) {
		if (date != null) {
			return dateFormat.format(date);
		}
		return null;
	}

	public static Date stringToDate(String dateString) {
		if (dateString != null) {
			try {
				Date date = dateFormat.parse(dateString);
				return date;
			} catch (ParseException ex) {
				logger.error("Date format exception", ex);
			}
		}
		return null;
	}

	public static String getLatLonString(Double lat, Double lon) {
		if (lat == null || lon == null) {
			return null;
		}

		try {
			float latFloat = lat.floatValue();
			float lonFloat = lon.floatValue();

			if (latFloat == 0 && lonFloat == 0) {
				// Even though it is a valid lat,lon since it is in middle of
				// ocean and we have 0 as default value
				// We are skipping it
				return null;
			}

			// if (GeoCoordinateManager.isValidLatitude(latFloat) &&
			// GeoCoordinateManager.isValidLongitude(lonFloat)) {
			// return lat + "," + lon;
			// } else {
			// logger.error("Invalid lat,lon. Skipping geo location.");
			// }
		} catch (NumberFormatException ex) {
			logger.error("Invalid lat,lon. Skipping geo location.", ex);
		}
		return null;
	}

	public abstract String toString();
}
