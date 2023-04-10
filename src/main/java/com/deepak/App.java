package com.deepak;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "project started " );
        
        // SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        
        // System.out.println(factory);
        // System.out.println(factory.isClosed());
        
        //creating student
        Student_Data std=new Student_Data();
        std.setStudentId(102);
        std.setStudentName("smith");
        std.setCity("lucknow");
        System.out.println(std);
        
        
        //creating object of address class

        Address address=new Address();
        address.setSreeet("street1");
        address.setCity("delhi");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setD(1234.1234);
        
        
        // reading image
        
        FileInputStream fis=new FileInputStream("src/main/java/stud.png");
        byte[] data=new byte[fis.available()];
        fis.read(data);
       address.setImage(data);
        
       Session session= factory.openSession();
        
       Transaction tx= session.beginTransaction();
       
       session.save(std);
       session.save(address);
       
       //session.getTransaction();
       
       tx.commit();
        
       session.close();
       System.out.println("Done..");
    }
}
