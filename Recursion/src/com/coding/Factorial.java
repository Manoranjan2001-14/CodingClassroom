package com.coding;

public class Factorial {
    public static void main(String[] args) {
        int ans = 5;
        System.out.println(fact(ans));
    }
    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
