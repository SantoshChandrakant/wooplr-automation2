package com.ubiquity.common.jaxb.stream;

import com.ubiquity.common.jaxb.cards.FlippingCardJAXB;
import com.ubiquity.common.jaxb.stream.collateapi.*;
import com.ubiquity.common.jaxb.votecard.VotecardJAXB;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by subharthi on 10/7/15.
 */
@XmlRootElement(name = "CollateApiPaginationJAXB")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateApiPaginationJAXB", propOrder = {
        "paginationType",
        "trendingApiJAXB",
        "contentApiJAXB",
        "socialApiJAXB",
        "appCardApiJAXB",
        "votecardApiJAXB",
        "flippingCardApiJAXB",
})
public class CollateApiPaginationJAXB implements Serializable{

    @XmlElement(required = false)
    private String paginationType;
    @XmlElement(required = false)
    private TrendingApiJAXB trendingApiJAXB;
    @XmlElement(required = false)
    private ContentApiJAXB contentApiJAXB;
    @XmlElement(required = false)
    private SocialApiJAXB socialApiJAXB;
    @XmlElement(required = false)
    private AppCardApiJAXB appCardApiJAXB;
    @XmlElement(required = false)
    private VoteCardApiJAXB votecardApiJAXB;
    @XmlElement(required = false)
    private FlippingCardApiJAXB flippingCardApiJAXB;

    public ContentApiJAXB getContentApiJAXB() {
        return contentApiJAXB;
    }

    public void setContentApiJAXB(ContentApiJAXB contentApiJAXB) {
        this.contentApiJAXB = contentApiJAXB;
    }

    public TrendingApiJAXB getTrendingApiJAXB() {
        return trendingApiJAXB;
    }

    public void setTrendingApiJAXB(TrendingApiJAXB trendingApiJAXB) {
        this.trendingApiJAXB = trendingApiJAXB;
    }

    public String getPaginationType() {
        return paginationType;
    }

    public void setPaginationType(String paginationType) {
        this.paginationType = paginationType;
    }

    public SocialApiJAXB getSocialApiJAXB() {
        return socialApiJAXB;
    }

    public void setSocialApiJAXB(SocialApiJAXB socialApiJAXB) {
        this.socialApiJAXB = socialApiJAXB;
    }

    public AppCardApiJAXB getAppCardApiJAXB() {
        return appCardApiJAXB;
    }

    public void setAppCardApiJAXB(AppCardApiJAXB appCardApiJAXB) {
        this.appCardApiJAXB = appCardApiJAXB;
    }

    public VoteCardApiJAXB getVotecardApiJAXB() {
        return votecardApiJAXB;
    }

    public void setVotecardApiJAXB(VoteCardApiJAXB votecardApiJAXB) {
        this.votecardApiJAXB = votecardApiJAXB;
    }

    public FlippingCardApiJAXB getFlippingCardApiJAXB() {
        return flippingCardApiJAXB;
    }

    public void setFlippingCardApiJAXB(FlippingCardApiJAXB flippingCardApiJAXB) {
        this.flippingCardApiJAXB = flippingCardApiJAXB;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CollateApiPaginationJAXB{");
        sb.append("paginationType='").append(paginationType).append('\'');
        sb.append(", trendingApiJAXB=").append(trendingApiJAXB);
        sb.append(", contentApiJAXB=").append(contentApiJAXB);
        sb.append(", socialApiJAXB=").append(socialApiJAXB);
        sb.append(", appCardApiJAXB=").append(appCardApiJAXB);
        sb.append(", votecardApiJAXB=").append(votecardApiJAXB);
        sb.append(", flippingCardApiJAXB=").append(flippingCardApiJAXB);
        sb.append('}');
        return sb.toString();
    }
}
