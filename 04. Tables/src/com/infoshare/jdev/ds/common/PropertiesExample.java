package com.infoshare.jdev.ds.common;

import java.io.IOException;
import java.util.Properties;

/**
 * Implement provided methods
 */
public class PropertiesExample {

    private static final ClassLoader PROPERTIES_FILE = Thread.currentThread().getContextClassLoader();

    private static final String FILE = "resource/infoshare.properties";

    private Properties properties = new Properties();

    public PropertiesExample() {
        try{
            loadProperties();
        } catch (IOException e) {
            System.out.println("Where's the file?");
        }
    }

    public String getValue(String value) {

        return properties.getProperty(value);
    }

    public void printProperties(){
        System.out.println(getValue(FILE));
    }

    private void loadProperties() throws IOException {

        properties.load(PROPERTIES_FILE.getResourceAsStream(FILE));

    }
}
