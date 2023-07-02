package org.example.core.filehandling.xmlfilehandling;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.io.File;

public class SerializeXML {

    public static void main(String[] args) throws Exception{

        Student s1 =new Student();
        s1.setRollno(100);
        s1.setSname("Madhu Sudhan Reddy");

        Student s2 =new Student();
        s2.setRollno(101);
        s2.setSname("Sai krishna Reddy");

        List<Student> s =new ArrayList<>();
        s.add(s1);
        s.add(s2);

        College college =new College();
        college.setStudents(s);

        File file =new File("college.xml");
        OutputStream oos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(oos);
        XMLEncoder x = new XMLEncoder(bos);
        x.writeObject(college);
        x.close();



    }
}
