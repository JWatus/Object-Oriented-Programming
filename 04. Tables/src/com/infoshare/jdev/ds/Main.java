package com.infoshare.jdev.ds;

import com.infoshare.jdev.ds.arr.ArraysExample;

/**
 * Print code must be here!
 */
public class Main {

    public static void main(String[] args) {
        ArraysExample arr = new ArraysExample();

        for(boolean b: arr.getOne()){
            System.out.println(b);
        }
        //get arrays and print

        for(int[] c: arr.getTwo()){
            System.out.println(c);
        }
    }
}
