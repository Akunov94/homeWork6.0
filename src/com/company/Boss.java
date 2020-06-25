package com.company;

public class Boss extends GameEntity{
    Weapon weapon1;

    public Weapon getWeapon1() {
        return weapon1;
    }

    public void setWeapon1(Weapon weapon1) {
        this.weapon1 = weapon1;
    }

    /*
    @Override
    public String toString() {
        return "Boss{" +
                "weapon1=" + weapon1 +
                '}';
    }
     */

    @Override
    public String toString() {
        return "Boss " + weapon1;
    }
}
