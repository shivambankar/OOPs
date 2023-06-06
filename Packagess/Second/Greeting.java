package com.company.Packagess.Second;

import static com.company.Packagess.First.Message.message;
//name of packages.--.Class.Method

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello world");
        message();
    }
}

//Run this file(Always run main function file)
//As the file Message is in another package import the path of that file
//in this file. If it was in the same package no need to import.
