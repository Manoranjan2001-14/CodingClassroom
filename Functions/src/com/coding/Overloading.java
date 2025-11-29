package com.coding;

public class Overloading {
    public static void main(String[] args) {
        fun(10, "scscs");
        fun("zcdscs", 36);

    }
    static void fun(int a, String b){
        System.out.println(a);
        System.out.println(b);

    }
    static void fun(String s, int b){
        System.out.println(s);
        System.out.println(b);

    }

}
