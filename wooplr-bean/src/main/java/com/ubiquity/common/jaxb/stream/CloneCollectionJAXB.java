package com.ubiquity.common.jaxb.stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

/**
 * Created by abhishek on 8/30/16.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CloneCollectionJAXB", propOrder = {
        "ids"
})
public class CloneCollectionJAXB implements Serializable {

    protected List<Long> ids;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }
}
