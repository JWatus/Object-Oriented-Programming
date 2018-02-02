package com.infoshare.jdev.ds.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implement regular expression that will validate an email address.
 */
public class RegexpExample {

    private static final String REGEXP = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

    private Pattern pattern = Pattern.compile(REGEXP, Pattern.CASE_INSENSITIVE);      // Pattern - wzór, obiekt zbierajacy wzorce

    public boolean validate(String string){

        return pattern.matcher(string).matches();           // Matcher - klasa porownujaca stringa ze wzorem(patternem)
    }
}
