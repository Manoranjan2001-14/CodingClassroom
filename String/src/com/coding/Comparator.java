package com.coding;

public class Comparator {
    public static void main(String[] args) {

        //pointing to same memory adress
//        String a = "Manoranjan";
//        String b = "Manoranjan";
//        System.out.println(a == b);

        //Creating different object
        String name1 = new String("Manoranjan");
        String name2 = new String("Manoranjan");
        System.out.println(name1.equals(name2));
    }
}
