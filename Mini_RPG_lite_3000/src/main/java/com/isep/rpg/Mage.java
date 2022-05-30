package com.isep.rpg;

public class Mage extends SpellCaster{
    public Mage(String name) {
        super(name, 25, 20, 60, "SpellCaster",80 , "Mage");
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }

    @Override
    public void useconsumable(Consumable consumable) {

    }
}
