package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerksDto {
    @JsonProperty("statPerks")
    private PerkStatsDto statPerks;

    @JsonProperty("statPerks")
    private List<PerkStyleDto> styles;

    public PerksDto() {
    }

    public PerkStatsDto getStatPerks() {
        return this.statPerks;
    }

    public void setStatPerks(PerkStatsDto statPerks) {
        this.statPerks = statPerks;
    }

    public List<PerkStyleDto> getStyles() {
        return this.styles;
    }

    public void setStyles(List<PerkStyleDto> styles) {
        this.styles = styles;
    }

    public PerksDto(PerkStatsDto statPerks, List<PerkStyleDto> styles) {
        this.statPerks = statPerks;
        this.styles = styles;
    }

}
