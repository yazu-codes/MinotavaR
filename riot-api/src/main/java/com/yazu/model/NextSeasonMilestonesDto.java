package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NextSeasonMilestonesDto {
    // TODO: THIS PROPERTY SHOULD BE TESTED. THE DOCS SAY THAT IT IS ANY CUSTOM
    // OBJECT. I DOUBT THAT
    @JsonProperty("requireGradeCounts")
    private RequireGradeCounts RequireGradeCounts;

    @JsonProperty("rewardMarks")
    private Integer RewardMarks;

    @JsonProperty("bonus")
    private Boolean Bonus;

    @JsonProperty("rewardConfig")
    private RewardConfigDto RewardConfig;

    @JsonProperty("totalGamesRequires")
    private Integer totalGamesRequires;

    public NextSeasonMilestonesDto(RequireGradeCounts RequireGradeCounts, Integer RewardMarks, Boolean Bonus,
            RewardConfigDto RewardConfig,
            Integer totalGamesRequires) {
        this.RequireGradeCounts = RequireGradeCounts;
        this.RewardMarks = RewardMarks;
        this.Bonus = Bonus;
        this.RewardConfig = RewardConfig;
        this.totalGamesRequires = totalGamesRequires;
    }

    public Integer getTotalGamesRequires() {
        return this.totalGamesRequires;
    }

    public void setTotalGamesRequires(Integer totalGamesRequires) {
        this.totalGamesRequires = totalGamesRequires;
    }

    public NextSeasonMilestonesDto() {
    }

    public RequireGradeCounts getRequireGradeCounts() {
        return this.RequireGradeCounts;
    }

    public void setRequireGradeCounts(RequireGradeCounts RequireGradeCounts) {
        this.RequireGradeCounts = RequireGradeCounts;
    }

    public Integer getRewardMarks() {
        return this.RewardMarks;
    }

    public void setRewardMarks(Integer RewardMarks) {
        this.RewardMarks = RewardMarks;
    }

    public Boolean isBonus() {
        return this.Bonus;
    }

    public Boolean getBonus() {
        return this.Bonus;
    }

    public void setBonus(Boolean Bonus) {
        this.Bonus = Bonus;
    }

    public RewardConfigDto getRewardConfig() {
        return this.RewardConfig;
    }

    public void setRewardConfig(RewardConfigDto RewardConfig) {
        this.RewardConfig = RewardConfig;
    }

}
