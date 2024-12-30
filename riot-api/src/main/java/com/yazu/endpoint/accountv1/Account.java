package com.yazu.endpoint.accountv1;

public class Account {
    public static String ByPuuid(String puuid) {
        return "/riot/account/v1/accounts/by-puuid/" + puuid;
    }

    public static String ByGameNameAndTagLine(String gameName, String tagLine) {
        return "/riot/account/v1/accounts/by-riot-id/" + gameName + "/" + tagLine;
    }

    public static String ActiveShards(String game, String puuid) {
        return "/riot/account/v1/active-shards/by-game/" + game + " /by-puuid/" + puuid;
    }

    public static String Me() {
        return "/riot/account/v1/accounts/me";
    }
}
