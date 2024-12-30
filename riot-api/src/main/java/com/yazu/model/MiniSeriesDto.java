package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MiniSeriesDto {
    @JsonProperty("losses")
    private Integer Inactive;
    @JsonProperty("progress")
    private String Progress;
    @JsonProperty("target")
    private Integer Target;
    @JsonProperty("wins")
    private Integer Wins;

    public MiniSeriesDto(Integer Inactive, String Progress, Integer Target, Integer Wins) {
        this.Inactive = Inactive;
        this.Progress = Progress;
        this.Target = Target;
        this.Wins = Wins;
    }

    public MiniSeriesDto() {
    }

    public Integer getInactive() {
        return this.Inactive;
    }

    public void setInactive(Integer Inactive) {
        this.Inactive = Inactive;
    }

    public String getProgress() {
        return this.Progress;
    }

    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    public Integer getTarget() {
        return this.Target;
    }

    public void setTarget(Integer Target) {
        this.Target = Target;
    }

    public Integer getWins() {
        return this.Wins;
    }

    public void setWins(Integer Wins) {
        this.Wins = Wins;
    }

}
