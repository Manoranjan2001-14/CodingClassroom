package com.coding;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        boolean swapped;
        //run the step N-1 times
        for(int i=0; i<arr.length; i++){
            swapped = false;
            //Each step, Max item come to the end respectively
            for(int j=1; j<arr.length-i; j++){
                //swap item smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you didn't swap a particulat value of i, means your array is sorted hence stop the program.
            if(!swapped){
                break;
            }
        }
    }
}
