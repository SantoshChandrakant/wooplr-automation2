package com.ubiquity.common.jaxb.stream;

/**
 * Created by abhishek on 10/5/15.
 */

import com.ubiquity.common.jaxb.ecomm.EcommProductLimitedJAXB;
import com.ubiquity.common.jaxb.producer.ProducerInfoJAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

/**
 * <p>Java class for WidgetJAXB complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="WidgetJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tags" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userDetails" type="{}StreamUserDetailJAXB"/>
 *         &lt;element name="comments" type="{}StreamRecommendationActionSmallJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fashionItems" type="{}FashionItemJAXB" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loveCount" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="commentCount" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="viewCount" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="hasBuyable" type="{http://www.w3.org/2001/XMLSchema}Boolean"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}Boolean"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}Double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}Double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WidgetJAXB", propOrder = {
        "id",
        "contentId",
        "para",
        "title",
        "image",
        "type",
        "sequence",
        "look",
        "twoLookList",
        "oneProduct",
        "twoProductList",
        "separator",
        "spacer",
        "user",
        "store",
        "search",
        "button",
        "breaker"

})
@XmlRootElement
public class WidgetJAXB implements Serializable{
    private final static Long serialVersionUID = 12343L;
    protected Long id;
    protected Long contentId;
    protected String para;
    protected String title;
    protected String type;
    protected Double sequence;
    protected PhotoWidgetJAXB image;
    protected FashionLookCommonJAXB look;
    protected List<FashionLookCommonJAXB> twoLookList;
    protected EcommProductLimitedJAXB oneProduct;
    protected List<EcommProductLimitedJAXB> twoProductList;
    protected SeparatorWidgetJAXB separator;
    protected String spacer;
    protected LookUserDetailJAXB user;
    protected ProducerInfoJAXB store;
    protected CustomSearchJAXB search;
    protected ButtonWidgetJAXB button;
    protected BreakerWidgetJAXB breaker;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PhotoWidgetJAXB getImage() {
        return image;
    }

    public void setImage(PhotoWidgetJAXB image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getSequence() {
        return sequence;
    }

    public void setSequence(Double sequence) {
        this.sequence = sequence;
    }

    public FashionLookCommonJAXB getLook() {
        return look;
    }

    public void setLook(FashionLookCommonJAXB lookCommonJAXB) {
        this.look = lookCommonJAXB;
    }

    public List<FashionLookCommonJAXB> getTwoLookList() {
        return twoLookList;
    }

    public void setTwoLookList(List<FashionLookCommonJAXB> twoLookList) {
        this.twoLookList = twoLookList;
    }

    public EcommProductLimitedJAXB getOneProduct() {
        return oneProduct;
    }

    public void setOneProduct(EcommProductLimitedJAXB oneProduct) {
        this.oneProduct = oneProduct;
    }

    public List<EcommProductLimitedJAXB> getTwoProductList() {
        return twoProductList;
    }

    public void setTwoProductList(List<EcommProductLimitedJAXB> twoProductList) {
        this.twoProductList = twoProductList;
    }

    public SeparatorWidgetJAXB getSeparator() {
        return separator;
    }

    public void setSeparator(SeparatorWidgetJAXB separatorWidgetJAXB) {
        this.separator = separatorWidgetJAXB;
    }

    public String getSpacer() {
        return spacer;
    }

    public void setSpacer(String spacer) {
        this.spacer = spacer;
    }

    public LookUserDetailJAXB getUser() {
        return user;
    }

    public void setUser(LookUserDetailJAXB userDetailBasicJAXB) {
        this.user = userDetailBasicJAXB;
    }

    public ProducerInfoJAXB getStore() {
        return store;
    }

    public void setStore(ProducerInfoJAXB ecommerceStoreJAXB) {
        this.store = ecommerceStoreJAXB;
    }

    public CustomSearchJAXB getSearch() {
        return search;
    }

    public void setSearch(CustomSearchJAXB searchJAXB) {
        this.search = searchJAXB;
    }

    public ButtonWidgetJAXB getButton() {
        return button;
    }

    public void setButton(ButtonWidgetJAXB button) {
        this.button = button;
    }

    public BreakerWidgetJAXB getBreaker() {
        return breaker;
    }

    public void setBreaker(BreakerWidgetJAXB breaker) {
        this.breaker = breaker;
    }
}
