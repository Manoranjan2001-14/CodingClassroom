package com.coding;

public class Odd_Even {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(isOdd(n));
    }
    private static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
