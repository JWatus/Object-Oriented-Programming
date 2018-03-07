package com.infoshare.oop.jd.body.riding;

import com.infoshare.oop.jd.Tank;

import java.awt.*;

public class RidingImpl implements Riding{

    private Battlefield battlefield;

    public RidingImpl() {
        this.battlefield = new Battlefield();
    }

    public void goTo(Tank tank, int x, int y) {
        battlefield.setPositionFor(tank, x, y);
    }

    public Dimension getPostition(Tank tank) {
        return battlefield.getPositionOfATank(tank);
    }

    public void resetPosition(Tank tank) {
        Dimension center = battlefield.getCenterPosition();
        battlefield.setPositionFor(tank, center.height, center.width);
    }

}
