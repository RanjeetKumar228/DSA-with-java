package com.ranjeet;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {7,5,4,2,5,6,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctPosition = arr[i] - 1;
            if (arr[i] != arr[correctPosition]) {
                swap(arr,i,correctPosition);
            }else{
                i++;
            }
        }
    }

     static void swap(int[] arr, int i, int correctPosition) {
        int temp = arr[correctPosition];
        arr[correctPosition] = arr[i];
        arr[i] = temp;
    }

}
