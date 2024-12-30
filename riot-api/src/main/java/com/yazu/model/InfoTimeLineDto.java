package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoTimeLineDto {

    @JsonProperty("endOfGameResult")
    private String endOfGameResult;

    @JsonProperty("frameInterval")
    private Long frameInterval;

    @JsonProperty("gameId")
    private Long gameId;

    @JsonProperty("participants")
    private List<ParticipantTimeLineDto> participants;

    @JsonProperty("frames")
    private List<FramesTimeLineDto> frames;

    public InfoTimeLineDto() {
    }

    public String getEndOfGameResult() {
        return this.endOfGameResult;
    }

    public void setEndOfGameResult(String endOfGameResult) {
        this.endOfGameResult = endOfGameResult;
    }

    public Long getFrameInterval() {
        return this.frameInterval;
    }

    public void setFrameInterval(Long frameInterval) {
        this.frameInterval = frameInterval;
    }

    public Long getGameId() {
        return this.gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public List<ParticipantTimeLineDto> getParticipants() {
        return this.participants;
    }

    public void setParticipants(List<ParticipantTimeLineDto> participants) {
        this.participants = participants;
    }

    public List<FramesTimeLineDto> getFrames() {
        return this.frames;
    }

    public void setFrames(List<FramesTimeLineDto> frames) {
        this.frames = frames;
    }

    public InfoTimeLineDto(String endOfGameResult, Long frameInterval, Long gameId,
            List<ParticipantTimeLineDto> participants, List<FramesTimeLineDto> frames) {
        this.endOfGameResult = endOfGameResult;
        this.frameInterval = frameInterval;
        this.gameId = gameId;
        this.participants = participants;
        this.frames = frames;
    }

}
