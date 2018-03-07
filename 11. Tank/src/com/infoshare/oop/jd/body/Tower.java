package com.infoshare.oop.jd.body;

//TODO full refactor
public class Tower<T> {

    public double radius;
    public T serialNumber;
    public int numberOfBarrels;
    public char battalion;

    public Tower(Double radius, T serialNumber, int numberOfBarrels, char battalion) {
        this.radius = radius;
        this.serialNumber = serialNumber;
        this.numberOfBarrels = numberOfBarrels;
        this.battalion = battalion;
    }


}
