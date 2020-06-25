package com.company;

public class Main {

    public static void main(String[] args) {
        Boss b1 = new Boss();
        b1.setDamage(200);
        b1.setHealth(250);
        Weapon weapon1 = new Weapon("Machine gun","M16A2");
        b1.setWeapon1(weapon1);
        System.out.println(b1.toString() + " " + b1.getDamage() + " " + b1.getHealth());
    }
}
