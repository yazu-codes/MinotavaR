package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerkStyleDto {
    @JsonProperty("description")
    private String description;

    @JsonProperty("selections")
    private List<PerkStyleSelectionDto> selections;

    @JsonProperty("style")
    private Integer style;

    public PerkStyleDto() {
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PerkStyleSelectionDto> getSelections() {
        return this.selections;
    }

    public void setSelections(List<PerkStyleSelectionDto> selections) {
        this.selections = selections;
    }

    public Integer getStyle() {
        return this.style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public PerkStyleDto(String description, List<PerkStyleSelectionDto> selections, Integer style) {
        this.description = description;
        this.selections = selections;
        this.style = style;
    }

}
