package com.ubiquity.common.jaxb.stream.reseller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by abhishek on 8/24/16.
 */
@XmlRootElement
public class ResellerStoreBankDetailsJAXB implements Serializable{

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    private Date createDate;
    private Long resellerStoreId;
    private String accountHolderName;
    private String accountNumber;
    private String accountIFSCcode;
    private String bankName;
    private String bankBranch;
    private String city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getResellerStoreId() {
        return resellerStoreId;
    }

    public void setResellerStoreId(Long resellerStoreId) {
        this.resellerStoreId = resellerStoreId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountIFSCcode() {
        return accountIFSCcode;
    }

    public void setAccountIFSCcode(String accountIFSCcode) {
        this.accountIFSCcode = accountIFSCcode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
