package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventsTimeLineDto {
    @JsonProperty("timestamp")
    private Long timestamp;

    @JsonProperty("realTimestamp")
    private Long realTimestamp;

    @JsonProperty("type")
    private String type;

    public EventsTimeLineDto() {
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getRealTimestamp() {
        return this.realTimestamp;
    }

    public void setRealTimestamp(Long realTimestamp) {
        this.realTimestamp = realTimestamp;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EventsTimeLineDto(Long timestamp, Long realTimestamp, String type) {
        this.timestamp = timestamp;
        this.realTimestamp = realTimestamp;
        this.type = type;
    }

}