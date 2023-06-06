package com.company.Polymorphism.OverRiding;

class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.makeSound(); // Output: Meow!
        animal2.makeSound(); // Output: Woof!
    }
}
