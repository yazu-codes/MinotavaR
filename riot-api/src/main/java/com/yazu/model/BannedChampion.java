package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BannedChampion {
    @JsonProperty("pickTurn")
    private Integer pickTurn;

    @JsonProperty("championId")
    private Long championId;

    @JsonProperty("teamId")
    private Long teamId;

    public BannedChampion(Integer pickTurn, Long championId, Long teamId) {
        this.pickTurn = pickTurn;
        this.championId = championId;
        this.teamId = teamId;
    }

    public BannedChampion() {
    }

    public Integer getPickTurn() {
        return this.pickTurn;
    }

    public void setPickTurn(Integer pickTurn) {
        this.pickTurn = pickTurn;
    }

    public Long getChampionId() {
        return this.championId;
    }

    public void setChampionId(Long championId) {
        this.championId = championId;
    }

    public Long getTeamId() {
        return this.teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

}