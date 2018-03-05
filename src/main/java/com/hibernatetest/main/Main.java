package com.hibernatetest.main;

import com.hibernatetest.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student student = session.get(Student.class,7);
        student.setAge(34);
//        System.out.println(student);
//        student.setFirstname("fn1");
//        student.setLastname("ln1");
//        student.setAge(111);
//        session.save(student);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
