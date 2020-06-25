package com.company;

public class Weapon {
    private String typeOfWeapon;
    private String nameOfWeapon;

    public Weapon(String typeOfWeapon, String nameOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
        this.nameOfWeapon = nameOfWeapon;
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    @Override
    public String toString() {
        return "Weapon {" +
                "typeOfWeapon='" + typeOfWeapon + '\'' +
                ", nameOfWeapon='" + nameOfWeapon + '\'' +
                '}';
    }
}
