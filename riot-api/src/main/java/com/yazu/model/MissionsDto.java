package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MissionsDto {
    @JsonProperty("playerScore0")
    private Integer playerScore0;

    @JsonProperty("playerScore1")
    private Integer playerScore1;

    @JsonProperty("playerScore2")
    private Integer playerScore2;

    @JsonProperty("playerScore3")
    private Integer playerScore3;

    @JsonProperty("playerScore4")
    private Integer playerScore4;

    @JsonProperty("playerScore5")
    private Integer playerScore5;

    @JsonProperty("playerScore6")
    private Integer playerScore6;

    @JsonProperty("playerScore7")
    private Integer playerScore7;

    @JsonProperty("playerScore8")
    private Integer playerScore8;

    @JsonProperty("playerScore9")
    private Integer playerScore9;

    @JsonProperty("playerScore10")
    private Integer playerScore10;

    @JsonProperty("playerScore11")
    private Integer playerScore11;

    public MissionsDto() {
    }

    public Integer getPlayerScore0() {
        return this.playerScore0;
    }

    public void setPlayerScore0(Integer playerScore0) {
        this.playerScore0 = playerScore0;
    }

    public Integer getPlayerScore1() {
        return this.playerScore1;
    }

    public void setPlayerScore1(Integer playerScore1) {
        this.playerScore1 = playerScore1;
    }

    public Integer getPlayerScore2() {
        return this.playerScore2;
    }

    public void setPlayerScore2(Integer playerScore2) {
        this.playerScore2 = playerScore2;
    }

    public Integer getPlayerScore3() {
        return this.playerScore3;
    }

    public void setPlayerScore3(Integer playerScore3) {
        this.playerScore3 = playerScore3;
    }

    public Integer getPlayerScore4() {
        return this.playerScore4;
    }

    public void setPlayerScore4(Integer playerScore4) {
        this.playerScore4 = playerScore4;
    }

    public Integer getPlayerScore5() {
        return this.playerScore5;
    }

    public void setPlayerScore5(Integer playerScore5) {
        this.playerScore5 = playerScore5;
    }

    public Integer getPlayerScore6() {
        return this.playerScore6;
    }

    public void setPlayerScore6(Integer playerScore6) {
        this.playerScore6 = playerScore6;
    }

    public Integer getPlayerScore7() {
        return this.playerScore7;
    }

    public void setPlayerScore7(Integer playerScore7) {
        this.playerScore7 = playerScore7;
    }

    public Integer getPlayerScore8() {
        return this.playerScore8;
    }

    public void setPlayerScore8(Integer playerScore8) {
        this.playerScore8 = playerScore8;
    }

    public Integer getPlayerScore9() {
        return this.playerScore9;
    }

    public void setPlayerScore9(Integer playerScore9) {
        this.playerScore9 = playerScore9;
    }

    public Integer getPlayerScore10() {
        return this.playerScore10;
    }

    public void setPlayerScore10(Integer playerScore10) {
        this.playerScore10 = playerScore10;
    }

    public Integer getPlayerScore11() {
        return this.playerScore11;
    }

    public void setPlayerScore11(Integer playerScore11) {
        this.playerScore11 = playerScore11;
    }

    public MissionsDto(Integer playerScore0, Integer playerScore1, Integer playerScore2, Integer playerScore3,
            Integer playerScore4, Integer playerScore5, Integer playerScore6, Integer playerScore7,
            Integer playerScore8, Integer playerScore9, Integer playerScore10, Integer playerScore11) {
        this.playerScore0 = playerScore0;
        this.playerScore1 = playerScore1;
        this.playerScore2 = playerScore2;
        this.playerScore3 = playerScore3;
        this.playerScore4 = playerScore4;
        this.playerScore5 = playerScore5;
        this.playerScore6 = playerScore6;
        this.playerScore7 = playerScore7;
        this.playerScore8 = playerScore8;
        this.playerScore9 = playerScore9;
        this.playerScore10 = playerScore10;
        this.playerScore11 = playerScore11;
    }

}
