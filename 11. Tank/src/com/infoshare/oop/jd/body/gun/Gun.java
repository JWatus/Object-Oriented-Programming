package com.infoshare.oop.jd.body.gun;

import com.infoshare.oop.jd.body.Messaging;

public abstract class Gun<T> {

    private Ammo ammo;
    private int ammoCount;
    private boolean isAutomatic;
    private T weight;
    private int clipSize;

    private boolean isReloaded = true;
    private int clipCondition;

    public Gun(Ammo ammo, int ammoCount, boolean isAutomatic, T weight, int clipSize) {
        this.ammo = ammo;
        this.ammoCount = ammoCount;
        this.isAutomatic = isAutomatic;
        this.weight = weight;
        this.clipSize = clipSize;
    }

    protected boolean isReadyToFire(){ return this.clipCondition > 0; }

    /*
        Do rozkminienia :D
     */
    public void reload(){
        int howMuch = clipSize - clipCondition;
        if(this.ammoCount - howMuch < 0) {
            Messaging.gunMessage("Reloading ... ammo running low!");
            howMuch = ammoCount;
        }
        clipCondition += howMuch;
        ammoCount -= howMuch;
        Messaging.gunMessage("Reloaded!");
    }

    public void fire() {
        if (isReadyToFire()) Messaging.gunMessage("Firing from: " + this.getClass() + "!");
        else Messaging.gunMessage("Fired last bullet! Please reload!");
    }

    public int getClipSize() { return clipSize; }

    public T getWeight() { return this.weight; }

    public Ammo getAmmo() { return ammo; }

    public int getAmmoCount() { return ammoCount; }

    public boolean isAutomatic() { return isAutomatic; }

    protected boolean isReloaded() { return isReloaded; }

    protected int getClipCondition() { return clipCondition; }
}
