package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NextSeasonMilestonesDto {
    // TODO: THIS PROPERTY SHOULD BE TESTED. THE DOCS SAY THAT IT IS ANY CUSTOM
    // OBJECT. I DOUBT THAT
    @JsonProperty("requireGradeCounts")
    private Boolean RequireGradeCounts;

    @JsonProperty("rewardMarks")
    private Integer RewardMarks;

    @JsonProperty("bonus")
    private Boolean Bonus;

    @JsonProperty("rewardConfig")
    private RewardConfigDto RewardConfig;

    public NextSeasonMilestonesDto(Boolean RequireGradeCounts, Integer RewardMarks, Boolean Bonus,
            RewardConfigDto RewardConfig) {
        this.RequireGradeCounts = RequireGradeCounts;
        this.RewardMarks = RewardMarks;
        this.Bonus = Bonus;
        this.RewardConfig = RewardConfig;
    }

    public NextSeasonMilestonesDto() {
    }

    public Boolean isRequireGradeCounts() {
        return this.RequireGradeCounts;
    }

    public Boolean getRequireGradeCounts() {
        return this.RequireGradeCounts;
    }

    public void setRequireGradeCounts(Boolean RequireGradeCounts) {
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
