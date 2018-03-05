package com.hibernatetest.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        Student student = session.get(Student.class,1);
//        Set<Exam> exams = student.getExams();
//        System.out.println(student);
//        student.setFirstname("fn1");
//        student.setLastname("ln1");
//        student.setAge(111);
//        session.save(student);

        Query query = session.createQuery("from Student ");
        List resultList = query.getResultList();
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
