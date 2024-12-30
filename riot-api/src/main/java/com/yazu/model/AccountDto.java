package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountDto {
    @JsonProperty("puuid")
    private String Puuid;
    @JsonProperty("gameName")
    private String GameName;
    @JsonProperty("tagLine")
    private String TagLine;

    public AccountDto(String Puuid, String GameName, String TagLine) {
        this.Puuid = Puuid;
        this.GameName = GameName;
        this.TagLine = TagLine;
    }

    public AccountDto() {
    }

    public String getPuuid() {
        return this.Puuid;
    }

    public void setPuuid(String Puuid) {
        this.Puuid = Puuid;
    }

    public String getGameName() {
        return this.GameName;
    }

    public void setGameName(String GameName) {
        this.GameName = GameName;
    }

    public String getTagLine() {
        return this.TagLine;
    }

    public void setTagLine(String TagLine) {
        this.TagLine = TagLine;
    }

}
