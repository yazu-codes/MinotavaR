package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BanDto {

    @JsonProperty("championId")
    private Integer championId;

    @JsonProperty("pickTurn")
    private Integer pickTurn;

    public Integer getChampionId() {
        return this.championId;
    }

    public void setChampionId(Integer championId) {
        this.championId = championId;
    }

    public Integer getPickTurn() {
        return this.pickTurn;
    }

    public void setPickTurn(Integer pickTurn) {
        this.pickTurn = pickTurn;
    }

    public BanDto(Integer championId, Integer pickTurn) {
        this.championId = championId;
        this.pickTurn = pickTurn;
    }

    public BanDto() {
    }

}
