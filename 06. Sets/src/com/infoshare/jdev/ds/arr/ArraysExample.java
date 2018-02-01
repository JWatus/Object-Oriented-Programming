package com.infoshare.jdev.ds.arr;

import java.util.Random;

/**
 * Define one, two and three dimensional arrays:
 * <p>
 * one - boolean type
 * two - number type
 * three - text type
 * <p>
 * fill them with any random values and print formatted as following
 * e.g. two:
 * <p>
 * Row: 1 ; Values: X,Y,Z
 * Row: 2 ; Values: A,B,C
 * .
 * .                                    // w tablicach dwuwymiarowych W-K (wiersz-kolumny) String [w][k] name;
 * Row n ; Values: 1,2,3
 */
public class ArraysExample {

    private boolean[] myBoolean = new boolean[10];
    private int[][] myInteger = new int[10][10];
    private String[][][] myString = new String[10][10][10];


    public boolean[] getOne() {
        generateRandomBooleanArray();
        return myBoolean;
    }

    public int[][] getTwo() {

        generateRandomIntegerArray();
        return myInteger;

    }

    public String[][][] getThree() {

        return null;
    }

    public void generateRandomBooleanArray() {
        for (int i = 0; i < myBoolean.length; i++) {
            myBoolean[i] = (new Random().nextInt(2)) == 1; // (max + 1 - min)

        }
    }

    public void generateRandomIntegerArray() {
        for (int i = 0; i < myInteger.length; i++) {
            for (int j = 0; j < myInteger[i].length; j++) {
                myInteger[i][j] = new Random().nextInt(100);
            }
        }
    }
}
