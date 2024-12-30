package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LeagueListDto {
    @JsonProperty("leagueId")
    private String LeagueId;

    @JsonProperty("entries")
    private List<LeagueItemDto> Entries;

    @JsonProperty("tier")
    private String Tier;

    @JsonProperty("name")
    private String Name;

    @JsonProperty("queue")
    private String Queue;

    public LeagueListDto(String LeagueId, List<LeagueItemDto> Entries, String Tier, String Name, String Queue) {
        this.LeagueId = LeagueId;
        this.Entries = Entries;
        this.Tier = Tier;
        this.Name = Name;
        this.Queue = Queue;
    }

    public LeagueListDto() {
    }

    public String getLeagueId() {
        return this.LeagueId;
    }

    public void setLeagueId(String LeagueId) {
        this.LeagueId = LeagueId;
    }

    public List<LeagueItemDto> getEntries() {
        return this.Entries;
    }

    public void setEntries(List<LeagueItemDto> Entries) {
        this.Entries = Entries;
    }

    public String getTier() {
        return this.Tier;
    }

    public void setTier(String Tier) {
        this.Tier = Tier;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getQueue() {
        return this.Queue;
    }

    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

}
