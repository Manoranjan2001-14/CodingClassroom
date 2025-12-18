package com.coding;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        //sort(arr);
       // selection(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
    }
    static void selection(int[] arr){
        for(int i=0; i< arr.length; i++){
            //find maximum element in the array , put it into correct index.
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i=start; i<= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
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
