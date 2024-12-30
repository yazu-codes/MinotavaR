package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChampionMasteryDto {
    @JsonProperty("puuid")
    private String Puuid;

    @JsonProperty("championPointsUntilNextLevel")
    private Long ChampionPointsUntilNextLevel;

    @JsonProperty("chestGranted")
    private Boolean ChestGranted;

    @JsonProperty("championId")
    private Long ChampionId;

    @JsonProperty("lastPlayTime")
    private Long LastPlayTime;

    @JsonProperty("championLevel")
    private Integer ChampionLevel;

    @JsonProperty("championPoints")
    private Integer ChampionPoints;

    @JsonProperty("championPointsSinceLastLevel")
    private Long ChampionPointsSinceLastLevel;

    @JsonProperty("markRequiredForNextLevel")
    private Integer MarkRequiredForNextLevel;

    @JsonProperty("championSeasonMilestone")
    private Integer ChampionSeasonMilestone;

    @JsonProperty("nextSeasonMilestone")
    private NextSeasonMilestonesDto NextSeasonMilestone;

    @JsonProperty("tokensEarned")
    private Integer TokensEarned;

    @JsonProperty("milestoneGrades")
    private List<String> MilestoneGrades;

    public ChampionMasteryDto() {
    }

    public ChampionMasteryDto(String Puuid, Long ChampionPointsUntilNextLevel, Boolean ChestGranted, Long ChampionId,
            Long LastPlayTime, Integer ChampionLevel, Integer ChampionPoints, Long ChampionPointsSinceLastLevel,
            Integer MarkRequiredForNextLevel, Integer ChampionSeasonMilestone,
            NextSeasonMilestonesDto NextSeasonMilestone, Integer TokensEarned, List<String> MilestoneGrades) {
        this.Puuid = Puuid;
        this.ChampionPointsUntilNextLevel = ChampionPointsUntilNextLevel;
        this.ChestGranted = ChestGranted;
        this.ChampionId = ChampionId;
        this.LastPlayTime = LastPlayTime;
        this.ChampionLevel = ChampionLevel;
        this.ChampionPoints = ChampionPoints;
        this.ChampionPointsSinceLastLevel = ChampionPointsSinceLastLevel;
        this.MarkRequiredForNextLevel = MarkRequiredForNextLevel;
        this.ChampionSeasonMilestone = ChampionSeasonMilestone;
        this.NextSeasonMilestone = NextSeasonMilestone;
        this.TokensEarned = TokensEarned;
        this.MilestoneGrades = MilestoneGrades;
    }

    public String getPuuid() {
        return this.Puuid;
    }

    public void setPuuid(String Puuid) {
        this.Puuid = Puuid;
    }

    public Long getChampionPointsUntilNextLevel() {
        return this.ChampionPointsUntilNextLevel;
    }

    public void setChampionPointsUntilNextLevel(Long ChampionPointsUntilNextLevel) {
        this.ChampionPointsUntilNextLevel = ChampionPointsUntilNextLevel;
    }

    public Boolean isChestGranted() {
        return this.ChestGranted;
    }

    public Boolean getChestGranted() {
        return this.ChestGranted;
    }

    public void setChestGranted(Boolean ChestGranted) {
        this.ChestGranted = ChestGranted;
    }

    public Long getChampionId() {
        return this.ChampionId;
    }

    public void setChampionId(Long ChampionId) {
        this.ChampionId = ChampionId;
    }

    public Long getLastPlayTime() {
        return this.LastPlayTime;
    }

    public void setLastPlayTime(Long LastPlayTime) {
        this.LastPlayTime = LastPlayTime;
    }

    public Integer getChampionLevel() {
        return this.ChampionLevel;
    }

    public void setChampionLevel(Integer ChampionLevel) {
        this.ChampionLevel = ChampionLevel;
    }

    public Integer getChampionPoints() {
        return this.ChampionPoints;
    }

    public void setChampionPoints(Integer ChampionPoints) {
        this.ChampionPoints = ChampionPoints;
    }

    public Long getChampionPointsSinceLastLevel() {
        return this.ChampionPointsSinceLastLevel;
    }

    public void setChampionPointsSinceLastLevel(Long ChampionPointsSinceLastLevel) {
        this.ChampionPointsSinceLastLevel = ChampionPointsSinceLastLevel;
    }

    public Integer getMarkRequiredForNextLevel() {
        return this.MarkRequiredForNextLevel;
    }

    public void setMarkRequiredForNextLevel(Integer MarkRequiredForNextLevel) {
        this.MarkRequiredForNextLevel = MarkRequiredForNextLevel;
    }

    public Integer getChampionSeasonMilestone() {
        return this.ChampionSeasonMilestone;
    }

    public void setChampionSeasonMilestone(Integer ChampionSeasonMilestone) {
        this.ChampionSeasonMilestone = ChampionSeasonMilestone;
    }

    public NextSeasonMilestonesDto getNextSeasonMilestone() {
        return this.NextSeasonMilestone;
    }

    public void setNextSeasonMilestone(NextSeasonMilestonesDto NextSeasonMilestone) {
        this.NextSeasonMilestone = NextSeasonMilestone;
    }

    public Integer getTokensEarned() {
        return this.TokensEarned;
    }

    public void setTokensEarned(Integer TokensEarned) {
        this.TokensEarned = TokensEarned;
    }

    public List<String> getMilestoneGrades() {
        return this.MilestoneGrades;
    }

    public void setMilestoneGrades(List<String> MilestoneGrades) {
        this.MilestoneGrades = MilestoneGrades;
    }

}
