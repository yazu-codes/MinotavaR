package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentGameParticipant {
    @JsonProperty("championId")
    private Long championId;

    @JsonProperty("perks")
    private Perks perks;

    @JsonProperty("profileIconId")
    private Long profileIconId;

    @JsonProperty("bot")
    private Boolean bot;

    @JsonProperty("teamId")
    private Long teamId;

    @JsonProperty("summonerId")
    private String summonerId;

    @JsonProperty("puuid")
    private String puuid;

    @JsonProperty("spell1Id")
    private Long spell1Id;

    @JsonProperty("spell2Id")
    private Long spell2Id;

    @JsonProperty("gameCustomizationObjects")
    private List<GameCustomizationObject> gameCustomizationObjects;

    public CurrentGameParticipant() {
    }

    public Long getChampionId() {
        return this.championId;
    }

    public void setChampionId(Long championId) {
        this.championId = championId;
    }

    public Perks getPerks() {
        return this.perks;
    }

    public void setPerks(Perks perks) {
        this.perks = perks;
    }

    public Long getProfileIconId() {
        return this.profileIconId;
    }

    public void setProfileIconId(Long profileIconId) {
        this.profileIconId = profileIconId;
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

    public Long getTeamId() {
        return this.teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
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

    public Long getSpell1Id() {
        return this.spell1Id;
    }

    public void setSpell1Id(Long spell1Id) {
        this.spell1Id = spell1Id;
    }

    public Long getSpell2Id() {
        return this.spell2Id;
    }

    public void setSpell2Id(Long spell2Id) {
        this.spell2Id = spell2Id;
    }

    public List<GameCustomizationObject> getGameCustomizationObjects() {
        return this.gameCustomizationObjects;
    }

    public void setGameCustomizationObjects(List<GameCustomizationObject> gameCustomizationObjects) {
        this.gameCustomizationObjects = gameCustomizationObjects;
    }

    public CurrentGameParticipant(Long championId, Perks perks, Long profileIconId, Boolean bot, Long teamId,
            String summonerId, String puuid, Long spell1Id, Long spell2Id,
            List<GameCustomizationObject> gameCustomizationObjects) {
        this.championId = championId;
        this.perks = perks;
        this.profileIconId = profileIconId;
        this.bot = bot;
        this.teamId = teamId;
        this.summonerId = summonerId;
        this.puuid = puuid;
        this.spell1Id = spell1Id;
        this.spell2Id = spell2Id;
        this.gameCustomizationObjects = gameCustomizationObjects;
    }

}