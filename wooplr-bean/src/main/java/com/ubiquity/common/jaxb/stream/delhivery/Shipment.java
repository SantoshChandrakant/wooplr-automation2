package com.ubiquity.common.jaxb.stream.delhivery;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by abhishek on 1/19/16.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shipment", propOrder = {
        "waybill",
//        "client",
        "name",
        "order",
        "products_desc",
        "order_date",
        "payment_mode",
        "total_amount",
        "cod_amount",
        "add",
        "city",
        "state",
        "country",
        "phone",
        "pin",

        "return_add",
        "return_city",
        "return_country",
        "return_name",
        "return_phone",
        "return_pin",
        "return_state",
  /*      "supplier",
        "shipment_length",
        "shipment_width",
        "shipment_height",
        "weight",
*/
        "product_quantity",
        "seller_inv",
        "seller_inv_date",
        "seller_name",
        "seller_add",
        "seller_cst",
        "seller_tin",
        "consignee_tin",
       /* "commodity_value",
        "tax_value",
        "sales_tax_form_ack_no",
        "category_of_goods"*/
})

@XmlRootElement
public class Shipment implements Serializable {

    private final static Long serialVersionUID = 12343L;
    @XmlElement(required = true,nillable = true)
    protected String waybill;
  //  @XmlElement(required = true,nillable = true)
 //   protected String client;
    @XmlElement(required = true,nillable = true)
    protected  String name;
    @XmlElement(required = true,nillable = true)
    protected String order;
    @XmlElement(required = true,nillable = true)
    protected String products_desc;
    @XmlElement(required = true,nillable = true)
    protected String order_date;
    @XmlElement(required = true,nillable = true)
    protected String payment_mode;
    @XmlElement(required = true,nillable = true)
    protected  Double total_amount;
    @XmlElement(required = true,nillable = true)
    protected  Double cod_amount;
    @XmlElement(required = true,nillable = true)
    protected String add;
    @XmlElement(required = true,nillable = true)
    protected String city;
    @XmlElement(required = true,nillable = true)
    protected String state;
    @XmlElement(required = true,nillable = true)
    protected String country;
    @XmlElement(required = true,nillable = true)
    protected String phone;
    @XmlElement(required = true,nillable = true)
    protected String pin;
    protected String return_add;
    protected String return_city;
    protected String return_country;
    protected String return_name;
    protected String return_phone;
    protected String return_pin;
    protected String return_state;
//    protected String supplier;
//    protected String shipment_length;
//    protected String shipment_width;
//    protected String shipment_height;
//    protected String weight;
    protected Integer product_quantity;
    protected String seller_inv;
    protected String seller_inv_date;
    protected String seller_name;
    protected String seller_add;
    protected String seller_cst;
    protected String seller_tin;
    protected String consignee_tin;
//    protected String commodity_value;
//    protected String tax_value;
//    protected String sales_tax_form_ack_no;
//    protected String category_of_goods;


    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

//    public String getClient() {
//        return client;
//    }
//
//    public void setClient(String client) {
//        this.client = client;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getProducts_desc() {
        return products_desc;
    }

    public void setProducts_desc(String products_desc) {
        this.products_desc = products_desc;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getPayment_mode() {
        return payment_mode;
    }

    public void setPayment_mode(String payment_mode) {
        this.payment_mode = payment_mode;
    }

    public Double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }

    public Double getCod_amount() {
        return cod_amount;
    }

    public void setCod_amount(Double cod_amount) {
        this.cod_amount = cod_amount;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }


    public String getReturn_add() {
        return return_add;
    }

    public void setReturn_add(String return_add) {
        this.return_add = return_add;
    }

    public String getReturn_city() {
        return return_city;
    }

    public void setReturn_city(String return_city) {
        this.return_city = return_city;
    }

    public String getReturn_country() {
        return return_country;
    }

    public void setReturn_country(String return_country) {
        this.return_country = return_country;
    }

    public String getReturn_name() {
        return return_name;
    }

    public void setReturn_name(String return_name) {
        this.return_name = return_name;
    }

    public String getReturn_phone() {
        return return_phone;
    }

    public void setReturn_phone(String return_phone) {
        this.return_phone = return_phone;
    }

    public String getReturn_pin() {
        return return_pin;
    }

    public void setReturn_pin(String return_pin) {
        this.return_pin = return_pin;
    }

    public String getReturn_state() {
        return return_state;
    }

    public void setReturn_state(String return_state) {
        this.return_state = return_state;
    }

/*    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getShipment_length() {
        return shipment_length;
    }

    public void setShipment_length(String shipment_length) {
        this.shipment_length = shipment_length;
    }

    public String getShipment_width() {
        return shipment_width;
    }

    public void setShipment_width(String shipment_width) {
        this.shipment_width = shipment_width;
    }

    public String getShipment_height() {
        return shipment_height;
    }

    public void setShipment_height(String shipment_height) {
        this.shipment_height = shipment_height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
*/

    public Integer getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(Integer product_quantity) {
        this.product_quantity = product_quantity;
    }


    public String getSeller_inv() {
        return seller_inv;
    }

    public void setSeller_inv(String seller_inv) {
        this.seller_inv = seller_inv;
    }

    public String getSeller_inv_date() {
        return seller_inv_date.toString();
    }

    public void setSeller_inv_date(String seller_inv_date) {
        this.seller_inv_date = seller_inv_date;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public String getSeller_add() {
        return seller_add;
    }

    public void setSeller_add(String seller_add) {
        this.seller_add = seller_add;
    }

    public String getSeller_cst() {
        return seller_cst;
    }

    public void setSeller_cst(String seller_cst) {
        this.seller_cst = seller_cst;
    }

    public String getSeller_tin() {
        return seller_tin;
    }

    public void setSeller_tin(String seller_tin) {
        this.seller_tin = seller_tin;
    }

    /*
    public String getConsignee_tin() {
        return consignee_tin;
    }

    public void setConsignee_tin(String consignee_tin) {
        this.consignee_tin = consignee_tin;
    }

    public String getCommodity_value() {
        return commodity_value;
    }

    public void setCommodity_value(String commodity_value) {
        this.commodity_value = commodity_value;
    }

    public String getTax_value() {
        return tax_value;
    }

    public void setTax_value(String tax_value) {
        this.tax_value = tax_value;
    }

    public String getSales_tax_form_ack_no() {
        return sales_tax_form_ack_no;
    }

    public void setSales_tax_form_ack_no(String sales_tax_form_ack_no) {
        this.sales_tax_form_ack_no = sales_tax_form_ack_no;
    }

    public String getCategory_of_goods() {
        return category_of_goods;
    }

    public void setCategory_of_goods(String category_of_goods) {
        this.category_of_goods = category_of_goods;
    }
*/
}
