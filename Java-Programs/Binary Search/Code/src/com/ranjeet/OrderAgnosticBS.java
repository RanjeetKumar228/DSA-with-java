package com.ranjeet;

import java.util.Arrays;

public class  OrderAgnosticBS{
    public static void main(String[] args) {
        //Ascending order
        //int[] arr = {102,105,117,130,150,167,200,294,300};

        //Descending order
        int[] arr = {102,100,99,64,34,12,-1,-13};
        int target = -13;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }

    //return Index if item does not found return -1

    static int orderAgnosticBS (int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        //Check whether the array is ascending or descending

//        boolean isAsc;
//        if (arr[start] > arr[end]) {
//            isAsc = true;
//        }else {
//            isAsc = false;
//        }

        //Instead of the above ,write directly
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            // Find middle element
            // int mid = (start + end) / 2;
            // note : might be possible that (start+end)/2 exceeds the range of the range of the java

            int mid = (start + ((end - start)/2));

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}