
package com.ubiquity.common.jaxb.rest;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RestKeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestKeys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oauth_token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oauth_token_secret" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oauth_verifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oauth_callback_confirmed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestKeys", propOrder = {
    "oauthToken",
    "oauthTokenSecret",
    "oauthVerifier",
    "oauthCallbackConfirmed"
})
@XmlRootElement
public class RestKeys {

    @XmlElement(name = "oauth_token", required = true)
    protected String oauthToken;
    @XmlElement(name = "oauth_token_secret", required = true)
    protected String oauthTokenSecret;
    @XmlElement(name = "oauth_verifier", required = true)
    protected String oauthVerifier;
    @XmlElement(name = "oauth_callback_confirmed", required = true)
    protected String oauthCallbackConfirmed;

    /**
     * Gets the value of the oauthToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthToken() {
        return oauthToken;
    }

    /**
     * Sets the value of the oauthToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthToken(String value) {
        this.oauthToken = value;
    }

    /**
     * Gets the value of the oauthTokenSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthTokenSecret() {
        return oauthTokenSecret;
    }

    /**
     * Sets the value of the oauthTokenSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthTokenSecret(String value) {
        this.oauthTokenSecret = value;
    }

    /**
     * Gets the value of the oauthVerifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthVerifier() {
        return oauthVerifier;
    }

    /**
     * Sets the value of the oauthVerifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthVerifier(String value) {
        this.oauthVerifier = value;
    }

    /**
     * Gets the value of the oauthCallbackConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthCallbackConfirmed() {
        return oauthCallbackConfirmed;
    }

    /**
     * Sets the value of the oauthCallbackConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthCallbackConfirmed(String value) {
        this.oauthCallbackConfirmed = value;
    }

}
