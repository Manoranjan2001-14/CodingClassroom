package com.coding;

public class PringNegativeNum {
    public static void main(String[] args) {
        int[] arr = {10, -12, 23, -1, -34, 57};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                System.out.println(arr[i]);
            }
        }
    }
}
