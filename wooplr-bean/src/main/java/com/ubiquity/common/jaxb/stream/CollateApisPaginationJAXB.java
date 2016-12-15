package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by subharthi on 10/15/15.
 */
@XmlRootElement(name = "CollateApiPaginationJAXB")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateApiPaginationJAXB", propOrder = {
        "collateApiPaginationCurrentJAXB",
        "collateApiPaginationPreviousJAXB",
        "resetStream",
        "notificationCount"
})
public class CollateApisPaginationJAXB implements Serializable{

    @XmlElement(required = false)
    private CollateApiPaginationJAXB collateApiPaginationCurrentJAXB;
    @XmlElement(required = false)
    private CollateApiPaginationJAXB collateApiPaginationPreviousJAXB;
    @XmlElement(required = false)
    private Boolean resetStream;
    @XmlElement(required = false)
    private Integer notificationCount;

    public CollateApiPaginationJAXB getCollateApiPaginationCurrentJAXB() {
        return collateApiPaginationCurrentJAXB;
    }

    public void setCollateApiPaginationCurrentJAXB(CollateApiPaginationJAXB collateApiPaginationCurrentJAXB) {
        this.collateApiPaginationCurrentJAXB = collateApiPaginationCurrentJAXB;
    }

    public CollateApiPaginationJAXB getCollateApiPaginationPreviousJAXB() {
        return collateApiPaginationPreviousJAXB;
    }

    public void setCollateApiPaginationPreviousJAXB(CollateApiPaginationJAXB collateApiPaginationPreviousJAXB) {
        this.collateApiPaginationPreviousJAXB = collateApiPaginationPreviousJAXB;
    }

    public Boolean getResetStream() {
        return resetStream;
    }

    public void setResetStream(Boolean resetStream) {
        this.resetStream = resetStream;
    }

    public Integer getNotificationCount() {
        return notificationCount;
    }

    public void setNotificationCount(Integer notificationCount) {
        this.notificationCount = notificationCount;
    }
}
