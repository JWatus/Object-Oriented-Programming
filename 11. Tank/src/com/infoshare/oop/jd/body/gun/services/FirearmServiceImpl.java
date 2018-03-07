package com.infoshare.oop.jd.body.gun.services;

import com.infoshare.oop.jd.body.gun.Ammo;
import com.infoshare.oop.jd.body.gun.Gun;
import com.infoshare.oop.jd.body.gun.services.FirearmService;

public class FirearmServiceImpl<T extends Gun> implements FirearmService {

    private T firearm;

    public FirearmServiceImpl(T firearm) {
        this.firearm = firearm;
    }

    public void fire() {
        firearm.fire();
    }

    public void reload() {
        firearm.reload();
    }

    public Ammo getAmmoType() {
        return firearm.getAmmo();
    }

    public int getAmmoCount() {
        return firearm.getAmmoCount();
    }

    public boolean isMyGunAutomatic() {
        return firearm.isAutomatic();
    }

    public int getClipSize() {
        return firearm.getClipSize();
    }

    public <Z extends Number> Z getWeight() {
        return null;
    }


}
