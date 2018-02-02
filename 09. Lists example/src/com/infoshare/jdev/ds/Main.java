package com.infoshare.jdev.ds;

import com.infoshare.jdev.ds.list.ListsExample;
import com.infoshare.jdev.ds.list.MyPoint;

public class Main {

    public static void main(String[] args) {

        ListsExample listEx = new ListsExample();

        listEx.addPositions();

        System.out.println("Avarage x is equal to: "+listEx.findSumAndAvarageX());
        System.out.println("Avarage y is equal to: "+listEx.findSumAndAvarageY());

    }
}
