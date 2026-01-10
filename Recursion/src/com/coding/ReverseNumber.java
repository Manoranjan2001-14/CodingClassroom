package com.coding;

public class ReverseNumber {
    static int sum = 0;
    static void revrse(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;

        revrse(n / 10);
    }
    public static void main(String[] args) {
        revrse(1234);
        System.out.println(sum);
    }
}
