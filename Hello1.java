package com.company.INTRODUCTION;

public class Hello1 {
    public static void main(String[] args) {
        //Store 5 roll nos
        int[] roll_no = new int[5];

        //Store 5 names
        String[] name = new String[5];

        //Storing rollno and name is easy as above
        //but what if we want to
        //store data of students having rollno,name and marks all three.

        //Store data of 5 students(rollno,name,marks)
        //int[] roll_no = new int[5];
        //String[] name = new String[5];
        //float[] marks = new float[5];
    }
}

        //Above isnt a good idea instead we we'll need our own class :
        //Create a class
        class Student {
            int[] roll_no = new int[5];
            String[] name = new String[5];
            float[] marks = new float[5];
        }
        //This is what OOP is classes and objects.
        //note that our new class should be outside of the previous one.

//Just don't execute this code.






