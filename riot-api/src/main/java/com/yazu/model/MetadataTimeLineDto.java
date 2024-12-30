package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetadataTimeLineDto {

    @JsonProperty("dataVersion")
    private String dataVersion;

    @JsonProperty("matchId")
    private String matchId;

    @JsonProperty("participants")
    private List<String> participants;

    public MetadataTimeLineDto() {
    }

    public String getDataVersion() {
        return this.dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public String getMatchId() {
        return this.matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public List<String> getParticipants() {
        return this.participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public MetadataTimeLineDto(String dataVersion, String matchId, List<String> participants) {
        this.dataVersion = dataVersion;
        this.matchId = matchId;
        this.participants = participants;
    }

}
