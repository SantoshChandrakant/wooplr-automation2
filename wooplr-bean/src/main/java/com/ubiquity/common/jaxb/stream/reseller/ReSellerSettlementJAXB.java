package com.ubiquity.common.jaxb.stream.reseller;

import java.io.Serializable;

/**
 * Created by Rajagopal on 8/30/16.
 */
public class ReSellerSettlementJAXB implements Serializable {
    protected Long id;
    protected String status;
    protected String entityType;
    protected Long entityId;
    protected Double amount;
    protected Double tds;
    protected Double paidAmount;
    protected String referenceNo;
    protected Long claimedDate;
    protected Long paidDate;
    protected String modeOfPayment;

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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTds() {
        return tds;
    }

    public void setTds(Double tds) {
        this.tds = tds;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public Long getClaimedDate() {
        return claimedDate;
    }

    public void setClaimedDate(Long claimedDate) {
        this.claimedDate = claimedDate;
    }

    public Long getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Long paidDate) {
        this.paidDate = paidDate;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ReSellerSettlementJAXB{");
        sb.append("id=").append(id);
        sb.append(", status='").append(status).append('\'');
        sb.append(", entityType='").append(entityType).append('\'');
        sb.append(", entityId=").append(entityId);
        sb.append(", amount=").append(amount);
        sb.append(", tds=").append(tds);
        sb.append(", paidAmount=").append(paidAmount);
        sb.append(", referenceNo='").append(referenceNo).append('\'');
        sb.append(", claimedDate=").append(claimedDate);
        sb.append(", paidDate=").append(paidDate);
        sb.append(", modeOfPayment='").append(modeOfPayment).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
