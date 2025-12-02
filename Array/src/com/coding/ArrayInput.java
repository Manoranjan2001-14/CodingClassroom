package com.coding;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //number 3
        System.out.println(Arrays.toString(arr));

        //one way to print
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }


        //number 2 way
//        for(int num : arr){
//            System.out.print(num+" ");
//        }

    }
}
