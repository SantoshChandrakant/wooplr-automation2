//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.23 at 01:36:50 AM IST 
//


package com.ubiquity.common.jaxb.reward;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ubiquity.common.jaxb.reward package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AdminRewardForm_QNAME = new QName("", "adminRewardForm");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ubiquity.common.jaxb.reward
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RewardRedeemedUserListRepresentationJAXB }
     * 
     */
    public RewardRedeemedUserListRepresentationJAXB createRewardRedeemedUserListRepresentationJAXB() {
        return new RewardRedeemedUserListRepresentationJAXB();
    }

    /**
     * Create an instance of {@link SponsoredRewardDetailsJAXB }
     * 
     */
    public SponsoredRewardDetailsJAXB createSponsoredRewardDetailsJAXB() {
        return new SponsoredRewardDetailsJAXB();
    }

    /**
     * Create an instance of {@link SponsoredRewardsListRepresentationJAXB }
     * 
     */
    public SponsoredRewardsListRepresentationJAXB createSponsoredRewardsListRepresentationJAXB() {
        return new SponsoredRewardsListRepresentationJAXB();
    }

    /**
     * Create an instance of {@link RewardRedeemedUserJAXB }
     * 
     */
    public RewardRedeemedUserJAXB createRewardRedeemedUserJAXB() {
        return new RewardRedeemedUserJAXB();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SponsoredRewardDetailsJAXB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "adminRewardForm")
    public JAXBElement<SponsoredRewardDetailsJAXB> createAdminRewardForm(SponsoredRewardDetailsJAXB value) {
        return new JAXBElement<SponsoredRewardDetailsJAXB>(_AdminRewardForm_QNAME, SponsoredRewardDetailsJAXB.class, null, value);
    }

}
