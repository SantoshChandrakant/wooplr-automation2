package com.ubiquity.common.jaxb.ecomm;

import com.ubiquity.common.jaxb.stream.Adapter1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by debasish on 12/10/2015.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ecommerceStoreSmallJAXB", propOrder = {
        "id",
        "name",
        "userId",
        "external_customerId",
        "first_name",
        "last_name",
        "email",
        "phone",
        "orders_count",
        "tags",
        "tax_exempt",
        "createDate"

})
public class ECommCustomerJAXB implements Serializable {


    private Long id;
    private String name;
    private Long userId;

    private Long external_customerId;

    private String first_name;

    private String last_name;

    private String email;
    private String phone;
    private Integer orders_count;

    private String tags;

    private Boolean tax_exempt;

    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Date createDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getExternal_customerId() {
        return external_customerId;
    }

    public void setExternal_customerId(Long external_customerId) {
        this.external_customerId = external_customerId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrders_count() {
        return orders_count;
    }

    public void setOrders_count(Integer orders_count) {
        this.orders_count = orders_count;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Boolean getTax_exempt() {
        return tax_exempt;
    }

    public void setTax_exempt(Boolean tax_exempt) {
        this.tax_exempt = tax_exempt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
