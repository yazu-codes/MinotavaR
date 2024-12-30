package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimelineDto {

    @JsonProperty("metadata")
    private MetadataTimeLineDto metadata;

    @JsonProperty("info")
    private InfoTimeLineDto info;

    public TimelineDto() {
    }

    public MetadataTimeLineDto getMetadata() {
        return this.metadata;
    }

    public void setMetadata(MetadataTimeLineDto metadata) {
        this.metadata = metadata;
    }

    public InfoTimeLineDto getInfo() {
        return this.info;
    }

    public void setInfo(InfoTimeLineDto info) {
        this.info = info;
    }

    public TimelineDto(MetadataTimeLineDto metadata, InfoTimeLineDto info) {
        this.metadata = metadata;
        this.info = info;
    }

}
