package com.infoshare.oop.jd.body;

public class Messaging {

    private Messaging() {
    }

    public static void gunMessage(String message){
        System.out.println("[GUN message] " + message);
    }
    public static void battlefieldMessage(String message){
        System.out.println("[BATTLEFIELD message] " + message);
    }
    public static void ridingMessage(String message){
        System.out.println("[RIDING message] " + message);
    }
    public static void tankMessage(String message){
        System.out.println("[TANK message] " + message);
    }
}
