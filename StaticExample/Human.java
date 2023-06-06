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
//Basically constructor means using Class Human as fuction so that we can create objects
//out of it like calling the function(see the Main file).

//Static variable is not dependent on the objects.
//In main() method of public static void main(), static is used so that main method can be used
//without creating objects of class.

//Class inside a class is possible but outer class cant be static.