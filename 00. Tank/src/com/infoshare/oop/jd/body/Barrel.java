package com.infoshare.oop.jd.body;

public class Barrel<T> {

    public double getDiameter() {
        return diameter;
    }

    public int getLength() {
        return length;
    }

    public T getTextile() {
        return textile;
    }

    public char getModel() {
        return model;
    }

    double diameter;
    int length;
    T textile;
    char model;


    public Barrel(double diameter, int length, T textile, char model) {
        this.diameter = diameter;
        this.length = length;
        this.textile = textile;
        this.model = model;
    }


}