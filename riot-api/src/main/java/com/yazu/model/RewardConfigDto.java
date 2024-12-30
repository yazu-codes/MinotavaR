package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RewardConfigDto {
    @JsonProperty("rewardValue")
    private String RewardValue;
    @JsonProperty("rewardType")
    private String RewardType;
    @JsonProperty("maximumReward")
    private Integer MaximumReward;

    public RewardConfigDto() {
    }

    public RewardConfigDto(String RewardValue, String RewardType, Integer MaximumReward) {
        this.RewardValue = RewardValue;
        this.RewardType = RewardType;
        this.MaximumReward = MaximumReward;
    }

    public String getRewardValue() {
        return this.RewardValue;
    }

    public void setRewardValue(String RewardValue) {
        this.RewardValue = RewardValue;
    }

    public String getRewardType() {
        return this.RewardType;
    }

    public void setRewardType(String RewardType) {
        this.RewardType = RewardType;
    }

    public Integer getMaximumReward() {
        return this.MaximumReward;
    }

    public void setMaximumReward(Integer MaximumReward) {
        this.MaximumReward = MaximumReward;
    }

}
