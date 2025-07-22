package com.ranjeet;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int[] num = {1,5,4,45,345,12,543};
        System.out.println(Arrays.toString(num));
        swap(num, 2,5);

        System.out.println(Arrays.toString(num));

    }
    static void swap(int[] arr , int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
