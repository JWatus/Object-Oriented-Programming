package com.infoshare.jdev.ds.map;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Create an object Brand with fields
 * name and countryOfOrigin
 * <p>
 * Create objects Beer, Wine, Whiskey and Vodka
 * with fields name and percentage
 * <p>
 * Create HashMap and ArrayList
 * <p>
 * Add to HashMap pairs:
 * - as Key - Brand
 * - as Value - ArrayList with 3 objects of your choice
 * <p>
 * Print Alcohols for desired Brand
 * <p>
 * -----------------------------------------------------
 * <p>
 * Do the same for LinkedHashMap as above but use iterator
 * for printing
 * <p>
 * -----------------------------------------------------
 * <p>
 * Do the same for TreeMap but sort it by percentage :)
 */
public class MapsExample {

    Brand brandOne = new Brand("Brand 1", "Polska");
    Brand brandTwo = new Brand("Brand 2", "Niemcy");
    Brand brandThree = new Brand("Brand 3", "Szkocja");

    Alcohol whiskeyOne = new Alcohol("Jack Daniels", 40);
    Alcohol whiskeyTwo = new Alcohol("Johny Walker", 40);
    Alcohol whiskeyThree = new Alcohol("Red Labels", 40);

    Alcohol wineOne = new Alcohol("Lesny Dzban", 13);
    Alcohol wineTwo = new Alcohol("Prosecco", 12);
    Alcohol wineThree = new Alcohol("CherryMix", 11);

    Alcohol vodkaOne = new Alcohol("Sobieski", 40);
    Alcohol vodkaTwo = new Alcohol("BOLS", 40);
    Alcohol vodkaThree = new Alcohol("Rasputin", 80);

    Alcohol beerOne = new Alcohol("Specjal", 5);
    Alcohol beerTwo = new Alcohol("Tyskie", 4);
    Alcohol beerThree = new Alcohol("Lech", 4);


    List<Alcohol> arrayListOne = new ArrayList<>();
    List<Alcohol> arrayListTwo = new ArrayList<>();
    List<Alcohol> arrayListThree = new ArrayList<>();
    List<Alcohol> arrayListFour = new ArrayList<>();

    public void fillList() {
        arrayListOne.add(whiskeyOne);
        arrayListOne.add(whiskeyTwo);
        arrayListOne.add(whiskeyThree);

        arrayListTwo.add(vodkaOne);
        arrayListTwo.add(vodkaTwo);
        arrayListTwo.add(vodkaThree);

        arrayListThree.add(beerOne);
        arrayListThree.add(beerTwo);
        arrayListThree.add(beerThree);

        arrayListFour.add(wineOne);
        arrayListFour.add(wineTwo);
        arrayListFour.add(wineThree);
    }

    Map<Brand, List<Alcohol>> map = new HashMap<>();

    public void fillMap() {

        map.put(brandOne, arrayListOne);
        map.put(brandTwo, arrayListTwo);
        map.put(brandThree, arrayListThree);

        printMap(map);
    }

    private <K extends Brand, V extends List<Alcohol>> void printMap(Map<K,V> map){

        for (Map.Entry<K,V> single : map.entrySet()) {

            System.out.println("Key: " + single.getKey() + " ; Value: " + Arrays.toString(single.getValue().toArray()));
        }
    }
}
