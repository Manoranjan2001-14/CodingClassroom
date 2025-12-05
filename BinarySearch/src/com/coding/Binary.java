package com.coding;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 2, 4, 6, 8, 12, 23, 34, 45, 56, 68, 79};
        int target = 34;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            //find the middle element
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                //if mid == target, return mid;
                return mid;
            }
        }
        return -1;
    }
}
