package com.coding;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.next();
        greet();
        String msg = greeting(name);
        System.out.println(msg);
    }
    //parameter
    static String greeting(String name){
        String msg = "Hello "+name;
        return msg;
    }
    static void greet(){
        System.out.println("Hello coder");
    }
}
