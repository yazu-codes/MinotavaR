package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoDto {
    @JsonProperty("endOfGameResult")
    private String EndOfGameResult;
    @JsonProperty("gameCreation")
    private Long GameCreation;
    @JsonProperty("gameDuration")
    private Long GameDuration;
    @JsonProperty("gameStartTimestamp")
    private Long GameStartTimestamp;
    @JsonProperty("gameEndTimestamp")
    private Long GameEndTimestamp;
    @JsonProperty("gameId")
    private Long GameId;
    @JsonProperty("gameMode")
    private String GameMode;
    @JsonProperty("gameName")
    private String GameName;
    @JsonProperty("gameType")
    private String GameType;
    @JsonProperty("gameVersion")
    private String GameVersion;
    @JsonProperty("platformId")
    private String PlatformId;
    @JsonProperty("tournamentCode")
    private String TournamentCode;
    @JsonProperty("mapId")
    private Integer MapId;
    @JsonProperty("queueId")
    private Integer QueueId;
    @JsonProperty("participants")
    private List<ParticipantDto> Participants;
    @JsonProperty("teams")
    private List<TeamDto> Teams;

    public InfoDto() {
    }

    public String getEndOfGameResult() {
        return this.EndOfGameResult;
    }

    public void setEndOfGameResult(String EndOfGameResult) {
        this.EndOfGameResult = EndOfGameResult;
    }

    public Long getGameCreation() {
        return this.GameCreation;
    }

    public void setGameCreation(Long GameCreation) {
        this.GameCreation = GameCreation;
    }

    public Long getGameDuration() {
        return this.GameDuration;
    }

    public void setGameDuration(Long GameDuration) {
        this.GameDuration = GameDuration;
    }

    public Long getGameStartTimestamp() {
        return this.GameStartTimestamp;
    }

    public void setGameStartTimestamp(Long GameStartTimestamp) {
        this.GameStartTimestamp = GameStartTimestamp;
    }

    public Long getGameEndTimestamp() {
        return this.GameEndTimestamp;
    }

    public void setGameEndTimestamp(Long GameEndTimestamp) {
        this.GameEndTimestamp = GameEndTimestamp;
    }

    public Long getGameId() {
        return this.GameId;
    }

    public void setGameId(Long GameId) {
        this.GameId = GameId;
    }

    public String getGameMode() {
        return this.GameMode;
    }

    public void setGameMode(String GameMode) {
        this.GameMode = GameMode;
    }

    public String getGameName() {
        return this.GameName;
    }

    public void setGameName(String GameName) {
        this.GameName = GameName;
    }

    public String getGameType() {
        return this.GameType;
    }

    public void setGameType(String GameType) {
        this.GameType = GameType;
    }

    public String getGameVersion() {
        return this.GameVersion;
    }

    public void setGameVersion(String GameVersion) {
        this.GameVersion = GameVersion;
    }

    public String getPlatformId() {
        return this.PlatformId;
    }

    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    public String getTournamentCode() {
        return this.TournamentCode;
    }

    public void setTournamentCode(String TournamentCode) {
        this.TournamentCode = TournamentCode;
    }

    public Integer getMapId() {
        return this.MapId;
    }

    public void setMapId(Integer MapId) {
        this.MapId = MapId;
    }

    public Integer getQueueId() {
        return this.QueueId;
    }

    public void setQueueId(Integer QueueId) {
        this.QueueId = QueueId;
    }

    public List<ParticipantDto> getParticipants() {
        return this.Participants;
    }

    public void setParticipants(List<ParticipantDto> Participants) {
        this.Participants = Participants;
    }

    public List<TeamDto> getTeams() {
        return this.Teams;
    }

    public void setTeams(List<TeamDto> Teams) {
        this.Teams = Teams;
    }

    public InfoDto(String EndOfGameResult, Long GameCreation, Long GameDuration, Long GameStartTimestamp,
            Long GameEndTimestamp, Long GameId, String GameMode, String GameName, String GameType, String GameVersion,
            String PlatformId, String TournamentCode, Integer MapId, Integer QueueId, List<ParticipantDto> Participants,
            List<TeamDto> Teams) {
        this.EndOfGameResult = EndOfGameResult;
        this.GameCreation = GameCreation;
        this.GameDuration = GameDuration;
        this.GameStartTimestamp = GameStartTimestamp;
        this.GameEndTimestamp = GameEndTimestamp;
        this.GameId = GameId;
        this.GameMode = GameMode;
        this.GameName = GameName;
        this.GameType = GameType;
        this.GameVersion = GameVersion;
        this.PlatformId = PlatformId;
        this.TournamentCode = TournamentCode;
        this.MapId = MapId;
        this.QueueId = QueueId;
        this.Participants = Participants;
        this.Teams = Teams;
    }

}
