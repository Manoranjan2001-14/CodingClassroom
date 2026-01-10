package com.coding;

public class Sum {
    public static void main(String[] args) {
        int ans = 5;
        System.out.println(sum(ans));
    }
    static int sum(int n){
        if(n <= 1){
            return 1;
        }
        return n + sum(n-1);
    }
}
