package com.ubiquity.common.jaxb.stream.reseller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.lang.reflect.Field;

/**
 * Created by subharthi on 10/4/16.
 */
@XmlRootElement
public class ResellerClaimSearchFilterJAXB extends ResellerSearchFilterJAXB {
    @XmlElement
    private String settlementStatus; //PENDING, APPROVED, REJECTED

    public String getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(String settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public static boolean isEmpty(ResellerClaimSearchFilterJAXB obj){
        try {

            for (Field field : obj.getClass().getSuperclass().getDeclaredFields()) {
                field.setAccessible(true); // You might want to set modifier to public first.
                Object value = field.get(obj);
                if (value != null) {
                    return Boolean.FALSE;
                }
            }
        }catch (Exception e){
            return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
