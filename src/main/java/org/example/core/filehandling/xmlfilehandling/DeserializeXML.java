package org.example.core.filehandling.xmlfilehandling;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class DeserializeXML {

    public static void main(String[] args) {
        List<Student> studentList;
        try {
            InputStream ios = new FileInputStream("college.xml");
            BufferedInputStream bos = new BufferedInputStream(ios);
            XMLDecoder xmlDecoder = new XMLDecoder(bos);
            College c1 = (College) xmlDecoder.readObject();
            studentList = c1.getStudents();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Student s : studentList) {
            System.out.println(s);
        }

        System.out.println("I am runnning");
    }
}
