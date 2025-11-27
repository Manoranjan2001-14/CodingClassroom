package com.coding;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 0;
        int current = 1;
        int count = 2;

        while (count <= n){
            int temp = current;
            current = current + start;
            start = temp;
            count ++;
        }
        System.out.println(current);
    }
}
