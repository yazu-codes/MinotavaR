package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParticipantFrameDto {
    @JsonProperty("championStats")
    private ChampionStatsDto championStats;

    @JsonProperty("currentGold")
    private Integer currentGold;

    @JsonProperty("damageStats")
    private DamageStatsDto damageStats;

    @JsonProperty("goldPerSecond")
    private Integer goldPerSecond;

    @JsonProperty("jungleMinionsKilled")
    private Integer jungleMinionsKilled;

    @JsonProperty("level")
    private Integer level;

    @JsonProperty("minionsKilled")
    private Integer minionsKilled;

    @JsonProperty("participantId")
    private Integer participantId;

    @JsonProperty("position")
    private PositionDto position;

    @JsonProperty("timeEnemySpentControlled")
    private Integer timeEnemySpentControlled;

    @JsonProperty("totalGold")
    private Integer totalGold;

    @JsonProperty("xp")
    private Integer xp;

    public ParticipantFrameDto() {
    }

    public ChampionStatsDto getChampionStats() {
        return this.championStats;
    }

    public void setChampionStats(ChampionStatsDto championStats) {
        this.championStats = championStats;
    }

    public Integer getCurrentGold() {
        return this.currentGold;
    }

    public void setCurrentGold(Integer currentGold) {
        this.currentGold = currentGold;
    }

    public DamageStatsDto getDamageStats() {
        return this.damageStats;
    }

    public void setDamageStats(DamageStatsDto damageStats) {
        this.damageStats = damageStats;
    }

    public Integer getGoldPerSecond() {
        return this.goldPerSecond;
    }

    public void setGoldPerSecond(Integer goldPerSecond) {
        this.goldPerSecond = goldPerSecond;
    }

    public Integer getJungleMinionsKilled() {
        return this.jungleMinionsKilled;
    }

    public void setJungleMinionsKilled(Integer jungleMinionsKilled) {
        this.jungleMinionsKilled = jungleMinionsKilled;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getMinionsKilled() {
        return this.minionsKilled;
    }

    public void setMinionsKilled(Integer minionsKilled) {
        this.minionsKilled = minionsKilled;
    }

    public Integer getParticipantId() {
        return this.participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    public PositionDto getPosition() {
        return this.position;
    }

    public void setPosition(PositionDto position) {
        this.position = position;
    }

    public Integer getTimeEnemySpentControlled() {
        return this.timeEnemySpentControlled;
    }

    public void setTimeEnemySpentControlled(Integer timeEnemySpentControlled) {
        this.timeEnemySpentControlled = timeEnemySpentControlled;
    }

    public Integer getTotalGold() {
        return this.totalGold;
    }

    public void setTotalGold(Integer totalGold) {
        this.totalGold = totalGold;
    }

    public Integer getXp() {
        return this.xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public ParticipantFrameDto(ChampionStatsDto championStats, Integer currentGold, DamageStatsDto damageStats,
            Integer goldPerSecond, Integer jungleMinionsKilled, Integer level, Integer minionsKilled,
            Integer participantId, PositionDto position, Integer timeEnemySpentControlled, Integer totalGold,
            Integer xp) {
        this.championStats = championStats;
        this.currentGold = currentGold;
        this.damageStats = damageStats;
        this.goldPerSecond = goldPerSecond;
        this.jungleMinionsKilled = jungleMinionsKilled;
        this.level = level;
        this.minionsKilled = minionsKilled;
        this.participantId = participantId;
        this.position = position;
        this.timeEnemySpentControlled = timeEnemySpentControlled;
        this.totalGold = totalGold;
        this.xp = xp;
    }

}