package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TournamentDto {
    @JsonProperty("id")
    private Integer Id;
    @JsonProperty("themeId")
    private Integer ThemeId;
    @JsonProperty("nameKey")
    private String NameKey;
    @JsonProperty("nameKeySecondary")
    private String NameKeySecondary;
    @JsonProperty("schedule")
    private List<TournamentPhaseDto> Schedule;

    public TournamentDto(Integer Id, Integer ThemeId, String NameKey, String NameKeySecondary,
            List<TournamentPhaseDto> Schedule) {
        this.Id = Id;
        this.ThemeId = ThemeId;
        this.NameKey = NameKey;
        this.NameKeySecondary = NameKeySecondary;
        this.Schedule = Schedule;
    }

    public TournamentDto() {
    }

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getThemeId() {
        return this.ThemeId;
    }

    public void setThemeId(Integer ThemeId) {
        this.ThemeId = ThemeId;
    }

    public String getNameKey() {
        return this.NameKey;
    }

    public void setNameKey(String NameKey) {
        this.NameKey = NameKey;
    }

    public String getNameKeySecondary() {
        return this.NameKeySecondary;
    }

    public void setNameKeySecondary(String NameKeySecondary) {
        this.NameKeySecondary = NameKeySecondary;
    }

    public List<TournamentPhaseDto> getSchedule() {
        return this.Schedule;
    }

    public void setSchedule(List<TournamentPhaseDto> Schedule) {
        this.Schedule = Schedule;
    }
}
