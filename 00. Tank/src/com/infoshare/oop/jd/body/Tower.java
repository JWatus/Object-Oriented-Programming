package com.infoshare.oop.jd.body;

public class Tower<T> {

    private double radius;
    private T serialNumber;
    private int numberOfBarrels;
    private char battalion;

    public Tower(double radius, T serialNumber, int numberOfBarrels, char battalion) {
        this.radius = radius;
        this.serialNumber = serialNumber;
        this.numberOfBarrels = numberOfBarrels;
        this.battalion = battalion;
    }

    public char getBattalion() {
        return battalion;
    }

    public void setBattalion(char battalion) {
        this.battalion = battalion;
    }

    public double getRadius() {
        return radius;
    }

    public int getNumberOfBarrels() {
        return numberOfBarrels;
    }

    public T getSerialNumber() {
        return serialNumber;
    }
}

