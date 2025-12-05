package com.coding;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 56},
                {12, 67, 89, 98},
                {34, 76, 43, 65},
                {11, -7, 88}
        };
        int target = 76;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
