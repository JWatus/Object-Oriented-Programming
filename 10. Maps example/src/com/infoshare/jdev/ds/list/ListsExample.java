package com.infoshare.jdev.ds.list;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Create an object called Position
 * with fields posX, posY and all the needed methods
 * <p>
 * Create an ArrayList
 * <p>
 * Fill it with 10 instances of Position
 * (posX and posY values should be generated randomly)
 * <p>
 * Find the sum of posX and posY for all of the elements
 * Find the average posX and posY.
 * <p>
 * Sort the ArrayList by posX and posY separately. (Comparator)
 * <p>
 * ------------------------------------------------------
 * <p>
 * Create a LinkedList
 * <p>
 * Fill it with 10 instances of Position
 * <p>
 * Find the first element that has odd posX
 * and print value behind and after it
 */
public class ListsExample {

    int x;
    int y;

/////////////// CREATING POINT /////////////////////////////////////////////////////////////////////////////////////////

    public MyPoint createPosition(int x, int y) {

        this.x = x;
        this.y = y;

        return new MyPoint(x, y);
    }

/////////////// CREATING AND FILLING LIST //////////////////////////////////////////////////////////////////////////////

    public List<MyPoint> listOne = new ArrayList<>();


    public void addPositions() {

        fillList(listOne);
    }

    public void fillList(List list) {

        for (int i = 0; i < 10; i++) {

            list.add(createPosition(new Random().nextInt(20), new Random().nextInt(20)));

        }

        System.out.println(list);
    }

/////////////// SUM AND AVERAGE ////////////////////////////////////////////////////////////////////////////////////////

    public int findSumAndAvarageX() {

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = sum + listOne.get(i).x;
        }

        int avX = sum / 10;

        return avX;
    }

    public int findSumAndAvarageY() {

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = sum + listOne.get(i).y;
        }

        int avY = sum / 10;

        return avY;
    }

/////////////// SORTING LIST BY X AND Y ////////////////////////////////////////////////////////////////////////////////

    public void compareX() {

       Collections.sort(listOne);

    }

}


