package com.coding;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       // sum();
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(24, 12);
        System.out.println(ans);
    }
    //parameter
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
    //return value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is:"+sum);
    }
}
