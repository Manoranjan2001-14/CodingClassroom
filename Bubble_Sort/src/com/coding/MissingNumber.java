package com.coding;

//https://leetcode.com/problems/missing-number/?envType=problem-list-v2&envId=sorting
class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
       int ans = missingNumber(arr);
        System.out.println(ans);
    }
    static int missingNumber(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        //search for first missing index
        for(int index=0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        //case2
        return nums.length;
    }
   static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}