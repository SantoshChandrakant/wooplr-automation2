package com.ubiquity.common.jaxb.cards;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by subharthi on 6/13/16.
 */
@XmlRootElement
public class FlippingCardJAXB implements Serializable {

    @XmlElement
    private Long id;

    @XmlElement
    private String title;

    @XmlElement
    private String subTitle;

    @XmlElement(required = false)
    private String optionalText;

    @XmlElement
    private List<FlippingCardQAJAXB> questions;

    @XmlElement
    private Integer questionsCount;

    @XmlElement
    private Double sequence;

    @XmlElement(required = false)
    private Map<String, String> miscellaneous;

    @XmlElement(defaultValue = "false")
    private Boolean published;

    @XmlElement(required = false)
    private Long publishDate;

    @XmlElement(required = true)
    private Long createDate;

    @XmlElement
    private String webLink;

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

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getOptionalText() {
        return optionalText;
    }

    public void setOptionalText(String optionalText) {
        this.optionalText = optionalText;
    }

    public List<FlippingCardQAJAXB> getQuestions() {
        return questions;
    }

    public void setQuestions(List<FlippingCardQAJAXB> questions) {
        this.questions = questions;
    }

    public Double getSequence() {
        return sequence;
    }

    public void setSequence(Double sequence) {
        this.sequence = sequence;
    }

    public Map<String, String> getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(Map<String, String> miscellaneous) {
        this.miscellaneous = miscellaneous;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Long getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Long publishDate) {
        this.publishDate = publishDate;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Integer getQuestionsCount() {
        return questionsCount;
    }

    public void setQuestionsCount(Integer questionsCount) {
        this.questionsCount = questionsCount;
    }

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FlippingCardJAXB{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", subTitle='").append(subTitle).append('\'');
        sb.append(", optionalText='").append(optionalText).append('\'');
        sb.append(", questions=").append(questions);
        sb.append(", questionsCount=").append(questionsCount);
        sb.append(", sequence=").append(sequence);
        sb.append(", miscellaneous=").append(miscellaneous);
        sb.append(", published=").append(published);
        sb.append(", publishDate=").append(publishDate);
        sb.append(", createDate=").append(createDate);
        sb.append(", webLink='").append(webLink).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
