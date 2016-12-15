package com.ubiquity.common.jaxb.reaction;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by debasish on 6/8/2016.
 */
public class ReactionJAXB implements Serializable {

	private Long id;
	private String name;

	// private Date createDate;

	private String image_pid;

	private List<String> type;

	private String text;

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

	// public Date getCreateDate() {
	// return createDate;
	// }
	//
	// public void setCreateDate(Date createDate) {
	// this.createDate = createDate;
	// }

	public String getImage_pid() {
		return image_pid;
	}

	public void setImage_pid(String image_pid) {
		this.image_pid = image_pid;
	}

	public List<String> getType() {
		return type;
	}

	public void setType(List<String> type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		ReactionJAXB that = (ReactionJAXB) o;

		if (name != null ? !name.equals(that.name) : that.name != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}

	// @Override
	// public String toString() {
	// return gson.toJson(this, ReactionJAXB.class);
	// }

	@Override
	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(this);
		} catch (Exception ex) {
			return "";
		}
	}
}
