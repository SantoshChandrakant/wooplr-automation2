package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * Created by subharthi on 8/31/16.
 */
@XmlRootElement
public class ECommEarningLogJAXB  implements Serializable{

    @XmlElement
    private Long id;
    @XmlElement
    private ECommEarningLogOrderJAXB orderInfo;
    @XmlElement
    private Long dateTimestamp;
    @XmlElement
    private String type;
    @XmlElement
    private Long beneficiaryId;
    @XmlElement
    private String beneficiaryType;
    @XmlElement
    private String name;
    @XmlElement
    private Double amount;
    @XmlElement
    private Long ruleId;
    @XmlElement
    private String status;
    @XmlElement
    private Map<String, Serializable> breakup;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ECommEarningLogOrderJAXB getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(ECommEarningLogOrderJAXB orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getDateTimestamp() {
        return dateTimestamp;
    }

    public void setDateTimestamp(Date date) {
        if(date != null)
            this.dateTimestamp = date.getTime();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(Long beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public String getBeneficiaryType() {
        return beneficiaryType;
    }

    public void setBeneficiaryType(String beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, Serializable> getBreakup() {
        return breakup;
    }

    public void setBreakup(Map<String, Serializable> breakup) {
        this.breakup = breakup;
    }
}
