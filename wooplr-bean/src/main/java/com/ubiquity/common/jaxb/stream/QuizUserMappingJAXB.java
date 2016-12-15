package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yashi on 7/6/16.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuizUserMappingJAXB", propOrder = {
        "id",
        "createDate",
        "quizId",
        "emailId",
        "couponCode"
})
@XmlRootElement
public class QuizUserMappingJAXB implements Serializable {

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    protected Date createDate;
    protected Long quizId;
    protected String emailId;
    protected String couponCode;

    public Long getId(){ return id;}

    public void setId(Long id){ this.id = id;}

    public Date getCreateDate(){ return createDate;}

    public void setCreateDate(Date createDate){ this.createDate = createDate;}

    public Long getQuizId(){return quizId;}

    public void setQuizId(Long quizId){ this.quizId = quizId;}

    public String getEmailId(){return emailId;}

    public void setEmailId(String emailId){this.emailId = emailId;}

    public String getCouponCode(){return couponCode;}

    public void setCouponCode(String couponCode){this.couponCode = couponCode;}
}
