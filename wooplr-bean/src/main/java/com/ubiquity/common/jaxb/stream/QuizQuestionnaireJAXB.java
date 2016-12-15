package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * Created by pravesh on 09/05/16.
 */


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuizQuestionnaireJAXB", propOrder = {
        "id",
        "createDate",
        "quizId",
        "question",
        "answer",
        "options"
})
@XmlRootElement
public class QuizQuestionnaireJAXB implements Serializable {

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    protected Date createDate;
    protected Long quizId;
    protected String question;
    protected Integer answer;
    protected Map<Integer, String> options;

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

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public Map<Integer, String> getOptions() {
        return options;
    }

    public void setOptions(Map<Integer, String> options) {
        this.options = options;
    }
}
