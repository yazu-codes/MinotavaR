package com.yazu.builder;

import com.yazu.constants.Platform;
import com.yazu.constants.Region;

public class RiotRequest {
    private String http = "http://";
    private String base;
    private String endPoint;
    private String apiKey;

    private StringBuilder builder = new StringBuilder();

    public RiotRequest(Region region) {
        this.base = region.toString();
        this.endPoint = "";
        this.apiKey = "";
    }

    public RiotRequest(Platform platform) {
        this.base = platform.toString();
        this.endPoint = "";
        this.apiKey = "";
    }

    public RiotRequest Secure() {
        this.http = "https://";
        return this;
    }

    public RiotRequest Get(String endPoint) {
        this.endPoint = endPoint;
        return this;
    }

    public RiotRequest WithKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    private String withKeyString() {
        return "?api_key=" + this.apiKey;
    }

    public String Build() {
        builder
                .append(http)
                .append(base)
                .append(endPoint)
                .toString();

        if (this.apiKey.length() > 0) {
            builder.append(withKeyString());
        }

        return builder.toString();
    }
}
