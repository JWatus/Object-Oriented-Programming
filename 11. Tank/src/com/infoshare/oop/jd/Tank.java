package com.infoshare.oop.jd;

import com.infoshare.oop.jd.body.Messaging;

public class Tank {

    private int fuelLevel = 100;

    public void decreaseFuelLevel(int amount){
        this.fuelLevel -= amount;
    }

    public void checkFuelLevel(){
        if(this.fuelLevel <= 0) Messaging.tankMessage("There's no fuel left!!");
        else Messaging.tankMessage("Fuel level at " + this.fuelLevel + " %!");
    }
}
