package com.company.Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";  // Inherited attribute
        myDog.eat();          // Inherited method
        myDog.bark();         // New method
    }
}

