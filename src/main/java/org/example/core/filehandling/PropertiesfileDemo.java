package org.example.core.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Properties;

public class PropertiesfileDemo {

    public static void main(String[] args) throws Exception {
        Properties p =new Properties();
        OutputStream os =new FileOutputStream("dataConfig.properties");

        p.setProperty("name","madhusudhanreddy");
        p.setProperty("age","23");
        p.setProperty("fathername","Ram Gopal Reddy");

        p.store(os,null);

        InputStream is =new FileInputStream("dataconfig.properties");
        p.load(is);

        System.out.println(p.getProperty("age"));
        System.out.println(p.getProperty("fathername"));

        p.list(System.out);
    }
}
