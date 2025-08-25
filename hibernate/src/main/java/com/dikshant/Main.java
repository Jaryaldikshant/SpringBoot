package com.dikshant;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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


        Progammers p1 = new Progammers();
        p1.setpId(101);
        p1.setpName("Max");
        p1.setTech("Mechanical");

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Progammers.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(p1);

        transaction.commit();



    }
}
