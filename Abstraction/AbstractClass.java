package com.company.Abstraction;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound(); // Abstract method

    public void sleep() {
        System.out.println("Zzzz...");
    }
}

class Dog1 extends Animal {
    public Dog1(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Woof!");
    }
}

class AbstractClass {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        System.out.println("Name: " + dog.getName());
        dog.makeSound();
        dog.sleep();
    }
}
