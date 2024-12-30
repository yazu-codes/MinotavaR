package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PositionDto {
    @JsonProperty("x")
    private Integer x;

    @JsonProperty("y")
    private Integer y;

    public PositionDto() {
    }

    public Integer getX() {
        return this.x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return this.y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public PositionDto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

}