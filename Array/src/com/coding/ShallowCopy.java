package com.coding;

import java.util.Arrays;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] arr = {100, 200, 271, 123, 450};
        int[] x = arr; // x is a shallow copy of arr
        x[0] = 150;
        System.out.println(arr[0]);


        //Deep copy
        int[] deep = Arrays.copyOf(arr, arr.length);
        deep[2] = 220;
        System.out.println(Arrays.toString(deep));
    }
}
