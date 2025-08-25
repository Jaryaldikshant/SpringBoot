package com.dikshant;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        // Create SessionFactory (reads hibernate.cfg.xml)
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(Student.class)
//                .configure()
//                .buildSessionFactory();
//
//        // Example student to insert/update
//        Student student2 = new Student();
//        student2.setName("Avi");
//        student2.setsAge(24);
//        student2.setRollNo(34);
//
//        // Open a new session
//        Session session = sf.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        // Fetch student with id=0 (may return null if not found)
//        Student student1 = session.get(Student.class, 0);
//
//        // Insert or update student2
//        session.merge(student2);
//
//        // Delete student1 if it exists
//        if (student1 != null) {
//            session.remove(student1);
//        }
//
//        // Commit transaction
//        transaction.commit();
//
//        // Close session & factory
//        session.close();
//        sf.close();
//
//        System.out.println(student1);

        Laptop l1 = new Laptop();
        l1.setLaptopId(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLaptopId(2);
        l2.setBrand("HP");
        l2.setModel("14s");
        l2.setRam(8);


        Progammers p1 = new Progammers();
        p1.setpId(101);
        p1.setpName("Max");
        p1.setTech("Mechanical");
        p1.setLaptops(List.of(l1,l2));

        l1.setProgammers(p1);
        l2.setProgammers(p1);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Progammers.class)
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(p1);

        transaction.commit();


      Progammers p2 = session.get(Progammers.class,101);
      System.out.println(p2);

        session.close();
        sf.close();



    }
}
