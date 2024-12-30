package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChampionInfo {
    @JsonProperty("maxNewPlayerLevel")
    private int MaxNewPlayerLevel;
    @JsonProperty("freeChampionIdsForNewPlayers")
    private List<Integer> FreeChampionIdsForNewPlayers;
    @JsonProperty("freeChampionIds")
    private List<Integer> FreeChampionIds;

    public ChampionInfo(int MaxNewPlayerLevel, List<Integer> FreeChampionIdsForNewPlayers,
            List<Integer> FreeChampionIds) {
        this.MaxNewPlayerLevel = MaxNewPlayerLevel;
        this.FreeChampionIdsForNewPlayers = FreeChampionIdsForNewPlayers;
        this.FreeChampionIds = FreeChampionIds;
    }

    public ChampionInfo() {
    }

    public int getMaxNewPlayerLevel() {
        return this.MaxNewPlayerLevel;
    }

    public void setMaxNewPlayerLevel(int MaxNewPlayerLevel) {
        this.MaxNewPlayerLevel = MaxNewPlayerLevel;
    }

    public List<Integer> getFreeChampionIdsForNewPlayers() {
        return this.FreeChampionIdsForNewPlayers;
    }

    public void setFreeChampionIdsForNewPlayers(List<Integer> FreeChampionIdsForNewPlayers) {
        this.FreeChampionIdsForNewPlayers = FreeChampionIdsForNewPlayers;
    }

    public List<Integer> getFreeChampionIds() {
        return this.FreeChampionIds;
    }

    public void setFreeChampionIds(List<Integer> FreeChampionIds) {
        this.FreeChampionIds = FreeChampionIds;
    }

}
