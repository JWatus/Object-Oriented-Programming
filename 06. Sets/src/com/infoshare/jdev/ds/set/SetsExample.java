package com.infoshare.jdev.ds.set;

import java.util.*;

/**
 * Implement the following
 *  HashSet
 *  LinkedHashSet
 *  TreeSet
 *
 *  fill them with values and print them.
 */
public class SetsExample {

    Set<Integer> mySet = new HashSet<Integer>();
    Set<Integer> mySet2 = new LinkedHashSet<Integer>();
    Set<Integer> mySet3 = new TreeSet<Integer>();

    private <T> void printSet(Set<T> set) {
        for (T a: set) {
            System.out.println(a+" ");
        }
    }

    public void printHashSet(){
        mySet.add(new Random().nextInt(20));
        mySet.add(new Random().nextInt(20));
        mySet.add(new Random().nextInt(20));
        System.out.println(mySet);
        printSet(mySet);

    }

    public void printLinkedHashSet(){
        mySet2.add(new Random().nextInt(20));
        mySet2.add(new Random().nextInt(20));
        mySet2.add(new Random().nextInt(20));
        System.out.println(mySet2);
        //printSet(mySet2);
    }

    public void printTreeSet(){
        mySet3.add(new Random().nextInt(20));
        mySet3.add(new Random().nextInt(20));
        mySet3.add(new Random().nextInt(20));
        System.out.println(mySet3);
        //printSet(mySet3);
    }

}
