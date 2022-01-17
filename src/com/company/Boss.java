package com.company;

public class Boss {
    private String BossStatus;
    private int BossHealth;
    private int BossDamage;
    private String BossDefenseType;

    public Boss(String bossStatus, int bossHealth, int bossDamage, String bossDefenseType) {
        BossStatus = bossStatus;
        BossHealth = bossHealth;
        BossDamage = bossDamage;
        BossDefenseType = bossDefenseType;
    }

    public String getBossStatus() {
        return BossStatus;
    }

    public void setBossStatus(String bossStatus) {
        BossStatus = bossStatus;
    }

    public int getBossHealth() {
        return BossHealth;
    }

    public void setBossHealth(int bossHealth) {
        BossHealth = bossHealth;
    }

    public int getBossDamage() {
        return BossDamage;
    }

    public void setBossDamage(int bossDamage) {
        BossDamage = bossDamage;
    }

    public String getBossDefenseType() {
        return BossDefenseType;
    }

    public void setBossDefenseType(String bossDefenseType) {
        BossDefenseType = bossDefenseType;
    }
}
