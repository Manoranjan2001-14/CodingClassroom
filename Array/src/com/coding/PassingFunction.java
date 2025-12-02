package com.coding;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] nums = {12,34,56,23,67};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[1] = 100;
    }
}
