package com.ranjeet;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {

        // create an array
        int[] arr = {1,34,44,56};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void changeValue(int[] arr) {
        arr[0] = 99;
    }
}
