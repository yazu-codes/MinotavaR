package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetadataDto {
    @JsonProperty("dataVersion")
    private String DataVersion;
    @JsonProperty("matchId")
    private String MatchId;
    @JsonProperty("participants")
    private List<String> Participants;

    public MetadataDto() {
    }

    public String getDataVersion() {
        return this.DataVersion;
    }

    public void setDataVersion(String DataVersion) {
        this.DataVersion = DataVersion;
    }

    public String getMatchId() {
        return this.MatchId;
    }

    public void setMatchId(String MatchId) {
        this.MatchId = MatchId;
    }

    public List<String> getParticipants() {
        return this.Participants;
    }

    public void setParticipants(List<String> Participants) {
        this.Participants = Participants;
    }

    public MetadataDto(String DataVersion, String MatchId, List<String> Participants) {
        this.DataVersion = DataVersion;
        this.MatchId = MatchId;
        this.Participants = Participants;
    }

}
