package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss( "Boss status ",700,50,"Shield");
    System.out.println(boss.getBossStatus()+ " " + "Health:" + " " + boss.getBossHealth() + " " + "Damage:" + boss.getBossDamage() +
        " "+ " Defense: " + boss.getBossDefenseType());
        Hero[] GroupHeroes = CreateHeroes();
        for (Hero Group:GroupHeroes) {
            System.out.println(Group.getHeroHealth()+" " + Group.getHeroDamage() + " " + Group.getHeroSuperSkills());

        }

        }

    public static Hero[] CreateHeroes(){
        Hero hero1 = new Hero(250,30,"Punch");
        Hero hero2 = new Hero(250,20,"Kick");
        Hero hero3 = new Hero(100,10);
        Hero[] GroupHeroes = {hero1,hero2,hero3};
        return GroupHeroes;
    }
}
