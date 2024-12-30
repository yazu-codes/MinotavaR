package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObjectivesDto {
    @JsonProperty("baron")
    private ObjectiveDto baron;

    @JsonProperty("champion")
    private ObjectiveDto champion;

    @JsonProperty("dragon")
    private ObjectiveDto dragon;

    @JsonProperty("horde")
    private ObjectiveDto horde;

    @JsonProperty("inhibitor")
    private ObjectiveDto inhibitor;

    @JsonProperty("riftHerald")
    private ObjectiveDto riftHerald;

    @JsonProperty("tower")
    private ObjectiveDto tower;

    public ObjectivesDto() {
    }

    public ObjectiveDto getBaron() {
        return this.baron;
    }

    public void setBaron(ObjectiveDto baron) {
        this.baron = baron;
    }

    public ObjectiveDto getChampion() {
        return this.champion;
    }

    public void setChampion(ObjectiveDto champion) {
        this.champion = champion;
    }

    public ObjectiveDto getDragon() {
        return this.dragon;
    }

    public void setDragon(ObjectiveDto dragon) {
        this.dragon = dragon;
    }

    public ObjectiveDto getHorde() {
        return this.horde;
    }

    public void setHorde(ObjectiveDto horde) {
        this.horde = horde;
    }

    public ObjectiveDto getInhibitor() {
        return this.inhibitor;
    }

    public void setInhibitor(ObjectiveDto inhibitor) {
        this.inhibitor = inhibitor;
    }

    public ObjectiveDto getRiftHerald() {
        return this.riftHerald;
    }

    public void setRiftHerald(ObjectiveDto riftHerald) {
        this.riftHerald = riftHerald;
    }

    public ObjectiveDto getTower() {
        return this.tower;
    }

    public void setTower(ObjectiveDto tower) {
        this.tower = tower;
    }

    public ObjectivesDto(ObjectiveDto baron, ObjectiveDto champion, ObjectiveDto dragon, ObjectiveDto horde,
            ObjectiveDto inhibitor, ObjectiveDto riftHerald, ObjectiveDto tower) {
        this.baron = baron;
        this.champion = champion;
        this.dragon = dragon;
        this.horde = horde;
        this.inhibitor = inhibitor;
        this.riftHerald = riftHerald;
        this.tower = tower;
    }

}
