package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LeagueItemDto {
    @JsonProperty("freshBlood")
    private Boolean FreshBlood;

    @JsonProperty("wins")
    private Integer Wins;

    @JsonProperty("miniSeries")
    private MiniSeriesDto MiniSeries;

    @JsonProperty("inactive")
    private Boolean Inactive;

    @JsonProperty("veteran")
    private Boolean Veteran;

    @JsonProperty("hotStreak")
    private Boolean HotStreak;

    @JsonProperty("rank")
    private String Rank;

    @JsonProperty("leaguePoints")
    private Integer LeaguePoints;

    @JsonProperty("losses")
    private Integer Losses;

    @JsonProperty("summonerId")
    private String SummonerId;

    public LeagueItemDto(Boolean FreshBlood, Integer Wins, MiniSeriesDto MiniSeries, Boolean Inactive, Boolean Veteran,
            Boolean HotStreak, String Rank, Integer LeaguePoints, Integer Losses, String SummonerId) {
        this.FreshBlood = FreshBlood;
        this.Wins = Wins;
        this.MiniSeries = MiniSeries;
        this.Inactive = Inactive;
        this.Veteran = Veteran;
        this.HotStreak = HotStreak;
        this.Rank = Rank;
        this.LeaguePoints = LeaguePoints;
        this.Losses = Losses;
        this.SummonerId = SummonerId;
    }

    public LeagueItemDto() {
    }

    public Boolean isFreshBlood() {
        return this.FreshBlood;
    }

    public Boolean getFreshBlood() {
        return this.FreshBlood;
    }

    public void setFreshBlood(Boolean FreshBlood) {
        this.FreshBlood = FreshBlood;
    }

    public Integer getWins() {
        return this.Wins;
    }

    public void setWins(Integer Wins) {
        this.Wins = Wins;
    }

    public MiniSeriesDto getMiniSeries() {
        return this.MiniSeries;
    }

    public void setMiniSeries(MiniSeriesDto MiniSeries) {
        this.MiniSeries = MiniSeries;
    }

    public Boolean isInactive() {
        return this.Inactive;
    }

    public Boolean getInactive() {
        return this.Inactive;
    }

    public void setInactive(Boolean Inactive) {
        this.Inactive = Inactive;
    }

    public Boolean isVeteran() {
        return this.Veteran;
    }

    public Boolean getVeteran() {
        return this.Veteran;
    }

    public void setVeteran(Boolean Veteran) {
        this.Veteran = Veteran;
    }

    public Boolean isHotStreak() {
        return this.HotStreak;
    }

    public Boolean getHotStreak() {
        return this.HotStreak;
    }

    public void setHotStreak(Boolean HotStreak) {
        this.HotStreak = HotStreak;
    }

    public String getRank() {
        return this.Rank;
    }

    public void setRank(String Rank) {
        this.Rank = Rank;
    }

    public Integer getLeaguePoints() {
        return this.LeaguePoints;
    }

    public void setLeaguePoints(Integer LeaguePoints) {
        this.LeaguePoints = LeaguePoints;
    }

    public Integer getLosses() {
        return this.Losses;
    }

    public void setLosses(Integer Losses) {
        this.Losses = Losses;
    }

    public String getSummonerId() {
        return this.SummonerId;
    }

    public void setSummonerId(String SummonerId) {
        this.SummonerId = SummonerId;
    }

}
