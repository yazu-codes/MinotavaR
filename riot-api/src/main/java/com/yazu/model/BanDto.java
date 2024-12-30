package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BanDto {

    @JsonProperty("championId")
    private Integer championId;

    @JsonProperty("pickTurn")
    private Integer pickTurn;
}
