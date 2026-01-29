package com.abstractdemo;

public class Child extends Parent{
    public Child(int age) {
        this.age = age;
    }

    @Override
    void carrier() {
        System.out.println("I am going to Engineer");
    }

    @Override
    void partner() {
        System.out.println("i love Hulk");
    }
}
