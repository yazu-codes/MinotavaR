package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObjectiveDto {
    @JsonProperty("first")
    private Boolean first;

    @JsonProperty("kills")
    private Integer kills;

    public ObjectiveDto() {
    }

    public Boolean isFirst() {
        return this.first;
    }

    public Boolean getFirst() {
        return this.first;
    }

    public void setFirst(Boolean first) {
        this.first = first;
    }

    public Integer getKills() {
        return this.kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public ObjectiveDto(Boolean first, Integer kills) {
        this.first = first;
        this.kills = kills;
    }

}
