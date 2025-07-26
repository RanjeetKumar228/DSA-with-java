package com.ranjeet;

public class FindMin {
    public static void main(String[] args) {

        int[] arr = {18, 12, 7, 3, 14, 28};
        System.out.println(min(arr));
    }

    // Assume array is not empty
    //return the minimum array
    static int min (int arr[]) {
        int ans = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < ans) {
               ans = arr[index];
            }
        }
        return ans;
    }
}
