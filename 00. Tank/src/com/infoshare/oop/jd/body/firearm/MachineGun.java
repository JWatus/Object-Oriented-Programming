package com.infoshare.oop.jd.body.firearm;

public class MachineGun extends Gun<Double> implements FirearmService {   // wszystko co jest w generykach w funkcji w ktorej jestesmy
                                                                          // bedzie funkcjonowalo dalej na prawo

    private static final Ammo AMMO = Ammo.BROWNING;                       // zmienne static sa pierw tworzone - potem reszta
    private static final boolean IS_AUTOMATIC = true;
    private static final double WEIGTH = 10;
    private static final int CLIP_SIZE = 100;

    public MachineGun( int ammoCount) {
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
