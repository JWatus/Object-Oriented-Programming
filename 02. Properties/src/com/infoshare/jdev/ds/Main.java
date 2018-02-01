package com.infoshare.jdev.ds;

import com.infoshare.jdev.ds.common.PropertiesExample;

public class Main {

    public static void main(String[] args) {
        PropertiesExample t = new PropertiesExample();
        System.out.println("Value of \"infoshare\" value: " + t.getValue("infoshare"));
        System.out.println("Contents of properties file:\n");
        t.printProperties();

    }
}
