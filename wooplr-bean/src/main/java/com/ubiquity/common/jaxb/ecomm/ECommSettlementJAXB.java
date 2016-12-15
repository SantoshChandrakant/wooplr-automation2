package com.ubiquity.common.jaxb.ecomm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by subharthi on 9/9/16.
 */
@XmlRootElement
public class ECommSettlementJAXB implements Serializable {
    @XmlElement
    private Long id;
    @XmlElement
    private String status;
    @XmlElement
    private String entityType;
    @XmlElement
    private Long entityId;
    @XmlElement
    private Long claimedDate;
    @XmlElement
    private String modeOfPayment;
    @XmlElement
    private String referenceNo;
    @XmlElement
    private Double TDS;
    @XmlElement
    private Double paidAmount;
    @XmlElement
    private Long paidDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Long getClaimedDate() {
        return claimedDate;
    }

    public void setClaimedDate(Long claimedDate) {
        this.claimedDate = claimedDate;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public Double getTDS() {
        return TDS;
    }

    public void setTDS(Double TDS) {
        this.TDS = TDS;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Long getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Long paidDate) {
        this.paidDate = paidDate;
    }
}
