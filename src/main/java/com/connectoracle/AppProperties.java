package com.connectoracle;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AppProperties {

    private static Properties properties;

    private AppProperties() {
    }

    private static Properties getSingletonProperties() throws IOException {
        if (properties == null){
            properties = new Properties();
            properties.load(new FileReader("src/main/resources/app.properties"));
        }

        return properties;
    }

    public static String getValue(String property) throws IOException {
        return getSingletonProperties().getProperty(property);
    }
}
