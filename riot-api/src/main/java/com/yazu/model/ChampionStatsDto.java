package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChampionStatsDto {
    @JsonProperty("abilityHaste")
    private Integer abilityHaste;

    @JsonProperty("abilityPower")
    private Integer abilityPower;

    @JsonProperty("armor")
    private Integer armor;

    @JsonProperty("armorPen")
    private Integer armorPen;

    @JsonProperty("armorPenPercent")
    private Integer armorPenPercent;

    @JsonProperty("attackDamage")
    private Integer attackDamage;

    @JsonProperty("attackSpeed")
    private Integer attackSpeed;

    @JsonProperty("bonusArmorPenPercent")
    private Integer bonusArmorPenPercent;

    @JsonProperty("bonusMagicPenPercent")
    private Integer bonusMagicPenPercent;

    @JsonProperty("ccReduction")
    private Integer ccReduction;

    @JsonProperty("cooldownReduction")
    private Integer cooldownReduction;

    @JsonProperty("health")
    private Integer health;

    @JsonProperty("healthMax")
    private Integer healthMax;

    @JsonProperty("healthRegen")
    private Integer healthRegen;

    @JsonProperty("lifesteal")
    private Integer lifesteal;

    @JsonProperty("magicPen")
    private Integer magicPen;

    @JsonProperty("magicPenPercent")
    private Integer magicPenPercent;

    @JsonProperty("magicResist")
    private Integer magicResist;

    @JsonProperty("movementSpeed")
    private Integer movementSpeed;

    @JsonProperty("omnivamp")
    private Integer omnivamp;

    @JsonProperty("physicalVamp")
    private Integer physicalVamp;

    @JsonProperty("power")
    private Integer power;

    @JsonProperty("powerMax")
    private Integer powerMax;

    @JsonProperty("powerRegen")
    private Integer powerRegen;

    @JsonProperty("spellVamp")
    private Integer spellVamp;

    public ChampionStatsDto() {
    }

    public Integer getAbilityHaste() {
        return this.abilityHaste;
    }

    public void setAbilityHaste(Integer abilityHaste) {
        this.abilityHaste = abilityHaste;
    }

    public Integer getAbilityPower() {
        return this.abilityPower;
    }

    public void setAbilityPower(Integer abilityPower) {
        this.abilityPower = abilityPower;
    }

    public Integer getArmor() {
        return this.armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public Integer getArmorPen() {
        return this.armorPen;
    }

    public void setArmorPen(Integer armorPen) {
        this.armorPen = armorPen;
    }

    public Integer getArmorPenPercent() {
        return this.armorPenPercent;
    }

    public void setArmorPenPercent(Integer armorPenPercent) {
        this.armorPenPercent = armorPenPercent;
    }

    public Integer getAttackDamage() {
        return this.attackDamage;
    }

    public void setAttackDamage(Integer attackDamage) {
        this.attackDamage = attackDamage;
    }

    public Integer getAttackSpeed() {
        return this.attackSpeed;
    }

    public void setAttackSpeed(Integer attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public Integer getBonusArmorPenPercent() {
        return this.bonusArmorPenPercent;
    }

    public void setBonusArmorPenPercent(Integer bonusArmorPenPercent) {
        this.bonusArmorPenPercent = bonusArmorPenPercent;
    }

    public Integer getBonusMagicPenPercent() {
        return this.bonusMagicPenPercent;
    }

    public void setBonusMagicPenPercent(Integer bonusMagicPenPercent) {
        this.bonusMagicPenPercent = bonusMagicPenPercent;
    }

    public Integer getCcReduction() {
        return this.ccReduction;
    }

    public void setCcReduction(Integer ccReduction) {
        this.ccReduction = ccReduction;
    }

    public Integer getCooldownReduction() {
        return this.cooldownReduction;
    }

    public void setCooldownReduction(Integer cooldownReduction) {
        this.cooldownReduction = cooldownReduction;
    }

    public Integer getHealth() {
        return this.health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getHealthMax() {
        return this.healthMax;
    }

    public void setHealthMax(Integer healthMax) {
        this.healthMax = healthMax;
    }

    public Integer getHealthRegen() {
        return this.healthRegen;
    }

    public void setHealthRegen(Integer healthRegen) {
        this.healthRegen = healthRegen;
    }

    public Integer getLifesteal() {
        return this.lifesteal;
    }

    public void setLifesteal(Integer lifesteal) {
        this.lifesteal = lifesteal;
    }

    public Integer getMagicPen() {
        return this.magicPen;
    }

    public void setMagicPen(Integer magicPen) {
        this.magicPen = magicPen;
    }

    public Integer getMagicPenPercent() {
        return this.magicPenPercent;
    }

    public void setMagicPenPercent(Integer magicPenPercent) {
        this.magicPenPercent = magicPenPercent;
    }

    public Integer getMagicResist() {
        return this.magicResist;
    }

    public void setMagicResist(Integer magicResist) {
        this.magicResist = magicResist;
    }

    public Integer getMovementSpeed() {
        return this.movementSpeed;
    }

    public void setMovementSpeed(Integer movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public Integer getOmnivamp() {
        return this.omnivamp;
    }

    public void setOmnivamp(Integer omnivamp) {
        this.omnivamp = omnivamp;
    }

    public Integer getPhysicalVamp() {
        return this.physicalVamp;
    }

    public void setPhysicalVamp(Integer physicalVamp) {
        this.physicalVamp = physicalVamp;
    }

    public Integer getPower() {
        return this.power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getPowerMax() {
        return this.powerMax;
    }

    public void setPowerMax(Integer powerMax) {
        this.powerMax = powerMax;
    }

    public Integer getPowerRegen() {
        return this.powerRegen;
    }

    public void setPowerRegen(Integer powerRegen) {
        this.powerRegen = powerRegen;
    }

    public Integer getSpellVamp() {
        return this.spellVamp;
    }

    public void setSpellVamp(Integer spellVamp) {
        this.spellVamp = spellVamp;
    }

    public ChampionStatsDto(Integer abilityHaste, Integer abilityPower, Integer armor, Integer armorPen,
            Integer armorPenPercent, Integer attackDamage, Integer attackSpeed, Integer bonusArmorPenPercent,
            Integer bonusMagicPenPercent, Integer ccReduction, Integer cooldownReduction, Integer health,
            Integer healthMax, Integer healthRegen, Integer lifesteal, Integer magicPen, Integer magicPenPercent,
            Integer magicResist, Integer movementSpeed, Integer omnivamp, Integer physicalVamp, Integer power,
            Integer powerMax, Integer powerRegen, Integer spellVamp) {
        this.abilityHaste = abilityHaste;
        this.abilityPower = abilityPower;
        this.armor = armor;
        this.armorPen = armorPen;
        this.armorPenPercent = armorPenPercent;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
        this.bonusArmorPenPercent = bonusArmorPenPercent;
        this.bonusMagicPenPercent = bonusMagicPenPercent;
        this.ccReduction = ccReduction;
        this.cooldownReduction = cooldownReduction;
        this.health = health;
        this.healthMax = healthMax;
        this.healthRegen = healthRegen;
        this.lifesteal = lifesteal;
        this.magicPen = magicPen;
        this.magicPenPercent = magicPenPercent;
        this.magicResist = magicResist;
        this.movementSpeed = movementSpeed;
        this.omnivamp = omnivamp;
        this.physicalVamp = physicalVamp;
        this.power = power;
        this.powerMax = powerMax;
        this.powerRegen = powerRegen;
        this.spellVamp = spellVamp;
    }

}