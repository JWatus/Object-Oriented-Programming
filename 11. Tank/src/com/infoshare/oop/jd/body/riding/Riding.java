package com.infoshare.oop.jd.body.riding;

import com.infoshare.oop.jd.Tank;

import java.awt.*;

public interface Riding {

    void goTo(Tank tank, int x, int y);
    Dimension getPostition(Tank tank);
    void resetPosition(Tank tank);

}
