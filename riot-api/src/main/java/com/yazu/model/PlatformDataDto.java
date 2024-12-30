package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlatformDataDto {
    @JsonProperty("id")
    private String Id;

    @JsonProperty("name")
    private String Name;

    @JsonProperty("locales")
    private List<String> Locales;

    @JsonProperty("maintenances")
    private List<StatusDto> Maintenances;

    @JsonProperty("incidents")
    private List<StatusDto> Incidents;

    public PlatformDataDto() {
    }

    public String getId() {
        return this.Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public List<String> getLocales() {
        return this.Locales;
    }

    public void setLocales(List<String> Locales) {
        this.Locales = Locales;
    }

    public List<StatusDto> getMaintenances() {
        return this.Maintenances;
    }

    public void setMaintenances(List<StatusDto> Maintenances) {
        this.Maintenances = Maintenances;
    }

    public List<StatusDto> getIncidents() {
        return this.Incidents;
    }

    public void setIncidents(List<StatusDto> Incidents) {
        this.Incidents = Incidents;
    }

    public PlatformDataDto(String Id, String Name, List<String> Locales, List<StatusDto> Maintenances,
            List<StatusDto> Incidents) {
        this.Id = Id;
        this.Name = Name;
        this.Locales = Locales;
        this.Maintenances = Maintenances;
        this.Incidents = Incidents;
    }

}
