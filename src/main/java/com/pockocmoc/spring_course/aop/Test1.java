package com.pockocmoc.spring_course.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfig.class)) {
            UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);

//        uniLibrary.returnBook();
//        uniLibrary.getMagazine();**
            Book book = context.getBean("book", Book.class);
            uniLibrary.getBook();
//        uniLibrary.getMagazine();
//        uniLibrary.returnMagazine();
            uniLibrary.addBook("Marat", book);
            uniLibrary.addMagazine();
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();
        }
    }

}
