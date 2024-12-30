package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TournamentPhaseDto {
    @JsonProperty("id")
    private Integer Id;
    @JsonProperty("registrationTime")
    private Long RegistrationTime;
    @JsonProperty("startTime")
    private Long StartTime;
    @JsonProperty("cancelled")
    private Boolean Cancelled;

    public TournamentPhaseDto(Integer Id, Long RegistrationTime, Long StartTime, Boolean Cancelled) {
        this.Id = Id;
        this.RegistrationTime = RegistrationTime;
        this.StartTime = StartTime;
        this.Cancelled = Cancelled;
    }

    public TournamentPhaseDto() {
    }

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Long getRegistrationTime() {
        return this.RegistrationTime;
    }

    public void setRegistrationTime(Long RegistrationTime) {
        this.RegistrationTime = RegistrationTime;
    }

    public Long getStartTime() {
        return this.StartTime;
    }

    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    public Boolean isCancelled() {
        return this.Cancelled;
    }

    public Boolean getCancelled() {
        return this.Cancelled;
    }

    public void setCancelled(Boolean Cancelled) {
        this.Cancelled = Cancelled;
    }

}
