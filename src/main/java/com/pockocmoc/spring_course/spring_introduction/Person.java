package com.pockocmoc.spring_course.spring_introduction;

public class Person {

    private Pet pet;
    private String surname;
    private int age;

//    public Person(Pet pet) {
//        System.out.println("Person bean is created!");
//        this.pet = pet;
//    }
    public Person() {
        System.out.println("Person bean is created!");
    }

    public void setPet(Pet pet) {
        System.out.println("Class person: set pet.");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class person: set surname.");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class person: set age.");
        this.age = age;
    }
    
    

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

}
