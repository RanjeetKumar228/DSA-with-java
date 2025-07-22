package com.ranjeet;

public class MaxRange {
    public static void main(String[] args) {

        int[] arr = {1,23,34,5,46,5};
        System.out.println(max(arr,1,4));
    }

    // Imagine that array is not empty
    static int max(int[] arr, int start, int end) {
        int maxVal = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }
        }

        return maxVal;
    }
}
