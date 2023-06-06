package com.company.INTRODUCTION;
import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        System.out.println(Arrays.toString(employees));

        Employee Shivam = new Employee();    //Shivam object created from Employee class
        System.out.println(Shivam.emp_no);
        System.out.println(Shivam.emp_name);
        System.out.println(Shivam.emp_code);

        Shivam.emp_no = 2;      //Shivam object is using properties from the Employee class.
        Shivam.emp_name ="Shivam Bankar";
        Shivam.emp_code = 425.53f;
        System.out.println(Shivam.emp_no);
        System.out.println(Shivam.emp_name);
        System.out.println(Shivam.emp_code);
        //Many such objects can be created from the below class.
    }
}

class Employee {
    int emp_no;
    String emp_name;
    float emp_code;
}
