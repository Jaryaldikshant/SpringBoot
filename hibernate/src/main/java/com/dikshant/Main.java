package com.dikshant;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.*;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Objects;

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
//
//        Laptop l1 = new Laptop();
//        l1.setLaptopId(4);
//        l1.setBrand("Asus");
//        l1.setModel("Strix");
//        l1.setRam(32);

//        Laptop l2 = new Laptop();
//        l2.setLaptopId(2);
//        l2.setBrand("HP");
//        l2.setModel("14s");
//        l2.setRam(8);
//
//        Laptop l3 = new Laptop();
//        l3.setLaptopId(3);
//        l3.setBrand("Lenovo");
//        l3.setModel("Yoga");
//        l3.setRam(10);
//
//        Progammers p1 = new Progammers();
//        p1.setpId(101);
//        p1.setpName("Max");
//        p1.setTech("Mechanical");
//
//        Progammers p2 = new Progammers();
//        p2.setpId(102);
//        p2.setpName("Rishu");
//        p2.setTech("Electric");
//
//
//        p1.setLaptops(List.of(l1,l2));
//        p2.setLaptops(List.of(l3));




//        SessionFactory sf = new Configuration()
////                .addAnnotatedClass(Progammers.class)
//                .addAnnotatedClass(Laptop.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
////        Transaction transaction = session.beginTransaction();
////        session.persist(l1);
//
////        session.persist(l2);
////        session.persist(l3);
////        session.persist(p1);
////        session.persist(p2);
////        transaction.commit();

//
//        // select * from laptop where ram=32   ---> Sql
//        // from Laptop where ram=32 ----> Hql
//
//        String brand = "Asus";
//
//        Query query = session.createQuery("select brand,model from Laptop where brand like ?1");
//        query.setParameter(1,brand);
//
//          List<Object[]> laptops = query.getResultList();
//
//          for(Object[] data: laptops){
//              System.out.println((String) data[0] + " " +(String) data[1]);
//          }
//
////        Laptop l1 = session.get(Laptop.class,3);
//        System.out.println(laptops);
//
//        session.close();
//
//        sf.close();


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Laptop l1 = session.get(Laptop.class,2);
        System.out.println(l1);
        session.close();

        Session session1 = sf.openSession();
        Laptop l2 = session1.get(Laptop.class,2);
        System.out.println(l2);
        session1.close();

        sf.close();

    }
}
