package com.coding;

public class Product {
    public static void main(String[] args) {
       int ans = 1342;
        System.out.println(prod(ans));
    }
    static int prod(int n){
        if(n%10 == 1){
            return 1;

        }
        return (n%10) * prod(n/10);
    }
}
