package com.ubiquity.common.jaxb.stream.reseller;

import java.io.Serializable;

/**
 * Created by debasish on 20/09/16.
 */
public class ResellerAnalyticsJAXB  implements Serializable {


    private Long resellerId;

    private Long sessionViews;

    private Long userViews;

    private Long avgSessionTime;

    private Long pageViews;

    //private String referrer;


    public Long getResellerId() {
        return resellerId;
    }

    public void setResellerId(Long resellerId) {
        this.resellerId = resellerId;
    }


    public Long getSessionViews() {
        return sessionViews;
    }

    public void setSessionViews(Long sessionViews) {
        this.sessionViews = sessionViews;
    }

    public Long getUserViews() {
        return userViews;
    }

    public void setUserViews(Long userViews) {
        this.userViews = userViews;
    }

    public Long getAvgSessionTime() {
        return avgSessionTime;
    }

    public void setAvgSessionTime(Long avgSessionTime) {
        this.avgSessionTime = avgSessionTime;
    }

    public Long getPageViews() {
        return pageViews;
    }

    public void setPageViews(Long pageViews) {
        this.pageViews = pageViews;
    }
}
