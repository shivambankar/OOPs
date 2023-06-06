package com.company.StaticExample;

public class Human {
    int age;    //Properties of class
    String name;
    int salary;
    boolean married;
    static long population; //static=> common to all objects. Here population is common to
    //all the humans. While creating new objects no need to specify population.

    public Human(int age, String name, int salary, boolean married) {//constructor
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; //for static variable, instead of 'this' class name used.
    }
}
