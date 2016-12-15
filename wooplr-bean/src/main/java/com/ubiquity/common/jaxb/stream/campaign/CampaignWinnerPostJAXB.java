package com.ubiquity.common.jaxb.stream.campaign;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Rajagopal on 12/3/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignWinnerPostJAXB", propOrder = {
        "listType",
        "leadingEntities"
})
@XmlRootElement
public class CampaignWinnerPostJAXB implements Serializable {
    private final static Long serialVersionUID = 12343L;
    protected String listType;
    protected List<Long> leadingEntities;

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }

    public List<Long> getLeadingEntities() {
        return leadingEntities;
    }

    public void setLeadingEntities(List<Long> leadingEntities) {
        this.leadingEntities = leadingEntities;
    }
}
