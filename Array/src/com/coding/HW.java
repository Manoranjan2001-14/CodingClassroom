package com.coding;

import java.util.Arrays;

//multiply odd index element by 2 and add 10 to even index number
public class HW {
    public static void main(String[] args) {
        int[] arr = {20, 23, 45, 67};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr[i] *= 2;
            }else {
                arr[i] += 10;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
