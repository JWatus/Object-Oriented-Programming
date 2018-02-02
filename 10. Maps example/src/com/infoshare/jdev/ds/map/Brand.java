package com.infoshare.jdev.ds.map;

public class Brand {

    String name;
    String countryOfOrigin;

    public Brand(String name, String countryOfOrigin) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Brand: " + name + " from " + countryOfOrigin;
    }
}
