package com.infoshare.oop.jd.body.firearm;

public abstract class Gun<T> {

    private Ammo ammo;
    private int ammoCount;
    private boolean isAutomat;
    protected T weigth;

    public Gun(Ammo ammo, int ammoCount, boolean isAutomat, T weight) {
        this.ammo = ammo;
        this.ammoCount = ammoCount;
        this.isAutomat = isAutomat;
        this.weigth = weight;
    }

    public abstract int clipSize();

    public abstract T giveWeigth();

    public Ammo getAmmo() {
        return ammo;
    }

    public int getAmmoCount() {
        return ammoCount;
    }

    public boolean isAutomat() {
        return isAutomat;
    }

    public T getWeigth() {
        return weigth;
    }


}
