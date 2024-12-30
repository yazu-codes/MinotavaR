package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateDto {

    @JsonProperty("id")
    private Integer Id;

    @JsonProperty("author")
    private String Author;

    @JsonProperty("publish")
    private Boolean Publish;

    @JsonProperty("publish_locations")
    private List<String> PublishLocations;

    @JsonProperty("translations")
    private List<ContentDto> Translations;

    @JsonProperty("created_at")
    private String CreatedAt;

    @JsonProperty("updated_at")
    private String UpdatedAt;

    public UpdateDto() {
    }

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getAuthor() {
        return this.Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public Boolean isPublish() {
        return this.Publish;
    }

    public Boolean getPublish() {
        return this.Publish;
    }

    public void setPublish(Boolean Publish) {
        this.Publish = Publish;
    }

    public List<String> getPublishLocations() {
        return this.PublishLocations;
    }

    public void setPublishLocations(List<String> PublishLocations) {
        this.PublishLocations = PublishLocations;
    }

    public List<ContentDto> getTranslations() {
        return this.Translations;
    }

    public void setTranslations(List<ContentDto> Translations) {
        this.Translations = Translations;
    }

    public String getCreatedAt() {
        return this.CreatedAt;
    }

    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public UpdateDto(Integer Id, String Author, Boolean Publish, List<String> PublishLocations,
            List<ContentDto> Translations, String CreatedAt, String UpdatedAt) {
        this.Id = Id;
        this.Author = Author;
        this.Publish = Publish;
        this.PublishLocations = PublishLocations;
        this.Translations = Translations;
        this.CreatedAt = CreatedAt;
        this.UpdatedAt = UpdatedAt;
    }

}
