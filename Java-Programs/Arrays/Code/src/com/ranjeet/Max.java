package com.ranjeet;

public class Max {
    public static void main(String[] args) {

        int[] arr = {1,23,34,5,46,5};
        System.out.println(max(arr));
    }

    // Imagine that array is not empty
     static int max(int[] arr) {
        int maxVal = arr[0];
         for (int i = 0; i < arr.length; i++) {
             if (arr[i]>maxVal){
                 maxVal = arr[i];
             }
         }

        return maxVal;
    }
}
