package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerkStyleSelectionDto {
    @JsonProperty("perk")
    private Integer perk;

    @JsonProperty("var1")
    private Integer var1;

    @JsonProperty("var2")
    private Integer var2;

    @JsonProperty("var3")
    private Integer var3;

    public PerkStyleSelectionDto() {
    }

    public Integer getPerk() {
        return this.perk;
    }

    public void setPerk(Integer perk) {
        this.perk = perk;
    }

    public Integer getVar1() {
        return this.var1;
    }

    public void setVar1(Integer var1) {
        this.var1 = var1;
    }

    public Integer getVar2() {
        return this.var2;
    }

    public void setVar2(Integer var2) {
        this.var2 = var2;
    }

    public Integer getVar3() {
        return this.var3;
    }

    public void setVar3(Integer var3) {
        this.var3 = var3;
    }

    public PerkStyleSelectionDto(Integer perk, Integer var1, Integer var2, Integer var3) {
        this.perk = perk;
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

}
