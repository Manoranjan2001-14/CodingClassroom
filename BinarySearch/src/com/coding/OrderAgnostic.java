package com.coding;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {80, 79, 72, 63, 59, 45, 34, 25, 17, 10, 8, 6, 2, -3, -8};
        int target = 2;
        int ans = orderAgno(arr, target);
        System.out.println(ans);

    }
    static int orderAgno(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            //find the middle element
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                } else{
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
