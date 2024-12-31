package com.yazu.endpoint.championmasteryv4;

public class ChampionMastery {
    public static String GetAll(String puuid) {
        return "/lol/champion-mastery/v4/champion-masteries/by-puuid/" + puuid;
    }

    public static String GetOne(String puuid, String championId) {
        return "/lol/champion-mastery/v4/champion-masteries/by-puuid/" + puuid + "/by-champion/" + championId;
    }

    public static String GetTop(String puuid) {
        return "/lol/champion-mastery/v4/champion-masteries/by-puuid/{encryptedPUUID}/top" + puuid;
    }

    public static String GetTop(String puuid, int count) {
        return "/lol/champion-mastery/v4/champion-masteries/by-puuid/{encryptedPUUID}/top" + puuid + "?count=" + count;
    }

    public static String Scores(String puuid) {
        return "/lol/champion-mastery/v4/scores/by-puuid/{encryptedPUUID}" + puuid;
    }
}
