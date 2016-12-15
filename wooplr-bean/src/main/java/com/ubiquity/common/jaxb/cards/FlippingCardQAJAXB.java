package com.ubiquity.common.jaxb.cards;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by subharthi on 6/13/16.
 */
@XmlRootElement
public class FlippingCardQAJAXB implements Serializable, Comparable<FlippingCardQAJAXB> {

	@XmlElement
	private Long id;

	@XmlElement
	private String image_pid;

	@XmlElement
	private String text;

	@XmlElement(required = false)
	private List<String> tags;

	@XmlElement
	private List<FlippingCardQAJAXB> answerOptions;

	@XmlElement
	private Integer answerOptionCount;

	@XmlElement(defaultValue = "0.0")
	private Double sequence;

	@XmlElement
	private Double weight;

	@XmlElement(required = false)
	private Map<String, String> miscellaneous;

	@XmlElement(required = true)
	private Long createDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<FlippingCardQAJAXB> getAnswerOptions() {
		return answerOptions;
	}

	public void setAnswerOptions(List<FlippingCardQAJAXB> answerOptions) {
		this.answerOptions = answerOptions;
	}

	public String getImage_pid() {
		return image_pid;
	}

	public void setImage_pid(String image_pid) {
		this.image_pid = image_pid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Double getSequence() {
		return sequence;
	}

	public void setSequence(Double sequence) {
		this.sequence = sequence;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Map<String, String> getMiscellaneous() {
		return miscellaneous;
	}

	public void setMiscellaneous(Map<String, String> miscellaneous) {
		this.miscellaneous = miscellaneous;
	}

	public Long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}

	public Integer getAnswerOptionCount() {
		return answerOptionCount;
	}

	public void setAnswerOptionCount(Integer answerOptionCount) {
		this.answerOptionCount = answerOptionCount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof FlippingCardQAJAXB))
			return false;

		FlippingCardQAJAXB that = (FlippingCardQAJAXB) o;

		if (!id.equals(that.id))
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("FlippingCardQAJAXB{");
		sb.append("id=").append(id);
		sb.append(", image_pid='").append(image_pid).append('\'');
		sb.append(", text='").append(text).append('\'');
		sb.append(", tags=").append(tags);
		sb.append(", answerOptions=").append(answerOptions);
		sb.append(", answerOptionCount=").append(answerOptionCount);
		sb.append(", sequence=").append(sequence);
		sb.append(", weight=").append(weight);
		sb.append(", miscellaneous=").append(miscellaneous);
		sb.append(", createDate=").append(createDate);
		sb.append('}');
		return sb.toString();
	}

	public int compareTo(FlippingCardQAJAXB o) {
		if (sequence == null || o.sequence == null)
			return 0;
		return this.sequence.compareTo(o.sequence);
	}
}
