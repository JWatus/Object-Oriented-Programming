package com.infoshare.oop.jd.body.firearm;

public enum Ammo {

    BROWNING(".50cal",10),
    FLAK_GUN("88mm", 20)
    ;

    String ammoType;
    int size;
                                                // ENUMY SA STATIC FINAL
    Ammo(String ammoType, int size) {           // enumy można porownywac == tak samo jak obiekty static final
        this.ammoType = ammoType;
        this.size = size;
    }

    public String getAmmoType() {
        return ammoType;
    }

    public int getSize() {
        return size;
    }

}
