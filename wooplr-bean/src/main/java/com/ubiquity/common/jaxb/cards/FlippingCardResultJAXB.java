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
public class FlippingCardResultJAXB implements Serializable, Comparable<FlippingCardResultJAXB> {

	@XmlElement
	private Long setId;

	@XmlElement
	private Long id;

	@XmlElement
	private String title;

	@XmlElement
	private String subTitle;

	@XmlElement
	private List<Long> answers;

	@XmlElement
	private String image_pid;

	@XmlElement(required = false)
	private String deeplink;

	@XmlElement(required = false)
	private String deeplinkText;

	@XmlElement
	private String resultText;

	@XmlElement(required = false)
	private Map<String, String> miscellaneous;

	@XmlElement
	private Double weight;

	@XmlElement
	private Double sequence;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Long> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Long> answers) {
		this.answers = answers;
	}

	public String getDeeplink() {
		return deeplink;
	}

	public void setDeeplink(String deeplink) {
		this.deeplink = deeplink;
	}

	public String getResultText() {
		return resultText;
	}

	public void setResultText(String resultText) {
		this.resultText = resultText;
	}

	public String getImage_pid() {
		return image_pid;
	}

	public void setImage_pid(String image_pid) {
		this.image_pid = image_pid;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Long getSetId() {
		return setId;
	}

	public void setSetId(Long setId) {
		this.setId = setId;
	}

	public String getDeeplinkText() {
		return deeplinkText;
	}

	public void setDeeplinkText(String deeplinkText) {
		this.deeplinkText = deeplinkText;
	}

	public Map<String, String> getMiscellaneous() {
		return miscellaneous;
	}

	public void setMiscellaneous(Map<String, String> miscellaneous) {
		this.miscellaneous = miscellaneous;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Double getSequence() {
		return sequence;
	}

	public void setSequence(Double sequence) {
		this.sequence = sequence;
	}

	public int compareTo(FlippingCardResultJAXB o) {
		if (sequence == null || o.sequence == null)
			return 0;
		return this.sequence.compareTo(o.sequence);
	}
}
