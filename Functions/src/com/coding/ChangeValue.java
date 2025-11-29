package com.coding;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {2,12,34,56,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 99;
    }
}
