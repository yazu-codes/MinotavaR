package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParticipantDto {
    @JsonProperty("allInPings")
    private Integer allInPings;

    @JsonProperty("assistMePings")
    private Integer assistMePings;

    @JsonProperty("assists")
    private Integer assists;

    @JsonProperty("baronKills")
    private Integer baronKills;

    @JsonProperty("bountyLevel")
    private Integer bountyLevel;

    @JsonProperty("champExperience")
    private Integer champExperience;

    @JsonProperty("champLevel")
    private Integer champLevel;

    @JsonProperty("championId")
    private Integer championId;

    @JsonProperty("championName")
    private String championName;

    @JsonProperty("commandPings")
    private Integer commandPings;

    @JsonProperty("championTransform")
    private Integer championTransform;

    @JsonProperty("consumablesPurchased")
    private Integer consumablesPurchased;

    @JsonProperty("challenges")
    private ChallengesDto challenges;

    @JsonProperty("damageDealtToBuildings")
    private Integer damageDealtToBuildings;

    @JsonProperty("damageDealtToObjectives")
    private Integer damageDealtToObjectives;

    @JsonProperty("damageDealtToTurrets")
    private Integer damageDealtToTurrets;

    @JsonProperty("damageSelfMitigated")
    private Integer damageSelfMitigated;

    @JsonProperty("deaths")
    private Integer deaths;

    @JsonProperty("detectorWardsPlaced")
    private Integer detectorWardsPlaced;

    @JsonProperty("doubleKills")
    private Integer doubleKills;

    @JsonProperty("dragonKills")
    private Integer dragonKills;

    @JsonProperty("eligibleForProgression")
    private Boolean eligibleForProgression;

    @JsonProperty("enemyMissingPings")
    private Integer enemyMissingPings;

    @JsonProperty("enemyVisionPings")
    private Integer enemyVisionPings;

    @JsonProperty("firstBloodAssist")
    private Boolean firstBloodAssist;

    @JsonProperty("firstBloodKill")
    private Boolean firstBloodKill;

    @JsonProperty("firstTowerAssist")
    private Boolean firstTowerAssist;

    @JsonProperty("firstTowerKill")
    private Boolean firstTowerKill;

    @JsonProperty("gameEndedInEarlySurrender")
    private Boolean gameEndedInEarlySurrender;

    @JsonProperty("gameEndedInSurrender")
    private Boolean gameEndedInSurrender;

    @JsonProperty("holdPings")
    private Integer holdPings;

    @JsonProperty("getBackPings")
    private Integer getBackPings;

    @JsonProperty("goldEarned")
    private Integer goldEarned;

    @JsonProperty("goldSpent")
    private Integer goldSpent;

    @JsonProperty("individualPosition")
    private String individualPosition;

    @JsonProperty("inhibitorKills")
    private Integer inhibitorKills;

    @JsonProperty("inhibitorTakedowns")
    private Integer inhibitorTakedowns;

    @JsonProperty("inhibitorsLost")
    private Integer inhibitorsLost;

    @JsonProperty("item0")
    private Integer item0;

    @JsonProperty("item1")
    private Integer item1;

    @JsonProperty("item2")
    private Integer item2;

    @JsonProperty("item3")
    private Integer item3;

    @JsonProperty("item4")
    private Integer item4;

    @JsonProperty("item5")
    private Integer item5;

    @JsonProperty("item6")
    private Integer item6;

    @JsonProperty("itemsPurchased")
    private Integer itemsPurchased;

    @JsonProperty("killingSprees")
    private Integer killingSprees;

    @JsonProperty("kills")
    private Integer kills;

    @JsonProperty("lane")
    private String lane;

    @JsonProperty("largestCriticalStrike")
    private Integer largestCriticalStrike;

    @JsonProperty("largestKillingSpree")
    private Integer largestKillingSpree;

    @JsonProperty("largestMultiKill")
    private Integer largestMultiKill;

    @JsonProperty("longestTimeSpentLiving")
    private Integer longestTimeSpentLiving;

    @JsonProperty("magicDamageDealt")
    private Integer magicDamageDealt;

    @JsonProperty("magicDamageDealtToChampions")
    private Integer magicDamageDealtToChampions;

    @JsonProperty("magicDamageTaken")
    private Integer magicDamageTaken;

    @JsonProperty("missions")
    private MissionsDto missions;

    @JsonProperty("neutralMinionsKilled")
    private Integer neutralMinionsKilled;

    @JsonProperty("needVisionPings")
    private Integer needVisionPings;

    @JsonProperty("nexusKills")
    private Integer nexusKills;

    @JsonProperty("nexusTakedowns")
    private Integer nexusTakedowns;

    @JsonProperty("nexusLost")
    private Integer nexusLost;

    @JsonProperty("objectivesStolen")
    private Integer objectivesStolen;

    @JsonProperty("objectivesStolenAssists")
    private Integer objectivesStolenAssists;

    @JsonProperty("onMyWayPings")
    private Integer onMyWayPings;

    @JsonProperty("participantId")
    private Integer participantId;

    @JsonProperty("playerScore0")
    private Integer playerScore0;

    @JsonProperty("playerScore1")
    private Integer playerScore1;

    @JsonProperty("playerScore2")
    private Integer playerScore2;

    @JsonProperty("playerScore3")
    private Integer playerScore3;

    @JsonProperty("playerScore4")
    private Integer playerScore4;

    @JsonProperty("playerScore5")
    private Integer playerScore5;

    @JsonProperty("playerScore6")
    private Integer playerScore6;

    @JsonProperty("playerScore7")
    private Integer playerScore7;

    @JsonProperty("playerScore8")
    private Integer playerScore8;

    @JsonProperty("playerScore9")
    private Integer playerScore9;

    @JsonProperty("playerScore10")
    private Integer playerScore10;

    @JsonProperty("playerScore11")
    private Integer playerScore11;

    @JsonProperty("pentaKills")
    private Integer pentaKills;

    @JsonProperty("perks")
    private PerksDto perks;

    @JsonProperty("physicalDamageDealt")
    private Integer physicalDamageDealt;

    @JsonProperty("physicalDamageDealtToChampions")
    private Integer physicalDamageDealtToChampions;

    @JsonProperty("physicalDamageTaken")
    private Integer physicalDamageTaken;

    @JsonProperty("placement")
    private Integer placement;

    @JsonProperty("playerAugment1")
    private Integer playerAugment1;

    @JsonProperty("playerAugment2")
    private Integer playerAugment2;

    @JsonProperty("playerAugment3")
    private Integer playerAugment3;

    @JsonProperty("playerAugment4")
    private Integer playerAugment4;

    @JsonProperty("playerSubteamId")
    private Integer playerSubteamId;

    @JsonProperty("pushPings")
    private Integer pushPings;

    @JsonProperty("profileIcon")
    private Integer profileIcon;

    @JsonProperty("puuid")
    private String puuid;

    @JsonProperty("quadraKills")
    private Integer quadraKills;

    @JsonProperty("riotIdGameName")
    private String riotIdGameName;

    @JsonProperty("riotIdTagline")
    private String riotIdTagline;

    @JsonProperty("role")
    private String role;

    @JsonProperty("sightWardsBoughtInGame")
    private Integer sightWardsBoughtInGame;

    @JsonProperty("spell1Casts")
    private Integer spell1Casts;

    @JsonProperty("spell2Casts")
    private Integer spell2Casts;

    @JsonProperty("spell3Casts")
    private Integer spell3Casts;

    @JsonProperty("spell4Casts")
    private Integer spell4Casts;

    @JsonProperty("subteamPlacement")
    private Integer subteamPlacement;

    @JsonProperty("summoner1Casts")
    private Integer summoner1Casts;

    @JsonProperty("summoner1Id")
    private Integer summoner1Id;

    @JsonProperty("summoner2Casts")
    private Integer summoner2Casts;

    @JsonProperty("summoner2Id")
    private Integer summoner2Id;

    @JsonProperty("summonerId")
    private String summonerId;

    @JsonProperty("summonerLevel")
    private Integer summonerLevel;

    @JsonProperty("summonerName")
    private String summonerName;

    @JsonProperty("teamEarlySurrendered")
    private Boolean teamEarlySurrendered;

    @JsonProperty("teamId")
    private Integer teamId;

    @JsonProperty("teamPosition")
    private String teamPosition;

    @JsonProperty("timeCCingOthers")
    private Integer timeCCingOthers;

    @JsonProperty("timePlayed")
    private Integer timePlayed;

    @JsonProperty("totalAllyJungleMinionsKilled")
    private Integer totalAllyJungleMinionsKilled;

    @JsonProperty("totalDamageDealt")
    private Integer totalDamageDealt;

    @JsonProperty("totalDamageDealtToChampions")
    private Integer totalDamageDealtToChampions;

    @JsonProperty("totalDamageShieldedOnTeammates")
    private Integer totalDamageShieldedOnTeammates;

    @JsonProperty("totalDamageTaken")
    private Integer totalDamageTaken;

    @JsonProperty("totalEnemyJungleMinionsKilled")
    private Integer totalEnemyJungleMinionsKilled;

    @JsonProperty("totalHeal")
    private Integer totalHeal;

    @JsonProperty("totalHealsOnTeammates")
    private Integer totalHealsOnTeammates;

    @JsonProperty("totalMinionsKilled")
    private Integer totalMinionsKilled;

    @JsonProperty("totalTimeCCDealt")
    private Integer totalTimeCCDealt;

    @JsonProperty("totalTimeSpentDead")
    private Integer totalTimeSpentDead;

    @JsonProperty("totalUnitsHealed")
    private Integer totalUnitsHealed;

    @JsonProperty("tripleKills")
    private Integer tripleKills;

    @JsonProperty("trueDamageDealt")
    private Integer trueDamageDealt;

    @JsonProperty("trueDamageDealtToChampions")
    private Integer trueDamageDealtToChampions;

    @JsonProperty("trueDamageTaken")
    private Integer trueDamageTaken;

    @JsonProperty("turretKills")
    private Integer turretKills;

    @JsonProperty("turretTakedowns")
    private Integer turretTakedowns;

    @JsonProperty("turretsLost")
    private Integer turretsLost;

    @JsonProperty("unrealKills")
    private Integer unrealKills;

    @JsonProperty("visionScore")
    private Integer visionScore;

    @JsonProperty("visionClearedPings")
    private Integer visionClearedPings;

    @JsonProperty("visionWardsBoughtInGame")
    private Integer visionWardsBoughtInGame;

    @JsonProperty("wardsKilled")
    private Integer wardsKilled;

    @JsonProperty("wardsPlaced")
    private Integer wardsPlaced;

    @JsonProperty("win")
    private Boolean win;

    public ParticipantDto() {
    }

    public Integer getAllInPings() {
        return this.allInPings;
    }

    public void setAllInPings(Integer allInPings) {
        this.allInPings = allInPings;
    }

    public Integer getAssistMePings() {
        return this.assistMePings;
    }

    public void setAssistMePings(Integer assistMePings) {
        this.assistMePings = assistMePings;
    }

    public Integer getAssists() {
        return this.assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getBaronKills() {
        return this.baronKills;
    }

    public void setBaronKills(Integer baronKills) {
        this.baronKills = baronKills;
    }

    public Integer getBountyLevel() {
        return this.bountyLevel;
    }

    public void setBountyLevel(Integer bountyLevel) {
        this.bountyLevel = bountyLevel;
    }

    public Integer getChampExperience() {
        return this.champExperience;
    }

    public void setChampExperience(Integer champExperience) {
        this.champExperience = champExperience;
    }

    public Integer getChampLevel() {
        return this.champLevel;
    }

    public void setChampLevel(Integer champLevel) {
        this.champLevel = champLevel;
    }

    public Integer getChampionId() {
        return this.championId;
    }

    public void setChampionId(Integer championId) {
        this.championId = championId;
    }

    public String getChampionName() {
        return this.championName;
    }

    public void setChampionName(String championName) {
        this.championName = championName;
    }

    public Integer getCommandPings() {
        return this.commandPings;
    }

    public void setCommandPings(Integer commandPings) {
        this.commandPings = commandPings;
    }

    public Integer getChampionTransform() {
        return this.championTransform;
    }

    public void setChampionTransform(Integer championTransform) {
        this.championTransform = championTransform;
    }

    public Integer getConsumablesPurchased() {
        return this.consumablesPurchased;
    }

    public void setConsumablesPurchased(Integer consumablesPurchased) {
        this.consumablesPurchased = consumablesPurchased;
    }

    public ChallengesDto getChallenges() {
        return this.challenges;
    }

    public void setChallenges(ChallengesDto challenges) {
        this.challenges = challenges;
    }

    public Integer getDamageDealtToBuildings() {
        return this.damageDealtToBuildings;
    }

    public void setDamageDealtToBuildings(Integer damageDealtToBuildings) {
        this.damageDealtToBuildings = damageDealtToBuildings;
    }

    public Integer getDamageDealtToObjectives() {
        return this.damageDealtToObjectives;
    }

    public void setDamageDealtToObjectives(Integer damageDealtToObjectives) {
        this.damageDealtToObjectives = damageDealtToObjectives;
    }

    public Integer getDamageDealtToTurrets() {
        return this.damageDealtToTurrets;
    }

    public void setDamageDealtToTurrets(Integer damageDealtToTurrets) {
        this.damageDealtToTurrets = damageDealtToTurrets;
    }

    public Integer getDamageSelfMitigated() {
        return this.damageSelfMitigated;
    }

    public void setDamageSelfMitigated(Integer damageSelfMitigated) {
        this.damageSelfMitigated = damageSelfMitigated;
    }

    public Integer getDeaths() {
        return this.deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getDetectorWardsPlaced() {
        return this.detectorWardsPlaced;
    }

    public void setDetectorWardsPlaced(Integer detectorWardsPlaced) {
        this.detectorWardsPlaced = detectorWardsPlaced;
    }

    public Integer getDoubleKills() {
        return this.doubleKills;
    }

    public void setDoubleKills(Integer doubleKills) {
        this.doubleKills = doubleKills;
    }

    public Integer getDragonKills() {
        return this.dragonKills;
    }

    public void setDragonKills(Integer dragonKills) {
        this.dragonKills = dragonKills;
    }

    public Boolean isEligibleForProgression() {
        return this.eligibleForProgression;
    }

    public Boolean getEligibleForProgression() {
        return this.eligibleForProgression;
    }

    public void setEligibleForProgression(Boolean eligibleForProgression) {
        this.eligibleForProgression = eligibleForProgression;
    }

    public Integer getEnemyMissingPings() {
        return this.enemyMissingPings;
    }

    public void setEnemyMissingPings(Integer enemyMissingPings) {
        this.enemyMissingPings = enemyMissingPings;
    }

    public Integer getEnemyVisionPings() {
        return this.enemyVisionPings;
    }

    public void setEnemyVisionPings(Integer enemyVisionPings) {
        this.enemyVisionPings = enemyVisionPings;
    }

    public Boolean isFirstBloodAssist() {
        return this.firstBloodAssist;
    }

    public Boolean getFirstBloodAssist() {
        return this.firstBloodAssist;
    }

    public void setFirstBloodAssist(Boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
    }

    public Boolean isFirstBloodKill() {
        return this.firstBloodKill;
    }

    public Boolean getFirstBloodKill() {
        return this.firstBloodKill;
    }

    public void setFirstBloodKill(Boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
    }

    public Boolean isFirstTowerAssist() {
        return this.firstTowerAssist;
    }

    public Boolean getFirstTowerAssist() {
        return this.firstTowerAssist;
    }

    public void setFirstTowerAssist(Boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
    }

    public Boolean isFirstTowerKill() {
        return this.firstTowerKill;
    }

    public Boolean getFirstTowerKill() {
        return this.firstTowerKill;
    }

    public void setFirstTowerKill(Boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
    }

    public Boolean isGameEndedInEarlySurrender() {
        return this.gameEndedInEarlySurrender;
    }

    public Boolean getGameEndedInEarlySurrender() {
        return this.gameEndedInEarlySurrender;
    }

    public void setGameEndedInEarlySurrender(Boolean gameEndedInEarlySurrender) {
        this.gameEndedInEarlySurrender = gameEndedInEarlySurrender;
    }

    public Boolean isGameEndedInSurrender() {
        return this.gameEndedInSurrender;
    }

    public Boolean getGameEndedInSurrender() {
        return this.gameEndedInSurrender;
    }

    public void setGameEndedInSurrender(Boolean gameEndedInSurrender) {
        this.gameEndedInSurrender = gameEndedInSurrender;
    }

    public Integer getHoldPings() {
        return this.holdPings;
    }

    public void setHoldPings(Integer holdPings) {
        this.holdPings = holdPings;
    }

    public Integer getGetBackPings() {
        return this.getBackPings;
    }

    public void setGetBackPings(Integer getBackPings) {
        this.getBackPings = getBackPings;
    }

    public Integer getGoldEarned() {
        return this.goldEarned;
    }

    public void setGoldEarned(Integer goldEarned) {
        this.goldEarned = goldEarned;
    }

    public Integer getGoldSpent() {
        return this.goldSpent;
    }

    public void setGoldSpent(Integer goldSpent) {
        this.goldSpent = goldSpent;
    }

    public String getIndividualPosition() {
        return this.individualPosition;
    }

    public void setIndividualPosition(String individualPosition) {
        this.individualPosition = individualPosition;
    }

    public Integer getInhibitorKills() {
        return this.inhibitorKills;
    }

    public void setInhibitorKills(Integer inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public Integer getInhibitorTakedowns() {
        return this.inhibitorTakedowns;
    }

    public void setInhibitorTakedowns(Integer inhibitorTakedowns) {
        this.inhibitorTakedowns = inhibitorTakedowns;
    }

    public Integer getInhibitorsLost() {
        return this.inhibitorsLost;
    }

    public void setInhibitorsLost(Integer inhibitorsLost) {
        this.inhibitorsLost = inhibitorsLost;
    }

    public Integer getItem0() {
        return this.item0;
    }

    public void setItem0(Integer item0) {
        this.item0 = item0;
    }

    public Integer getItem1() {
        return this.item1;
    }

    public void setItem1(Integer item1) {
        this.item1 = item1;
    }

    public Integer getItem2() {
        return this.item2;
    }

    public void setItem2(Integer item2) {
        this.item2 = item2;
    }

    public Integer getItem3() {
        return this.item3;
    }

    public void setItem3(Integer item3) {
        this.item3 = item3;
    }

    public Integer getItem4() {
        return this.item4;
    }

    public void setItem4(Integer item4) {
        this.item4 = item4;
    }

    public Integer getItem5() {
        return this.item5;
    }

    public void setItem5(Integer item5) {
        this.item5 = item5;
    }

    public Integer getItem6() {
        return this.item6;
    }

    public void setItem6(Integer item6) {
        this.item6 = item6;
    }

    public Integer getItemsPurchased() {
        return this.itemsPurchased;
    }

    public void setItemsPurchased(Integer itemsPurchased) {
        this.itemsPurchased = itemsPurchased;
    }

    public Integer getKillingSprees() {
        return this.killingSprees;
    }

    public void setKillingSprees(Integer killingSprees) {
        this.killingSprees = killingSprees;
    }

    public Integer getKills() {
        return this.kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public String getLane() {
        return this.lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public Integer getLargestCriticalStrike() {
        return this.largestCriticalStrike;
    }

    public void setLargestCriticalStrike(Integer largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    public Integer getLargestKillingSpree() {
        return this.largestKillingSpree;
    }

    public void setLargestKillingSpree(Integer largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    public Integer getLargestMultiKill() {
        return this.largestMultiKill;
    }

    public void setLargestMultiKill(Integer largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    public Integer getLongestTimeSpentLiving() {
        return this.longestTimeSpentLiving;
    }

    public void setLongestTimeSpentLiving(Integer longestTimeSpentLiving) {
        this.longestTimeSpentLiving = longestTimeSpentLiving;
    }

    public Integer getMagicDamageDealt() {
        return this.magicDamageDealt;
    }

    public void setMagicDamageDealt(Integer magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
    }

    public Integer getMagicDamageDealtToChampions() {
        return this.magicDamageDealtToChampions;
    }

    public void setMagicDamageDealtToChampions(Integer magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    public Integer getMagicDamageTaken() {
        return this.magicDamageTaken;
    }

    public void setMagicDamageTaken(Integer magicDamageTaken) {
        this.magicDamageTaken = magicDamageTaken;
    }

    public MissionsDto getMissions() {
        return this.missions;
    }

    public void setMissions(MissionsDto missions) {
        this.missions = missions;
    }

    public Integer getNeutralMinionsKilled() {
        return this.neutralMinionsKilled;
    }

    public void setNeutralMinionsKilled(Integer neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    public Integer getNeedVisionPings() {
        return this.needVisionPings;
    }

    public void setNeedVisionPings(Integer needVisionPings) {
        this.needVisionPings = needVisionPings;
    }

    public Integer getNexusKills() {
        return this.nexusKills;
    }

    public void setNexusKills(Integer nexusKills) {
        this.nexusKills = nexusKills;
    }

    public Integer getNexusTakedowns() {
        return this.nexusTakedowns;
    }

    public void setNexusTakedowns(Integer nexusTakedowns) {
        this.nexusTakedowns = nexusTakedowns;
    }

    public Integer getNexusLost() {
        return this.nexusLost;
    }

    public void setNexusLost(Integer nexusLost) {
        this.nexusLost = nexusLost;
    }

    public Integer getObjectivesStolen() {
        return this.objectivesStolen;
    }

    public void setObjectivesStolen(Integer objectivesStolen) {
        this.objectivesStolen = objectivesStolen;
    }

    public Integer getObjectivesStolenAssists() {
        return this.objectivesStolenAssists;
    }

    public void setObjectivesStolenAssists(Integer objectivesStolenAssists) {
        this.objectivesStolenAssists = objectivesStolenAssists;
    }

    public Integer getOnMyWayPings() {
        return this.onMyWayPings;
    }

    public void setOnMyWayPings(Integer onMyWayPings) {
        this.onMyWayPings = onMyWayPings;
    }

    public Integer getParticipantId() {
        return this.participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    public Integer getPlayerScore0() {
        return this.playerScore0;
    }

    public void setPlayerScore0(Integer playerScore0) {
        this.playerScore0 = playerScore0;
    }

    public Integer getPlayerScore1() {
        return this.playerScore1;
    }

    public void setPlayerScore1(Integer playerScore1) {
        this.playerScore1 = playerScore1;
    }

    public Integer getPlayerScore2() {
        return this.playerScore2;
    }

    public void setPlayerScore2(Integer playerScore2) {
        this.playerScore2 = playerScore2;
    }

    public Integer getPlayerScore3() {
        return this.playerScore3;
    }

    public void setPlayerScore3(Integer playerScore3) {
        this.playerScore3 = playerScore3;
    }

    public Integer getPlayerScore4() {
        return this.playerScore4;
    }

    public void setPlayerScore4(Integer playerScore4) {
        this.playerScore4 = playerScore4;
    }

    public Integer getPlayerScore5() {
        return this.playerScore5;
    }

    public void setPlayerScore5(Integer playerScore5) {
        this.playerScore5 = playerScore5;
    }

    public Integer getPlayerScore6() {
        return this.playerScore6;
    }

    public void setPlayerScore6(Integer playerScore6) {
        this.playerScore6 = playerScore6;
    }

    public Integer getPlayerScore7() {
        return this.playerScore7;
    }

    public void setPlayerScore7(Integer playerScore7) {
        this.playerScore7 = playerScore7;
    }

    public Integer getPlayerScore8() {
        return this.playerScore8;
    }

    public void setPlayerScore8(Integer playerScore8) {
        this.playerScore8 = playerScore8;
    }

    public Integer getPlayerScore9() {
        return this.playerScore9;
    }

    public void setPlayerScore9(Integer playerScore9) {
        this.playerScore9 = playerScore9;
    }

    public Integer getPlayerScore10() {
        return this.playerScore10;
    }

    public void setPlayerScore10(Integer playerScore10) {
        this.playerScore10 = playerScore10;
    }

    public Integer getPlayerScore11() {
        return this.playerScore11;
    }

    public void setPlayerScore11(Integer playerScore11) {
        this.playerScore11 = playerScore11;
    }

    public Integer getPentaKills() {
        return this.pentaKills;
    }

    public void setPentaKills(Integer pentaKills) {
        this.pentaKills = pentaKills;
    }

    public PerksDto getPerks() {
        return this.perks;
    }

    public void setPerks(PerksDto perks) {
        this.perks = perks;
    }

    public Integer getPhysicalDamageDealt() {
        return this.physicalDamageDealt;
    }

    public void setPhysicalDamageDealt(Integer physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
    }

    public Integer getPhysicalDamageDealtToChampions() {
        return this.physicalDamageDealtToChampions;
    }

    public void setPhysicalDamageDealtToChampions(Integer physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    public Integer getPhysicalDamageTaken() {
        return this.physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(Integer physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    public Integer getPlacement() {
        return this.placement;
    }

    public void setPlacement(Integer placement) {
        this.placement = placement;
    }

    public Integer getPlayerAugment1() {
        return this.playerAugment1;
    }

    public void setPlayerAugment1(Integer playerAugment1) {
        this.playerAugment1 = playerAugment1;
    }

    public Integer getPlayerAugment2() {
        return this.playerAugment2;
    }

    public void setPlayerAugment2(Integer playerAugment2) {
        this.playerAugment2 = playerAugment2;
    }

    public Integer getPlayerAugment3() {
        return this.playerAugment3;
    }

    public void setPlayerAugment3(Integer playerAugment3) {
        this.playerAugment3 = playerAugment3;
    }

    public Integer getPlayerAugment4() {
        return this.playerAugment4;
    }

    public void setPlayerAugment4(Integer playerAugment4) {
        this.playerAugment4 = playerAugment4;
    }

    public Integer getPlayerSubteamId() {
        return this.playerSubteamId;
    }

    public void setPlayerSubteamId(Integer playerSubteamId) {
        this.playerSubteamId = playerSubteamId;
    }

    public Integer getPushPings() {
        return this.pushPings;
    }

    public void setPushPings(Integer pushPings) {
        this.pushPings = pushPings;
    }

    public Integer getProfileIcon() {
        return this.profileIcon;
    }

    public void setProfileIcon(Integer profileIcon) {
        this.profileIcon = profileIcon;
    }

    public String getPuuid() {
        return this.puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public Integer getQuadraKills() {
        return this.quadraKills;
    }

    public void setQuadraKills(Integer quadraKills) {
        this.quadraKills = quadraKills;
    }

    public String getRiotIdGameName() {
        return this.riotIdGameName;
    }

    public void setRiotIdGameName(String riotIdGameName) {
        this.riotIdGameName = riotIdGameName;
    }

    public String getRiotIdTagline() {
        return this.riotIdTagline;
    }

    public void setRiotIdTagline(String riotIdTagline) {
        this.riotIdTagline = riotIdTagline;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getSightWardsBoughtInGame() {
        return this.sightWardsBoughtInGame;
    }

    public void setSightWardsBoughtInGame(Integer sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
    }

    public Integer getSpell1Casts() {
        return this.spell1Casts;
    }

    public void setSpell1Casts(Integer spell1Casts) {
        this.spell1Casts = spell1Casts;
    }

    public Integer getSpell2Casts() {
        return this.spell2Casts;
    }

    public void setSpell2Casts(Integer spell2Casts) {
        this.spell2Casts = spell2Casts;
    }

    public Integer getSpell3Casts() {
        return this.spell3Casts;
    }

    public void setSpell3Casts(Integer spell3Casts) {
        this.spell3Casts = spell3Casts;
    }

    public Integer getSpell4Casts() {
        return this.spell4Casts;
    }

    public void setSpell4Casts(Integer spell4Casts) {
        this.spell4Casts = spell4Casts;
    }

    public Integer getSubteamPlacement() {
        return this.subteamPlacement;
    }

    public void setSubteamPlacement(Integer subteamPlacement) {
        this.subteamPlacement = subteamPlacement;
    }

    public Integer getSummoner1Casts() {
        return this.summoner1Casts;
    }

    public void setSummoner1Casts(Integer summoner1Casts) {
        this.summoner1Casts = summoner1Casts;
    }

    public Integer getSummoner1Id() {
        return this.summoner1Id;
    }

    public void setSummoner1Id(Integer summoner1Id) {
        this.summoner1Id = summoner1Id;
    }

    public Integer getSummoner2Casts() {
        return this.summoner2Casts;
    }

    public void setSummoner2Casts(Integer summoner2Casts) {
        this.summoner2Casts = summoner2Casts;
    }

    public Integer getSummoner2Id() {
        return this.summoner2Id;
    }

    public void setSummoner2Id(Integer summoner2Id) {
        this.summoner2Id = summoner2Id;
    }

    public String getSummonerId() {
        return this.summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public Integer getSummonerLevel() {
        return this.summonerLevel;
    }

    public void setSummonerLevel(Integer summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public String getSummonerName() {
        return this.summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public Boolean isTeamEarlySurrendered() {
        return this.teamEarlySurrendered;
    }

    public Boolean getTeamEarlySurrendered() {
        return this.teamEarlySurrendered;
    }

    public void setTeamEarlySurrendered(Boolean teamEarlySurrendered) {
        this.teamEarlySurrendered = teamEarlySurrendered;
    }

    public Integer getTeamId() {
        return this.teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamPosition() {
        return this.teamPosition;
    }

    public void setTeamPosition(String teamPosition) {
        this.teamPosition = teamPosition;
    }

    public Integer getTimeCCingOthers() {
        return this.timeCCingOthers;
    }

    public void setTimeCCingOthers(Integer timeCCingOthers) {
        this.timeCCingOthers = timeCCingOthers;
    }

    public Integer getTimePlayed() {
        return this.timePlayed;
    }

    public void setTimePlayed(Integer timePlayed) {
        this.timePlayed = timePlayed;
    }

    public Integer getTotalAllyJungleMinionsKilled() {
        return this.totalAllyJungleMinionsKilled;
    }

    public void setTotalAllyJungleMinionsKilled(Integer totalAllyJungleMinionsKilled) {
        this.totalAllyJungleMinionsKilled = totalAllyJungleMinionsKilled;
    }

    public Integer getTotalDamageDealt() {
        return this.totalDamageDealt;
    }

    public void setTotalDamageDealt(Integer totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    public Integer getTotalDamageDealtToChampions() {
        return this.totalDamageDealtToChampions;
    }

    public void setTotalDamageDealtToChampions(Integer totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    public Integer getTotalDamageShieldedOnTeammates() {
        return this.totalDamageShieldedOnTeammates;
    }

    public void setTotalDamageShieldedOnTeammates(Integer totalDamageShieldedOnTeammates) {
        this.totalDamageShieldedOnTeammates = totalDamageShieldedOnTeammates;
    }

    public Integer getTotalDamageTaken() {
        return this.totalDamageTaken;
    }

    public void setTotalDamageTaken(Integer totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public Integer getTotalEnemyJungleMinionsKilled() {
        return this.totalEnemyJungleMinionsKilled;
    }

    public void setTotalEnemyJungleMinionsKilled(Integer totalEnemyJungleMinionsKilled) {
        this.totalEnemyJungleMinionsKilled = totalEnemyJungleMinionsKilled;
    }

    public Integer getTotalHeal() {
        return this.totalHeal;
    }

    public void setTotalHeal(Integer totalHeal) {
        this.totalHeal = totalHeal;
    }

    public Integer getTotalHealsOnTeammates() {
        return this.totalHealsOnTeammates;
    }

    public void setTotalHealsOnTeammates(Integer totalHealsOnTeammates) {
        this.totalHealsOnTeammates = totalHealsOnTeammates;
    }

    public Integer getTotalMinionsKilled() {
        return this.totalMinionsKilled;
    }

    public void setTotalMinionsKilled(Integer totalMinionsKilled) {
        this.totalMinionsKilled = totalMinionsKilled;
    }

    public Integer getTotalTimeCCDealt() {
        return this.totalTimeCCDealt;
    }

    public void setTotalTimeCCDealt(Integer totalTimeCCDealt) {
        this.totalTimeCCDealt = totalTimeCCDealt;
    }

    public Integer getTotalTimeSpentDead() {
        return this.totalTimeSpentDead;
    }

    public void setTotalTimeSpentDead(Integer totalTimeSpentDead) {
        this.totalTimeSpentDead = totalTimeSpentDead;
    }

    public Integer getTotalUnitsHealed() {
        return this.totalUnitsHealed;
    }

    public void setTotalUnitsHealed(Integer totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    public Integer getTripleKills() {
        return this.tripleKills;
    }

    public void setTripleKills(Integer tripleKills) {
        this.tripleKills = tripleKills;
    }

    public Integer getTrueDamageDealt() {
        return this.trueDamageDealt;
    }

    public void setTrueDamageDealt(Integer trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
    }

    public Integer getTrueDamageDealtToChampions() {
        return this.trueDamageDealtToChampions;
    }

    public void setTrueDamageDealtToChampions(Integer trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    public Integer getTrueDamageTaken() {
        return this.trueDamageTaken;
    }

    public void setTrueDamageTaken(Integer trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    public Integer getTurretKills() {
        return this.turretKills;
    }

    public void setTurretKills(Integer turretKills) {
        this.turretKills = turretKills;
    }

    public Integer getTurretTakedowns() {
        return this.turretTakedowns;
    }

    public void setTurretTakedowns(Integer turretTakedowns) {
        this.turretTakedowns = turretTakedowns;
    }

    public Integer getTurretsLost() {
        return this.turretsLost;
    }

    public void setTurretsLost(Integer turretsLost) {
        this.turretsLost = turretsLost;
    }

    public Integer getUnrealKills() {
        return this.unrealKills;
    }

    public void setUnrealKills(Integer unrealKills) {
        this.unrealKills = unrealKills;
    }

    public Integer getVisionScore() {
        return this.visionScore;
    }

    public void setVisionScore(Integer visionScore) {
        this.visionScore = visionScore;
    }

    public Integer getVisionClearedPings() {
        return this.visionClearedPings;
    }

    public void setVisionClearedPings(Integer visionClearedPings) {
        this.visionClearedPings = visionClearedPings;
    }

    public Integer getVisionWardsBoughtInGame() {
        return this.visionWardsBoughtInGame;
    }

    public void setVisionWardsBoughtInGame(Integer visionWardsBoughtInGame) {
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
    }

    public Integer getWardsKilled() {
        return this.wardsKilled;
    }

    public void setWardsKilled(Integer wardsKilled) {
        this.wardsKilled = wardsKilled;
    }

    public Integer getWardsPlaced() {
        return this.wardsPlaced;
    }

    public void setWardsPlaced(Integer wardsPlaced) {
        this.wardsPlaced = wardsPlaced;
    }

    public Boolean isWin() {
        return this.win;
    }

    public Boolean getWin() {
        return this.win;
    }

    public void setWin(Boolean win) {
        this.win = win;
    }

    public ParticipantDto(Integer allInPings, Integer assistMePings, Integer assists, Integer baronKills,
            Integer bountyLevel, Integer champExperience, Integer champLevel, Integer championId, String championName,
            Integer commandPings, Integer championTransform, Integer consumablesPurchased, ChallengesDto challenges,
            Integer damageDealtToBuildings, Integer damageDealtToObjectives, Integer damageDealtToTurrets,
            Integer damageSelfMitigated, Integer deaths, Integer detectorWardsPlaced, Integer doubleKills,
            Integer dragonKills, Boolean eligibleForProgression, Integer enemyMissingPings, Integer enemyVisionPings,
            Boolean firstBloodAssist, Boolean firstBloodKill, Boolean firstTowerAssist, Boolean firstTowerKill,
            Boolean gameEndedInEarlySurrender, Boolean gameEndedInSurrender, Integer holdPings, Integer getBackPings,
            Integer goldEarned, Integer goldSpent, String individualPosition, Integer inhibitorKills,
            Integer inhibitorTakedowns, Integer inhibitorsLost, Integer item0, Integer item1, Integer item2,
            Integer item3, Integer item4, Integer item5, Integer item6, Integer itemsPurchased, Integer killingSprees,
            Integer kills, String lane, Integer largestCriticalStrike, Integer largestKillingSpree,
            Integer largestMultiKill, Integer longestTimeSpentLiving, Integer magicDamageDealt,
            Integer magicDamageDealtToChampions, Integer magicDamageTaken, MissionsDto missions,
            Integer neutralMinionsKilled, Integer needVisionPings, Integer nexusKills, Integer nexusTakedowns,
            Integer nexusLost, Integer objectivesStolen, Integer objectivesStolenAssists, Integer onMyWayPings,
            Integer participantId, Integer playerScore0, Integer playerScore1, Integer playerScore2,
            Integer playerScore3, Integer playerScore4, Integer playerScore5, Integer playerScore6,
            Integer playerScore7, Integer playerScore8, Integer playerScore9, Integer playerScore10,
            Integer playerScore11, Integer pentaKills, PerksDto perks, Integer physicalDamageDealt,
            Integer physicalDamageDealtToChampions, Integer physicalDamageTaken, Integer placement,
            Integer playerAugment1, Integer playerAugment2, Integer playerAugment3, Integer playerAugment4,
            Integer playerSubteamId, Integer pushPings, Integer profileIcon, String puuid, Integer quadraKills,
            String riotIdGameName, String riotIdTagline, String role, Integer sightWardsBoughtInGame,
            Integer spell1Casts, Integer spell2Casts, Integer spell3Casts, Integer spell4Casts,
            Integer subteamPlacement, Integer summoner1Casts, Integer summoner1Id, Integer summoner2Casts,
            Integer summoner2Id, String summonerId, Integer summonerLevel, String summonerName,
            Boolean teamEarlySurrendered, Integer teamId, String teamPosition, Integer timeCCingOthers,
            Integer timePlayed, Integer totalAllyJungleMinionsKilled, Integer totalDamageDealt,
            Integer totalDamageDealtToChampions, Integer totalDamageShieldedOnTeammates, Integer totalDamageTaken,
            Integer totalEnemyJungleMinionsKilled, Integer totalHeal, Integer totalHealsOnTeammates,
            Integer totalMinionsKilled, Integer totalTimeCCDealt, Integer totalTimeSpentDead, Integer totalUnitsHealed,
            Integer tripleKills, Integer trueDamageDealt, Integer trueDamageDealtToChampions, Integer trueDamageTaken,
            Integer turretKills, Integer turretTakedowns, Integer turretsLost, Integer unrealKills, Integer visionScore,
            Integer visionClearedPings, Integer visionWardsBoughtInGame, Integer wardsKilled, Integer wardsPlaced,
            Boolean win) {
        this.allInPings = allInPings;
        this.assistMePings = assistMePings;
        this.assists = assists;
        this.baronKills = baronKills;
        this.bountyLevel = bountyLevel;
        this.champExperience = champExperience;
        this.champLevel = champLevel;
        this.championId = championId;
        this.championName = championName;
        this.commandPings = commandPings;
        this.championTransform = championTransform;
        this.consumablesPurchased = consumablesPurchased;
        this.challenges = challenges;
        this.damageDealtToBuildings = damageDealtToBuildings;
        this.damageDealtToObjectives = damageDealtToObjectives;
        this.damageDealtToTurrets = damageDealtToTurrets;
        this.damageSelfMitigated = damageSelfMitigated;
        this.deaths = deaths;
        this.detectorWardsPlaced = detectorWardsPlaced;
        this.doubleKills = doubleKills;
        this.dragonKills = dragonKills;
        this.eligibleForProgression = eligibleForProgression;
        this.enemyMissingPings = enemyMissingPings;
        this.enemyVisionPings = enemyVisionPings;
        this.firstBloodAssist = firstBloodAssist;
        this.firstBloodKill = firstBloodKill;
        this.firstTowerAssist = firstTowerAssist;
        this.firstTowerKill = firstTowerKill;
        this.gameEndedInEarlySurrender = gameEndedInEarlySurrender;
        this.gameEndedInSurrender = gameEndedInSurrender;
        this.holdPings = holdPings;
        this.getBackPings = getBackPings;
        this.goldEarned = goldEarned;
        this.goldSpent = goldSpent;
        this.individualPosition = individualPosition;
        this.inhibitorKills = inhibitorKills;
        this.inhibitorTakedowns = inhibitorTakedowns;
        this.inhibitorsLost = inhibitorsLost;
        this.item0 = item0;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
        this.item6 = item6;
        this.itemsPurchased = itemsPurchased;
        this.killingSprees = killingSprees;
        this.kills = kills;
        this.lane = lane;
        this.largestCriticalStrike = largestCriticalStrike;
        this.largestKillingSpree = largestKillingSpree;
        this.largestMultiKill = largestMultiKill;
        this.longestTimeSpentLiving = longestTimeSpentLiving;
        this.magicDamageDealt = magicDamageDealt;
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
        this.magicDamageTaken = magicDamageTaken;
        this.missions = missions;
        this.neutralMinionsKilled = neutralMinionsKilled;
        this.needVisionPings = needVisionPings;
        this.nexusKills = nexusKills;
        this.nexusTakedowns = nexusTakedowns;
        this.nexusLost = nexusLost;
        this.objectivesStolen = objectivesStolen;
        this.objectivesStolenAssists = objectivesStolenAssists;
        this.onMyWayPings = onMyWayPings;
        this.participantId = participantId;
        this.playerScore0 = playerScore0;
        this.playerScore1 = playerScore1;
        this.playerScore2 = playerScore2;
        this.playerScore3 = playerScore3;
        this.playerScore4 = playerScore4;
        this.playerScore5 = playerScore5;
        this.playerScore6 = playerScore6;
        this.playerScore7 = playerScore7;
        this.playerScore8 = playerScore8;
        this.playerScore9 = playerScore9;
        this.playerScore10 = playerScore10;
        this.playerScore11 = playerScore11;
        this.pentaKills = pentaKills;
        this.perks = perks;
        this.physicalDamageDealt = physicalDamageDealt;
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
        this.physicalDamageTaken = physicalDamageTaken;
        this.placement = placement;
        this.playerAugment1 = playerAugment1;
        this.playerAugment2 = playerAugment2;
        this.playerAugment3 = playerAugment3;
        this.playerAugment4 = playerAugment4;
        this.playerSubteamId = playerSubteamId;
        this.pushPings = pushPings;
        this.profileIcon = profileIcon;
        this.puuid = puuid;
        this.quadraKills = quadraKills;
        this.riotIdGameName = riotIdGameName;
        this.riotIdTagline = riotIdTagline;
        this.role = role;
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
        this.spell1Casts = spell1Casts;
        this.spell2Casts = spell2Casts;
        this.spell3Casts = spell3Casts;
        this.spell4Casts = spell4Casts;
        this.subteamPlacement = subteamPlacement;
        this.summoner1Casts = summoner1Casts;
        this.summoner1Id = summoner1Id;
        this.summoner2Casts = summoner2Casts;
        this.summoner2Id = summoner2Id;
        this.summonerId = summonerId;
        this.summonerLevel = summonerLevel;
        this.summonerName = summonerName;
        this.teamEarlySurrendered = teamEarlySurrendered;
        this.teamId = teamId;
        this.teamPosition = teamPosition;
        this.timeCCingOthers = timeCCingOthers;
        this.timePlayed = timePlayed;
        this.totalAllyJungleMinionsKilled = totalAllyJungleMinionsKilled;
        this.totalDamageDealt = totalDamageDealt;
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
        this.totalDamageShieldedOnTeammates = totalDamageShieldedOnTeammates;
        this.totalDamageTaken = totalDamageTaken;
        this.totalEnemyJungleMinionsKilled = totalEnemyJungleMinionsKilled;
        this.totalHeal = totalHeal;
        this.totalHealsOnTeammates = totalHealsOnTeammates;
        this.totalMinionsKilled = totalMinionsKilled;
        this.totalTimeCCDealt = totalTimeCCDealt;
        this.totalTimeSpentDead = totalTimeSpentDead;
        this.totalUnitsHealed = totalUnitsHealed;
        this.tripleKills = tripleKills;
        this.trueDamageDealt = trueDamageDealt;
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
        this.trueDamageTaken = trueDamageTaken;
        this.turretKills = turretKills;
        this.turretTakedowns = turretTakedowns;
        this.turretsLost = turretsLost;
        this.unrealKills = unrealKills;
        this.visionScore = visionScore;
        this.visionClearedPings = visionClearedPings;
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
        this.wardsKilled = wardsKilled;
        this.wardsPlaced = wardsPlaced;
        this.win = win;
    }

}
