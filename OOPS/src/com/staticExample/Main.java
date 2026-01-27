package com.staticExample;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(24, "Manoranjan", 5.7, 100000);
        System.out.println(Human.population);
        Human h2 = new Human(34, "Arpit",5.6, 50000);
        System.out.println(Human.population);
    }
}
