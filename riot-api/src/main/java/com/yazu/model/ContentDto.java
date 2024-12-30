package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContentDto {
    @JsonProperty("locale")
    private String Locale;
    @JsonProperty("content")
    private String Content;

    public ContentDto() {
    }

    public String getLocale() {
        return this.Locale;
    }

    public void setLocale(String Locale) {
        this.Locale = Locale;
    }

    public String getContent() {
        return this.Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public ContentDto(String Locale, String Content) {
        this.Locale = Locale;
        this.Content = Content;
    }

}
