package com.infoshare.jdev.ds.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Create array list and linked list.
 * <p>
 * Fill them with values.
 * <p>
 * Then write a code for adding, removal and listing.
 */
public class ListsExample {

    private List<String> myList = new ArrayList<String>();
    private List<String> myList2 = new LinkedList<String>();


    public void addArrayList(String element) {

        myList.add(element);
    }

    public void addLinkedList(String element) {

        myList.add(element);
    }

    public void removeArrayList(int index) {

        myList.remove(index);
    }

    public void removeLinkedList(int index) {

        myList2.remove(index);
    }

    public void listArrayList() {

        for (String a : myList) {
            System.out.println(a);
        }
    }

    public void listLinkedListList() {

        for (String a : myList2) {
            System.out.println(a);
        }

    }
}
