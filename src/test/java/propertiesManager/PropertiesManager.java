package propertiesManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {
    private static final File file = new File("src/test/resources");
    private static final Properties properties = new Properties();

    public static void setProperty(String key, String value) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath() + "/properties.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
            FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsolutePath() + "/properties.properties");
            properties.setProperty(key, value);
            properties.store(fileOutputStream, null);
            fileOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key) {
        try {
            properties.load(new FileInputStream(file.getAbsolutePath() + "/properties.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(key);
    }
}
