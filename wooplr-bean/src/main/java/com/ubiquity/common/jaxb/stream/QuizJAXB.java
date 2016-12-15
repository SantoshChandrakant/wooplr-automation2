package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by pravesh on 09/05/16.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuizJAXB", propOrder = {
        "id",
        "createDate",
        "name",
        "description",
        "authorId",
        "isActive",
        "wrongText",
        "correctText",
        "quizType",
        "image",
        "bannerHeader",
        "bannerOut",
        "numberOfGrids",
        "gridAnswer",
        "couponType",
        "couponValue",
        "couponMinValue",
        "couponMaxApplicability",
        "couponMessage",
        "quizQuestionnaireJAXBList"
})
@XmlRootElement
public class QuizJAXB implements Serializable {

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    protected Date createDate;
    protected String name;
    protected String description;
    protected Long authorId;
    protected Boolean isActive;
    protected String wrongText;
    protected String correctText;
    protected String quizType;
    protected String image;
    protected String bannerHeader;
    protected String bannerOut;
    protected Integer numberOfGrids;
    protected Integer gridAnswer;
    protected String couponType;
    protected Double couponValue;
    protected Double couponMinValue;
    protected Double couponMaxApplicability;
    protected List<QuizQuestionnaireJAXB> quizQuestionnaireJAXBList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getWrongText() {
        return wrongText;
    }

    public void setWrongText(String wrongText) {
        this.wrongText = wrongText;
    }

    public String getCorrectText() {
        return correctText;
    }

    public void setCorrectText(String correctText) {
        this.correctText = correctText;
    }

    public String getQuizType() {
        return quizType;
    }

    public void setQuizType(String quizType) {
        this.quizType = quizType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBannerHeader() {
        return bannerHeader;
    }

    public void setBannerHeader(String bannerHeader) {
        this.bannerHeader = bannerHeader;
    }

    public String getBannerOut() {
        return bannerOut;
    }

    public void setBannerOut(String bannerOut) {
        this.bannerOut = bannerOut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberOfGrids() {
        return numberOfGrids;
    }

    public void setNumberOfGrids(Integer numberOfGrids) {
        this.numberOfGrids = numberOfGrids;
    }

    public Integer getGridAnswer() {
        return gridAnswer;
    }

    public void setGridAnswer(Integer gridAnswer) {
        this.gridAnswer = gridAnswer;
    }

    public List<QuizQuestionnaireJAXB> getQuizQuestionnaireJAXBList() {
        return quizQuestionnaireJAXBList;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public Double getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(Double couponValue) {
        this.couponValue = couponValue;
    }

    public Double getCouponMinValue() {
        return couponMinValue;
    }

    public void setCouponMinValue(Double couponMinValue) {
        this.couponMinValue = couponMinValue;
    }

    public Double getCouponMaxApplicability() {
        return couponMaxApplicability;
    }

    public void setCouponMaxApplicability(Double couponMaxApplicability) {
        this.couponMaxApplicability = couponMaxApplicability;
    }

    public void setQuizQuestionnaireJAXBList(List<QuizQuestionnaireJAXB> quizQuestionnaireJAXBList) {
        this.quizQuestionnaireJAXBList = quizQuestionnaireJAXBList;
    }
}

