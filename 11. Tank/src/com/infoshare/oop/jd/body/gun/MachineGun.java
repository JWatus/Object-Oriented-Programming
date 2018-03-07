package com.infoshare.oop.jd.body.gun;

public class MachineGun extends Gun<Double> {

    private static final Ammo AMMO = Ammo.BROWNING;
    private static final boolean IS_AUTOMATIC = true;
    private static final double WEIGTH = 10;
    private static final int CLIP_SIZE = 100;

    public MachineGun(int ammoCount) {
        super(AMMO, ammoCount, IS_AUTOMATIC, WEIGTH, CLIP_SIZE);
    }

}
