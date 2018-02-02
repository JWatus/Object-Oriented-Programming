package com.infoshare.jdev.ds.map;

import java.util.*;

/**
 * Create object that be used as a Key and then create:
 * <p>
 * HashMap - key: your_object; value: list with random int
 * LinkedHashMap - key: random_string; value: set with some names
 * TreeMap - key: integer; value: queue with any values e.g. double
 * <p>
 * then print the contents of each of them.
 */
public class MapsExample {

    private Map<String, List<Integer>> hashMap = new HashMap<>();
    private Map<String, Set<String>> linkedHashMap = new LinkedHashMap<>();
    private Map<Integer, Queue<Double>> treeMap = new TreeMap<>();

    public void printHashMap() {
        hashMap.put("ListOne", generateIntegers(10) );
        hashMap.put("ListTwo", generateIntegers(10) );
        hashMap.put("ListThree", generateIntegers(10) );
        printMap(hashMap);
    }

    public void printLinkedHashMap() {
        linkedHashMap.put("Set1", new HashSet<>(Arrays.asList("A","B","C")));       // asList(... a) - mozna podawać tyle argumentów ile chcemy
        linkedHashMap.put("Set2", new HashSet<>(Arrays.asList("A","B","C","D")));
        linkedHashMap.put("Set3", new HashSet<>(Arrays.asList("A","B","C","D","E")));
        printMap(linkedHashMap);
    }

    public void printTreeMap() {

        printMap(treeMap);
    }

    private <K, V extends Collection> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> single : map.entrySet()) {             // Entry - zwraca pare klucz wartość
            System.out.println("Key: " + single.getKey() + " ; Value: " + Arrays.toString(single.getValue().toArray()));
        }
    }

    private List<Integer> generateIntegers(int numberOf) {
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i =0; i < numberOf; i++) {
            numbers.add(new Random().nextInt(100));
        }
        return numbers;
    }










    private String formatCollection(Collection c) {
        String result = "";
        for(;;);
    }


}
