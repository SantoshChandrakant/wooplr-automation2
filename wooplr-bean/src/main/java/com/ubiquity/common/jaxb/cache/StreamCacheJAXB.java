package com.ubiquity.common.jaxb.cache;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Rajagopal on 6/8/16.
 */
public class StreamCacheJAXB<T extends Serializable> implements Serializable {
    protected Boolean isFinished;
    protected List<T> streamEntries;

    public Boolean getIsFinished() {
        if (isFinished == null){
            isFinished = Boolean.FALSE;
        }
        return isFinished;
    }

    public void setIsFinished(Boolean isFinished) {
        this.isFinished = isFinished;
    }

    public List<T> getStreamEntries() {
        return streamEntries;
    }

    public void setStreamEntries(List<T> streamEntries) {
        this.streamEntries = streamEntries;
    }
}
