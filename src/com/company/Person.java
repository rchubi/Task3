package com.company;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by Roman on 25.10.2018.
 */
public class Person {
    private String name;
    private int birthYear;
    public String infa;

    public Person() {    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int age(){
        int old = Calendar.getInstance().get(Calendar.YEAR) - getBirthYear();
        return old;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input information: ");
        infa = in.nextLine();
    }

    public String output() {
        return infa;
    }

    public void changeName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input new name: ");
        String newName = in.nextLine();
        setName(newName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + age() + '\'' +
                ", information=" + output() + '\'' +
                '}';
    }
}
