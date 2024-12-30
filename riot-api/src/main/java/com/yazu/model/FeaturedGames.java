package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FeaturedGames {
    @JsonProperty("gameList")
    private List<FeaturedGameInfo> gameList;

    @JsonProperty("clientRefreshInterval")
    private Long clientRefreshInterval;

    public FeaturedGames() {
    }

    public List<FeaturedGameInfo> getGameList() {
        return this.gameList;
    }

    public void setGameList(List<FeaturedGameInfo> gameList) {
        this.gameList = gameList;
    }

    public Long getClientRefreshInterval() {
        return this.clientRefreshInterval;
    }

    public void setClientRefreshInterval(Long clientRefreshInterval) {
        this.clientRefreshInterval = clientRefreshInterval;
    }

    public FeaturedGames(List<FeaturedGameInfo> gameList, Long clientRefreshInterval) {
        this.gameList = gameList;
        this.clientRefreshInterval = clientRefreshInterval;
    }

}