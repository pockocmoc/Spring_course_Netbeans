/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pockocmoc.spring_course.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author marat
 */
@Component
public class Book {

    @Value("Преступление и наказание")
    private String name;

    @Value("Ф.М.Достоевский")
    private String author;
    
    @Value("1866")
    private int yearOfPublication;
    
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
    

}
