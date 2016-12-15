package com.ubiquity.common.jaxb.stream.reseller;


import java.io.Serializable;

/**
 * Created by Rajagopal on 8/25/16.
 */
public class ResellerPayoutRuleJAXB implements Serializable {
    private final static Long serialVersionUID = 12343L;

    protected Long id;
    protected String name;
    protected String summary;
    protected Long createDate;
    protected Long updateDate;
    protected String type; //Basic/bonus
    protected Long startDate;
    protected Long endDate;
    protected String calculationType; //Percentage / flat
    protected Double payoutValue;  //depends on
    protected Double orderMinvalue;
    protected Double orderMaxValue;
    protected Long startTimeOfDay;
    protected Long endTimeOfDay;
    protected String dayOfWeek;
    protected Long minOrderCount; //target in case of bonus
    protected String pricingPlan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public String getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(String calculationType) {
        this.calculationType = calculationType;
    }

    public Double getPayoutValue() {
        return payoutValue;
    }

    public void setPayoutValue(Double payoutValue) {
        this.payoutValue = payoutValue;
    }

    public Double getOrderMinvalue() {
        return orderMinvalue;
    }

    public void setOrderMinvalue(Double orderMinvalue) {
        this.orderMinvalue = orderMinvalue;
    }

    public Double getOrderMaxValue() {
        return orderMaxValue;
    }

    public void setOrderMaxValue(Double orderMaxValue) {
        this.orderMaxValue = orderMaxValue;
    }

    public Long getStartTimeOfDay() {
        return startTimeOfDay;
    }

    public void setStartTimeOfDay(Long startTimeOfDay) {
        this.startTimeOfDay = startTimeOfDay;
    }

    public Long getEndTimeOfDay() {
        return endTimeOfDay;
    }

    public void setEndTimeOfDay(Long endTimeOfDay) {
        this.endTimeOfDay = endTimeOfDay;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Long getMinOrderCount() {
        return minOrderCount;
    }

    public void setMinOrderCount(Long minOrderCount) {
        this.minOrderCount = minOrderCount;
    }

    public String getPricingPlan() {
        return pricingPlan;
    }

    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }
}
