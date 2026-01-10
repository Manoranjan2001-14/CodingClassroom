package com.coding;

public class Number_Example_Recursion {
    public static void main(String[] args) {
        //write a function that takes number and print it.
        //print first 5 number :1 2 3 4 5
        print(5);
    }
//    static void print(int n){
//        if(n == 5){
//            System.out.println(5);
//            return;
//        }
//        System.out.println(n);
//        print(n+1);
//    }

    static void print(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print(n-1);
    }

}
