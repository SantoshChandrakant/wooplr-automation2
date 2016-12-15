package com.ubiquity.common.jaxb.error;

import javax.xml.bind.annotation.*;

/**
 * Created by subharthi on 7/8/16.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "code", "message" })
public class ErrorMessageJAXB {

    @XmlElement
    private String code;

    @XmlElement
    private String message;

    public ErrorMessageJAXB(){

    }

    /**
     * @param code
     * @param message
     */
    public ErrorMessageJAXB(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * /**
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     *            the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     *            the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }



}
