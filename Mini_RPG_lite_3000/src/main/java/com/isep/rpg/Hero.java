package com.isep.rpg;

import java.util.ArrayList;

public abstract class Hero {

    private String nom;
    private String classe;
    private int lifepoints;
    private int armor;
    private int weapondamage;
    private int manapoints;
    private int maxmanapoints;
    private int Arrow;
    private int MaxHp;
    private int life;
    private int mana;

    ArrayList<Potion> potions = new ArrayList<>();
    ArrayList<Food> food = new ArrayList<>();

    public void editpotions(String name,int life,int mana,String type) {
        this.life = life;
        this.mana = mana;
        potions.add(new Potion(name,life,mana,"type"));
    }
    public void editfood(String name, int lifepoints, int mana){
        this.mana += 10;
        this.life += 10;
    }
    public Hero(String nom, int lifepoints, int armor, int weaponDamage, int ManaPoints,String Class) {
        this.maxmanapoints = manapoints;
        this.nom = nom;
        this.classe = Class;
        this.lifepoints = lifepoints;
        this.armor = armor;
        this.weapondamage = weaponDamage;
        this.manapoints = ManaPoints;
        this.MaxHp = lifepoints;
    }
    public int getManapoints() {return manapoints;}
    public int getMaxManapoints(){return maxmanapoints;}
    public int getWeapondamage() {return weapondamage;}
    public int getArmor() {return armor;}
    public String getName() {return nom;}
    public int getLifePoints() {return lifepoints;}
    public String getClasse() {return classe;}
    public int getArrow() {return Arrow;}
    public int getMaxHp(){return MaxHp;}

    public void editarmor(int armor) {
        this.armor += armor;
    }
    public void editlifepoints(int lifepoints) {
        this.lifepoints += lifepoints;
    }
    public void editweapondamage(int weapondamage) {
        this.weapondamage += weapondamage;
    }
    public void editmanapoints(int manapoints) {
        this.manapoints -= manapoints;
    }


    public int attack(){
        return weapondamage;
    }

    abstract public int defend();

    abstract public void useconsumable(Consumable consumable);

    public ArrayList<Potion> getPotions() {
        return potions;
    }
    public ArrayList<Food> getFood() {
        return food;
    }
}
