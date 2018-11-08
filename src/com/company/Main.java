package com.company;

public class Main {

    public static void main(String[] args) {
        Person olya = new Person("Olya", 1999);
        System.out.println(olya);
        olya.input();
        olya.changeName();

        System.out.println("New person");

        Person andriy = new Person("Andriy", 1996);
        System.out.println(andriy);
        andriy.input();
        andriy.changeName();

        System.out.println("After change persons: ");
        System.out.println(olya);
        System.out.println(andriy);

    }
}
