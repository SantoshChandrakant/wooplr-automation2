package com.ubiquity.common.jaxb.stream.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

/**
 * Created by abhishek on 10/8/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentIdListJAXB", propOrder = {
        "longList"
})


@XmlRootElement
public class ContentIdListJAXB implements Serializable {
    private final static Long serialVersionUID = 12343L;
    protected List<Long> longList;


    public List<Long> getLongList() {
        return longList;
    }

    public void setLongList(List<Long> longList) {
        this.longList = longList;
    }
}
