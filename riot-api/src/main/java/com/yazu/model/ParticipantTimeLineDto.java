package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParticipantTimeLineDto {
    @JsonProperty("participantId")
    private Integer participantId;

    @JsonProperty("puuid")
    private String puuid;

    public ParticipantTimeLineDto() {
    }

    public Integer getParticipantId() {
        return this.participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    public String getPuuid() {
        return this.puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public ParticipantTimeLineDto(Integer participantId, String puuid) {
        this.participantId = participantId;
        this.puuid = puuid;
    }

}