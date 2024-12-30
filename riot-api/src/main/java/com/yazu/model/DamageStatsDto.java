package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DamageStatsDto {
    @JsonProperty("magicDamageDone")
    private Integer magicDamageDone;

    @JsonProperty("magicDamageDoneToChampions")
    private Integer magicDamageDoneToChampions;

    @JsonProperty("magicDamageTaken")
    private Integer magicDamageTaken;

    @JsonProperty("physicalDamageDone")
    private Integer physicalDamageDone;

    @JsonProperty("physicalDamageDoneToChampions")
    private Integer physicalDamageDoneToChampions;

    @JsonProperty("physicalDamageTaken")
    private Integer physicalDamageTaken;

    @JsonProperty("totalDamageDone")
    private Integer totalDamageDone;

    @JsonProperty("totalDamageDoneToChampions")
    private Integer totalDamageDoneToChampions;

    @JsonProperty("totalDamageTaken")
    private Integer totalDamageTaken;

    @JsonProperty("trueDamageDone")
    private Integer trueDamageDone;

    @JsonProperty("trueDamageDoneToChampions")
    private Integer trueDamageDoneToChampions;

    @JsonProperty("trueDamageTaken")
    private Integer trueDamageTaken;

    public DamageStatsDto() {
    }

    public Integer getMagicDamageDone() {
        return this.magicDamageDone;
    }

    public void setMagicDamageDone(Integer magicDamageDone) {
        this.magicDamageDone = magicDamageDone;
    }

    public Integer getMagicDamageDoneToChampions() {
        return this.magicDamageDoneToChampions;
    }

    public void setMagicDamageDoneToChampions(Integer magicDamageDoneToChampions) {
        this.magicDamageDoneToChampions = magicDamageDoneToChampions;
    }

    public Integer getMagicDamageTaken() {
        return this.magicDamageTaken;
    }

    public void setMagicDamageTaken(Integer magicDamageTaken) {
        this.magicDamageTaken = magicDamageTaken;
    }

    public Integer getPhysicalDamageDone() {
        return this.physicalDamageDone;
    }

    public void setPhysicalDamageDone(Integer physicalDamageDone) {
        this.physicalDamageDone = physicalDamageDone;
    }

    public Integer getPhysicalDamageDoneToChampions() {
        return this.physicalDamageDoneToChampions;
    }

    public void setPhysicalDamageDoneToChampions(Integer physicalDamageDoneToChampions) {
        this.physicalDamageDoneToChampions = physicalDamageDoneToChampions;
    }

    public Integer getPhysicalDamageTaken() {
        return this.physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(Integer physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    public Integer getTotalDamageDone() {
        return this.totalDamageDone;
    }

    public void setTotalDamageDone(Integer totalDamageDone) {
        this.totalDamageDone = totalDamageDone;
    }

    public Integer getTotalDamageDoneToChampions() {
        return this.totalDamageDoneToChampions;
    }

    public void setTotalDamageDoneToChampions(Integer totalDamageDoneToChampions) {
        this.totalDamageDoneToChampions = totalDamageDoneToChampions;
    }

    public Integer getTotalDamageTaken() {
        return this.totalDamageTaken;
    }

    public void setTotalDamageTaken(Integer totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public Integer getTrueDamageDone() {
        return this.trueDamageDone;
    }

    public void setTrueDamageDone(Integer trueDamageDone) {
        this.trueDamageDone = trueDamageDone;
    }

    public Integer getTrueDamageDoneToChampions() {
        return this.trueDamageDoneToChampions;
    }

    public void setTrueDamageDoneToChampions(Integer trueDamageDoneToChampions) {
        this.trueDamageDoneToChampions = trueDamageDoneToChampions;
    }

    public Integer getTrueDamageTaken() {
        return this.trueDamageTaken;
    }

    public void setTrueDamageTaken(Integer trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    public DamageStatsDto(Integer magicDamageDone, Integer magicDamageDoneToChampions, Integer magicDamageTaken,
            Integer physicalDamageDone, Integer physicalDamageDoneToChampions, Integer physicalDamageTaken,
            Integer totalDamageDone, Integer totalDamageDoneToChampions, Integer totalDamageTaken,
            Integer trueDamageDone, Integer trueDamageDoneToChampions, Integer trueDamageTaken) {
        this.magicDamageDone = magicDamageDone;
        this.magicDamageDoneToChampions = magicDamageDoneToChampions;
        this.magicDamageTaken = magicDamageTaken;
        this.physicalDamageDone = physicalDamageDone;
        this.physicalDamageDoneToChampions = physicalDamageDoneToChampions;
        this.physicalDamageTaken = physicalDamageTaken;
        this.totalDamageDone = totalDamageDone;
        this.totalDamageDoneToChampions = totalDamageDoneToChampions;
        this.totalDamageTaken = totalDamageTaken;
        this.trueDamageDone = trueDamageDone;
        this.trueDamageDoneToChampions = trueDamageDoneToChampions;
        this.trueDamageTaken = trueDamageTaken;
    }

}