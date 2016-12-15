package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by abhishek on 10/11/16.
 */
@XmlRootElement
public class ResequenceJAXB implements Serializable {

    @XmlElement
    protected Long collectionId;
    @XmlElement
    protected Long toPosition;
    @XmlElement
    protected Long productId;
    @XmlElement
    protected Boolean isCurator;

    public Long getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Long collectionId) {
        this.collectionId = collectionId;
    }

    public Long getToPosition() {
        return toPosition;
    }

    public void setToPosition(Long toPosition) {
        this.toPosition = toPosition;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Boolean getIsCurator() {
        return isCurator;
    }

    public void setIsCurator(Boolean isCurator) {
        this.isCurator = isCurator;
    }
}
