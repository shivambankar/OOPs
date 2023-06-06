package com.company.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human shivam = new Human(21,"shivam",200000,false);
        Human shamal = new Human(23,"shamal",500000,false);
        //shivam and shamal objects are created from constructor.

        System.out.println(shivam.name);
        System.out.println(shamal.name);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
//Here both Human and Main files are in same package hence no need to import the path.
