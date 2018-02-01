package com.infoshare.oop.jd.body.firearm;

public class Cannon extends Gun implements FirearmService{

    private static final Ammo AMMO = Ammo.FLAK_GUN;
    private static final boolean IS_AUTOMATIC = false;
    private static final double WEIGTH = 200;
    private static final int CLIP_SIZE = 50;

    public Cannon(int ammoCount) {
        super(AMMO, ammoCount, IS_AUTOMATIC, WEIGTH);
    }

    public int clipSize() {
        return CLIP_SIZE;
    }

    public Double giveWeigth() {
        return WEIGTH;
    }

    @Override
    public void shotSpeed() {

    }

    @Override
    public void prefire() {

    }

    @Override
    public void reload() {

    }

    @Override
    public void changeInclination(double angle) {

    }
}