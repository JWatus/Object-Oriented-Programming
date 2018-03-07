package com.infoshare.oop.jd.body.gun;

public enum Ammo {

    BROWNING(".50cal", 10),
    FLAK_GUN("88mm", 20)
    ;

    String ammoType;
    int size;

    Ammo(String ammoType, int size) {
        this.ammoType = ammoType;
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public String getAmmoType() {
        return ammoType;
    }
}
