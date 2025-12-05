package com.coding;

public class Find_Max {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 45, 34},
                {23, 43, 78, 90},
                {-4, 12, 87, 122}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max = arr[0][0];
        for(int row=1; row<arr.length; row++){
            for(int col=1; col<arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
