/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pockocmoc.spring_course.aop;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author marat
 */
@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Zaur Tregulov", 4, 7.5);
        Student st2 = new Student("Mikhayil Ivanov", 2, 8.3);
        Student st3 = new Student("Elena Sidorova", 1, 9.1);

        students.add(st1);
        students.add(st2);
        students.add(st3);

    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }

}
