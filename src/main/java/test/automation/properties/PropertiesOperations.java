package test.automation.properties;

import java.io.*;
import java.util.Properties;

public class PropertiesOperations {

    public Properties getProperties(String fileName) throws IOException {
        Properties prop;
        prop = new Properties();
        FileInputStream fileIn = new FileInputStream("PropertiesFiles\\Data.properties");
        prop.load(fileIn);
        fileIn.close();
        return prop;

    }

    public Properties setProperties(Properties prop, String key, String data) throws IOException {
        prop.setProperty(key, data);
        return prop;
    }

    public static void main(String[] args) throws IOException {
        PropertiesOperations pro= new PropertiesOperations();
     Properties prop=   pro.getProperties("");
        pro.setProperties(prop,"zaid","haque");
    }
}
