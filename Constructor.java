package com.company.INTRODUCTION;

public class Constructor {
    public static void main(String[] args) {

        Car car1 = new Car(2, "BMW", 3.42f);//creating new object & passing values.

        System.out.println(car1.car_no);
        System.out.println(car1.car_name);
        System.out.println(car1.car_code);
        //'this' keyword will be replaced by car1.
    }
}

class Car {
    int car_no;
    String car_name;
    float car_code;

    Car(int car_no, String car_name, float car_code) {  //constructor
        this.car_no = car_no;
        this.car_name = car_name;
        this.car_code = car_code;
    }
}
