package com.pockocmoc.spring_course.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    
    final String line = "-".repeat(160);

    public void getBook() {
        System.out.println("Мы берём книгу из UniLibrary");
        System.out.println(line);
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "Война и мир.";

    }

    public void getMagazine() {
        System.out.println("Мы берём журнал из UniLibrary");
        System.out.println(line);

    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в UniLibrary");
        System.out.println(line);

    }

    public void addBook(String person_name, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println(line);

    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println(line);

    }
}
