package com.ubiquity.common.jaxb.stream.collateapi;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by subharthi on 3/21/16.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppCardApiJAXB", propOrder = { "timestamp", "after", "pageNumber", })
public class AppCardApiJAXB implements Serializable {
	@XmlElement(required = true, defaultValue = "0L")
	private Long timestamp;
	@XmlElement(required = true, defaultValue = "false")
	private Boolean after;
	@XmlElement(required = true, defaultValue = "1L")
	private Long pageNumber;
	@XmlTransient
	private static AppCardApiJAXB DEFAULT = new AppCardApiJAXB();

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Boolean getAfter() {
		return after;
	}

	public void setAfter(Boolean after) {
		this.after = after;
	}

	public Long getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public static AppCardApiJAXB valueOf(String defaultValue) {
		if ("__DEFAULT".equals(defaultValue)) {
			DEFAULT.setTimestamp(new Date().getTime());
			DEFAULT.setAfter(Boolean.FALSE);
			DEFAULT.setPageNumber(1L);
			return DEFAULT;
		}
		return null;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("AppCardApiJAXB{");
		sb.append("timestamp=").append(timestamp);
		sb.append(", after=").append(after);
		sb.append(", pageNumber=").append(pageNumber);
		sb.append('}');
		return sb.toString();
	}
}
