package com.isep.rpg;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name, 50, 30, 50, 30,"Warrior");
    }

    @Override
    public int defend() {
        return 0;
    }

    @Override
    public void useconsumable(Consumable consumable) {

    }
}