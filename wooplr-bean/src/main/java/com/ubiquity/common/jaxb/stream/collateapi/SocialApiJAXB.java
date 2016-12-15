package com.ubiquity.common.jaxb.stream.collateapi;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.ubiquity.common.jaxb.ecomm.EntityConstants;

/**
 * Created by subharthi on 3/10/16.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialApiJAXB", propOrder = { "timestamp", "after", "pageNumber", })
public class SocialApiJAXB implements Serializable {
	@XmlElement(required = true, defaultValue = "0L")
	private Long timestamp;
	@XmlElement(required = true, defaultValue = "false")
	private Boolean after;
	@XmlElement(required = true, defaultValue = "1L")
	private Long pageNumber;
	@XmlElement(required = true, defaultValue = "V2")
	private EntityConstants.ApiVersion apiVersion;
	@XmlTransient
	private static SocialApiJAXB DEFAULT = new SocialApiJAXB();

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public EntityConstants.ApiVersion getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(EntityConstants.ApiVersion apiVersion) {
		this.apiVersion = apiVersion;
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

	public static SocialApiJAXB valueOf(String defaultValue) {
		if ("__DEFAULT".equals(defaultValue)) {
			DEFAULT.setTimestamp(0L);
			DEFAULT.setAfter(Boolean.FALSE);
			DEFAULT.setPageNumber(1L);
			DEFAULT.setApiVersion(EntityConstants.ApiVersion.V2);
			return DEFAULT;
		}
		return null;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SocialApiJAXB{");
		sb.append("timestamp=").append(timestamp);
		sb.append(", after=").append(after);
		sb.append(", pageNumber=").append(pageNumber);
		sb.append(", apiVersion=").append(apiVersion);
		sb.append('}');
		return sb.toString();
	}
}
