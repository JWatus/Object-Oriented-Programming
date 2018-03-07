package com.infoshare.oop.jd.body.gun;

public class Cannon extends Gun<Double> {

    private static final Ammo AMMO = Ammo.FLAK_GUN;
    private static final boolean IS_AUTOMATIC = false;
    private static final double WEIGTH = 100;
    private static final int CLIP_SIZE = 1;

    public Cannon(int ammoCount) {
        super(AMMO, ammoCount, IS_AUTOMATIC, WEIGTH, CLIP_SIZE);
    }

}
