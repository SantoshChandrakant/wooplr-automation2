package com.ubiquity.common.jaxb.ecomm;

import java.io.Serializable;

/**
 * Created by Rajagopal on 9/9/16.
 */
public class ReSellerProfileCompletenessTaskJAXB implements Serializable {
    private String taskName;
    private String taskMsg;
    private String weblink;
    private Boolean completed;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskMsg() {
        return taskMsg;
    }

    public void setTaskMsg(String taskMsg) {
        this.taskMsg = taskMsg;
    }

    public String getWeblink() {
        return weblink;
    }

    public void setWeblink(String weblink) {
        this.weblink = weblink;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
