package com.infoshare.oop.jd.body.gun.services;

import com.infoshare.oop.jd.body.gun.Cannon;

public class CannonServiceImpl extends FirearmServiceImpl<Cannon> implements CannonService{

    public CannonServiceImpl(int ammoCount) {
        super(new Cannon(ammoCount));
    }
}
