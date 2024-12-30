package com.yazu.constants;

public final class Region {
    private String value;

    public Region(String region) {
        this.value = region;
    }

    public static Region AMERICAS() {
        return new Region(AMERICAS);
    }

    public static Region ASIA() {
        return new Region(ASIA);
    }

    public static Region EUROPE() {
        return new Region(EUROPE);
    }

    public static Region SEA() {
        return new Region(SEA);
    }

    private static final String AMERICAS = "americas.api.riotgames.com";
    private static final String ASIA = "asia.api.riotgames.com";
    private static final String EUROPE = "europe.api.riotgames.com";
    private static final String SEA = "sea.api.riotgames.com";

    @Override
    public String toString() {
        return this.value;
    }
}
