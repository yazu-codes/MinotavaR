package com.yazu.constants;

public class Platform {
    private String value;

    public Platform(String Platform) {
        this.value = Platform.toString();
    }

    public static Platform BR1() {
        return new Platform(BR1);
    }

    public static Platform EUN1() {
        return new Platform(EUN1);
    }

    public static Platform EUW1() {
        return new Platform(EUW1);
    }

    public static Platform JP1() {
        return new Platform(JP1);
    }

    public static Platform KR() {
        return new Platform(KR);
    }

    public static Platform LA1() {
        return new Platform(LA1);
    }

    public static Platform LA2() {
        return new Platform(LA2);
    }

    public static Platform NA1() {
        return new Platform(NA1);
    }

    public static Platform OC1() {
        return new Platform(OC1);
    }

    public static Platform TR1() {
        return new Platform(TR1);
    }

    public static Platform RU() {
        return new Platform(RU);
    }

    public static Platform PH2() {
        return new Platform(PH2);
    }

    public static Platform SG2() {
        return new Platform(SG2);
    }

    public static Platform TH2() {
        return new Platform(TH2);
    }

    public static Platform TW2() {
        return new Platform(TW2);
    }

    public static Platform VN2() {
        return new Platform(VN2);
    }

    private static final String BR1 = "br1.api.riotgames.com";
    private static final String EUN1 = "eun1.api.riotgames.com";
    private static final String EUW1 = "euw1.api.riotgames.com";
    private static final String JP1 = "jp1.api.riotgames.com";
    private static final String KR = "kr.api.riotgames.com";
    private static final String LA1 = "la1.api.riotgames.com";
    private static final String LA2 = "la2.api.riotgames.com";
    private static final String NA1 = "na1.api.riotgames.com";
    private static final String OC1 = "oc1.api.riotgames.com";
    private static final String TR1 = "tr1.api.riotgames.com";
    private static final String RU = "ru.api.riotgames.com";
    private static final String PH2 = "ph2.api.riotgames.com";
    private static final String SG2 = "sg2.api.riotgames.com";
    private static final String TH2 = "th2.api.riotgames.com";
    private static final String TW2 = "tw2.api.riotgames.com";
    private static final String VN2 = "vn2.api.riotgames.com";

    @Override
    public String toString() {
        return this.value;
    }
}
