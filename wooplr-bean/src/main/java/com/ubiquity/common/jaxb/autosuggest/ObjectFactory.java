
package com.ubiquity.common.jaxb.autosuggest;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ubiquity.common.jaxb.autosuggest package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ubiquity.common.jaxb.autosuggest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SuggestionStreamRepresentationJAXB }
     * 
     */
    public SuggestionStreamRepresentationJAXB createSuggestionStreamRepresentationJAXB() {
        return new SuggestionStreamRepresentationJAXB();
    }

    /**
     * Create an instance of {@link SuggestionHashMapEntryJAXB }
     * 
     */
    public SuggestionHashMapEntryJAXB createSuggestionHashMapEntryJAXB() {
        return new SuggestionHashMapEntryJAXB();
    }

    /**
     * Create an instance of {@link SuggestionHashMapStreamRepresentationJAXB }
     * 
     */
    public SuggestionHashMapStreamRepresentationJAXB createSuggestionHashMapStreamRepresentationJAXB() {
        return new SuggestionHashMapStreamRepresentationJAXB();
    }

    /**
     * Create an instance of {@link AttributeEntry }
     * 
     */
    public AttributeEntry createAttributeEntry() {
        return new AttributeEntry();
    }

}
