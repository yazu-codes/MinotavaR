package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yazu.model.collections.Position;
import com.yazu.model.collections.Role;

public class PlayerDto {
    @JsonProperty("summonerId")
    private String SummonerId;
    @JsonProperty("puuid")
    private String Puuid;
    @JsonProperty("teamId")
    private String TeamId;
    @JsonProperty("position")
    private Position Position;
    @JsonProperty("role")
    private Role Role;

    public PlayerDto(String SummonerId, String Puuid, String TeamId, Position Position, Role Role) {
        this.SummonerId = SummonerId;
        this.Puuid = Puuid;
        this.TeamId = TeamId;
        this.Position = Position;
        this.Role = Role;
    }

    public PlayerDto() {
    }

    public String getSummonerId() {
        return this.SummonerId;
    }

    public void setSummonerId(String SummonerId) {
        this.SummonerId = SummonerId;
    }

    public String getPuuid() {
        return this.Puuid;
    }

    public void setPuuid(String Puuid) {
        this.Puuid = Puuid;
    }

    public String getTeamId() {
        return this.TeamId;
    }

    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    public Position getPosition() {
        return this.Position;
    }

    public void setPosition(Position Position) {
        this.Position = Position;
    }

    public Role getRole() {
        return this.Role;
    }

    public void setRole(Role Role) {
        this.Role = Role;
    }

}
