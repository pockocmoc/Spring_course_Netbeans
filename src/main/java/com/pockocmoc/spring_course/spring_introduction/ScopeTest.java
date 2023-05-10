/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pockocmoc.spring_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author marat
 */
public class ScopeTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applictaionContext3.xml");

        Dog myDog = context.getBean("dog", Dog.class);
//        Dog yourDog = context.getBean("dog", Dog.class);
//
//        System.out.println("Переменные ссылаются на один и тот жу объект? "
//                + (myDog == yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);

        myDog.say();
        context.close();
    }
}
