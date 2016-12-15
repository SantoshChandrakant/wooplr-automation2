package com.ubiquity.common.jaxb.ecomm;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
/**
 * Created by nikhileshwari on 6/13/2016.
 */


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECommDeliveryPartnerJAXB", propOrder = {"deliveryPartnerName",
        "partnerId",
        "storeId"})
public class ECommDeliveryPartnerJAXB implements Serializable{

    protected String deliveryPartnerName;
    protected String partnerId;
    protected Long storeId;
    protected Long Id;

    public String getDeliveryPartnerName(){ return deliveryPartnerName;}

    public void setDeliveryPartnerName(String DeliveryPartnerName){ this.deliveryPartnerName = DeliveryPartnerName; }

    public String getPartnerId() { return partnerId;}

    public void setPartnerId(String PartnerId) { this.partnerId = PartnerId; }

    public Long getStoreId() { return storeId; }

    public void setStoreId(Long StoreId){ this.storeId = StoreId; }

    public Long getId() {return Id;}

    public void setId(Long Id){ this.Id = Id; }
}