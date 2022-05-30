package com.isep.rpg;

public class Consumable {

    private int lifepoints;
    private int manapoints;
    private String name;
    private String type;
    public Consumable(String name, int lifepoints, int manapoints, String type) {
        this.lifepoints = lifepoints;
        this.name = name;
        this.manapoints = manapoints;
        this.type = type;

    }
    public String getName() {

        return name;
    }
}