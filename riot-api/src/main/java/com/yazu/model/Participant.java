package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Participant {
    @JsonProperty("bot")
    private Boolean bot;

    @JsonProperty("spell2Id")
    private Long spell2Id;

    @JsonProperty("profileIconId")
    private Long profileIconId;

    @JsonProperty("summonerId")
    private String summonerId;

    @JsonProperty("puuid")
    private String puuid;

    @JsonProperty("championId")
    private Long championId;

    @JsonProperty("teamId")
    private Long teamId;

    @JsonProperty("spell1Id")
    private Long spell1Id;

    public Participant() {
    }

    public Boolean isBot() {
        return this.bot;
    }

    public Boolean getBot() {
        return this.bot;
    }

    public void setBot(Boolean bot) {
        this.bot = bot;
    }

    public Long getSpell2Id() {
        return this.spell2Id;
    }

    public void setSpell2Id(Long spell2Id) {
        this.spell2Id = spell2Id;
    }

    public Long getProfileIconId() {
        return this.profileIconId;
    }

    public void setProfileIconId(Long profileIconId) {
        this.profileIconId = profileIconId;
    }

    public String getSummonerId() {
        return this.summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public String getPuuid() {
        return this.puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public Long getChampionId() {
        return this.championId;
    }

    public void setChampionId(Long championId) {
        this.championId = championId;
    }

    public Long getTeamId() {
        return this.teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Long getSpell1Id() {
        return this.spell1Id;
    }

    public void setSpell1Id(Long spell1Id) {
        this.spell1Id = spell1Id;
    }

    public Participant(Boolean bot, Long spell2Id, Long profileIconId, String summonerId, String puuid, Long championId,
            Long teamId, Long spell1Id) {
        this.bot = bot;
        this.spell2Id = spell2Id;
        this.profileIconId = profileIconId;
        this.summonerId = summonerId;
        this.puuid = puuid;
        this.championId = championId;
        this.teamId = teamId;
        this.spell1Id = spell1Id;
    }

}