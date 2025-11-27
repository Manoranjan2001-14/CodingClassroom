package com.coding;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        for(int i=1; i<=10; i+=2){
//            System.out.println(i);
//        }

        //from user input
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for(int i=1; i<=num; i++){
//            System.out.println(i);
//        }

        //while loop


//        int j = 1;
//        int num2 = sc.nextInt();
//        while (j <= num2){
//            System.out.println(j);
//            j++;
//        }

        //do-while loop

        int n=1;
        do{
            System.out.println(n);
            n++;
        }while (n <= 100);
    }
}
