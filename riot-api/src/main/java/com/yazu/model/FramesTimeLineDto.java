package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FramesTimeLineDto {
    @JsonProperty("events")
    private List<EventsTimeLineDto> events;

    @JsonProperty("participantFrames")
    private ParticipantFramesDto participantFrames;

    @JsonProperty("timestamp")
    private Integer timestamp;

    public FramesTimeLineDto() {
    }

    public List<EventsTimeLineDto> getEvents() {
        return this.events;
    }

    public void setEvents(List<EventsTimeLineDto> events) {
        this.events = events;
    }

    public ParticipantFramesDto getParticipantFrames() {
        return this.participantFrames;
    }

    public void setParticipantFrames(ParticipantFramesDto participantFrames) {
        this.participantFrames = participantFrames;
    }

    public Integer getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public FramesTimeLineDto(List<EventsTimeLineDto> events, ParticipantFramesDto participantFrames,
            Integer timestamp) {
        this.events = events;
        this.participantFrames = participantFrames;
        this.timestamp = timestamp;
    }

}