package com.yazu.builder;

import com.yazu.constants.Platform;
import com.yazu.constants.Region;

public class RiotRequest {
    private String http = "http://";
    private String base;
    private String endPoint;

    private StringBuilder builder = new StringBuilder();

    public RiotRequest(Region region) {
        this.base = region.toString();
    }

    public RiotRequest(Platform platform) {
        this.base = platform.toString();
    }

    public RiotRequest Secure() {
        this.http = "https://";
        return this;
    }

    public RiotRequest Get(String e) {
        this.endPoint = e;
        return this;
    }

    public String Build() {
        return builder
                .append(http)
                .append(base)
                .append(endPoint)
                .toString();
    }
}
