package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Rajagopal on 9/9/16.
 */
public class ReSellerProfileCompletnessJAXB implements Serializable {
    private Double completedPercentage;
    private List<ReSellerProfileCompletenessTaskJAXB> completenessTasks;

    public Double getCompletedPercentage() {
        return completedPercentage;
    }

    public void setCompletedPercentage(Double completedPercentage) {
        this.completedPercentage = completedPercentage;
    }

    public List<ReSellerProfileCompletenessTaskJAXB> getCompletenessTasks() {
        return completenessTasks;
    }

    public void setCompletenessTasks(List<ReSellerProfileCompletenessTaskJAXB> completenessTasks) {
        this.completenessTasks = completenessTasks;
    }
}
