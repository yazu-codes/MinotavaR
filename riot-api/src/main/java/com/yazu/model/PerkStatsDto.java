package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerkStatsDto {
    @JsonProperty("defence")
    private Integer defence;

    @JsonProperty("flex")
    private Integer flex;

    @JsonProperty("offense")
    private Integer offense;

    public PerkStatsDto() {
    }

    public Integer getDefence() {
        return this.defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Integer getFlex() {
        return this.flex;
    }

    public void setFlex(Integer flex) {
        this.flex = flex;
    }

    public Integer getOffense() {
        return this.offense;
    }

    public void setOffense(Integer offense) {
        this.offense = offense;
    }

    public PerkStatsDto(Integer defence, Integer flex, Integer offense) {
        this.defence = defence;
        this.flex = flex;
        this.offense = offense;
    }

}
