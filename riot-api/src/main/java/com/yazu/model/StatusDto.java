package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatusDto {
    @JsonProperty("id")
    private Integer Id;
    @JsonProperty("maintenance_status")
    private String MaintenanceStatus;
    @JsonProperty("incident_severity")
    private String IncidentSeverity;
    @JsonProperty("titles")
    private List<ContentDto> Titles;
    @JsonProperty("updates")
    private List<UpdateDto> Updates;
    @JsonProperty("created_at")
    private String CreatedAt;
    @JsonProperty("archive_at")
    private String ArchiveAt;
    @JsonProperty("updated_at")
    private String UpdatedAt;
    @JsonProperty("platforms")
    private List<String> Platforms;

    public StatusDto() {
    }

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getMaintenanceStatus() {
        return this.MaintenanceStatus;
    }

    public void setMaintenanceStatus(String MaintenanceStatus) {
        this.MaintenanceStatus = MaintenanceStatus;
    }

    public String getIncidentSeverity() {
        return this.IncidentSeverity;
    }

    public void setIncidentSeverity(String IncidentSeverity) {
        this.IncidentSeverity = IncidentSeverity;
    }

    public List<ContentDto> getTitles() {
        return this.Titles;
    }

    public void setTitles(List<ContentDto> Titles) {
        this.Titles = Titles;
    }

    public List<UpdateDto> getUpdates() {
        return this.Updates;
    }

    public void setUpdates(List<UpdateDto> Updates) {
        this.Updates = Updates;
    }

    public String getCreatedAt() {
        return this.CreatedAt;
    }

    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public String getArchiveAt() {
        return this.ArchiveAt;
    }

    public void setArchiveAt(String ArchiveAt) {
        this.ArchiveAt = ArchiveAt;
    }

    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public List<String> getPlatforms() {
        return this.Platforms;
    }

    public void setPlatforms(List<String> Platforms) {
        this.Platforms = Platforms;
    }

    public StatusDto(Integer Id, String MaintenanceStatus, String IncidentSeverity, List<ContentDto> Titles,
            List<UpdateDto> Updates, String CreatedAt, String ArchiveAt, String UpdatedAt, List<String> Platforms) {
        this.Id = Id;
        this.MaintenanceStatus = MaintenanceStatus;
        this.IncidentSeverity = IncidentSeverity;
        this.Titles = Titles;
        this.Updates = Updates;
        this.CreatedAt = CreatedAt;
        this.ArchiveAt = ArchiveAt;
        this.UpdatedAt = UpdatedAt;
        this.Platforms = Platforms;
    }

}
