package com.ranjeet;

public class RCW {
    public static void main(String[] args) {
       int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            //when you start a new col ,take a new sum for that row
            int rowSum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowSum += accounts[person][account];
            }
            // now we have sum of account of person
            // check with overall ans
            if (rowSum > ans) {
                ans = rowSum;
            }
        }
        return ans;
    }
}
