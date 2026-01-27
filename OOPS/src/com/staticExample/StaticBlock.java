package com.staticExample;

public class StaticBlock {
    static int a = 20;
    static int b;
    static {
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock s = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
