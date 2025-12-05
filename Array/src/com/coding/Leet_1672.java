package com.coding;
//https://leetcode.com/problems/richest-customer-wealth/description/?envType=problem-list-v2&envId=array
public class Leet_1672 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        // person = row;
        //account = col;
        int ans = accounts[0][0];
        for(int person=0; person<accounts.length; person++){
            //when you take a new col, take a new sum for that row.
            int sum = 0;
            for(int account=0; account<accounts[person].length; account++){
                sum += accounts[person][account];

            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
