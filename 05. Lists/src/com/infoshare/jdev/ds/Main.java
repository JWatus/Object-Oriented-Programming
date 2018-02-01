package com.infoshare.jdev.ds;

import com.infoshare.jdev.ds.list.ListsExample;

import java.util.function.Function;

public class Main {


    public static void main(String[] args) {
        ListsExample lists = new ListsExample();

        System.out.println("Dry run: " + checkExecutionTime(s -> { System.out.println(); return null;}) + " ms");

        System.out.println("Adding ArrayList: " + checkExecutionTime(s -> {lists.addArrayList("Johnny"); return null;}) + " ms");
        System.out.println("Adding LinkedList: " + checkExecutionTime(s -> {lists.addLinkedList("Johnny"); return null;}) + " ms");

        System.out.println("Removing from ArrayList: " + checkExecutionTime(s -> {lists.removeArrayList(0); return null;}) + " ms");
        System.out.println("Removing from LinkedList: " + checkExecutionTime(s -> {lists.removeLinkedList(0); return null;}) + " ms");

        System.out.println("Listing ArrayList: " + checkExecutionTime(s -> {lists.listArrayList(); return null;}) + " ms");
        System.out.println("Listing LinkedList: " + checkExecutionTime(s -> {lists.listLinkedListList(); return null;}) + " ms");

        /*
        * Zaimplementowąć generowanie losowych wartości i zmierzyć ile wynosi czas dla 565 elementu
        * */

    }

    private static long checkExecutionTime(Function<Void, Void> method){
        long startTime = System.nanoTime()/1000;
        method.apply(null);
        long endTime = System.nanoTime()/1000;

        return endTime - startTime;
    }
}
