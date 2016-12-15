package com.ubiquity.common.jaxb.stream.reseller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by subharthi on 10/14/16.
 */
@XmlRootElement
public class ResellerStoreStatsJAXB extends ResellerStoreJAXB {

    @XmlElement
    private Long orderCount;

    @XmlElement
    private Integer pageView;

    @XmlElement
    private Integer uniquePageView;

    @XmlElement
    private Integer users;

    @XmlElement
    private Integer sessionViews;

    @XmlElement
    private Integer newUsers;


    @XmlElement
    private Long firstOrderPlaced;

    @XmlElement
    private Long lastOrderPlaced;

    public Long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Long orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getPageView() {
        return pageView;
    }

    public void setPageView(Integer pageView) {
        this.pageView = pageView;
    }

    public Integer getUniquePageView() {
        return uniquePageView;
    }

    public void setUniquePageView(Integer uniquePageView) {
        this.uniquePageView = uniquePageView;
    }

    public Integer getUsers() {
        return users;
    }

    public void setUsers(Integer users) {
        this.users = users;
    }

    public Long getFirstOrderPlaced() {
        return firstOrderPlaced;
    }

    public void setFirstOrderPlaced(Long firstOrderPlaced) {
        this.firstOrderPlaced = firstOrderPlaced;
    }

    public Long getLastOrderPlaced() {
        return lastOrderPlaced;
    }

    public void setLastOrderPlaced(Long lastOrderPlaced) {
        this.lastOrderPlaced = lastOrderPlaced;
    }

    public Integer getSessionViews() {
        return sessionViews;
    }

    public void setSessionViews(Integer sessionViews) {
        this.sessionViews = sessionViews;
    }

    public Integer getNewUsers() {
        return newUsers;
    }

    public void setNewUsers(Integer newUsers) {
        this.newUsers = newUsers;
    }
}
