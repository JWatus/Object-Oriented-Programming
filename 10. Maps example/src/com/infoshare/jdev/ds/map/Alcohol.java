package com.infoshare.jdev.ds.map;

public class Alcohol {

    String name;
    double percentage;

    public Alcohol(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Alcohol: " + name + " Percentage [%]: " + percentage;
    }
}
