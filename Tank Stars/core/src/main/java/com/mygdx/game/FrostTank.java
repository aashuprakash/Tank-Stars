package com.mygdx.game;

import java.io.Serializable;
import java.util.ArrayList;

public class FrostTank extends Tank implements Serializable {
    private ArrayList<Weapon> weapons;
    private ArrayList<Weapon> currWeapons;
    public FrostTank(Float x, Float y, Float width, Float height,int number) {
        super(x, y, width, height,"frost",number);
    }
    public void fireWeapon()
    {

    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public void setCurrWeapons(ArrayList<Weapon> currWeapons) {
        this.currWeapons = currWeapons;
    }
}
