package com.infoshare.oop.jd.body.riding;

import com.infoshare.oop.jd.Tank;
import com.infoshare.oop.jd.body.Messaging;

import java.awt.*;

public class Battlefield {
    private static final int BOUND = 10;

    private Tank[][] battlefieldMap = new Tank[BOUND][BOUND];

    public int getBound() {
        return BOUND;
    }

    Dimension getPositionOfATank(Tank tank) {
        Dimension position = new Dimension(0, 0);
        for (Tank[] rows : battlefieldMap) {
            for (Tank one : rows) {
                if (one.equals(tank)) return position;
                position.height += 1;
            }
            position.width += 1;
        }
        return new Dimension(-1,-1);
    }

    void setPositionFor(Tank tank, int x, int y) {
        checkCoordinates(x, y);
        if (battlefieldMap[x][y] == null) battlefieldMap[x][y] = tank;
        else Messaging.battlefieldMessage("There's already a tank in position " + x + " , " + y + "!");
    }

    Dimension getCenterPosition() {
        return new Dimension(BOUND / 2, BOUND / 2);
    }

    private void checkCoordinates(int x, int y) {
        if (x > BOUND || y > BOUND)
            Messaging.battlefieldMessage("Coordinates are wrong! Tank is staying in it's original position.");
    }
}
