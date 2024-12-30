package com.yazu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChallengesDto {
    @JsonProperty("12AssistStreakCount")
    private Integer assistStreakCount;

    @JsonProperty("baronBuffGoldAdvantageOverThreshold")
    private Integer baronBuffGoldAdvantageOverThreshold;

    @JsonProperty("controlWardTimeCoverageInRiverOrEnemyHalf")
    private Float controlWardTimeCoverageInRiverOrEnemyHalf;

    @JsonProperty("earliestBaron")
    private Integer earliestBaron;

    @JsonProperty("earliestDragonTakedown")
    private Integer earliestDragonTakedown;

    @JsonProperty("earliestElderDragon")
    private Integer earliestElderDragon;

    @JsonProperty("earlyLaningPhaseGoldExpAdvantage")
    private Integer earlyLaningPhaseGoldExpAdvantage;

    @JsonProperty("fasterSupportQuestCompletion")
    private Integer fasterSupportQuestCompletion;

    @JsonProperty("fastestLegendary")
    private Integer fastestLegendary;

    @JsonProperty("hadAfkTeammate")
    private Integer hadAfkTeammate;

    @JsonProperty("highestChampionDamage")
    private Integer highestChampionDamage;

    @JsonProperty("highestCrowdControlScore")
    private Integer highestCrowdControlScore;

    @JsonProperty("highestWardKills")
    private Integer highestWardKills;

    @JsonProperty("junglerKillsEarlyJungle")
    private Integer junglerKillsEarlyJungle;

    @JsonProperty("killsOnLanersEarlyJungleAsJungler")
    private Integer killsOnLanersEarlyJungleAsJungler;

    @JsonProperty("laningPhaseGoldExpAdvantage")
    private Integer laningPhaseGoldExpAdvantage;

    @JsonProperty("legendaryCount")
    private Integer legendaryCount;

    @JsonProperty("maxCsAdvantageOnLaneOpponent")
    private Float maxCsAdvantageOnLaneOpponent;

    @JsonProperty("maxLevelLeadLaneOpponent")
    private Integer maxLevelLeadLaneOpponent;

    @JsonProperty("mostWardsDestroyedOneSweeper")
    private Integer mostWardsDestroyedOneSweeper;

    @JsonProperty("mythicItemUsed")
    private Integer mythicItemUsed;

    @JsonProperty("playedChampSelectPosition")
    private Integer playedChampSelectPosition;

    @JsonProperty("soloTurretsLategame")
    private Integer soloTurretsLategame;

    @JsonProperty("takedownsFirst25Minutes")
    private Integer takedownsFirst25Minutes;

    @JsonProperty("teleportTakedowns")
    private Integer teleportTakedowns;

    @JsonProperty("thirdInhibitorDestroyedTime")
    private Integer thirdInhibitorDestroyedTime;

    @JsonProperty("threeWardsOneSweeperCount")
    private Integer threeWardsOneSweeperCount;

    @JsonProperty("visionScoreAdvantageLaneOpponent")
    private Float visionScoreAdvantageLaneOpponent;

    @JsonProperty("InfernalScalePickup")
    private Integer infernalScalePickup;

    @JsonProperty("fistBumpParticipation")
    private Integer fistBumpParticipation;

    @JsonProperty("voidMonsterKill")
    private Integer voidMonsterKill;

    @JsonProperty("abilityUses")
    private Integer abilityUses;

    @JsonProperty("acesBefore15Minutes")
    private Integer acesBefore15Minutes;

    @JsonProperty("alliedJungleMonsterKills")
    private Float alliedJungleMonsterKills;

    @JsonProperty("baronTakedowns")
    private Integer baronTakedowns;

    @JsonProperty("blastConeOppositeOpponentCount")
    private Integer blastConeOppositeOpponentCount;

    @JsonProperty("bountyGold")
    private Integer bountyGold;

    @JsonProperty("buffsStolen")
    private Integer buffsStolen;

    @JsonProperty("completeSupportQuestInTime")
    private Integer completeSupportQuestInTime;

    @JsonProperty("controlWardsPlaced")
    private Integer controlWardsPlaced;

    @JsonProperty("damagePerMinute")
    private Float damagePerMinute;

    @JsonProperty("damageTakenOnTeamPercentage")
    private Float damageTakenOnTeamPercentage;

    @JsonProperty("dancedWithRiftHerald")
    private Integer dancedWithRiftHerald;

    @JsonProperty("deathsByEnemyChamps")
    private Integer deathsByEnemyChamps;

    @JsonProperty("dodgeSkillShotsSmallWindow")
    private Integer dodgeSkillShotsSmallWindow;

    @JsonProperty("doubleAces")
    private Integer doubleAces;

    @JsonProperty("dragonTakedowns")
    private Integer dragonTakedowns;

    @JsonProperty("legendaryItemUsed")
    private List<Integer> legendaryItemUsed;

    @JsonProperty("effectiveHealAndShielding")
    private Float effectiveHealAndShielding;

    @JsonProperty("elderDragonKillsWithOpposingSoul")
    private Integer elderDragonKillsWithOpposingSoul;

    @JsonProperty("elderDragonMultikills")
    private Integer elderDragonMultikills;

    @JsonProperty("enemyChampionImmobilizations")
    private Integer enemyChampionImmobilizations;

    @JsonProperty("enemyJungleMonsterKills")
    private Float enemyJungleMonsterKills;

    @JsonProperty("epicMonsterKillsNearEnemyJungler")
    private Integer epicMonsterKillsNearEnemyJungler;

    @JsonProperty("epicMonsterKillsWithin30SecondsOfSpawn")
    private Integer epicMonsterKillsWithin30SecondsOfSpawn;

    @JsonProperty("epicMonsterSteals")
    private Integer epicMonsterSteals;

    @JsonProperty("epicMonsterStolenWithoutSmite")
    private Integer epicMonsterStolenWithoutSmite;

    @JsonProperty("firstTurretKilled")
    private Integer firstTurretKilled;

    @JsonProperty("firstTurretKilledTime")
    private Float firstTurretKilledTime;

    @JsonProperty("flawlessAces")
    private Integer flawlessAces;

    @JsonProperty("fullTeamTakedown")
    private Integer fullTeamTakedown;

    @JsonProperty("gameLength")
    private Float gameLength;

    @JsonProperty("getTakedownsInAllLanesEarlyJungleAsLaner")
    private Integer getTakedownsInAllLanesEarlyJungleAsLaner;

    @JsonProperty("goldPerMinute")
    private Float goldPerMinute;

    @JsonProperty("hadOpenNexus")
    private Integer hadOpenNexus;

    @JsonProperty("immobilizeAndKillWithAlly")
    private Integer immobilizeAndKillWithAlly;

    @JsonProperty("initialBuffCount")
    private Integer initialBuffCount;

    @JsonProperty("initialCrabCount")
    private Integer initialCrabCount;

    @JsonProperty("jungleCsBefore10Minutes")
    private Float jungleCsBefore10Minutes;

    @JsonProperty("junglerTakedownsNearDamagedEpicMonster")
    private Integer junglerTakedownsNearDamagedEpicMonster;

    @JsonProperty("kda")
    private Float kda;

    @JsonProperty("killAfterHiddenWithAlly")
    private Integer killAfterHiddenWithAlly;

    @JsonProperty("killedChampTookFullTeamDamageSurvived")
    private Integer killedChampTookFullTeamDamageSurvived;

    @JsonProperty("killingSprees")
    private Integer killingSprees;

    @JsonProperty("killParticipation")
    private Float killParticipation;

    @JsonProperty("killsNearEnemyTurret")
    private Integer killsNearEnemyTurret;

    @JsonProperty("killsOnOtherLanesEarlyJungleAsLaner")
    private Integer killsOnOtherLanesEarlyJungleAsLaner;

    @JsonProperty("killsOnRecentlyHealedByAramPack")
    private Integer killsOnRecentlyHealedByAramPack;

    @JsonProperty("killsUnderOwnTurret")
    private Integer killsUnderOwnTurret;

    @JsonProperty("killsWithHelpFromEpicMonster")
    private Integer killsWithHelpFromEpicMonster;

    @JsonProperty("knockEnemyIntoTeamAndKill")
    private Integer knockEnemyIntoTeamAndKill;

    @JsonProperty("kTurretsDestroyedBeforePlatesFall")
    private Integer kTurretsDestroyedBeforePlatesFall;

    @JsonProperty("landSkillShotsEarlyGame")
    private Integer landSkillShotsEarlyGame;

    @JsonProperty("laneMinionsFirst10Minutes")
    private Integer laneMinionsFirst10Minutes;

    @JsonProperty("lostAnInhibitor")
    private Integer lostAnInhibitor;

    @JsonProperty("maxKillDeficit")
    private Integer maxKillDeficit;

    @JsonProperty("mejaisFullStackInTime")
    private Integer mejaisFullStackInTime;

    @JsonProperty("moreEnemyJungleThanOpponent")
    private Float moreEnemyJungleThanOpponent;

    @JsonProperty("multiKillOneSpell")
    private Integer multiKillOneSpell;

    @JsonProperty("multikills")
    private Integer multikills;

    @JsonProperty("multikillsAfterAggressiveFlash")
    private Integer multikillsAfterAggressiveFlash;

    @JsonProperty("multiTurretRiftHeraldCount")
    private Integer multiTurretRiftHeraldCount;

    @JsonProperty("outerTurretExecutesBefore10Minutes")
    private Integer outerTurretExecutesBefore10Minutes;

    @JsonProperty("outnumberedKills")
    private Integer outnumberedKills;

    @JsonProperty("outnumberedNexusKill")
    private Integer outnumberedNexusKill;

    @JsonProperty("perfectDragonSoulsTaken")
    private Integer perfectDragonSoulsTaken;

    @JsonProperty("perfectGame")
    private Integer perfectGame;

    @JsonProperty("pickKillWithAlly")
    private Integer pickKillWithAlly;

    @JsonProperty("poroExplosions")
    private Integer poroExplosions;

    @JsonProperty("quickCleanse")
    private Integer quickCleanse;

    @JsonProperty("quickFirstTurret")
    private Integer quickFirstTurret;

    @JsonProperty("quickSoloKills")
    private Integer quickSoloKills;

    @JsonProperty("riftHeraldTakedowns")
    private Integer riftHeraldTakedowns;

    @JsonProperty("saveAllyFromDeath")
    private Integer saveAllyFromDeath;

    @JsonProperty("scuttleCrabKills")
    private Integer scuttleCrabKills;

    @JsonProperty("shortestTimeToAceFromFirstTakedown")
    private Float shortestTimeToAceFromFirstTakedown;

    @JsonProperty("skillshotsDodged")
    private Integer skillshotsDodged;

    @JsonProperty("skillshotsHit")
    private Integer skillshotsHit;

    @JsonProperty("snowballsHit")
    private Integer snowballsHit;

    @JsonProperty("soloBaronKills")
    private Integer soloBaronKills;

    @JsonProperty("SWARM_DefeatAatrox")
    private Integer swarmDefeatAatrox;

    @JsonProperty("SWARM_DefeatBriar")
    private Integer swarmDefeatBriar;

    @JsonProperty("SWARM_DefeatMiniBosses")
    private Integer swarmDefeatMiniBosses;

    @JsonProperty("SWARM_EvolveWeapon")
    private Integer swarmEvolveWeapon;

    @JsonProperty("SWARM_Have3Passives")
    private Integer swarmHave3Passives;

    @JsonProperty("SWARM_KillEnemy")
    private Integer swarmKillEnemy;

    @JsonProperty("SWARM_PickupGold")
    private Float swarmPickupGold;

    @JsonProperty("SWARM_ReachLevel50")
    private Integer swarmReachLevel50;

    @JsonProperty("SWARM_Survive15Min")
    private Integer swarmSurvive15Min;

    @JsonProperty("SWARM_WinWith5EvolvedWeapons")
    private Integer swarmWinWith5EvolvedWeapons;

    @JsonProperty("soloKills")
    private Integer soloKills;

    @JsonProperty("stealthWardsPlaced")
    private Integer stealthWardsPlaced;

    @JsonProperty("survivedSingleDigitHpCount")
    private Integer survivedSingleDigitHpCount;

    @JsonProperty("survivedThreeImmobilizesInFight")
    private Integer survivedThreeImmobilizesInFight;

    @JsonProperty("takedownOnFirstTurret")
    private Integer takedownOnFirstTurret;

    @JsonProperty("takedowns")
    private Integer takedowns;

    @JsonProperty("takedownsAfterGainingLevelAdvantage")
    private Integer takedownsAfterGainingLevelAdvantage;

    @JsonProperty("takedownsBeforeJungleMinionSpawn")
    private Integer takedownsBeforeJungleMinionSpawn;

    @JsonProperty("takedownsFirstXMinutes")
    private Integer takedownsFirstXMinutes;

    @JsonProperty("takedownsInAlcove")
    private Integer takedownsInAlcove;

    @JsonProperty("takedownsInEnemyFountain")
    private Integer takedownsInEnemyFountain;

    @JsonProperty("teamBaronKills")
    private Integer teamBaronKills;

    @JsonProperty("teamDamagePercentage")
    private Float teamDamagePercentage;

    @JsonProperty("teamElderDragonKills")
    private Integer teamElderDragonKills;

    @JsonProperty("teamRiftHeraldKills")
    private Integer teamRiftHeraldKills;

    @JsonProperty("tookLargeDamageSurvived")
    private Integer tookLargeDamageSurvived;

    @JsonProperty("turretPlatesTaken")
    private Integer turretPlatesTaken;

    @JsonProperty("turretsTakenWithRiftHerald")
    private Integer turretsTakenWithRiftHerald;

    @JsonProperty("turretTakedowns")
    private Integer turretTakedowns;

    @JsonProperty("twentyMinionsIn3SecondsCount")
    private Integer twentyMinionsIn3SecondsCount;

    @JsonProperty("twoWardsOneSweeperCount")
    private Integer twoWardsOneSweeperCount;

    @JsonProperty("unseenRecalls")
    private Integer unseenRecalls;

    @JsonProperty("visionScorePerMinute")
    private Float visionScorePerMinute;

    @JsonProperty("wardsGuarded")
    private Integer wardsGuarded;

    @JsonProperty("wardTakedowns")
    private Integer wardTakedowns;

    @JsonProperty("wardTakedownsBefore20M")
    private Integer wardTakedownsBefore20M;

    public ChallengesDto(Integer assistStreakCount, Integer baronBuffGoldAdvantageOverThreshold,
            Float controlWardTimeCoverageInRiverOrEnemyHalf, Integer earliestBaron, Integer earliestDragonTakedown,
            Integer earliestElderDragon, Integer earlyLaningPhaseGoldExpAdvantage, Integer fasterSupportQuestCompletion,
            Integer fastestLegendary, Integer hadAfkTeammate, Integer highestChampionDamage,
            Integer highestCrowdControlScore, Integer highestWardKills, Integer junglerKillsEarlyJungle,
            Integer killsOnLanersEarlyJungleAsJungler, Integer laningPhaseGoldExpAdvantage, Integer legendaryCount,
            Float maxCsAdvantageOnLaneOpponent, Integer maxLevelLeadLaneOpponent, Integer mostWardsDestroyedOneSweeper,
            Integer mythicItemUsed, Integer playedChampSelectPosition, Integer soloTurretsLategame,
            Integer takedownsFirst25Minutes, Integer teleportTakedowns, Integer thirdInhibitorDestroyedTime,
            Integer threeWardsOneSweeperCount, Float visionScoreAdvantageLaneOpponent, Integer infernalScalePickup,
            Integer fistBumpParticipation, Integer voidMonsterKill, Integer abilityUses, Integer acesBefore15Minutes,
            Float alliedJungleMonsterKills, Integer baronTakedowns, Integer blastConeOppositeOpponentCount,
            Integer bountyGold, Integer buffsStolen, Integer completeSupportQuestInTime, Integer controlWardsPlaced,
            Float damagePerMinute, Float damageTakenOnTeamPercentage, Integer dancedWithRiftHerald,
            Integer deathsByEnemyChamps, Integer dodgeSkillShotsSmallWindow, Integer doubleAces,
            Integer dragonTakedowns, List<Integer> legendaryItemUsed, Float effectiveHealAndShielding,
            Integer elderDragonKillsWithOpposingSoul, Integer elderDragonMultikills,
            Integer enemyChampionImmobilizations, Float enemyJungleMonsterKills,
            Integer epicMonsterKillsNearEnemyJungler, Integer epicMonsterKillsWithin30SecondsOfSpawn,
            Integer epicMonsterSteals, Integer epicMonsterStolenWithoutSmite, Integer firstTurretKilled,
            Float firstTurretKilledTime, Integer flawlessAces, Integer fullTeamTakedown, Float gameLength,
            Integer getTakedownsInAllLanesEarlyJungleAsLaner, Float goldPerMinute, Integer hadOpenNexus,
            Integer immobilizeAndKillWithAlly, Integer initialBuffCount, Integer initialCrabCount,
            Float jungleCsBefore10Minutes, Integer junglerTakedownsNearDamagedEpicMonster, Float kda,
            Integer killAfterHiddenWithAlly, Integer killedChampTookFullTeamDamageSurvived, Integer killingSprees,
            Float killParticipation, Integer killsNearEnemyTurret, Integer killsOnOtherLanesEarlyJungleAsLaner,
            Integer killsOnRecentlyHealedByAramPack, Integer killsUnderOwnTurret, Integer killsWithHelpFromEpicMonster,
            Integer knockEnemyIntoTeamAndKill, Integer kTurretsDestroyedBeforePlatesFall,
            Integer landSkillShotsEarlyGame, Integer laneMinionsFirst10Minutes, Integer lostAnInhibitor,
            Integer maxKillDeficit, Integer mejaisFullStackInTime, Float moreEnemyJungleThanOpponent,
            Integer multiKillOneSpell, Integer multikills, Integer multikillsAfterAggressiveFlash,
            Integer multiTurretRiftHeraldCount, Integer outerTurretExecutesBefore10Minutes, Integer outnumberedKills,
            Integer outnumberedNexusKill, Integer perfectDragonSoulsTaken, Integer perfectGame,
            Integer pickKillWithAlly, Integer poroExplosions, Integer quickCleanse, Integer quickFirstTurret,
            Integer quickSoloKills, Integer riftHeraldTakedowns, Integer saveAllyFromDeath, Integer scuttleCrabKills,
            Float shortestTimeToAceFromFirstTakedown, Integer skillshotsDodged, Integer skillshotsHit,
            Integer snowballsHit, Integer soloBaronKills, Integer swarmDefeatAatrox, Integer swarmDefeatBriar,
            Integer swarmDefeatMiniBosses, Integer swarmEvolveWeapon, Integer swarmHave3Passives,
            Integer swarmKillEnemy, Float swarmPickupGold, Integer swarmReachLevel50, Integer swarmSurvive15Min,
            Integer swarmWinWith5EvolvedWeapons, Integer soloKills, Integer stealthWardsPlaced,
            Integer survivedSingleDigitHpCount, Integer survivedThreeImmobilizesInFight, Integer takedownOnFirstTurret,
            Integer takedowns, Integer takedownsAfterGainingLevelAdvantage, Integer takedownsBeforeJungleMinionSpawn,
            Integer takedownsFirstXMinutes, Integer takedownsInAlcove, Integer takedownsInEnemyFountain,
            Integer teamBaronKills, Float teamDamagePercentage, Integer teamElderDragonKills,
            Integer teamRiftHeraldKills, Integer tookLargeDamageSurvived, Integer turretPlatesTaken,
            Integer turretsTakenWithRiftHerald, Integer turretTakedowns, Integer twentyMinionsIn3SecondsCount,
            Integer twoWardsOneSweeperCount, Integer unseenRecalls, Float visionScorePerMinute, Integer wardsGuarded,
            Integer wardTakedowns, Integer wardTakedownsBefore20M) {
        this.assistStreakCount = assistStreakCount;
        this.baronBuffGoldAdvantageOverThreshold = baronBuffGoldAdvantageOverThreshold;
        this.controlWardTimeCoverageInRiverOrEnemyHalf = controlWardTimeCoverageInRiverOrEnemyHalf;
        this.earliestBaron = earliestBaron;
        this.earliestDragonTakedown = earliestDragonTakedown;
        this.earliestElderDragon = earliestElderDragon;
        this.earlyLaningPhaseGoldExpAdvantage = earlyLaningPhaseGoldExpAdvantage;
        this.fasterSupportQuestCompletion = fasterSupportQuestCompletion;
        this.fastestLegendary = fastestLegendary;
        this.hadAfkTeammate = hadAfkTeammate;
        this.highestChampionDamage = highestChampionDamage;
        this.highestCrowdControlScore = highestCrowdControlScore;
        this.highestWardKills = highestWardKills;
        this.junglerKillsEarlyJungle = junglerKillsEarlyJungle;
        this.killsOnLanersEarlyJungleAsJungler = killsOnLanersEarlyJungleAsJungler;
        this.laningPhaseGoldExpAdvantage = laningPhaseGoldExpAdvantage;
        this.legendaryCount = legendaryCount;
        this.maxCsAdvantageOnLaneOpponent = maxCsAdvantageOnLaneOpponent;
        this.maxLevelLeadLaneOpponent = maxLevelLeadLaneOpponent;
        this.mostWardsDestroyedOneSweeper = mostWardsDestroyedOneSweeper;
        this.mythicItemUsed = mythicItemUsed;
        this.playedChampSelectPosition = playedChampSelectPosition;
        this.soloTurretsLategame = soloTurretsLategame;
        this.takedownsFirst25Minutes = takedownsFirst25Minutes;
        this.teleportTakedowns = teleportTakedowns;
        this.thirdInhibitorDestroyedTime = thirdInhibitorDestroyedTime;
        this.threeWardsOneSweeperCount = threeWardsOneSweeperCount;
        this.visionScoreAdvantageLaneOpponent = visionScoreAdvantageLaneOpponent;
        this.infernalScalePickup = infernalScalePickup;
        this.fistBumpParticipation = fistBumpParticipation;
        this.voidMonsterKill = voidMonsterKill;
        this.abilityUses = abilityUses;
        this.acesBefore15Minutes = acesBefore15Minutes;
        this.alliedJungleMonsterKills = alliedJungleMonsterKills;
        this.baronTakedowns = baronTakedowns;
        this.blastConeOppositeOpponentCount = blastConeOppositeOpponentCount;
        this.bountyGold = bountyGold;
        this.buffsStolen = buffsStolen;
        this.completeSupportQuestInTime = completeSupportQuestInTime;
        this.controlWardsPlaced = controlWardsPlaced;
        this.damagePerMinute = damagePerMinute;
        this.damageTakenOnTeamPercentage = damageTakenOnTeamPercentage;
        this.dancedWithRiftHerald = dancedWithRiftHerald;
        this.deathsByEnemyChamps = deathsByEnemyChamps;
        this.dodgeSkillShotsSmallWindow = dodgeSkillShotsSmallWindow;
        this.doubleAces = doubleAces;
        this.dragonTakedowns = dragonTakedowns;
        this.legendaryItemUsed = legendaryItemUsed;
        this.effectiveHealAndShielding = effectiveHealAndShielding;
        this.elderDragonKillsWithOpposingSoul = elderDragonKillsWithOpposingSoul;
        this.elderDragonMultikills = elderDragonMultikills;
        this.enemyChampionImmobilizations = enemyChampionImmobilizations;
        this.enemyJungleMonsterKills = enemyJungleMonsterKills;
        this.epicMonsterKillsNearEnemyJungler = epicMonsterKillsNearEnemyJungler;
        this.epicMonsterKillsWithin30SecondsOfSpawn = epicMonsterKillsWithin30SecondsOfSpawn;
        this.epicMonsterSteals = epicMonsterSteals;
        this.epicMonsterStolenWithoutSmite = epicMonsterStolenWithoutSmite;
        this.firstTurretKilled = firstTurretKilled;
        this.firstTurretKilledTime = firstTurretKilledTime;
        this.flawlessAces = flawlessAces;
        this.fullTeamTakedown = fullTeamTakedown;
        this.gameLength = gameLength;
        this.getTakedownsInAllLanesEarlyJungleAsLaner = getTakedownsInAllLanesEarlyJungleAsLaner;
        this.goldPerMinute = goldPerMinute;
        this.hadOpenNexus = hadOpenNexus;
        this.immobilizeAndKillWithAlly = immobilizeAndKillWithAlly;
        this.initialBuffCount = initialBuffCount;
        this.initialCrabCount = initialCrabCount;
        this.jungleCsBefore10Minutes = jungleCsBefore10Minutes;
        this.junglerTakedownsNearDamagedEpicMonster = junglerTakedownsNearDamagedEpicMonster;
        this.kda = kda;
        this.killAfterHiddenWithAlly = killAfterHiddenWithAlly;
        this.killedChampTookFullTeamDamageSurvived = killedChampTookFullTeamDamageSurvived;
        this.killingSprees = killingSprees;
        this.killParticipation = killParticipation;
        this.killsNearEnemyTurret = killsNearEnemyTurret;
        this.killsOnOtherLanesEarlyJungleAsLaner = killsOnOtherLanesEarlyJungleAsLaner;
        this.killsOnRecentlyHealedByAramPack = killsOnRecentlyHealedByAramPack;
        this.killsUnderOwnTurret = killsUnderOwnTurret;
        this.killsWithHelpFromEpicMonster = killsWithHelpFromEpicMonster;
        this.knockEnemyIntoTeamAndKill = knockEnemyIntoTeamAndKill;
        this.kTurretsDestroyedBeforePlatesFall = kTurretsDestroyedBeforePlatesFall;
        this.landSkillShotsEarlyGame = landSkillShotsEarlyGame;
        this.laneMinionsFirst10Minutes = laneMinionsFirst10Minutes;
        this.lostAnInhibitor = lostAnInhibitor;
        this.maxKillDeficit = maxKillDeficit;
        this.mejaisFullStackInTime = mejaisFullStackInTime;
        this.moreEnemyJungleThanOpponent = moreEnemyJungleThanOpponent;
        this.multiKillOneSpell = multiKillOneSpell;
        this.multikills = multikills;
        this.multikillsAfterAggressiveFlash = multikillsAfterAggressiveFlash;
        this.multiTurretRiftHeraldCount = multiTurretRiftHeraldCount;
        this.outerTurretExecutesBefore10Minutes = outerTurretExecutesBefore10Minutes;
        this.outnumberedKills = outnumberedKills;
        this.outnumberedNexusKill = outnumberedNexusKill;
        this.perfectDragonSoulsTaken = perfectDragonSoulsTaken;
        this.perfectGame = perfectGame;
        this.pickKillWithAlly = pickKillWithAlly;
        this.poroExplosions = poroExplosions;
        this.quickCleanse = quickCleanse;
        this.quickFirstTurret = quickFirstTurret;
        this.quickSoloKills = quickSoloKills;
        this.riftHeraldTakedowns = riftHeraldTakedowns;
        this.saveAllyFromDeath = saveAllyFromDeath;
        this.scuttleCrabKills = scuttleCrabKills;
        this.shortestTimeToAceFromFirstTakedown = shortestTimeToAceFromFirstTakedown;
        this.skillshotsDodged = skillshotsDodged;
        this.skillshotsHit = skillshotsHit;
        this.snowballsHit = snowballsHit;
        this.soloBaronKills = soloBaronKills;
        this.swarmDefeatAatrox = swarmDefeatAatrox;
        this.swarmDefeatBriar = swarmDefeatBriar;
        this.swarmDefeatMiniBosses = swarmDefeatMiniBosses;
        this.swarmEvolveWeapon = swarmEvolveWeapon;
        this.swarmHave3Passives = swarmHave3Passives;
        this.swarmKillEnemy = swarmKillEnemy;
        this.swarmPickupGold = swarmPickupGold;
        this.swarmReachLevel50 = swarmReachLevel50;
        this.swarmSurvive15Min = swarmSurvive15Min;
        this.swarmWinWith5EvolvedWeapons = swarmWinWith5EvolvedWeapons;
        this.soloKills = soloKills;
        this.stealthWardsPlaced = stealthWardsPlaced;
        this.survivedSingleDigitHpCount = survivedSingleDigitHpCount;
        this.survivedThreeImmobilizesInFight = survivedThreeImmobilizesInFight;
        this.takedownOnFirstTurret = takedownOnFirstTurret;
        this.takedowns = takedowns;
        this.takedownsAfterGainingLevelAdvantage = takedownsAfterGainingLevelAdvantage;
        this.takedownsBeforeJungleMinionSpawn = takedownsBeforeJungleMinionSpawn;
        this.takedownsFirstXMinutes = takedownsFirstXMinutes;
        this.takedownsInAlcove = takedownsInAlcove;
        this.takedownsInEnemyFountain = takedownsInEnemyFountain;
        this.teamBaronKills = teamBaronKills;
        this.teamDamagePercentage = teamDamagePercentage;
        this.teamElderDragonKills = teamElderDragonKills;
        this.teamRiftHeraldKills = teamRiftHeraldKills;
        this.tookLargeDamageSurvived = tookLargeDamageSurvived;
        this.turretPlatesTaken = turretPlatesTaken;
        this.turretsTakenWithRiftHerald = turretsTakenWithRiftHerald;
        this.turretTakedowns = turretTakedowns;
        this.twentyMinionsIn3SecondsCount = twentyMinionsIn3SecondsCount;
        this.twoWardsOneSweeperCount = twoWardsOneSweeperCount;
        this.unseenRecalls = unseenRecalls;
        this.visionScorePerMinute = visionScorePerMinute;
        this.wardsGuarded = wardsGuarded;
        this.wardTakedowns = wardTakedowns;
        this.wardTakedownsBefore20M = wardTakedownsBefore20M;
    }

    public ChallengesDto() {
    }

    public Integer getAssistStreakCount() {
        return this.assistStreakCount;
    }

    public void setAssistStreakCount(Integer assistStreakCount) {
        this.assistStreakCount = assistStreakCount;
    }

    public Integer getBaronBuffGoldAdvantageOverThreshold() {
        return this.baronBuffGoldAdvantageOverThreshold;
    }

    public void setBaronBuffGoldAdvantageOverThreshold(Integer baronBuffGoldAdvantageOverThreshold) {
        this.baronBuffGoldAdvantageOverThreshold = baronBuffGoldAdvantageOverThreshold;
    }

    public Float getControlWardTimeCoverageInRiverOrEnemyHalf() {
        return this.controlWardTimeCoverageInRiverOrEnemyHalf;
    }

    public void setControlWardTimeCoverageInRiverOrEnemyHalf(Float controlWardTimeCoverageInRiverOrEnemyHalf) {
        this.controlWardTimeCoverageInRiverOrEnemyHalf = controlWardTimeCoverageInRiverOrEnemyHalf;
    }

    public Integer getEarliestBaron() {
        return this.earliestBaron;
    }

    public void setEarliestBaron(Integer earliestBaron) {
        this.earliestBaron = earliestBaron;
    }

    public Integer getEarliestDragonTakedown() {
        return this.earliestDragonTakedown;
    }

    public void setEarliestDragonTakedown(Integer earliestDragonTakedown) {
        this.earliestDragonTakedown = earliestDragonTakedown;
    }

    public Integer getEarliestElderDragon() {
        return this.earliestElderDragon;
    }

    public void setEarliestElderDragon(Integer earliestElderDragon) {
        this.earliestElderDragon = earliestElderDragon;
    }

    public Integer getEarlyLaningPhaseGoldExpAdvantage() {
        return this.earlyLaningPhaseGoldExpAdvantage;
    }

    public void setEarlyLaningPhaseGoldExpAdvantage(Integer earlyLaningPhaseGoldExpAdvantage) {
        this.earlyLaningPhaseGoldExpAdvantage = earlyLaningPhaseGoldExpAdvantage;
    }

    public Integer getFasterSupportQuestCompletion() {
        return this.fasterSupportQuestCompletion;
    }

    public void setFasterSupportQuestCompletion(Integer fasterSupportQuestCompletion) {
        this.fasterSupportQuestCompletion = fasterSupportQuestCompletion;
    }

    public Integer getFastestLegendary() {
        return this.fastestLegendary;
    }

    public void setFastestLegendary(Integer fastestLegendary) {
        this.fastestLegendary = fastestLegendary;
    }

    public Integer getHadAfkTeammate() {
        return this.hadAfkTeammate;
    }

    public void setHadAfkTeammate(Integer hadAfkTeammate) {
        this.hadAfkTeammate = hadAfkTeammate;
    }

    public Integer getHighestChampionDamage() {
        return this.highestChampionDamage;
    }

    public void setHighestChampionDamage(Integer highestChampionDamage) {
        this.highestChampionDamage = highestChampionDamage;
    }

    public Integer getHighestCrowdControlScore() {
        return this.highestCrowdControlScore;
    }

    public void setHighestCrowdControlScore(Integer highestCrowdControlScore) {
        this.highestCrowdControlScore = highestCrowdControlScore;
    }

    public Integer getHighestWardKills() {
        return this.highestWardKills;
    }

    public void setHighestWardKills(Integer highestWardKills) {
        this.highestWardKills = highestWardKills;
    }

    public Integer getJunglerKillsEarlyJungle() {
        return this.junglerKillsEarlyJungle;
    }

    public void setJunglerKillsEarlyJungle(Integer junglerKillsEarlyJungle) {
        this.junglerKillsEarlyJungle = junglerKillsEarlyJungle;
    }

    public Integer getKillsOnLanersEarlyJungleAsJungler() {
        return this.killsOnLanersEarlyJungleAsJungler;
    }

    public void setKillsOnLanersEarlyJungleAsJungler(Integer killsOnLanersEarlyJungleAsJungler) {
        this.killsOnLanersEarlyJungleAsJungler = killsOnLanersEarlyJungleAsJungler;
    }

    public Integer getLaningPhaseGoldExpAdvantage() {
        return this.laningPhaseGoldExpAdvantage;
    }

    public void setLaningPhaseGoldExpAdvantage(Integer laningPhaseGoldExpAdvantage) {
        this.laningPhaseGoldExpAdvantage = laningPhaseGoldExpAdvantage;
    }

    public Integer getLegendaryCount() {
        return this.legendaryCount;
    }

    public void setLegendaryCount(Integer legendaryCount) {
        this.legendaryCount = legendaryCount;
    }

    public Float getMaxCsAdvantageOnLaneOpponent() {
        return this.maxCsAdvantageOnLaneOpponent;
    }

    public void setMaxCsAdvantageOnLaneOpponent(Float maxCsAdvantageOnLaneOpponent) {
        this.maxCsAdvantageOnLaneOpponent = maxCsAdvantageOnLaneOpponent;
    }

    public Integer getMaxLevelLeadLaneOpponent() {
        return this.maxLevelLeadLaneOpponent;
    }

    public void setMaxLevelLeadLaneOpponent(Integer maxLevelLeadLaneOpponent) {
        this.maxLevelLeadLaneOpponent = maxLevelLeadLaneOpponent;
    }

    public Integer getMostWardsDestroyedOneSweeper() {
        return this.mostWardsDestroyedOneSweeper;
    }

    public void setMostWardsDestroyedOneSweeper(Integer mostWardsDestroyedOneSweeper) {
        this.mostWardsDestroyedOneSweeper = mostWardsDestroyedOneSweeper;
    }

    public Integer getMythicItemUsed() {
        return this.mythicItemUsed;
    }

    public void setMythicItemUsed(Integer mythicItemUsed) {
        this.mythicItemUsed = mythicItemUsed;
    }

    public Integer getPlayedChampSelectPosition() {
        return this.playedChampSelectPosition;
    }

    public void setPlayedChampSelectPosition(Integer playedChampSelectPosition) {
        this.playedChampSelectPosition = playedChampSelectPosition;
    }

    public Integer getSoloTurretsLategame() {
        return this.soloTurretsLategame;
    }

    public void setSoloTurretsLategame(Integer soloTurretsLategame) {
        this.soloTurretsLategame = soloTurretsLategame;
    }

    public Integer getTakedownsFirst25Minutes() {
        return this.takedownsFirst25Minutes;
    }

    public void setTakedownsFirst25Minutes(Integer takedownsFirst25Minutes) {
        this.takedownsFirst25Minutes = takedownsFirst25Minutes;
    }

    public Integer getTeleportTakedowns() {
        return this.teleportTakedowns;
    }

    public void setTeleportTakedowns(Integer teleportTakedowns) {
        this.teleportTakedowns = teleportTakedowns;
    }

    public Integer getThirdInhibitorDestroyedTime() {
        return this.thirdInhibitorDestroyedTime;
    }

    public void setThirdInhibitorDestroyedTime(Integer thirdInhibitorDestroyedTime) {
        this.thirdInhibitorDestroyedTime = thirdInhibitorDestroyedTime;
    }

    public Integer getThreeWardsOneSweeperCount() {
        return this.threeWardsOneSweeperCount;
    }

    public void setThreeWardsOneSweeperCount(Integer threeWardsOneSweeperCount) {
        this.threeWardsOneSweeperCount = threeWardsOneSweeperCount;
    }

    public Float getVisionScoreAdvantageLaneOpponent() {
        return this.visionScoreAdvantageLaneOpponent;
    }

    public void setVisionScoreAdvantageLaneOpponent(Float visionScoreAdvantageLaneOpponent) {
        this.visionScoreAdvantageLaneOpponent = visionScoreAdvantageLaneOpponent;
    }

    public Integer getInfernalScalePickup() {
        return this.infernalScalePickup;
    }

    public void setInfernalScalePickup(Integer infernalScalePickup) {
        this.infernalScalePickup = infernalScalePickup;
    }

    public Integer getFistBumpParticipation() {
        return this.fistBumpParticipation;
    }

    public void setFistBumpParticipation(Integer fistBumpParticipation) {
        this.fistBumpParticipation = fistBumpParticipation;
    }

    public Integer getVoidMonsterKill() {
        return this.voidMonsterKill;
    }

    public void setVoidMonsterKill(Integer voidMonsterKill) {
        this.voidMonsterKill = voidMonsterKill;
    }

    public Integer getAbilityUses() {
        return this.abilityUses;
    }

    public void setAbilityUses(Integer abilityUses) {
        this.abilityUses = abilityUses;
    }

    public Integer getAcesBefore15Minutes() {
        return this.acesBefore15Minutes;
    }

    public void setAcesBefore15Minutes(Integer acesBefore15Minutes) {
        this.acesBefore15Minutes = acesBefore15Minutes;
    }

    public Float getAlliedJungleMonsterKills() {
        return this.alliedJungleMonsterKills;
    }

    public void setAlliedJungleMonsterKills(Float alliedJungleMonsterKills) {
        this.alliedJungleMonsterKills = alliedJungleMonsterKills;
    }

    public Integer getBaronTakedowns() {
        return this.baronTakedowns;
    }

    public void setBaronTakedowns(Integer baronTakedowns) {
        this.baronTakedowns = baronTakedowns;
    }

    public Integer getBlastConeOppositeOpponentCount() {
        return this.blastConeOppositeOpponentCount;
    }

    public void setBlastConeOppositeOpponentCount(Integer blastConeOppositeOpponentCount) {
        this.blastConeOppositeOpponentCount = blastConeOppositeOpponentCount;
    }

    public Integer getBountyGold() {
        return this.bountyGold;
    }

    public void setBountyGold(Integer bountyGold) {
        this.bountyGold = bountyGold;
    }

    public Integer getBuffsStolen() {
        return this.buffsStolen;
    }

    public void setBuffsStolen(Integer buffsStolen) {
        this.buffsStolen = buffsStolen;
    }

    public Integer getCompleteSupportQuestInTime() {
        return this.completeSupportQuestInTime;
    }

    public void setCompleteSupportQuestInTime(Integer completeSupportQuestInTime) {
        this.completeSupportQuestInTime = completeSupportQuestInTime;
    }

    public Integer getControlWardsPlaced() {
        return this.controlWardsPlaced;
    }

    public void setControlWardsPlaced(Integer controlWardsPlaced) {
        this.controlWardsPlaced = controlWardsPlaced;
    }

    public Float getDamagePerMinute() {
        return this.damagePerMinute;
    }

    public void setDamagePerMinute(Float damagePerMinute) {
        this.damagePerMinute = damagePerMinute;
    }

    public Float getDamageTakenOnTeamPercentage() {
        return this.damageTakenOnTeamPercentage;
    }

    public void setDamageTakenOnTeamPercentage(Float damageTakenOnTeamPercentage) {
        this.damageTakenOnTeamPercentage = damageTakenOnTeamPercentage;
    }

    public Integer getDancedWithRiftHerald() {
        return this.dancedWithRiftHerald;
    }

    public void setDancedWithRiftHerald(Integer dancedWithRiftHerald) {
        this.dancedWithRiftHerald = dancedWithRiftHerald;
    }

    public Integer getDeathsByEnemyChamps() {
        return this.deathsByEnemyChamps;
    }

    public void setDeathsByEnemyChamps(Integer deathsByEnemyChamps) {
        this.deathsByEnemyChamps = deathsByEnemyChamps;
    }

    public Integer getDodgeSkillShotsSmallWindow() {
        return this.dodgeSkillShotsSmallWindow;
    }

    public void setDodgeSkillShotsSmallWindow(Integer dodgeSkillShotsSmallWindow) {
        this.dodgeSkillShotsSmallWindow = dodgeSkillShotsSmallWindow;
    }

    public Integer getDoubleAces() {
        return this.doubleAces;
    }

    public void setDoubleAces(Integer doubleAces) {
        this.doubleAces = doubleAces;
    }

    public Integer getDragonTakedowns() {
        return this.dragonTakedowns;
    }

    public void setDragonTakedowns(Integer dragonTakedowns) {
        this.dragonTakedowns = dragonTakedowns;
    }

    public List<Integer> getLegendaryItemUsed() {
        return this.legendaryItemUsed;
    }

    public void setLegendaryItemUsed(List<Integer> legendaryItemUsed) {
        this.legendaryItemUsed = legendaryItemUsed;
    }

    public Float getEffectiveHealAndShielding() {
        return this.effectiveHealAndShielding;
    }

    public void setEffectiveHealAndShielding(Float effectiveHealAndShielding) {
        this.effectiveHealAndShielding = effectiveHealAndShielding;
    }

    public Integer getElderDragonKillsWithOpposingSoul() {
        return this.elderDragonKillsWithOpposingSoul;
    }

    public void setElderDragonKillsWithOpposingSoul(Integer elderDragonKillsWithOpposingSoul) {
        this.elderDragonKillsWithOpposingSoul = elderDragonKillsWithOpposingSoul;
    }

    public Integer getElderDragonMultikills() {
        return this.elderDragonMultikills;
    }

    public void setElderDragonMultikills(Integer elderDragonMultikills) {
        this.elderDragonMultikills = elderDragonMultikills;
    }

    public Integer getEnemyChampionImmobilizations() {
        return this.enemyChampionImmobilizations;
    }

    public void setEnemyChampionImmobilizations(Integer enemyChampionImmobilizations) {
        this.enemyChampionImmobilizations = enemyChampionImmobilizations;
    }

    public Float getEnemyJungleMonsterKills() {
        return this.enemyJungleMonsterKills;
    }

    public void setEnemyJungleMonsterKills(Float enemyJungleMonsterKills) {
        this.enemyJungleMonsterKills = enemyJungleMonsterKills;
    }

    public Integer getEpicMonsterKillsNearEnemyJungler() {
        return this.epicMonsterKillsNearEnemyJungler;
    }

    public void setEpicMonsterKillsNearEnemyJungler(Integer epicMonsterKillsNearEnemyJungler) {
        this.epicMonsterKillsNearEnemyJungler = epicMonsterKillsNearEnemyJungler;
    }

    public Integer getEpicMonsterKillsWithin30SecondsOfSpawn() {
        return this.epicMonsterKillsWithin30SecondsOfSpawn;
    }

    public void setEpicMonsterKillsWithin30SecondsOfSpawn(Integer epicMonsterKillsWithin30SecondsOfSpawn) {
        this.epicMonsterKillsWithin30SecondsOfSpawn = epicMonsterKillsWithin30SecondsOfSpawn;
    }

    public Integer getEpicMonsterSteals() {
        return this.epicMonsterSteals;
    }

    public void setEpicMonsterSteals(Integer epicMonsterSteals) {
        this.epicMonsterSteals = epicMonsterSteals;
    }

    public Integer getEpicMonsterStolenWithoutSmite() {
        return this.epicMonsterStolenWithoutSmite;
    }

    public void setEpicMonsterStolenWithoutSmite(Integer epicMonsterStolenWithoutSmite) {
        this.epicMonsterStolenWithoutSmite = epicMonsterStolenWithoutSmite;
    }

    public Integer getFirstTurretKilled() {
        return this.firstTurretKilled;
    }

    public void setFirstTurretKilled(Integer firstTurretKilled) {
        this.firstTurretKilled = firstTurretKilled;
    }

    public Float getFirstTurretKilledTime() {
        return this.firstTurretKilledTime;
    }

    public void setFirstTurretKilledTime(Float firstTurretKilledTime) {
        this.firstTurretKilledTime = firstTurretKilledTime;
    }

    public Integer getFlawlessAces() {
        return this.flawlessAces;
    }

    public void setFlawlessAces(Integer flawlessAces) {
        this.flawlessAces = flawlessAces;
    }

    public Integer getFullTeamTakedown() {
        return this.fullTeamTakedown;
    }

    public void setFullTeamTakedown(Integer fullTeamTakedown) {
        this.fullTeamTakedown = fullTeamTakedown;
    }

    public Float getGameLength() {
        return this.gameLength;
    }

    public void setGameLength(Float gameLength) {
        this.gameLength = gameLength;
    }

    public Integer getGetTakedownsInAllLanesEarlyJungleAsLaner() {
        return this.getTakedownsInAllLanesEarlyJungleAsLaner;
    }

    public void setGetTakedownsInAllLanesEarlyJungleAsLaner(Integer getTakedownsInAllLanesEarlyJungleAsLaner) {
        this.getTakedownsInAllLanesEarlyJungleAsLaner = getTakedownsInAllLanesEarlyJungleAsLaner;
    }

    public Float getGoldPerMinute() {
        return this.goldPerMinute;
    }

    public void setGoldPerMinute(Float goldPerMinute) {
        this.goldPerMinute = goldPerMinute;
    }

    public Integer getHadOpenNexus() {
        return this.hadOpenNexus;
    }

    public void setHadOpenNexus(Integer hadOpenNexus) {
        this.hadOpenNexus = hadOpenNexus;
    }

    public Integer getImmobilizeAndKillWithAlly() {
        return this.immobilizeAndKillWithAlly;
    }

    public void setImmobilizeAndKillWithAlly(Integer immobilizeAndKillWithAlly) {
        this.immobilizeAndKillWithAlly = immobilizeAndKillWithAlly;
    }

    public Integer getInitialBuffCount() {
        return this.initialBuffCount;
    }

    public void setInitialBuffCount(Integer initialBuffCount) {
        this.initialBuffCount = initialBuffCount;
    }

    public Integer getInitialCrabCount() {
        return this.initialCrabCount;
    }

    public void setInitialCrabCount(Integer initialCrabCount) {
        this.initialCrabCount = initialCrabCount;
    }

    public Float getJungleCsBefore10Minutes() {
        return this.jungleCsBefore10Minutes;
    }

    public void setJungleCsBefore10Minutes(Float jungleCsBefore10Minutes) {
        this.jungleCsBefore10Minutes = jungleCsBefore10Minutes;
    }

    public Integer getJunglerTakedownsNearDamagedEpicMonster() {
        return this.junglerTakedownsNearDamagedEpicMonster;
    }

    public void setJunglerTakedownsNearDamagedEpicMonster(Integer junglerTakedownsNearDamagedEpicMonster) {
        this.junglerTakedownsNearDamagedEpicMonster = junglerTakedownsNearDamagedEpicMonster;
    }

    public Float getKda() {
        return this.kda;
    }

    public void setKda(Float kda) {
        this.kda = kda;
    }

    public Integer getKillAfterHiddenWithAlly() {
        return this.killAfterHiddenWithAlly;
    }

    public void setKillAfterHiddenWithAlly(Integer killAfterHiddenWithAlly) {
        this.killAfterHiddenWithAlly = killAfterHiddenWithAlly;
    }

    public Integer getKilledChampTookFullTeamDamageSurvived() {
        return this.killedChampTookFullTeamDamageSurvived;
    }

    public void setKilledChampTookFullTeamDamageSurvived(Integer killedChampTookFullTeamDamageSurvived) {
        this.killedChampTookFullTeamDamageSurvived = killedChampTookFullTeamDamageSurvived;
    }

    public Integer getKillingSprees() {
        return this.killingSprees;
    }

    public void setKillingSprees(Integer killingSprees) {
        this.killingSprees = killingSprees;
    }

    public Float getKillParticipation() {
        return this.killParticipation;
    }

    public void setKillParticipation(Float killParticipation) {
        this.killParticipation = killParticipation;
    }

    public Integer getKillsNearEnemyTurret() {
        return this.killsNearEnemyTurret;
    }

    public void setKillsNearEnemyTurret(Integer killsNearEnemyTurret) {
        this.killsNearEnemyTurret = killsNearEnemyTurret;
    }

    public Integer getKillsOnOtherLanesEarlyJungleAsLaner() {
        return this.killsOnOtherLanesEarlyJungleAsLaner;
    }

    public void setKillsOnOtherLanesEarlyJungleAsLaner(Integer killsOnOtherLanesEarlyJungleAsLaner) {
        this.killsOnOtherLanesEarlyJungleAsLaner = killsOnOtherLanesEarlyJungleAsLaner;
    }

    public Integer getKillsOnRecentlyHealedByAramPack() {
        return this.killsOnRecentlyHealedByAramPack;
    }

    public void setKillsOnRecentlyHealedByAramPack(Integer killsOnRecentlyHealedByAramPack) {
        this.killsOnRecentlyHealedByAramPack = killsOnRecentlyHealedByAramPack;
    }

    public Integer getKillsUnderOwnTurret() {
        return this.killsUnderOwnTurret;
    }

    public void setKillsUnderOwnTurret(Integer killsUnderOwnTurret) {
        this.killsUnderOwnTurret = killsUnderOwnTurret;
    }

    public Integer getKillsWithHelpFromEpicMonster() {
        return this.killsWithHelpFromEpicMonster;
    }

    public void setKillsWithHelpFromEpicMonster(Integer killsWithHelpFromEpicMonster) {
        this.killsWithHelpFromEpicMonster = killsWithHelpFromEpicMonster;
    }

    public Integer getKnockEnemyIntoTeamAndKill() {
        return this.knockEnemyIntoTeamAndKill;
    }

    public void setKnockEnemyIntoTeamAndKill(Integer knockEnemyIntoTeamAndKill) {
        this.knockEnemyIntoTeamAndKill = knockEnemyIntoTeamAndKill;
    }

    public Integer getKTurretsDestroyedBeforePlatesFall() {
        return this.kTurretsDestroyedBeforePlatesFall;
    }

    public void setKTurretsDestroyedBeforePlatesFall(Integer kTurretsDestroyedBeforePlatesFall) {
        this.kTurretsDestroyedBeforePlatesFall = kTurretsDestroyedBeforePlatesFall;
    }

    public Integer getLandSkillShotsEarlyGame() {
        return this.landSkillShotsEarlyGame;
    }

    public void setLandSkillShotsEarlyGame(Integer landSkillShotsEarlyGame) {
        this.landSkillShotsEarlyGame = landSkillShotsEarlyGame;
    }

    public Integer getLaneMinionsFirst10Minutes() {
        return this.laneMinionsFirst10Minutes;
    }

    public void setLaneMinionsFirst10Minutes(Integer laneMinionsFirst10Minutes) {
        this.laneMinionsFirst10Minutes = laneMinionsFirst10Minutes;
    }

    public Integer getLostAnInhibitor() {
        return this.lostAnInhibitor;
    }

    public void setLostAnInhibitor(Integer lostAnInhibitor) {
        this.lostAnInhibitor = lostAnInhibitor;
    }

    public Integer getMaxKillDeficit() {
        return this.maxKillDeficit;
    }

    public void setMaxKillDeficit(Integer maxKillDeficit) {
        this.maxKillDeficit = maxKillDeficit;
    }

    public Integer getMejaisFullStackInTime() {
        return this.mejaisFullStackInTime;
    }

    public void setMejaisFullStackInTime(Integer mejaisFullStackInTime) {
        this.mejaisFullStackInTime = mejaisFullStackInTime;
    }

    public Float getMoreEnemyJungleThanOpponent() {
        return this.moreEnemyJungleThanOpponent;
    }

    public void setMoreEnemyJungleThanOpponent(Float moreEnemyJungleThanOpponent) {
        this.moreEnemyJungleThanOpponent = moreEnemyJungleThanOpponent;
    }

    public Integer getMultiKillOneSpell() {
        return this.multiKillOneSpell;
    }

    public void setMultiKillOneSpell(Integer multiKillOneSpell) {
        this.multiKillOneSpell = multiKillOneSpell;
    }

    public Integer getMultikills() {
        return this.multikills;
    }

    public void setMultikills(Integer multikills) {
        this.multikills = multikills;
    }

    public Integer getMultikillsAfterAggressiveFlash() {
        return this.multikillsAfterAggressiveFlash;
    }

    public void setMultikillsAfterAggressiveFlash(Integer multikillsAfterAggressiveFlash) {
        this.multikillsAfterAggressiveFlash = multikillsAfterAggressiveFlash;
    }

    public Integer getMultiTurretRiftHeraldCount() {
        return this.multiTurretRiftHeraldCount;
    }

    public void setMultiTurretRiftHeraldCount(Integer multiTurretRiftHeraldCount) {
        this.multiTurretRiftHeraldCount = multiTurretRiftHeraldCount;
    }

    public Integer getOuterTurretExecutesBefore10Minutes() {
        return this.outerTurretExecutesBefore10Minutes;
    }

    public void setOuterTurretExecutesBefore10Minutes(Integer outerTurretExecutesBefore10Minutes) {
        this.outerTurretExecutesBefore10Minutes = outerTurretExecutesBefore10Minutes;
    }

    public Integer getOutnumberedKills() {
        return this.outnumberedKills;
    }

    public void setOutnumberedKills(Integer outnumberedKills) {
        this.outnumberedKills = outnumberedKills;
    }

    public Integer getOutnumberedNexusKill() {
        return this.outnumberedNexusKill;
    }

    public void setOutnumberedNexusKill(Integer outnumberedNexusKill) {
        this.outnumberedNexusKill = outnumberedNexusKill;
    }

    public Integer getPerfectDragonSoulsTaken() {
        return this.perfectDragonSoulsTaken;
    }

    public void setPerfectDragonSoulsTaken(Integer perfectDragonSoulsTaken) {
        this.perfectDragonSoulsTaken = perfectDragonSoulsTaken;
    }

    public Integer getPerfectGame() {
        return this.perfectGame;
    }

    public void setPerfectGame(Integer perfectGame) {
        this.perfectGame = perfectGame;
    }

    public Integer getPickKillWithAlly() {
        return this.pickKillWithAlly;
    }

    public void setPickKillWithAlly(Integer pickKillWithAlly) {
        this.pickKillWithAlly = pickKillWithAlly;
    }

    public Integer getPoroExplosions() {
        return this.poroExplosions;
    }

    public void setPoroExplosions(Integer poroExplosions) {
        this.poroExplosions = poroExplosions;
    }

    public Integer getQuickCleanse() {
        return this.quickCleanse;
    }

    public void setQuickCleanse(Integer quickCleanse) {
        this.quickCleanse = quickCleanse;
    }

    public Integer getQuickFirstTurret() {
        return this.quickFirstTurret;
    }

    public void setQuickFirstTurret(Integer quickFirstTurret) {
        this.quickFirstTurret = quickFirstTurret;
    }

    public Integer getQuickSoloKills() {
        return this.quickSoloKills;
    }

    public void setQuickSoloKills(Integer quickSoloKills) {
        this.quickSoloKills = quickSoloKills;
    }

    public Integer getRiftHeraldTakedowns() {
        return this.riftHeraldTakedowns;
    }

    public void setRiftHeraldTakedowns(Integer riftHeraldTakedowns) {
        this.riftHeraldTakedowns = riftHeraldTakedowns;
    }

    public Integer getSaveAllyFromDeath() {
        return this.saveAllyFromDeath;
    }

    public void setSaveAllyFromDeath(Integer saveAllyFromDeath) {
        this.saveAllyFromDeath = saveAllyFromDeath;
    }

    public Integer getScuttleCrabKills() {
        return this.scuttleCrabKills;
    }

    public void setScuttleCrabKills(Integer scuttleCrabKills) {
        this.scuttleCrabKills = scuttleCrabKills;
    }

    public Float getShortestTimeToAceFromFirstTakedown() {
        return this.shortestTimeToAceFromFirstTakedown;
    }

    public void setShortestTimeToAceFromFirstTakedown(Float shortestTimeToAceFromFirstTakedown) {
        this.shortestTimeToAceFromFirstTakedown = shortestTimeToAceFromFirstTakedown;
    }

    public Integer getSkillshotsDodged() {
        return this.skillshotsDodged;
    }

    public void setSkillshotsDodged(Integer skillshotsDodged) {
        this.skillshotsDodged = skillshotsDodged;
    }

    public Integer getSkillshotsHit() {
        return this.skillshotsHit;
    }

    public void setSkillshotsHit(Integer skillshotsHit) {
        this.skillshotsHit = skillshotsHit;
    }

    public Integer getSnowballsHit() {
        return this.snowballsHit;
    }

    public void setSnowballsHit(Integer snowballsHit) {
        this.snowballsHit = snowballsHit;
    }

    public Integer getSoloBaronKills() {
        return this.soloBaronKills;
    }

    public void setSoloBaronKills(Integer soloBaronKills) {
        this.soloBaronKills = soloBaronKills;
    }

    public Integer getSwarmDefeatAatrox() {
        return this.swarmDefeatAatrox;
    }

    public void setSwarmDefeatAatrox(Integer swarmDefeatAatrox) {
        this.swarmDefeatAatrox = swarmDefeatAatrox;
    }

    public Integer getSwarmDefeatBriar() {
        return this.swarmDefeatBriar;
    }

    public void setSwarmDefeatBriar(Integer swarmDefeatBriar) {
        this.swarmDefeatBriar = swarmDefeatBriar;
    }

    public Integer getSwarmDefeatMiniBosses() {
        return this.swarmDefeatMiniBosses;
    }

    public void setSwarmDefeatMiniBosses(Integer swarmDefeatMiniBosses) {
        this.swarmDefeatMiniBosses = swarmDefeatMiniBosses;
    }

    public Integer getSwarmEvolveWeapon() {
        return this.swarmEvolveWeapon;
    }

    public void setSwarmEvolveWeapon(Integer swarmEvolveWeapon) {
        this.swarmEvolveWeapon = swarmEvolveWeapon;
    }

    public Integer getSwarmHave3Passives() {
        return this.swarmHave3Passives;
    }

    public void setSwarmHave3Passives(Integer swarmHave3Passives) {
        this.swarmHave3Passives = swarmHave3Passives;
    }

    public Integer getSwarmKillEnemy() {
        return this.swarmKillEnemy;
    }

    public void setSwarmKillEnemy(Integer swarmKillEnemy) {
        this.swarmKillEnemy = swarmKillEnemy;
    }

    public Float getSwarmPickupGold() {
        return this.swarmPickupGold;
    }

    public void setSwarmPickupGold(Float swarmPickupGold) {
        this.swarmPickupGold = swarmPickupGold;
    }

    public Integer getSwarmReachLevel50() {
        return this.swarmReachLevel50;
    }

    public void setSwarmReachLevel50(Integer swarmReachLevel50) {
        this.swarmReachLevel50 = swarmReachLevel50;
    }

    public Integer getSwarmSurvive15Min() {
        return this.swarmSurvive15Min;
    }

    public void setSwarmSurvive15Min(Integer swarmSurvive15Min) {
        this.swarmSurvive15Min = swarmSurvive15Min;
    }

    public Integer getSwarmWinWith5EvolvedWeapons() {
        return this.swarmWinWith5EvolvedWeapons;
    }

    public void setSwarmWinWith5EvolvedWeapons(Integer swarmWinWith5EvolvedWeapons) {
        this.swarmWinWith5EvolvedWeapons = swarmWinWith5EvolvedWeapons;
    }

    public Integer getSoloKills() {
        return this.soloKills;
    }

    public void setSoloKills(Integer soloKills) {
        this.soloKills = soloKills;
    }

    public Integer getStealthWardsPlaced() {
        return this.stealthWardsPlaced;
    }

    public void setStealthWardsPlaced(Integer stealthWardsPlaced) {
        this.stealthWardsPlaced = stealthWardsPlaced;
    }

    public Integer getSurvivedSingleDigitHpCount() {
        return this.survivedSingleDigitHpCount;
    }

    public void setSurvivedSingleDigitHpCount(Integer survivedSingleDigitHpCount) {
        this.survivedSingleDigitHpCount = survivedSingleDigitHpCount;
    }

    public Integer getSurvivedThreeImmobilizesInFight() {
        return this.survivedThreeImmobilizesInFight;
    }

    public void setSurvivedThreeImmobilizesInFight(Integer survivedThreeImmobilizesInFight) {
        this.survivedThreeImmobilizesInFight = survivedThreeImmobilizesInFight;
    }

    public Integer getTakedownOnFirstTurret() {
        return this.takedownOnFirstTurret;
    }

    public void setTakedownOnFirstTurret(Integer takedownOnFirstTurret) {
        this.takedownOnFirstTurret = takedownOnFirstTurret;
    }

    public Integer getTakedowns() {
        return this.takedowns;
    }

    public void setTakedowns(Integer takedowns) {
        this.takedowns = takedowns;
    }

    public Integer getTakedownsAfterGainingLevelAdvantage() {
        return this.takedownsAfterGainingLevelAdvantage;
    }

    public void setTakedownsAfterGainingLevelAdvantage(Integer takedownsAfterGainingLevelAdvantage) {
        this.takedownsAfterGainingLevelAdvantage = takedownsAfterGainingLevelAdvantage;
    }

    public Integer getTakedownsBeforeJungleMinionSpawn() {
        return this.takedownsBeforeJungleMinionSpawn;
    }

    public void setTakedownsBeforeJungleMinionSpawn(Integer takedownsBeforeJungleMinionSpawn) {
        this.takedownsBeforeJungleMinionSpawn = takedownsBeforeJungleMinionSpawn;
    }

    public Integer getTakedownsFirstXMinutes() {
        return this.takedownsFirstXMinutes;
    }

    public void setTakedownsFirstXMinutes(Integer takedownsFirstXMinutes) {
        this.takedownsFirstXMinutes = takedownsFirstXMinutes;
    }

    public Integer getTakedownsInAlcove() {
        return this.takedownsInAlcove;
    }

    public void setTakedownsInAlcove(Integer takedownsInAlcove) {
        this.takedownsInAlcove = takedownsInAlcove;
    }

    public Integer getTakedownsInEnemyFountain() {
        return this.takedownsInEnemyFountain;
    }

    public void setTakedownsInEnemyFountain(Integer takedownsInEnemyFountain) {
        this.takedownsInEnemyFountain = takedownsInEnemyFountain;
    }

    public Integer getTeamBaronKills() {
        return this.teamBaronKills;
    }

    public void setTeamBaronKills(Integer teamBaronKills) {
        this.teamBaronKills = teamBaronKills;
    }

    public Float getTeamDamagePercentage() {
        return this.teamDamagePercentage;
    }

    public void setTeamDamagePercentage(Float teamDamagePercentage) {
        this.teamDamagePercentage = teamDamagePercentage;
    }

    public Integer getTeamElderDragonKills() {
        return this.teamElderDragonKills;
    }

    public void setTeamElderDragonKills(Integer teamElderDragonKills) {
        this.teamElderDragonKills = teamElderDragonKills;
    }

    public Integer getTeamRiftHeraldKills() {
        return this.teamRiftHeraldKills;
    }

    public void setTeamRiftHeraldKills(Integer teamRiftHeraldKills) {
        this.teamRiftHeraldKills = teamRiftHeraldKills;
    }

    public Integer getTookLargeDamageSurvived() {
        return this.tookLargeDamageSurvived;
    }

    public void setTookLargeDamageSurvived(Integer tookLargeDamageSurvived) {
        this.tookLargeDamageSurvived = tookLargeDamageSurvived;
    }

    public Integer getTurretPlatesTaken() {
        return this.turretPlatesTaken;
    }

    public void setTurretPlatesTaken(Integer turretPlatesTaken) {
        this.turretPlatesTaken = turretPlatesTaken;
    }

    public Integer getTurretsTakenWithRiftHerald() {
        return this.turretsTakenWithRiftHerald;
    }

    public void setTurretsTakenWithRiftHerald(Integer turretsTakenWithRiftHerald) {
        this.turretsTakenWithRiftHerald = turretsTakenWithRiftHerald;
    }

    public Integer getTurretTakedowns() {
        return this.turretTakedowns;
    }

    public void setTurretTakedowns(Integer turretTakedowns) {
        this.turretTakedowns = turretTakedowns;
    }

    public Integer getTwentyMinionsIn3SecondsCount() {
        return this.twentyMinionsIn3SecondsCount;
    }

    public void setTwentyMinionsIn3SecondsCount(Integer twentyMinionsIn3SecondsCount) {
        this.twentyMinionsIn3SecondsCount = twentyMinionsIn3SecondsCount;
    }

    public Integer getTwoWardsOneSweeperCount() {
        return this.twoWardsOneSweeperCount;
    }

    public void setTwoWardsOneSweeperCount(Integer twoWardsOneSweeperCount) {
        this.twoWardsOneSweeperCount = twoWardsOneSweeperCount;
    }

    public Integer getUnseenRecalls() {
        return this.unseenRecalls;
    }

    public void setUnseenRecalls(Integer unseenRecalls) {
        this.unseenRecalls = unseenRecalls;
    }

    public Float getVisionScorePerMinute() {
        return this.visionScorePerMinute;
    }

    public void setVisionScorePerMinute(Float visionScorePerMinute) {
        this.visionScorePerMinute = visionScorePerMinute;
    }

    public Integer getWardsGuarded() {
        return this.wardsGuarded;
    }

    public void setWardsGuarded(Integer wardsGuarded) {
        this.wardsGuarded = wardsGuarded;
    }

    public Integer getWardTakedowns() {
        return this.wardTakedowns;
    }

    public void setWardTakedowns(Integer wardTakedowns) {
        this.wardTakedowns = wardTakedowns;
    }

    public Integer getWardTakedownsBefore20M() {
        return this.wardTakedownsBefore20M;
    }

    public void setWardTakedownsBefore20M(Integer wardTakedownsBefore20M) {
        this.wardTakedownsBefore20M = wardTakedownsBefore20M;
    }

}
