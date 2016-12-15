//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.11 at 01:55:25 PM IST 
//


package com.ubiquity.common.jaxb.stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StreamInformationRepresentationJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreamInformationRepresentationJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="streamId" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="isTrend" type="{http://www.w3.org/2001/XMLSchema}Boolean"/>
 *         &lt;element name="topUserDetail" type="{}StreamUserDetailJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="topProducerDetail" type="{}StreamProducerDetailJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="topBranchDetail" type="{}StreamProducerBranchDetailJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="topTrendDetail" type="{}StreamTrendURLRepresentationJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="currentStreamCount" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="currentStreamStartTimestamp" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="currentStreamEndTimestamp" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="nextStreamCursor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nextStreamUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nextStreamPageNumber" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamInformationRepresentationJAXB", propOrder = {
    "streamId",
    "isTrend",
    "topUserDetail",
    "topProducerDetail",
    "topBranchDetail",
    "topTrendDetail",
    "currentStreamCount",
    "currentStreamStartTimestamp",
    "currentStreamEndTimestamp",
    "nextStreamCursor",
    "nextStreamUrl",
    "nextStreamPageNumber"
})
@XmlRootElement public class StreamInformationRepresentationJAXB
    implements Serializable
{

    private final static Long serialVersionUID = 12343L;
    protected Long streamId;
    protected Boolean isTrend;
    @XmlElement(nillable = true)
    protected List<StreamUserDetailJAXB> topUserDetail;
    @XmlElement(nillable = true)
    protected List<StreamProducerDetailJAXB> topProducerDetail;
    @XmlElement(nillable = true)
    protected List<StreamProducerBranchDetailJAXB> topBranchDetail;
    @XmlElement(nillable = true)
    protected List<StreamTrendURLRepresentationJAXB> topTrendDetail;
    protected Long currentStreamCount;
    protected Long currentStreamStartTimestamp;
    protected Long currentStreamEndTimestamp;
    @XmlElement(required = true)
    protected String nextStreamCursor;
    @XmlElement(required = true)
    protected String nextStreamUrl;
    protected Long nextStreamPageNumber;

    /**
     * Gets the value of the streamId property.
     * 
     */
    public Long getStreamId() {
        return streamId;
    }

    /**
     * Sets the value of the streamId property.
     * 
     */
    public void setStreamId(Long value) {
        this.streamId = value;
    }

    public Boolean isSetStreamId() {
        return true;
    }

    /**
     * Gets the value of the isTrend property.
     * 
     */
    public Boolean isIsTrend() {
        return isTrend;
    }

    /**
     * Sets the value of the isTrend property.
     * 
     */
    public void setIsTrend(Boolean value) {
        this.isTrend = value;
    }

    public Boolean isSetIsTrend() {
        return true;
    }

    /**
     * Gets the value of the topUserDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topUserDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopUserDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreamUserDetailJAXB }
     * 
     * 
     */
    public List<StreamUserDetailJAXB> getTopUserDetail() {
        if (topUserDetail == null) {
            topUserDetail = new ArrayList<StreamUserDetailJAXB>();
        }
        return this.topUserDetail;
    }

    public Boolean isSetTopUserDetail() {
        return ((this.topUserDetail!= null)&&(!this.topUserDetail.isEmpty()));
    }

    public void unsetTopUserDetail() {
        this.topUserDetail = null;
    }

    /**
     * Gets the value of the topProducerDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topProducerDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopProducerDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreamProducerDetailJAXB }
     * 
     * 
     */
    public List<StreamProducerDetailJAXB> getTopProducerDetail() {
        if (topProducerDetail == null) {
            topProducerDetail = new ArrayList<StreamProducerDetailJAXB>();
        }
        return this.topProducerDetail;
    }

    public Boolean isSetTopProducerDetail() {
        return ((this.topProducerDetail!= null)&&(!this.topProducerDetail.isEmpty()));
    }

    public void unsetTopProducerDetail() {
        this.topProducerDetail = null;
    }

    /**
     * Gets the value of the topBranchDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topBranchDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopBranchDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreamProducerBranchDetailJAXB }
     * 
     * 
     */
    public List<StreamProducerBranchDetailJAXB> getTopBranchDetail() {
        if (topBranchDetail == null) {
            topBranchDetail = new ArrayList<StreamProducerBranchDetailJAXB>();
        }
        return this.topBranchDetail;
    }

    public Boolean isSetTopBranchDetail() {
        return ((this.topBranchDetail!= null)&&(!this.topBranchDetail.isEmpty()));
    }

    public void unsetTopBranchDetail() {
        this.topBranchDetail = null;
    }

    /**
     * Gets the value of the topTrendDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topTrendDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopTrendDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreamTrendURLRepresentationJAXB }
     * 
     * 
     */
    public List<StreamTrendURLRepresentationJAXB> getTopTrendDetail() {
        if (topTrendDetail == null) {
            topTrendDetail = new ArrayList<StreamTrendURLRepresentationJAXB>();
        }
        return this.topTrendDetail;
    }

    public Boolean isSetTopTrendDetail() {
        return ((this.topTrendDetail!= null)&&(!this.topTrendDetail.isEmpty()));
    }

    public void unsetTopTrendDetail() {
        this.topTrendDetail = null;
    }

    /**
     * Gets the value of the currentStreamCount property.
     * 
     */
    public Long getCurrentStreamCount() {
        return currentStreamCount;
    }

    /**
     * Sets the value of the currentStreamCount property.
     * 
     */
    public void setCurrentStreamCount(Long value) {
        this.currentStreamCount = value;
    }

    public Boolean isSetCurrentStreamCount() {
        return true;
    }

    /**
     * Gets the value of the currentStreamStartTimestamp property.
     * 
     */
    public Long getCurrentStreamStartTimestamp() {
        return currentStreamStartTimestamp;
    }

    /**
     * Sets the value of the currentStreamStartTimestamp property.
     * 
     */
    public void setCurrentStreamStartTimestamp(Long value) {
        this.currentStreamStartTimestamp = value;
    }

    public Boolean isSetCurrentStreamStartTimestamp() {
        return true;
    }

    /**
     * Gets the value of the currentStreamEndTimestamp property.
     * 
     */
    public Long getCurrentStreamEndTimestamp() {
        return currentStreamEndTimestamp;
    }

    /**
     * Sets the value of the currentStreamEndTimestamp property.
     * 
     */
    public void setCurrentStreamEndTimestamp(Long value) {
        this.currentStreamEndTimestamp = value;
    }

    public Boolean isSetCurrentStreamEndTimestamp() {
        return true;
    }

    /**
     * Gets the value of the nextStreamCursor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextStreamCursor() {
        return nextStreamCursor;
    }

    /**
     * Sets the value of the nextStreamCursor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextStreamCursor(String value) {
        this.nextStreamCursor = value;
    }

    public Boolean isSetNextStreamCursor() {
        return (this.nextStreamCursor!= null);
    }

    /**
     * Gets the value of the nextStreamUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextStreamUrl() {
        return nextStreamUrl;
    }

    /**
     * Sets the value of the nextStreamUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextStreamUrl(String value) {
        this.nextStreamUrl = value;
    }

    public Boolean isSetNextStreamUrl() {
        return (this.nextStreamUrl!= null);
    }

    /**
     * Gets the value of the nextStreamPageNumber property.
     * 
     */
    public Long getNextStreamPageNumber() {
        return nextStreamPageNumber;
    }

    /**
     * Sets the value of the nextStreamPageNumber property.
     * 
     */
    public void setNextStreamPageNumber(Long value) {
        this.nextStreamPageNumber = value;
    }

    public Boolean isSetNextStreamPageNumber() {
        return true;
    }

}
