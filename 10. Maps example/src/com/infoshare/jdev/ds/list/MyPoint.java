package com.infoshare.jdev.ds.list;

import java.awt.*;

public class MyPoint extends Point implements Comparable<MyPoint> {

    public MyPoint(int x, int y) {
        super(x, y);
    }


    @Override
    public int compareTo(MyPoint o) {
        if (x > o.x) return 1;
        else if (x < o.x) return -1;
        return 0;
    }
}
