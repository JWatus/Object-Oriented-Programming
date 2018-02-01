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

    Set<Integer> mySet = new HashSet<>();
    Set<Integer> mySet2 = new LinkedHashSet<>();
    Set<Integer> mySet3 = new TreeSet<>();

    private int[] generated;

    public SetsExample() {
        System.out.println("GENERATED ARRAY: ");
        this.generated = generate();
        for (int a:
             this.generated) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    private <T> void printSet(Set<T> set) {
        for (T a: set) {
            System.out.println(a+" ");
        }
    }

    public void printHashSet(){
        mySet.add(this.generated[0]);
        mySet.add(this.generated[1]);
        mySet.add(this.generated[2]);
        System.out.println(mySet);
//        printSet(mySet);

    }

    public void printLinkedHashSet(){
        mySet2.add(this.generated[0]);
        mySet2.add(this.generated[1]);
        mySet2.add(this.generated[2]);
        System.out.println(mySet2);
        //printSet(mySet2);
    }

    public void printTreeSet(){
        mySet3.add(this.generated[0]);
        mySet3.add(this.generated[1]);
        mySet3.add(this.generated[2]);
        System.out.println(mySet3);
        //printSet(mySet3);
    }

    private int[] generate(){
        return new int[]{new Random().nextInt(20), new Random().nextInt(20), new Random().nextInt(20)};
    }

}
