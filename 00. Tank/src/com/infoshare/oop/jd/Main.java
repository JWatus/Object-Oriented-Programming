package com.infoshare.oop.jd;

import com.infoshare.oop.jd.body.Barrel;
import com.infoshare.oop.jd.body.Tower;
import com.infoshare.oop.jd.body.firearm.Ammo;

/**
 * Created by Jakub Watus
 */
public class Main {

    public static void main(String[] args) {

        Tower<String> tower = new Tower(1.0, "MY", 11, 'Z');
        Tower<Integer> tower1 = new Tower(4.0, "KLODH", 6, 'P');
        Tower<Character> tower2 = new Tower(6.0, "GBH", 121, 'B');

        System.out.println(tower2.getBattalion() + " " + tower2.getNumberOfBarrels() + " " + tower2.getRadius() + " " + tower2.getSerialNumber());


        Barrel<String> barrel = new Barrel(10, 400, "Steel", 'u');

        System.out.println(barrel.getDiameter() + " " + barrel.getLength() + " " + barrel.getTextile() + " " + barrel.getModel());


        for(Ammo ammo: Ammo.values())
        System.out.println(ammo.getAmmoType());


    }


}

