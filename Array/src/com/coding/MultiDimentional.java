package com.coding;

import java.util.Arrays;

public class MultiDimentional {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},//0 index
                {4,5},//1 index
                {7,8,9}// 2 index
        };
        //input
       for(int[] num : arr){
           System.out.println(Arrays.toString(num));
       }

    }
}
