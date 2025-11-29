package com.coding;

import java.util.Scanner;

public class isArmstrong {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(isArm(n));

        for(int i=100; i<1000; i++){
           if(isArm(i)){
               System.out.println(i+" ");
           }
        }
    }
    static boolean isArm(int n){
        int org = n;
        int sum = 0;
        while ( n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        if(sum == org){
            return true;
        }
        return false;
    }
}
