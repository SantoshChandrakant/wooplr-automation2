package com.ubiquity.common.jaxb.user;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by subharthi on 6/27/16.
 */
@XmlRootElement
public class UserCardAnswerJAXB {
    @XmlElement
    private Long answerId;

    @XmlElement
    private Long cardId;

    @XmlElement
    private String cardType;

    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
