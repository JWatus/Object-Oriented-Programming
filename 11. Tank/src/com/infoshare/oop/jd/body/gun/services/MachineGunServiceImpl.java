package com.infoshare.oop.jd.body.gun.services;

import com.infoshare.oop.jd.body.gun.MachineGun;

public class MachineGunServiceImpl extends FirearmServiceImpl<MachineGun> implements MachineGunService {

    public MachineGunServiceImpl(int ammoCount) {
        super(new MachineGun(ammoCount));
    }
}
