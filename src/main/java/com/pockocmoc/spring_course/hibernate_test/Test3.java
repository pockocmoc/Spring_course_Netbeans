package com.pockocmoc.spring_course.hibernate_test;

import com.pockocmoc.spring_course.hibernate_test.entity.Employee;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> emps = session.createQuery("from Employee")
//                    .getResultList();
            List<Employee> emps = session.createQuery("from Employee "
                    + "where name = 'Aleksandr' AND salary > 10000")
                    .getResultList();

            for (Employee e : emps) {
                System.out.println(e);
            }

            session.getTransaction().commit();

            System.out.println("Done!!!");

        } finally {
            factory.close();
        }

    }
}
