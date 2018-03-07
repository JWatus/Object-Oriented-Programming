package com.infoshare.oop.jd.body.gun.services;

import com.infoshare.oop.jd.body.gun.Ammo;

public interface FirearmService {

    void fire();
    void reload();

    Ammo getAmmoType();
    int getAmmoCount();
    boolean isMyGunAutomatic();
    int getClipSize();
    <T extends Number> T getWeight();
}
