package com.ubiquity.common.jaxb.promocode;

import java.io.Serializable;

/**
 * Created by Rajagopal on 2/19/16.
 */
public class PromotionCodeJAXB implements Serializable {
    protected String code;
    protected String type;
    protected String info;
    protected String note;
    protected Boolean codApplicable;
    protected Boolean pgApplicable;
    protected Boolean isAutomatic;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getCodApplicable() {
        return codApplicable;
    }

    public void setCodApplicable(Boolean codApplicable) {
        this.codApplicable = codApplicable;
    }

    public Boolean getPgApplicable() {
        return pgApplicable;
    }

    public void setPgApplicable(Boolean pgApplicable) {
        this.pgApplicable = pgApplicable;
    }


    public Boolean getIsAutomatic() {
        return isAutomatic;
    }

    public void setIsAutomatic(Boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }
}
