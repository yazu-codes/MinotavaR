package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchDto {
    @JsonProperty("metadata")
    private MetadataDto Metadata;

    @JsonProperty("info")
    private InfoDto Info;

    public MatchDto() {
    }

    public MetadataDto getMetadata() {
        return this.Metadata;
    }

    public void setMetadata(MetadataDto Metadata) {
        this.Metadata = Metadata;
    }

    public InfoDto getInfo() {
        return this.Info;
    }

    public void setInfo(InfoDto Info) {
        this.Info = Info;
    }

    public MatchDto(MetadataDto Metadata, InfoDto Info) {
        this.Metadata = Metadata;
        this.Info = Info;
    }

}
