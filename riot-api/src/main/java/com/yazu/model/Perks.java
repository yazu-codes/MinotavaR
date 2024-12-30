package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Perks {
    @JsonProperty("perkIds")
    private List<Long> perkIds;

    @JsonProperty("perkStyle")
    private Long perkStyle;

    @JsonProperty("perkSubStyle")
    private Long perkSubStyle;

    public Perks() {
    }

    public List<Long> getPerkIds() {
        return this.perkIds;
    }

    public void setPerkIds(List<Long> perkIds) {
        this.perkIds = perkIds;
    }

    public Long getPerkStyle() {
        return this.perkStyle;
    }

    public void setPerkStyle(Long perkStyle) {
        this.perkStyle = perkStyle;
    }

    public Long getPerkSubStyle() {
        return this.perkSubStyle;
    }

    public void setPerkSubStyle(Long perkSubStyle) {
        this.perkSubStyle = perkSubStyle;
    }

    public Perks(List<Long> perkIds, Long perkStyle, Long perkSubStyle) {
        this.perkIds = perkIds;
        this.perkStyle = perkStyle;
        this.perkSubStyle = perkSubStyle;
    }

}