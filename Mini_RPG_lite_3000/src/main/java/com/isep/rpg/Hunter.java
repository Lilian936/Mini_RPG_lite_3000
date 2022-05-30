package com.isep.rpg;

public class Hunter extends Hero{
    public Hunter(String name) {
        super(name, 30, 20, 30, 50,"Hunter");
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
