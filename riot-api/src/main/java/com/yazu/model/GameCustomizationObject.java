package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameCustomizationObject {
    @JsonProperty("category")
    private String category;

    @JsonProperty("content")
    private String content;

    public GameCustomizationObject() {
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public GameCustomizationObject(String category, String content) {
        this.category = category;
        this.content = content;
    }

}
