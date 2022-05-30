package com.isep.rpg;

public abstract class SpellCaster extends Hero{
    private int manaPoints;
    private String spé;

    public SpellCaster(String nom, int lifepoints, int armor, int weaponDamage, String Class,int manaPoints , String Spé) {
        super(nom, lifepoints, armor, weaponDamage, manaPoints,Spé);
        this.manaPoints=manaPoints;
        this.spé=Spé;
    }


    @Override
    public int defend() {
        return 0;
    }

    @Override
    public void useconsumable(Consumable consumable) {

    }
}
