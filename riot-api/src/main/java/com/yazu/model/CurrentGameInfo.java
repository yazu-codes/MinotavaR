package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentGameInfo {
    @JsonProperty("gameId")
    private Long gameId;

    @JsonProperty("gameType")
    private String gameType;

    @JsonProperty("gameStartTime")
    private Long gameStartTime;

    @JsonProperty("mapId")
    private Long mapId;

    @JsonProperty("gameLength")
    private Long gameLength;

    @JsonProperty("platformId")
    private String platformId;

    @JsonProperty("gameMode")
    private String gameMode;

    @JsonProperty("bannedChampions")
    private List<BannedChampion> bannedChampions;

    @JsonProperty("gameQueueConfigId")
    private Long gameQueueConfigId;

    @JsonProperty("observers")
    private Observer observers;

    @JsonProperty("participants")
    private List<CurrentGameParticipant> participants;

    public CurrentGameInfo() {
    }

    public Long getGameId() {
        return this.gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getGameType() {
        return this.gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Long getGameStartTime() {
        return this.gameStartTime;
    }

    public void setGameStartTime(Long gameStartTime) {
        this.gameStartTime = gameStartTime;
    }

    public Long getMapId() {
        return this.mapId;
    }

    public void setMapId(Long mapId) {
        this.mapId = mapId;
    }

    public Long getGameLength() {
        return this.gameLength;
    }

    public void setGameLength(Long gameLength) {
        this.gameLength = gameLength;
    }

    public String getPlatformId() {
        return this.platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getGameMode() {
        return this.gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public List<BannedChampion> getBannedChampions() {
        return this.bannedChampions;
    }

    public void setBannedChampions(List<BannedChampion> bannedChampions) {
        this.bannedChampions = bannedChampions;
    }

    public Long getGameQueueConfigId() {
        return this.gameQueueConfigId;
    }

    public void setGameQueueConfigId(Long gameQueueConfigId) {
        this.gameQueueConfigId = gameQueueConfigId;
    }

    public Observer getObservers() {
        return this.observers;
    }

    public void setObservers(Observer observers) {
        this.observers = observers;
    }

    public List<CurrentGameParticipant> getParticipants() {
        return this.participants;
    }

    public void setParticipants(List<CurrentGameParticipant> participants) {
        this.participants = participants;
    }

    public CurrentGameInfo(Long gameId, String gameType, Long gameStartTime, Long mapId, Long gameLength,
            String platformId, String gameMode, List<BannedChampion> bannedChampions, Long gameQueueConfigId,
            Observer observers, List<CurrentGameParticipant> participants) {
        this.gameId = gameId;
        this.gameType = gameType;
        this.gameStartTime = gameStartTime;
        this.mapId = mapId;
        this.gameLength = gameLength;
        this.platformId = platformId;
        this.gameMode = gameMode;
        this.bannedChampions = bannedChampions;
        this.gameQueueConfigId = gameQueueConfigId;
        this.observers = observers;
        this.participants = participants;
    }

}