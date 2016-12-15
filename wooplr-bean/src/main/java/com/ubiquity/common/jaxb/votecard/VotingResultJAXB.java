package com.ubiquity.common.jaxb.votecard;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by vamshi on 6/14/16.
 */
public class VotingResultJAXB implements Serializable {
    private Map<Long,Long> votingResult;

    public Map<Long, Long> getVotingResult() {
        return votingResult;
    }

    public void setVotingResult(Map<Long, Long> votingResult) {
        this.votingResult = votingResult;
    }

    @Override
    public String toString() {
        return "VotingResultJAXB{" +
                "votingResult=" + votingResult.toString() +
                '}';
    }
}
