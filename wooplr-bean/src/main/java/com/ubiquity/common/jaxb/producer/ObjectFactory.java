
package com.ubiquity.common.jaxb.producer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ubiquity.common.jaxb.producer package. 
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

    private final static QName _BranchForm_QNAME = new QName("", "branchForm");
    private final static QName _LoginForm_QNAME = new QName("", "loginForm");
    private final static QName _ProducerSettingsForm_QNAME = new QName("", "producerSettingsForm");
    private final static QName _ProducerSettingFieldForm_QNAME = new QName("", "producerSettingFieldForm");
    private final static QName _SignupForm_QNAME = new QName("", "signupForm");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ubiquity.common.jaxb.producer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProducerAndBranchIdJAXB }
     * 
     */
    public ProducerAndBranchIdJAXB createProducerAndBranchIdJAXB() {
        return new ProducerAndBranchIdJAXB();
    }

    /**
     * Create an instance of {@link ProducerSettingFields }
     * 
     */
    public ProducerSettingFields createProducerSettingFields() {
        return new ProducerSettingFields();
    }

    /**
     * Create an instance of {@link ProducerLoginDetailsJAXB }
     * 
     */
    public ProducerLoginDetailsJAXB createProducerLoginDetailsJAXB() {
        return new ProducerLoginDetailsJAXB();
    }

    /**
     * Create an instance of {@link ProducerAuthenticationDetailsJAXB }
     * 
     */
    public ProducerAuthenticationDetailsJAXB createProducerAuthenticationDetailsJAXB() {
        return new ProducerAuthenticationDetailsJAXB();
    }

    /**
     * Create an instance of {@link ProducerSignupCategoriesAndTagsDetailsJAXB }
     * 
     */
    public ProducerSignupCategoriesAndTagsDetailsJAXB createProducerSignupCategoriesAndTagsDetailsJAXB() {
        return new ProducerSignupCategoriesAndTagsDetailsJAXB();
    }

    /**
     * Create an instance of {@link ProducerInfoJAXB }
     * 
     */
    public ProducerInfoJAXB createProducerInfoJAXB() {
        return new ProducerInfoJAXB();
    }

    /**
     * Create an instance of {@link ProducerSignupContanctDetailsJAXB }
     * 
     */
    public ProducerSignupContanctDetailsJAXB createProducerSignupContanctDetailsJAXB() {
        return new ProducerSignupContanctDetailsJAXB();
    }

    /**
     * Create an instance of {@link ProducerSignupDetailsJAXB }
     * 
     */
    public ProducerSignupDetailsJAXB createProducerSignupDetailsJAXB() {
        return new ProducerSignupDetailsJAXB();
    }

    /**
     * Create an instance of {@link ImageDetailsJAXB }
     * 
     */
    public ImageDetailsJAXB createImageDetailsJAXB() {
        return new ImageDetailsJAXB();
    }

    /**
     * Create an instance of {@link AddressDetailsJAXB }
     * 
     */
    public AddressDetailsJAXB createAddressDetailsJAXB() {
        return new AddressDetailsJAXB();
    }

    /**
     * Create an instance of {@link ProducerSignupBasicDetailsJAXB }
     * 
     */
    public ProducerSignupBasicDetailsJAXB createProducerSignupBasicDetailsJAXB() {
        return new ProducerSignupBasicDetailsJAXB();
    }

    /**
     * Create an instance of {@link ProducerSettingsDetailsJAXB }
     * 
     */
    public ProducerSettingsDetailsJAXB createProducerSettingsDetailsJAXB() {
        return new ProducerSettingsDetailsJAXB();
    }

    /**
     * Create an instance of {@link ProducerSignupDetailsJAXBNew }
     * 
     */
    public ProducerSignupDetailsJAXBNew createProducerSignupDetailsJAXBNew() {
        return new ProducerSignupDetailsJAXBNew();
    }

    /**
     * Create an instance of {@link ProducerSignupImageDetailsJAXB }
     * 
     */
    public ProducerSignupImageDetailsJAXB createProducerSignupImageDetailsJAXB() {
        return new ProducerSignupImageDetailsJAXB();
    }

    /**
     * Create an instance of {@link ProducerSignupBasic2DetailsJAXB }
     * 
     */
    public ProducerSignupBasic2DetailsJAXB createProducerSignupBasic2DetailsJAXB() {
        return new ProducerSignupBasic2DetailsJAXB();
    }

    /**
     * Create an instance of {@link ProducerListRepresentationJAXB }
     * 
     */
    public ProducerListRepresentationJAXB createProducerListRepresentationJAXB() {
        return new ProducerListRepresentationJAXB();
    }

    /**
     * Create an instance of {@link ProducerBranchDetailsJAXB }
     * 
     */
    public ProducerBranchDetailsJAXB createProducerBranchDetailsJAXB() {
        return new ProducerBranchDetailsJAXB();
    }

    /**
     * Create an instance of {@link ProducerBranchesRepresentationJAXB }
     * 
     */
    public ProducerBranchesRepresentationJAXB createProducerBranchesRepresentationJAXB() {
        return new ProducerBranchesRepresentationJAXB();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducerBranchDetailsJAXB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "branchForm")
    public JAXBElement<ProducerBranchDetailsJAXB> createBranchForm(ProducerBranchDetailsJAXB value) {
        return new JAXBElement<ProducerBranchDetailsJAXB>(_BranchForm_QNAME, ProducerBranchDetailsJAXB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducerLoginDetailsJAXB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "loginForm")
    public JAXBElement<ProducerLoginDetailsJAXB> createLoginForm(ProducerLoginDetailsJAXB value) {
        return new JAXBElement<ProducerLoginDetailsJAXB>(_LoginForm_QNAME, ProducerLoginDetailsJAXB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducerSettingsDetailsJAXB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "producerSettingsForm")
    public JAXBElement<ProducerSettingsDetailsJAXB> createProducerSettingsForm(ProducerSettingsDetailsJAXB value) {
        return new JAXBElement<ProducerSettingsDetailsJAXB>(_ProducerSettingsForm_QNAME, ProducerSettingsDetailsJAXB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducerSettingFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "producerSettingFieldForm")
    public JAXBElement<ProducerSettingFields> createProducerSettingFieldForm(ProducerSettingFields value) {
        return new JAXBElement<ProducerSettingFields>(_ProducerSettingFieldForm_QNAME, ProducerSettingFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducerSignupDetailsJAXBNew }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "signupForm")
    public JAXBElement<ProducerSignupDetailsJAXBNew> createSignupForm(ProducerSignupDetailsJAXBNew value) {
        return new JAXBElement<ProducerSignupDetailsJAXBNew>(_SignupForm_QNAME, ProducerSignupDetailsJAXBNew.class, null, value);
    }

}
