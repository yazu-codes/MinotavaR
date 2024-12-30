package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LeagueEntryDto {
    @JsonProperty("leagueId")
    private String LeagueId;

    @JsonProperty("summonerId")
    private String SummonerId;

    @JsonProperty("queueType")
    private String QueueType;

    @JsonProperty("tier")
    private String Tier;

    @JsonProperty("rank")
    private String Rank;

    @JsonProperty("leaguePoints")
    private Integer LeaguePoints;

    @JsonProperty("wins")
    private Integer Wins;

    @JsonProperty("losses")
    private Integer Losses;

    @JsonProperty("hotStreak")
    private Boolean HotStreak;

    @JsonProperty("veteran")
    private Boolean Veteran;

    @JsonProperty("freshBlood")
    private Boolean FreshBlood;

    @JsonProperty("inactive")
    private Boolean Inactive;

    @JsonProperty("miniSeries")
    private MiniSeriesDto MiniSeries;

    public LeagueEntryDto(String LeagueId, String SummonerId, String QueueType, String Tier, String Rank,
            Integer LeaguePoints, Integer Wins, Integer Losses, Boolean HotStreak, Boolean Veteran, Boolean FreshBlood,
            Boolean Inactive, MiniSeriesDto MiniSeries) {
        this.LeagueId = LeagueId;
        this.SummonerId = SummonerId;
        this.QueueType = QueueType;
        this.Tier = Tier;
        this.Rank = Rank;
        this.LeaguePoints = LeaguePoints;
        this.Wins = Wins;
        this.Losses = Losses;
        this.HotStreak = HotStreak;
        this.Veteran = Veteran;
        this.FreshBlood = FreshBlood;
        this.Inactive = Inactive;
        this.MiniSeries = MiniSeries;
    }

    public LeagueEntryDto() {
    }

    public String getLeagueId() {
        return this.LeagueId;
    }

    public void setLeagueId(String LeagueId) {
        this.LeagueId = LeagueId;
    }

    public String getSummonerId() {
        return this.SummonerId;
    }

    public void setSummonerId(String SummonerId) {
        this.SummonerId = SummonerId;
    }

    public String getQueueType() {
        return this.QueueType;
    }

    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    public String getTier() {
        return this.Tier;
    }

    public void setTier(String Tier) {
        this.Tier = Tier;
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

    public Integer getWins() {
        return this.Wins;
    }

    public void setWins(Integer Wins) {
        this.Wins = Wins;
    }

    public Integer getLosses() {
        return this.Losses;
    }

    public void setLosses(Integer Losses) {
        this.Losses = Losses;
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

    public Boolean isVeteran() {
        return this.Veteran;
    }

    public Boolean getVeteran() {
        return this.Veteran;
    }

    public void setVeteran(Boolean Veteran) {
        this.Veteran = Veteran;
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

    public Boolean isInactive() {
        return this.Inactive;
    }

    public Boolean getInactive() {
        return this.Inactive;
    }

    public void setInactive(Boolean Inactive) {
        this.Inactive = Inactive;
    }

    public MiniSeriesDto getMiniSeries() {
        return this.MiniSeries;
    }

    public void setMiniSeries(MiniSeriesDto MiniSeries) {
        this.MiniSeries = MiniSeries;
    }

}
