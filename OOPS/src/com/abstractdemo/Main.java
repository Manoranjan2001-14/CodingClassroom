package com.abstractdemo;

public class Main {
    public static void main(String[] args) {
        Child ch = new Child(24);
        System.out.println(ch.age);
        ch.carrier();
        ch.partner();

        Doughter d = new Doughter();
         d.carrier();
         d.partner();

         Parent.hello();
    }
}
