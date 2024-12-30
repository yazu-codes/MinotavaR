package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamDto {
    @JsonProperty("bans")
    private List<BanDto> bans;

    @JsonProperty("objectives")
    private ObjectivesDto objectives;

    @JsonProperty("teamId")
    private Integer teamId;

    @JsonProperty("win")
    private Boolean win;

    public TeamDto() {
    }

    public List<BanDto> getBans() {
        return this.bans;
    }

    public void setBans(List<BanDto> bans) {
        this.bans = bans;
    }

    public ObjectivesDto getObjectives() {
        return this.objectives;
    }

    public void setObjectives(ObjectivesDto objectives) {
        this.objectives = objectives;
    }

    public Integer getTeamId() {
        return this.teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Boolean isWin() {
        return this.win;
    }

    public Boolean getWin() {
        return this.win;
    }

    public void setWin(Boolean win) {
        this.win = win;
    }

    public TeamDto(List<BanDto> bans, ObjectivesDto objectives, Integer teamId, Boolean win) {
        this.bans = bans;
        this.objectives = objectives;
        this.teamId = teamId;
        this.win = win;
    }

}
