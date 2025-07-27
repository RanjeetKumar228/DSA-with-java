package com.ranjeet;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {102,105,117,130,150,167,200,294,300};
        int target = 300;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    //return Index if item does not found return -1

    static int binarySearch (int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
             // Find middle element

            // int mid = (start + end) / 2;

            // note : might be possible that (start+end)/2 exceeds the range of the range of the java

            int mid = (start + ((end - start)/2));

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            //answer found
            else  {
                return mid;
            }
        }
        return -1;
    }
}