package org.example.core.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SerialDemo {

    public static void main(String[] args) throws Exception {
        Save obj =new Save();
        obj.i=123456;

        File f =new File("obj-read.txt");
        OutputStream fos= new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);

        InputStream fis =new FileInputStream("obj-read.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Save obj1 =(Save)ois.readObject();

        System.out.println("The Value of the I "+obj.i);

    }
}
class Save implements Serializable {
    int i;
}