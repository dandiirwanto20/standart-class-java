package learn.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);

        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        } catch (IOException exception) {
            System.out.println("I/O Exception");
        }

       try {
           Properties properties = new Properties();

           // menyimpan data properties
           properties.put("name.first", "Dandi");
           properties.put("name.last", "Irwanto");

           properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama");
       } catch (FileNotFoundException exception) {
           System.out.println("Error membuat file properties");
       } catch (IOException exception) {
           System.out.println("Error menyimpan file properties");
       }
    }
}
