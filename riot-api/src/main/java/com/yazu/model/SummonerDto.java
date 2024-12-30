package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SummonerDto {
    @JsonProperty("accountId")
    private String accountId;

    @JsonProperty("profileIconId")
    private Integer profileIconId;

    @JsonProperty("revisionDate")
    private Long revisionDate;

    @JsonProperty("id")
    private String id;

    @JsonProperty("puuid")
    private String puuid;

    @JsonProperty("summonerLevel")
    private Long summonerLevel;

    public SummonerDto() {
    }

    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Integer getProfileIconId() {
        return this.profileIconId;
    }

    public void setProfileIconId(Integer profileIconId) {
        this.profileIconId = profileIconId;
    }

    public Long getRevisionDate() {
        return this.revisionDate;
    }

    public void setRevisionDate(Long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPuuid() {
        return this.puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public Long getSummonerLevel() {
        return this.summonerLevel;
    }

    public void setSummonerLevel(Long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public SummonerDto(String accountId, Integer profileIconId, Long revisionDate, String id, String puuid,
            Long summonerLevel) {
        this.accountId = accountId;
        this.profileIconId = profileIconId;
        this.revisionDate = revisionDate;
        this.id = id;
        this.puuid = puuid;
        this.summonerLevel = summonerLevel;
    }

}
