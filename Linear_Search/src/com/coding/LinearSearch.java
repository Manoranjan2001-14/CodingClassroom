package com.coding;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 34, 23, 45, -11, 56, 47, 89};
        int target = 45;
        int ans = linear(arr, target);
        System.out.println(ans);

    }
    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linear(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        //run a for loop to iterate every element
        for(int index=0; index<arr.length; index++){
            // check for element at every index if it is = target
            int element = arr[index];

            if(element == target){
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
