package com.company.Polymorphism.OverLoading;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(5, 10));         // Output: 15
        System.out.println(math.add(3.5, 2.5));     // Output: 6.0
    }
}
