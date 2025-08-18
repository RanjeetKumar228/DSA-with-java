package com.ranjeet;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item and swap with correct index
            int last = arr.length - i - 1;
            int max = findMAxValue(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int  findMAxValue(int[] arr, int start,int end){
        int max = start;
        for (int i = start; i <= end; i++){
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int max , int last){
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;
    }
}
