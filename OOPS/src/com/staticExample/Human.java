package com.staticExample;

public class Human {

    int age;
    String name;
    double height;
    int salary;
    static int population;
    Human(int age, String name, double height, int salary){
        this.age = age;
        this.name = name;
        this.height = height;
        this.salary = salary;
        Human.population += 1;
    }
}
