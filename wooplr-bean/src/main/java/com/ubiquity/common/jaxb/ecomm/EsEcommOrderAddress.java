package com.ubiquity.common.jaxb.ecomm;

/**
 * Created by subharthi on 4/26/16.
 */
public class EsEcommOrderAddress extends EsDocument {

	private Long customerId;
	private Long userId;
	private String type;
	private Boolean default_addr;
	private String line1;
	private String line2;
	private String name;
	private String first_name;
	private String last_name;
	private String phone;
	private String city;
	private String province;
	private String country;
	private String zip;
	private String landmark;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getDefault_addr() {
		return default_addr;
	}

	public void setDefault_addr(Boolean default_addr) {
		this.default_addr = default_addr;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toReport() {
		StringBuffer buffer = new StringBuffer();

		if (line1 != null)
			buffer.append(line1 + ", ");
		if (line2 != null)
			buffer.append(line2 + ", ");
		if (landmark != null)
			buffer.append(landmark + ", ");
		if (city != null)
			buffer.append(city + ", ");
		if (province != null)
			buffer.append(province + ", ");
		if (country != null)
			buffer.append(country + " ");
		if (zip != null)
			buffer.append(zip + "<br>");
		if (phone != null)
			buffer.append("+91 " + phone);

		return buffer.toString();
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("EsEcommOrderAddress{");
		sb.append("customerId=").append(customerId);
		sb.append(", userId=").append(userId);
		sb.append(", type='").append(type).append('\'');
		sb.append(", default_addr=").append(default_addr);
		sb.append(", line1='").append(line1).append('\'');
		sb.append(", line2='").append(line2).append('\'');
		sb.append(", name='").append(name).append('\'');
		sb.append(", first_name='").append(first_name).append('\'');
		sb.append(", last_name='").append(last_name).append('\'');
		sb.append(", phone='").append(phone).append('\'');
		sb.append(", city='").append(city).append('\'');
		sb.append(", province='").append(province).append('\'');
		sb.append(", country='").append(country).append('\'');
		sb.append(", zip='").append(zip).append('\'');
		sb.append(", landmark='").append(landmark).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
