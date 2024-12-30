package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FeaturedGameInfo {
    @JsonProperty("gameMode")
    private String gameMode;

    @JsonProperty("gameLength")
    private Long gameLength;

    @JsonProperty("mapId")
    private Long mapId;

    @JsonProperty("gameType")
    private String gameType;

    @JsonProperty("bannedChampions")
    private List<BannedChampion> bannedChampions;

    @JsonProperty("gameId")
    private Long gameId;

    @JsonProperty("observers")
    private Observer observers;

    @JsonProperty("gameQueueConfigId")
    private Long gameQueueConfigId;

    @JsonProperty("participants")
    private List<Participant> participants;

    @JsonProperty("platformId")
    private String platformId;

    public FeaturedGameInfo() {
    }

    public String getGameMode() {
        return this.gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public Long getGameLength() {
        return this.gameLength;
    }

    public void setGameLength(Long gameLength) {
        this.gameLength = gameLength;
    }

    public Long getMapId() {
        return this.mapId;
    }

    public void setMapId(Long mapId) {
        this.mapId = mapId;
    }

    public String getGameType() {
        return this.gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public List<BannedChampion> getBannedChampions() {
        return this.bannedChampions;
    }

    public void setBannedChampions(List<BannedChampion> bannedChampions) {
        this.bannedChampions = bannedChampions;
    }

    public Long getGameId() {
        return this.gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public Observer getObservers() {
        return this.observers;
    }

    public void setObservers(Observer observers) {
        this.observers = observers;
    }

    public Long getGameQueueConfigId() {
        return this.gameQueueConfigId;
    }

    public void setGameQueueConfigId(Long gameQueueConfigId) {
        this.gameQueueConfigId = gameQueueConfigId;
    }

    public List<Participant> getParticipants() {
        return this.participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public String getPlatformId() {
        return this.platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public FeaturedGameInfo(String gameMode, Long gameLength, Long mapId, String gameType,
            List<BannedChampion> bannedChampions, Long gameId, Observer observers, Long gameQueueConfigId,
            List<Participant> participants, String platformId) {
        this.gameMode = gameMode;
        this.gameLength = gameLength;
        this.mapId = mapId;
        this.gameType = gameType;
        this.bannedChampions = bannedChampions;
        this.gameId = gameId;
        this.observers = observers;
        this.gameQueueConfigId = gameQueueConfigId;
        this.participants = participants;
        this.platformId = platformId;
    }

}
