package com.company;

public class Hero {
    private int HeroHealth;
    private int HeroDamage;
    private String HeroSuperSkills;
    public Hero(int HeroHealth,int HeroDamage, String HeroSuperSkills) {
        this.HeroHealth = HeroHealth;
        this.HeroDamage = HeroDamage;
        this.HeroSuperSkills = HeroSuperSkills;
    }
    public Hero (int HeroHealth, int HeroDamage) {
        this.HeroHealth = HeroHealth;
        this.HeroDamage = HeroDamage;
    }

    public int getHeroHealth() {
        return HeroHealth;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

    public String getHeroSuperSkills() {
        return HeroSuperSkills;
    }
}

